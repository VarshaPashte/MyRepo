package ClassContains;

public class Task2 {

	public static void main(String[] args) {
	Outer o=new Outer();
	o.bike();
	Outer.Inner b=new Outer().new Inner();
	Outer.Inner.Inner2 c=new Outer().new Inner().new Inner2();
	b.bike();
	c.bike();
	}

}
class Outer{
	void bike(){
	System.out.println("bike method from outer class");} 
	class Inner{
	void bike(){
		
		System.out.println("bike method from inner class");}
	class Inner2{
		void bike(){
			System.out.println("bike method from inner2 class");}
	}
	}
}