package Practice1;

public class Abstrct {

	public static void main(String[] args) {
		Xyz x=new Xyz();
		x.abc();
		x.bike();
		x.car();
		x.xyz();
}

}
abstract class Abc{
	Abc(){}
	Abc(int a){}
	public void bike(){
		System.out.println("method bike");
	}
	public void car(){
		System.out.println("method car");
	}
	abstract void abc();
	abstract void xyz();
}
class Xyz extends Abc{
	Xyz(){
		
	}
	Xyz(int d){}

	@Override
	void abc() {
		
		System.out.println("abstract method abc");
	}

	@Override
	void xyz() {
		System.out.println("abstract method xyz");
		
	}
	public void car()
	{
		super.car();
	}
	public void car(int a){}
	}
