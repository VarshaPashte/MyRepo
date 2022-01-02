package Stringcon;

public class Abc {

	public static void main(String[] args) {
		
		String s="Sachin";  
		System.out.println(s.toUpperCase()); 
		System.out.println(s.toLowerCase());  
		System.out.println(s);
		String b="  Sachin  ";  
		System.out.println(b);   
		System.out.println(b.trim()); 
		String v="Sachin";  
		 System.out.println(v.startsWith("Sa"));//true  
		 System.out.println(v.endsWith("n"));//true 
		 System.out.println(v.charAt(0));
		 System.out.println(v.length());
		 String a=new String("Sachin");
		 String a2=a.intern();
		 System.out.println(a2);
		 int a1=10;
		 String a3=String.valueOf(a1);
		 System.out.println(a3+a1);
		 String b2="java programming";
		 String b1=b2.replace("java", "Python");
		 System.out.println(b1);
		 String c="sachin";
		 String c1=new String("sachin");
		 String c2="Sachin";
		 System.out.println(c.equals(c1));
		 System.out.println(c1.equals(c2));
		 System.out.println(c2.equals(c));
		 String d="Sachin";
		 String d1="Sachin";
		 String d2=new String("Rachin");
		 System.out.println(d.compareTo(d1));
		 System.out.println(d.compareTo(d2));
		 
		 
	}

}
