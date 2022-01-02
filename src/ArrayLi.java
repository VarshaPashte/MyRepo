import java.util.Scanner;

public class ArrayLi {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int a1[][]=new int[3][3];
	System.out.println("enter elements:");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			a1[i][j]=s.nextInt();
		}
	}
	
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			System.out.print(a1[i][j]+" ");
		}
		System.out.println();
	}

	}

}
