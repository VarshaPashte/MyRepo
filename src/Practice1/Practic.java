package Practice1;

public class Practic {

	public static void main(String[] args) {
		Outer b=new Outer();
		b.bike();
		
	}

}
class Outer{
	int a=10;
	public void bike(){
		
		System.out.println("hi i m user def method");
	
	class Inner{
	public void car(){
			System.out.println("i am a method local inner class method");
		}
	}
	Inner n=new Inner();
	n.car();
}
}