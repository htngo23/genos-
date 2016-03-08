import java.util.Scanner;

public class functionalities {
	Power test = new Power();
	Scanner read = new Scanner(System.in);

	
		
	public void Task(){
	loop: while(read.hasNext()){	
	String task = read.nextLine();
	switch(task)
	{
	case "Move":
		Move();
		Repeatmenu();
	break;
	case "Blast":
		Blast();
		Repeatmenu();
	break;	
	case "Recover":
		Recover();
		Repeatmenu();
	break;	
	case "Checklevels":
		Checklevels();
		Repeatmenu();
	break;	
	default:
		System.out.println("I cannot do that");
		Repeatmenu();
	break;
	
}	
	}
}
	// why would i want to use void 

	public void Move() {
		System.out.println("I am moving forward");
		test.move();
	}

	private void task() {
		// TODO Auto-generated method stub
		
	}

	public void Blast() {
		System.out.println("Incenerate!!!");
		test.blast();
	}

	public void Recover() {
		System.out.println("Ah much better");
		test.recover();
	}
	public void Checklevels()	{
		test.checklevels();
			}	
	public void Repeatmenu(){
		System.out.println("Move, Blast,Recover, Check levels");
	}
}