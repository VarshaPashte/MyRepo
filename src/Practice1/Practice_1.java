package Practice1;

public class Practice_1 {

	public static void main(String[] args) {

		Son s=new Son();
		s.bike();
		s.car();
		}
}
class Father{
	public void car(){
		System.out.println("car");
	}
	public void bike(){
		System.out.println("bike");
	}
	private final void balance(){
		System.out.println("1500000");
	}
}
class Son extends Father{
	
}