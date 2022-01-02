package Task1;

import java.util.Scanner;

public class Example {
static int n, s;
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enetr the no.:");
		s=a.nextInt();
		Example e=new Example();
		e.generateCode(s);
		
	}

	int generateCode(int c){
		int num;
		int num1;
		int cal=0;
		int cal2 = 0;
		if(s<0){
			System.out.println("number is too small");
		}
		if(s>32767){
			System.out.println("number is too small");
		}
		
		if(s>0){
		
			num1=s/10;
			
			if(num1%2==0){
			}
			System.out.println(num1);
			}s=s%10;
		return 0;
			}
		
	
	}

