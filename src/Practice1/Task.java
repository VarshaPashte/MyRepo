package Practice1;

public class Task {

	public static void main(String[] args) {
		Cricket c=new Cricket();
		c.Ipl();
}
}
class Game{
	void Football(){
		System.out.println("football from game class");
	}
	Game(){
		this("f");
		System.out.println("def cons from game class");	
	}
	Game(String s){
		super();
		System.out.println("para cons from game class");
	}
}
class Cricket extends Game{
	void Ipl(){
		super.Football();
		System.out.println( "ipl from cricket class");
	}
	Cricket(){
		this("g");
		
		System.out.println("def from cricket class");	
	}
	Cricket(String c){
		super();
		System.out.println("para cons from cricket class"+c);
	}
}

