package Task1;

import java.util.Scanner;

public class Ex {
	float res=0;
	float res1 = 0;
	float i=1;
	static int n;
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		Ex m=new Ex();
		float res1=m.findAv();
		System.out.println(+res1);

	}
	public float findAv(){
		
		if(n<0){
			System.out.println("invalid input");
		}
	for(int a=5;a<=n;a++){
		if(a%5==0){
			res=res+a;
			
			res1=res/i;
			i++;
			
		}}
	return res1;
	

	}


}
