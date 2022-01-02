package Task1;

import java.util.Scanner;

public class PracticalPascalT {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int no=s.nextInt();
		int space=no;
		int num=1;
		for(int i=0;i<no;i++){
			for(int s1=1;s1<=space;s1++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print(num+" ");
				num=num*(i-j)/(j+1);
			}
			space--;
			System.out.println();
		}
	}

}
