package HackerRank;

import java.util.Scanner;

public class JavaLoop2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enetr the value:");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<=i;j++){
            a=(int) (a+(Math.pow(2,j)*b));
           
            }
            System.out.println(a+" ");
        }
        
        in.close();
    }
	}


