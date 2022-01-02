package Task1;

import java.util.Scanner;

public class EvenNo {
static int s;
int c;
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enetr the no.:");
		s=a.nextInt();
		int num=generateCode(s);
		System.out.println("even"+num);
	}
	
	
	public static int generateCode(int coup){
		
		int n=s/10;
		for(n=0;n<=32767;){
			n=n/10;
			if(n%2==0){
				
			s=s%10;
		
		}}System.out.println(n);
		return coup;
		}
	
}

