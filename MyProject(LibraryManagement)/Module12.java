package MyProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Module12 extends Module1 {
	ArrayList<Module1> arrList;
	Module1 studentDetails;
	Scanner sn;
	InputStreamReader r;  
    BufferedReader brr;
    
	public Module12() {
		sn = new Scanner(System.in);
		r=new InputStreamReader(System.in); 
		brr=new BufferedReader(r);
		studentDetails  = new Module1();
		arrList = new ArrayList<Module1>();
		// TODO Auto-generated constructor stub
	}  
    
    public ArrayList<Module1> userInputData() throws Exception{
    	System.out.println("--------------------------------------------------------");
    	
    	System.out.println("Enter name:");
    	String name=brr.readLine();
    	studentDetails.setName(name);
    	
    	System.out.println("Register no:");
    	String r_id=brr.readLine();
    	studentDetails.setR_id(r_id);
    	
    	System.out.println("Student id:");
    	String u_id=brr.readLine();
    	studentDetails.setUid(u_id);
    	
    	System.out.println("Semester:");
    	int sem=sn.nextInt();
    	studentDetails.setSem(sem);
    	arrList.add(studentDetails);
    	System.out.println("--------------------------------------------------------");
		return arrList;
		
    	
    }
}
