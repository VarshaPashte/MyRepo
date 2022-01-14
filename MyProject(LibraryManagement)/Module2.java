package MyProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Module2 extends Module12{
	Module12 m12=new Module12();
	String uname="user";
	String upassword="user";
	Scanner st=new Scanner(System.in);
	ArrayList<String> as=new ArrayList<String>();
	ArrayList<String> ag=new ArrayList<String>();
	ArrayList<String> af=new ArrayList<String>();
	
	public void viewBook() throws Exception{
		System.out.println("Enter 1:to view book for BscIT Department");
		System.out.println("Enter 2:to view book for Bcom Department");
		System.out.println("Enter 3:to view book for BAF Department");
		System.out.println("Enter 4: to exit");
		System.out.println("Enter your choice:");
		int choose=st.nextInt();
		System.out.println("--------------------------------------------------------");
		switch(choose){
		case 1:
			BScIT();
			viewBook();
		case 2:
			Bcom();
			viewBook();
		case 3:
			BAF();
			viewBook();
		case 4:
			m12.userInputData();
		}}
	
	public void BScIT(){
		
		
		
		 as.add("java programming");
		 as.add("python");
		 as.add("C Programming");
		 as.add("Mathematics");
		 as.add("Digital electronics");
		 		
		 
		 
		 for(int i=0;i<as.size();i++){
				System.out.println(as.get(i));
				}
		 System.out.println("--------------------------------------------------------");
	}
	
	public void Bcom(){
		
		ag.add("Accountancy");
		ag.add("Statistics");
		ag.add("Economics");
		ag.add("Finance");
		ag.add("English");
		ag.add("Marketing");
		
		
		for(int i=0;i<ag.size();i++){
			System.out.println(ag.get(i));
			}
		System.out.println("--------------------------------------------------------");
	}
	
	public void BAF(){
		
		af.add("Financial Accounting");
		af.add("Cost accounting");
		af.add("Business Communication");
		af.add("Business economics");
		
		
		for(int i=0;i<af.size();i++){
			System.out.println(af.get(i));
			}
		System.out.println("--------------------------------------------------------");
	}

}
