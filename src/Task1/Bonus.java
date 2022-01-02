package Task1;

import java.util.Scanner;

public class Bonus {
static int s;
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		s=a.nextInt();
		int salary=calculatebonus(s);
		System.out.println(salary);
		if(s<0){
			System.out.println("Number is too small");	
			}else
			if(s>32767){
			System.out.println("Number is too large");
			}

	}
	static int calculatebonus(int basic){
		
		if(s>20000&&s<=32767){
			basic=(s/100*17)+1500;
			}else
		if(s>15000&&s<=20000){
			basic=(s/100*15)+1200;
			}else
		if(s>10000&&s<=15000){
			basic=(s/100*12)+1000;
			}
		return basic;
		
	}

}
