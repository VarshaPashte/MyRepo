package Stringcon;

public class ConceptString {

	public static void main(String[] args) {
		String s1="java string split method by javatpoint";  
		String[] words=s1.split("\\s");  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		} 
		String s2="welcome to split world";  
		System.out.println("returning words:");  
		for(String w:s2.split("\\s",0)){  
		System.out.println(w);  
		}  
		System.out.println("returning words:");  
		for(String w:s2.split("\\s",1)){  
		System.out.println(w);  
		}  
		System.out.println("returning words:");  
		for(String w:s2.split("\\s",2)){  
		System.out.println(w);  
		}  

		} 

	}


