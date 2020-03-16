
import java.util.Random;
import java.util.Scanner;

public class Method {

	// 플레이어 정보

	static String playerName;

	int playerHealth = 100;
	int player_max_health = 100;
	int player_min_damage = 2;
	int player_max_damage = 7;
	int playerGold = 600;

	// 포션

	int health_potion_max_amount = 10; //
	int health_potion_heal_amount = 30;
	int health_potion_amount = 2;
	int health_potion_heal_part;

	// 인벤토리

	String[] inventory = new String[5];

	// 아이템

	int itemValue = 0;

	int itemDamage = 0;

	int itemID = 0;

	int sellValue = 0;

	// MONSTERS VARIABLES

	String[] firstMonsters = { "고블린", "늑대" };

	String[] secondMonsters = { "스켈레톤", "스켈레톤_전사", "좀비", "고스트" };

	int monsterHealth;

	int monster_min_damage;

	int monster_max_damage;

	int monster_min_gold_drop;

	int monster_max_gold_drop;

	int health_potion_drop;

	Scanner sc = new Scanner(System.in);

	Random rand = new Random();

	String monster = "";
	
	int input8=0;

	void start() {

		

		System.out.println("현재 체력: " + playerHealth);

		System.out.println("1. 던전 입장 ");

		System.out.println("2. 상점 입장");

		System.out.println("3. 장비창 ");
		System.out.println("4. 게임을 종료하겠습니다.");

		int input = Integer.parseInt(sc.nextLine());

		System.out.println("\n");

		if (input == 1) {

			dungeon();

		}

		else if (input == 2) {

			store();

		}

		else if (input == 3) {

			equipment();

		}else if(input == 4){
			System.out.println("게임을 종료했습니다.");
		}

	}

	void dungeon() {

		monster = firstMonsters[(int) (Math.random() * (firstMonsters.length))];
		monster_first(monster);
		battle();

	}// dungeon

	void monster_first(String monster) {

		if (monster.equals("고블린")) {

			monsterHealth = 5;

			monster_min_damage = 1;

			monster_max_damage = 3;

			monster_min_gold_drop = 3;

			monster_max_gold_drop = 10;

			health_potion_drop = 5;

		}

		else if (monster.equals("늑대")) {

			monsterHealth = 10;

			monster_min_damage = 2;

			monster_max_damage = 5;

			monster_min_gold_drop = 1;

			monster_max_gold_drop = 1;

			health_potion_drop = 5;

		}

		System.out.println("몬스터 : " + monster + " 를 발견했다!");

	}

	void monster_second(String monster) {

		if (monster == "스켈레톤") {
			monsterHealth = 13;
			monster_min_damage = 4;
			monster_max_damage = 7;
			monster_min_gold_drop = 3;
			monster_max_gold_drop = 10;
			health_potion_drop = 5;
		} else if (monster == "스켈레톤_전사") {
			monsterHealth = 20;
			monster_min_damage = 7;
			monster_max_damage = 12;
			monster_min_gold_drop = 3;
			monster_max_gold_drop = 10;
			health_potion_drop = 5;
		} else if (monster == "좀비") {
			monsterHealth = 22;
			monster_min_damage = 3;
			monster_max_damage = 6;
			monster_min_gold_drop = 3;
			monster_max_gold_drop = 10;
			health_potion_drop = 5;
		} else { // 고스트
			monsterHealth = 11;
			monster_min_damage = 6;
			monster_max_damage = 14;
			monster_min_gold_drop = 3;
			monster_max_gold_drop = 10;
			health_potion_drop = 5;
		}

		System.out.println("몬스터 : " + monster + " 를 발견했다!");
	}

	// 배틀

	void battle() {

		while (monsterHealth > 0) {

			System.out.println("현재 체력 : " + playerHealth);

			System.out.println("몬스터의 현재 체력: " + monsterHealth);

			System.out.println("무엇을 하시겠습니까?");

			System.out.println("1. 공격");

			System.out.println("2. 회복 (" + health_potion_amount + ")");

			int input2 = Integer.parseInt(sc.nextLine());

			System.out.println();

			// 전투

			if (input2 == 1) {

				int damageDealt = (int) (Math.random() * (player_max_damage - player_min_damage))

						+ player_min_damage;

				int damageTaken = (int) (Math.random() * (monster_max_damage - monster_min_damage))

						+ monster_min_damage;

				monsterHealth -= damageDealt;

				playerHealth -= damageTaken;


				System.out.println(monster + "이 " + damageDealt

				+ " 피해를 입었다.");

				System.out.println(playerName + " 이 " + damageTaken

				+ " 피해를 입었다.\n");

				if (playerHealth < 1) {

					System.out.println("죽었습니다.");
					System.out.println(monster + " 에게 패배햇습니다.\n");

					if (monster_min_gold_drop >= 0 && monster_max_gold_drop > 0) {

						int goldDrop = (int) (Math.random() * (monster_max_gold_drop - monster_min_gold_drop))
								+ monster_min_gold_drop;

						System.out.println("당신의 " + goldDrop + " 골드를 떨어뜨렸습니다.\n");

						playerGold += goldDrop;

					}

					break;

				}

			}

			// 회복

			else if (input2 == 2) {

				if (health_potion_amount > 0) {

					playerHealth += health_potion_heal_amount;

					health_potion_amount--;

					if (playerHealth > player_max_health) {

						health_potion_heal_part = health_potion_heal_amount
								- (playerHealth - player_max_health);

						System.out.println("회복이 " + health_potion_heal_part

						+ " 만큼 회복되었습니다.");

						playerHealth = player_max_health;

					}

					else {

						System.out.println("회복이 " + health_potion_heal_amount
								+ " 만큼 회복되었습니다.");

					}

				}

				else {

					System.out.println("회복약이 없습니다..");

				}

			}

			else {

				System.out.println("잘못 선택하셨습니다..\n");

			}

		}

		// 캐릭터 죽음

		if (playerHealth < 1) {

			System.out.println("당신은 죽었습니다.");

			playerHealth = 0;

			System.out.println("게임이 끝났습니다.");


		}else{

		// END OF BATTLE AND DROPS

		

		if ((int) (Math.random() * (100)) < health_potion_drop) {

			health_potion_amount++;

			System.out.println("물약을 얻었습니다!");

		}

		System.out.println("나의 체력이 " + playerHealth + " 입니다.");

		System.out.println("나의 골드는 " + playerGold + " 입니다");

		System.out.println("무엇을 하시겠습니까?");
		System.out.println("0. 던전에서 나가겠습니다.");
		System.out.println("1. 1층 던전에서 사냥하겠습니다.");
		System.out.println("2. 2층 던전에서 사냥하겠습니다.");

		

		int input3 = Integer.parseInt(sc.nextLine());

		System.out.print("\n");

		while (input3 != 0 && input3 != 1 && input3 != 2) {

			System.out.println("잘못된 옵션을 선택했습니다.");

			input3 = Integer.parseInt(sc.nextLine());

		}

		if (input3 == 0) {
			System.out.println("던전을 떠났습니다..\n");
			start();

		}

		else if (input3 == 1) {
			System.out.println("1층 던전에서 사냥하겠습니다.");
			monster = firstMonsters[(int) (Math.random() * (firstMonsters.length))];
			monster_first(monster);
			battle();
		} else if (input3 == 2) {
			System.out.println("2층 던전에서 사냥하겠습니다.\n");
			monster = secondMonsters[(int) (Math.random() * (secondMonsters.length))];
			monster_second(monster);
			battle();
		}

	}}

	void store() {
		
			System.out.println("가게에 오신것을 환영합니다. " + playerName + "님");
			System.out.println("무엇을 하고 싶으십니까?");
			System.out.println("1. 구입");

			int input6 = Integer.parseInt(sc.nextLine());;
			
			if(input6 == 1) {
				System.out.println("소지 금액 : " + playerGold);
				System.out.println("1. 나무칼 (공격력: 5, 가격: 50)");
				System.out.println("2. 철검 (공격력: 10, 가격: 150)");
				System.out.println("3. 다이아몬드 검 (공격력: 25, 가격: 400)");
				System.out.println("4. 체력 물약 (회복력 : 30, 가격: 30)");
				System.out.println("5. 돌아가기");
								
				int input7 = Integer.parseInt(sc.nextLine());;
				
				int number = 10;
				for(int i = 4; i >= 0; i--) {
					if(inventory[i] == null) {
						number = i;
					}
				}

				for(int i = 0; i <= inventory.length; i++) {
					int num = 0;
					num++;
				
					if(input7 == 1) {
						itemValue = 50;
						sellValue = 10;
						itemDamage = 5;
						itemID = 1;
						if(number != 10) {
							if(playerGold >= itemValue) {
								playerGold -= itemValue;
								System.out.println("\n나무칼을 구입햇습니다.\n");
								inventory[number] = "나무칼"; 
								break; 
							}
							else {
								System.out.println("\n돈이 없습니다.\n");
								break;
							}
						}
						
						else {
							System.out.println("\n인벤토리에 공간이 없습니다.");
							break;
						}
						
					}
					else if(input7 == 2) {
						itemValue = 150;
						sellValue = 50;
						itemDamage = 10;
						itemID = 2;
						if(number != 10) {
							if(playerGold >= itemValue) {
								playerGold -= itemValue;
								System.out.println("철검을 구매했습니다.");
								inventory[number] = "철검";
								break;
								
							}
							
							else {
								System.out.println("돈이 부족합니다!");
								break;
								
							}								
						}
					
						else {
							System.out.println("인벤토리에 공간이 없습니다.");
							break;
						}
						
					}
					else if(input7 == 3) {
						itemValue = 400;
						sellValue = 150;
						itemDamage = 25;
						itemID = 3;
						if(number != 10) {
							if(playerGold >= itemValue) {
								playerGold -= itemValue;
								System.out.println("다이아몬드 칼을 샀습니다.");
								inventory[number] = "다이아몬드 칼";
								
							}
							else {
								System.out.println("돈이 없습니다.");
								break;
								
							}
						}
						
						else {
							System.out.println("인벤토리에 공간이 없습니다.");
							break;
							
						}

					}
					else if(input7 == 4) {
						if(health_potion_amount < health_potion_max_amount) {
						itemValue = 30;
							if(playerGold >= itemValue) {
								playerGold -= itemValue;
								System.out.println("체력 물약을 구입햇습니다.");
								health_potion_amount++;
								
							}
							else {
								System.out.println("돈이 부족합니다!");
								break;
								
							}
						}
						else {
							System.out.println("물약을 더이상 살수 없습니다.");
							break;
						}
						System.out.println("현재 소지금액은 " + playerGold);
						
					}
					else {
						start();
					}
						
				
				} }

				
				start();
				
			}
	

	void equipment() {
		int num = 1;
 		for(int i = 0; i < inventory.length ; i++) {
 			if(inventory[i] != null) {
 				System.out.print(num++ + ". " + inventory[i] + "\n");
 			}
 		} /////	

 		System.out.println("무엇을 하시겠습니까??");
 		System.out.println("1. 강화하기");
 		System.out.println("2. 돌아가기");
 		int input9 = Integer.parseInt(sc.nextLine());;
 			if(input9 == 1) {
 				System.out.println("현재 최소 데미지 : "+player_min_damage+", 현재 최대 데미지"+player_max_damage);
 				if(itemID == 1) {
 					player_min_damage += 5;
 					player_max_damage += 5;			 					
 				}
 				
 				if(itemID == 2) {
 					player_min_damage += 10;
 					player_max_damage += 10;
 				}
 				
 				if(itemID == 3){
 					player_min_damage += 25;
 					player_max_damage += 25;
 				}
 				if(itemID != 1 && itemID != 2 && itemID != 3){
 					System.out.println("강화할것이 없습니다.");
 				}
 			}
 			System.out.println("현재 최소 데미지 : "+player_min_damage+", 현재 최대 데미지"+player_max_damage);
 			start();
	}

}