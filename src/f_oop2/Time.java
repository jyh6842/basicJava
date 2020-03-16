package f_oop2;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		
		if(hour < 0){
			this.hour = 0;
		}else{
			this.hour = hour % 24;
		}
		
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		
		if(minute < 0){
			this.minute = 0;
		}else if(minute > 60){
			
			setHour(this.hour + minute/60);
			this.minute  = minute % 60;
			
		}else{
			this.minute = minute;
		}
		
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		
		if(second < 0){
			this.second = 0;
		}else if(second > 60){
			
			setMinute(this.minute+ second / 60);
			this.second = second % 60;
			
			
		} else {
			this.second = second;
		}

		
		
		
	}

	@Override
	public String toString() {
		return hour +":" + minute + ":"+ second;
	}
}
