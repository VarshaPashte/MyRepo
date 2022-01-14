package Register_Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Db_Database.DbConnection;

public class UserProfile {
Connection con;

public UserProfile() {
	con=DbConnection.db();
	// TODO Auto-generated constructor stub
}
public void insert(String name,String email,String password,String contact ){
	try{
		PreparedStatement pd=con.prepareStatement("Insert into users(name,email,password,contact)values(?,?,?,?)");
	pd.setString(1, name);
	pd.setString(2, email);
	pd.setString(3,password);
	pd.setString(4,contact);
	int i=pd.executeUpdate();
	if(i>0) {
		System.out.println(" Register Successfully...!");
	}else {
		System.out.println("check with your query");
	}
	
	
	}catch(Exception e){
		System.out.println(e);
	}

}

	public void select(String name,String password){
		
		try{
			PreparedStatement pd=con.prepareStatement("select *from users where name = '" + name + "' " + "and password = '" + password + "' ");
			ResultSet rs= pd.executeQuery();
			
			while(rs.next()){
				String email=rs.getString("email");
				String name1 = rs.getString("name");
				
				System.out.println("Welcome "+name);
				System.out.println("Login Successfully....");
			}
			
			}catch (Exception e){
			System.out.println(e);
		} 
}
	public void update(String password,String oldpass){
		try {
			PreparedStatement pd = con.prepareStatement("update users set password='"+password+"' "
															+"where password='"+oldpass+"' ");
			int i = pd.executeUpdate();

			if(i>0) {
				System.out.println("Successful");
			}else {
				System.out.println("check with your query");
			}

		}catch (Exception e) {
			System.out.println(e);
		}
	}
	}


