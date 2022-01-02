package Task1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
			Test m=new Test();
			float res1=m.findAv();
			System.out.printf("%.2f",res1);
			}
			public float findAv(){
				
				float res=0f;
				float res1 = 0f;
				float i=1;
				int n;
				
				Scanner s=new Scanner(System.in);
				n=s.nextInt();
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



