package Task1;

import java.util.Scanner;

public class ArrayTask {

	public static void main(String[] args) {
		int count = 0;
		int n;
		int c;
		int a[]=new int[20];
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		
		
		for(c=0;c<b;c++){
			a[c]=s.nextInt();
			
		}
		
		for(c=0;c<b;c++){
			if(a[c]%3==0){
				count++;
				
			}
			}
		System.out.println(count);}
		}

