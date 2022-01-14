package MyProject;

import java.util.ArrayList;
import java.util.Scanner;




public class MainClass extends Module3 {

	public void library() throws Exception {
		Scanner sc= new Scanner(System.in);
		Module12 st = new Module12();
		Module1 m1=new Module1();
		Module2 m2= new Module2();
		Module3 m3=new Module3();
		ArrayList<Module1> arr =  st.userInputData();

		for(Module1 s : arr)
		{
			
			System.out.println("Name of Student"+s.getName());
			System.out.println("Register No.: "+s.getR_id());
			System.out.println("Student Id : "+s.getUid());
			System.out.println("Semester:"+s.getSem());
			System.out.println("--------------------------------------------------------");
		}
		
		System.out.println("//Welcome to Library management System//");
		System.out.println("type 1: to login as admin");
		System.out.println("type 2: to view the book");
		System.out.println("type 3: to exit");
		
		int select;
		System.out.println("Enter your choice:");
		select=sc.nextInt();
		switch(select){
		case 1:
			System.out.println("--------------------------------------------------------");
			System.out.println("Enter name:");
			String adminName=sc.next();
			System.out.println("Password");
			String adminPassword= sc.next();
			System.out.println("--------------------------------------------------------");
			if(adminName.equals(m3.name)&&adminPassword.equals(m3.password)){
				System.out.println("Login Successfully");
				m3.addBook();
				System.out.println("--------------------------------------------------------");
			}else{
				System.out.println("Invalid name or password");
			}
			break;
			
		case 2:
			
			System.out.println("Enter Username:");
			String sname=sc.next();
			System.out.println("User Password");
			String sPassword= sc.next();
			System.out.println("--------------------------------------------------------");
			if(sname.equals(m2.uname)&&sPassword.equals(m2.upassword)){
				System.out.println("Login Successfully");
				System.out.println("--------------------------------------------------------");
				m2.viewBook();
				}else{
					System.out.println("Invalid name or password");
				}
		   
			break;
		
		case 3:
			library();
		}
		
		
		
	}

}
