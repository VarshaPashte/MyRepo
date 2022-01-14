package MyProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Module3 extends Module2 {
	String name="Admin";
	String password="Admin";
	ArrayList<String> as=new ArrayList<String>();
	ArrayList<String> ag=new ArrayList<String>();
	ArrayList<String> af=new ArrayList<String>();
	
	Scanner sn= new Scanner(System.in);
	public void addBook() throws Exception{
	System.out.println("Enter 1:to add book for BscIT Department");
	System.out.println("Enter 2:to add book for Bcom Department");
	System.out.println("Enter 3:to add book for BAF Department");
	System.out.println("Enter 4: to exit");
	System.out.println("Enter your choice:");
	int choose=sn.nextInt();
	System.out.println("--------------------------------------------------------");
	switch(choose){
	case 1:
		BScIT();
		addBook();
	case 2:
		Bcom();
		addBook();
	case 3:
		BAF();
		addBook();
	case 4:
		m12.userInputData();
	}}
	public void BScIT(){
		System.out.println("adding book to the BscIt department:");
		String add=sn.next();
		as.add(add);
		for(int i=0;i<as.size();i++){
			System.out.println(as.get(i));
			}
		super.BScIT();
	}
	public void Bcom(){
		System.out.println("adding book to the Bcom department:");
		String add=sn.next();
		ag.add(add);
		for(int i=0;i<ag.size();i++){
			System.out.println(ag.get(i));
			}
		super.Bcom();
	}
	public void BAF(){
		System.out.println("adding book to the BAF department:");
		String add=sn.next();
		af.add(add);
		for(int i=0;i<af.size();i++){
			System.out.println(af.get(i));
			}
		super.BAF();
	}
}
