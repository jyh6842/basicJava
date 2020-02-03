package c_statement;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {

		System.out.println("나는 금사빠다 \n *금방 사람에 빠진다. Y/N");
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();

		if (answer.equals("Y")) {// 나는 금사빠다 Y -> 끌력다니는
			System.out.println("연애할 때 끌려다니는 타입이다. Y/N");
			answer = sc.nextLine();
			if (answer.equals("Y")) {// 끌려다니는 Y -> 감정 표현
				System.out.println("감정 표현에 솔직한 편이다. Y/N");
				answer = sc.nextLine();
				if (answer.equals("Y")) { // 감정 표현 Y -> 이성친구
					System.out.println("이성친구는 존재할 수 없다. Y/N");
					answer = sc.nextLine();
					if (answer.equals("Y")) {// 이성친구 Y -> 아무것도
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. Y/N");
						answer = sc.nextLine();
						if (answer.equals("Y")) { // 아무것도 Y -> D
							System.out.println("D : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");

						} else {// 아무것도 N -> C
							System.out.println("C : 이것은 의리인가 사람인가 ... 친구같은 편안한 연애를 하는 타입!");
						}
					} else {// 이성친구 N -> B
						System.out.println("B : 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
					}
				} else {// 감정 표현 N -> 활동적인
					System.out.println("활동적인 데이트가 좋다. Y/N");
					answer = sc.nextLine();
					if (answer.equals("Y")) { // 활동적인 Y -> 이성친구
						System.out.println("이성친구는 존재할 수 없다. Y/N");
						answer = sc.nextLine();
						if (answer.equals("Y")) { // 이성친구 Y -> 아무것도 아닌
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. Y/N");
							answer = sc.nextLine();
							if (answer.equals("Y")) { // 아무것도 아닌 Y -> D
								System.out.println("D : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
							} else { // 아무것도 아닌 N -> C
								System.out.println("C : 이것은 의리인가 사람인가 ... 친구같은 편안한 연애를 하는 타입!");
							}
						} else {// 이성친구 N -> B
							System.out.println("B : 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
						}

					} else { // 활동적인 N -> 아무것도 아닌
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. Y/N");
						answer = sc.nextLine();
						if (answer.equals("Y")) { // 아무것도 아닌 Y -> D
							System.out.println("D : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
						} else { // 아무것도 아닌 N -> C
							System.out.println("C : 이것은 의리인가 사람인가 ... 친구같은 편안한 연애를 하는 타입!");
						}

					}
				}
			} else {// 끌려다니는 N -> 데이트 코스
				System.out.println("데이트 코스는 미리 짜는게 편하다. Y/N");
				answer = sc.nextLine();
				if (answer.equals("Y")) { // 데이트 코스 Y -> 활동적인
					System.out.println("활동적인 데이트가 좋다. Y/N");
					answer = sc.nextLine();
					if (answer.equals("Y")) {// 활동적인 Y -> 이성 친구
						System.out.println("이성친구는 존재할 수 없다. Y/N");
						answer = sc.nextLine();
						if (answer.equals("Y")) { // 이성친구 Y -> 아무것도 아닌
							if (answer.equals("Y")) { // 아무것도 아닌 Y -> D
								System.out.println("D : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
							} else { // 아무것도 아닌 N -> C
								System.out.println("C : 이것은 의리인가 사람인가 ... 친구같은 편안한 연애를 하는 타입!");
							}
						} else { // 이성친구 N -> B
							System.out.println("B : 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
						}
					} else { // 활동적인 N -> 아무것도 아닌
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. Y/N");
						answer = sc.nextLine();
						if (answer.equals("Y")) { // 아무것도 아닌 Y -> D
							System.out.println("D : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
						} else { // 아무것도 아닌 N -> C
							System.out.println("C : 이것은 의리인가 사람인가 ... 친구같은 편안한 연애를 하는 타입!");
						}
					}
				} else { // 데이트 코스 N -> 감정표현
					System.out.println("감정 표현에 솔직한 편이다. Y/N");
					answer = sc.nextLine();
					if (answer.equals("Y")) { // 감정표현 Y -> 이성친구
						System.out.println("이성친구는 존재할 수 없다. Y/N");
						answer = sc.nextLine();
						if (answer.equals("Y")) { // 이성친구 Y -> 아무것도 아닌
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. Y/N");
							answer = sc.nextLine();
							if (answer.equals("Y")) { // 아무것도 아닌 Y -> D
								System.out.println("D : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
							} else { // 아무것도 아닌 N -> C
								System.out.println("C : 이것은 의리인가 사람인가 ... 친구같은 편안한 연애를 하는 타입!");
							}
						} else {// 이성친구 N -> B
							System.out.println("B : 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
						}
					} else {// 감정표현 N -> 활동적인
						System.out.println("활동적인 데이트가 좋다. Y/N");
						answer = sc.nextLine();
						if (answer.equals("Y")) { // 활동적인 Y -> 이성친구
							System.out.println("이성친구는 존재할 수 없다. Y/N");
							answer = sc.nextLine();
							if (answer.equals("Y")) { // 이성친구 Y -> 아무것도
								System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. Y/N");
								answer = sc.nextLine();
								if (answer.equals("Y")) {// 아무것도 아닌 Y -> D
									System.out.println("D : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
								} else {// 아무것도 아닌 N -> C
									System.out.println("C : 이것은 의리인가 사람인가 ... 친구같은 편안한 연애를 하는 타입!");
								}

							} else { // 이성친구 N -> B
								System.out.println("B : 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
							}
						} else {// 활동적인 N -> 아무것도 아닌
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. Y/N");
							answer = sc.nextLine();
							if (answer.equals("Y")) { // 아무것도 Y -> D
								System.out.println("D : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
							} else { // 아무것도 N -> C
								System.out.println("C : 이것은 의리인가 사람인가 ... 친구같은 편안한 연애를 하는 타입!");
							}
						}
					}
				}
			}
		} else {// 나는 금사빠다 N -> 감정기복
			System.out.println("감정기복이 크지 않다. Y/N");
			answer = sc.nextLine();
			if (answer.equals("Y")) { // 감정기복 Y -> 연락
				System.out.println("연락이 없어도 믿고 기다리는 편이다. Y/N");
				answer = sc.nextLine();
				if (answer.equals("Y")) { // 연락 Y -> A
					System.out.println("A : 서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!");
				} else { // 연락 N -> 이성친구
					System.out.println("이성친구는 존재할 수 없다. Y/N");
					answer = sc.nextLine();
					if (answer.equals("Y")) { // 이성친구 Y -> 아무것도
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. Y/N");
						answer = sc.nextLine();
						if (answer.equals("Y")) {// 아무것도 아닌 Y -> D
							System.out.println("D : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
						} else {// 아무것도 아닌 N -> C
							System.out.println("C : 이것은 의리인가 사람인가 ... 친구같은 편안한 연애를 하는 타입!");
						}

					} else { // 이성친구 N -> B
						System.out.println("B : 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
					}
				}
			} else { // 감정기복 N -> 감정표현
				System.out.println("감정 표현에 솔직한 편이다. Y/N");
				answer = sc.nextLine();
				if (answer.equals("Y")) { // 감정표현 Y -> 이성친구
					System.out.println("이성친구는 존재할 수 없다. Y/N");
					answer = sc.nextLine();
					if (answer.equals("Y")) { // 이성친구 Y -> 아무것도 아닌
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. Y/N");
						answer = sc.nextLine();
						if (answer.equals("Y")) { // 아무것도 아닌 Y -> D
							System.out.println("D : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
						} else { // 아무것도 아닌 N -> C
							System.out.println("C : 이것은 의리인가 사람인가 ... 친구같은 편안한 연애를 하는 타입!");
						}
					} else {// 이성친구 N -> B
						System.out.println("B : 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
					}
				} else {// 감정표현 N -> 활동적인
					System.out.println("활동적인 데이트가 좋다. Y/N");
					answer = sc.nextLine();
					if (answer.equals("Y")) { // 활동적인 Y -> 이성친구
						System.out.println("이성친구는 존재할 수 없다. Y/N");
						answer = sc.nextLine();
						if (answer.equals("Y")) { // 이성친구 Y -> 아무것도
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. Y/N");
							answer = sc.nextLine();
							if (answer.equals("Y")) {// 아무것도 아닌 Y -> D
								System.out.println("D : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
							} else {// 아무것도 아닌 N -> C
								System.out.println("C : 이것은 의리인가 사람인가 ... 친구같은 편안한 연애를 하는 타입!");
							}

						} else { // 이성친구 N -> B
							System.out.println("B : 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
						}
					} else {// 활동적인 N -> 아무것도 아닌
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. Y/N");
						answer = sc.nextLine();
						if (answer.equals("Y")) { // 아무것도 Y -> D
							System.out.println("D : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
						} else { // 아무것도 N -> C
							System.out.println("C : 이것은 의리인가 사람인가 ... 친구같은 편안한 연애를 하는 타입!");
						}
					}
				}
			}
		}

		/*
		 * 
		 * if(answer.equals("Y")){
		 * 
		 * }else {
		 * 
		 * }
		 */

		System.out.println("연애할 때 끌려다니는 타입이다. Y/N");
		System.out.println("데이트 코스는 미리 짜는게 편하다. Y/N");
		System.out.println("감정기복이 크지 않다. Y/N");
		System.out.println("감정 표현에 솔직한 편이다. Y/N");
		System.out.println("활동적인 데이트가 좋다. Y/N");
		System.out.println("연락이 없어도 믿고 기다리는 편이다. Y/N");
		System.out.println("이성친구는 존재할 수 없다. Y/N");
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. Y/N");
		System.out.println("A : 서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!");
		System.out.println("B : 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
		System.out.println("C : 이것은 의리인가 사람인가 ... 친구같은 편안한 연애를 하는 타입!");
		System.out.println("D : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");

	}

}
