import java.util.Scanner;

public class HillTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  
		   
        
   
        System.out.println("Enter number of rows :");  
   
        int nrows = s.nextInt(); 
        for(int i=1;i<=nrows;i++){
        int rowCount = 1; 
        for(int sp=i;sp<=nrows;sp++){ //for space
        	System.out.print("  ");
        	}
        for(int j=1;j<i;j++){
        	System.out.print(rowCount++ +" ");//for increment
        }
        for(int j=1;j<=i;j++){
        	System.out.print(rowCount-- +" "); //for decrement
        	}
        System.out.println();
        } 
        
        }
   
	
   
          
   
        
	}


