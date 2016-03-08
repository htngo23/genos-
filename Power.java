
public class Power {
	
	int totalpower=100;
	
	public int move(){
		totalpower -=10;
		System.out.println(totalpower);
		return totalpower;
	}
	public int blast(){
		totalpower -=25;
		System.out.println(totalpower);
		return totalpower;
	}
	public int recover(){
		totalpower =100;
		System.out.println(totalpower);
		return totalpower;
	}
	public int checklevels(){
		totalpower -=0;
		System.out.println(totalpower);
		return totalpower;
	}
}
