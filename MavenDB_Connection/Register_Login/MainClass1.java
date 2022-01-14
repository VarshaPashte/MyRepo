package Register_Login;

import java.util.Scanner;

import Db_Database.DbConnection;

public class MainClass1 {
	
	String name,email,password,contact,oldpass;
	Scanner st=new Scanner(System.in);
	UserProfile us=new UserProfile();

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name,email,password,contact,oldpass;

DbConnection.db();
UserProfile us=new UserProfile();
MainClass1 mn=new MainClass1();
Scanner st=new Scanner(System.in);
System.out.println("1.for register");
System.out.println("2.for login");
System.out.println("3.for update password");

System.out.println("4.Exit");
System.out.println("Enter your choice:");
int select=st.nextInt();
switch(select){

case 1:
	mn.register();
	break;
	
case 2:
	mn.login();
	break;
case 3:
	mn.updatepass();
	break;
case 5:
	System.out.println("Thank u");
	break;
}

	}
	
public void register(){
	System.out.println("Enter your name:");
	name=st.next();
	System.out.println("Enter email Id:");
	email=st.next();
	System.out.println("Enter password");
	password=st.next();
	System.out.println("Enter your contact:");
	contact=st.next();
	us.insert(name,email,password,contact);
}
public void login(){
	System.out.println("Enter your registered name:");
	name=st.next();
	System.out.println("Enter registered password:");
	password=st.next();
	us.select(name, password);
}
public void updatepass(){
	System.out.println("Enter your old password:");
	oldpass=st.next();
	System.out.println("Enter your new password:");
	password=st.next();
	us.update(password, oldpass);
}
}
