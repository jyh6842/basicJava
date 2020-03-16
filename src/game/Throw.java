package game;

public class Throw {
	int yut;
	String name;
	
	int throwYut(){
		this.yut = (int)(Math.random()*6);
		if(this.yut == 0){
			yut = -1;
		}
		return yut;
	}
	
	String yutName(int yutNumber){

		switch (yutNumber % 6) {
		case 1:
			name = "도";
			break;
		case 2:
			name = "개";
			break;
		case 3:
			name = "걸";
			break;
		case 4:
			name = "윷";
			break;
		case 5:
			name = "모";
			break;

		default:
			name = "빽도";
			break;
		}
		return name;
	}
}
