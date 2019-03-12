import java.util.Scanner;


class Student {
	public String name; 
	public float cgpa; 
	public int token;	
	// A parameterized student constructor 
	public Student(String name, float cgpa, int token) { 
	
		this.name = name; 
		this.cgpa = cgpa; 
		this.token =token;
	}
	public Student(String name) { 
		
		this.name = name; 
		
	}
	
	public String getData() { 
		return name; 
	} 


}







