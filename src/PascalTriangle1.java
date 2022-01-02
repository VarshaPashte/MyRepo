import java.util.Scanner;

public class PascalTriangle1 {

	public static void main(String[] args) {
		
int digit=1;
Scanner s = new Scanner(System.in);
System.out.println("Enter number of rows :");
int rows = s.nextInt(); 
	    for(int i = 0; i < rows; i++) {
	      for(int space = i; space < rows; space++) {
	        System.out.print("  ");
	      }

	      for(int j = 0; j <= i; j++) {
	        if (j == 0 || i == 0){
	          digit = 1;}
	        else{
	          digit = digit * (i - j + 1) / j;}

	        System.out.printf(digit+"    ");
	      }

	      System.out.println();
	    }
	  }}


