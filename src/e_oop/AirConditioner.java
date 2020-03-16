package e_oop;

public class AirConditioner { // 에어컨

	boolean power; // 전원
	int temperature; // 온도
	int airVolume; // 풍량
	
	final int MAX_TEMPERATURE = 30;
	final int MIN_TEMPERATURE = 18;

	// 생성자에서 초기화
	AirConditioner() {
		power = false;
		temperature = 24;
		airVolume = 1;
	}

	// 전원 버튼
	void power() {
		power = !power;// false가 들어 있으면 true로 true면 false로 변경
		System.out.println("POWER : " + (power ? "ON" : "OFF"));
	}

	// 온도 +버튼
	void temperatureUp() {
		if (power && temperature < MAX_TEMPERATURE) {
			temperature++;
		}
		System.out.println(temperature);
	}

	// 온도 -버튼
	void temperatureDown() {
		if (power && temperature > MIN_TEMPERATURE) {
			temperature--;	
		}
		System.out.println(temperature);

	}

	// 풍량 버튼
	void airVolume() {
		if(power){
			if (3 < ++airVolume) {
				airVolume = 1;
			}
			System.out.println(airVolume);
		}
		
		
	}

	// 온도가 18~30 까지만 변경할 수 있게 해주고
	// 전원을 켰을 때만 버튼들이 작동되도록 메소드들을 변경해주세요.
	
	public static void main(String[] args) {
		
		AirConditioner ac = new AirConditioner();
	
		ac.power();

		System.out.println(ac.power);
		for(int i = 0; i < 30; i++){
			ac.temperatureUp();
			
			
		}
		
		
		
		for(int i = 0; i < 30; i++){
			ac.temperatureDown();
			
			
		}
		
		
		for(int i = 0; i < 10; i++){
			ac.airVolume();		
			
		}
		
		
		
		
		
	}//main
}// class
