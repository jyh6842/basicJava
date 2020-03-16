package e_oop;

public class TV {
	//TV와 최대한 비슷하게 TV 클래스를 만들어주세요
	boolean power;
	int volume;
	int channel;
	boolean mute;
	int temp_volume;
	
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 40;
	final int MIN_CHANNEL = 1;
	final int MAX_CHANNEL = 100;
	
	TV(){
		power = false;
		volume = 5;
		channel = 7;
		mute = false;
		temp_volume = volume;
	}
	
	void power(){
		power = !power;
		System.out.println("POWER : " + (power ? "ON" : "OFF"));
	}
	
	void volumeUp(){
		if(power && volume < MAX_VOLUME){
			volume++;
		}
		temp_volume = volume;
		System.out.println("볼륨 : " +volume);
	}
	
	void volumeDown(){
		if(power && volume >MIN_VOLUME){
			volume--;
		}
		temp_volume = volume;
		System.out.println("볼륨 : " + volume);
	}
	
	void channelUp(){
		if(power && channel < MAX_CHANNEL){
			channel++;
		}
		System.out.println("채널 : "+ channel);
	}
	
	void channelDown(){
		if(power && channel > MIN_CHANNEL){
			channel--;
		}
		System.out.println("채널 : "+ channel);
	}
	
	void mute(){
		mute = !mute;
		if(power){
			if(mute){
				temp_volume = volume;
				volume = MIN_VOLUME;
				System.out.print("음소거 : ");
			}else {
				volume = temp_volume;
				System.out.print("음소거 제거 : ");
			}
		}
		System.out.println(volume);
	}
	
	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.power();
//		tv.power();
		
		tv.channelUp();
		tv.channelDown();
		
		tv.volumeUp();
		tv.volumeDown();
		
		tv.mute();
		tv.mute();
		
	}
	
}
