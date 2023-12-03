package com.upskill.java_1;

public class variables {
	
	//Variable in Java
	
			// Instance or global variable -variables declared in class level,outside method
			
			//static variable-variable belong to class and don't required creating object
			
			//Local variable - variables declared in method
			
	//Method parameter- variables used as method parameter
			


	public static void main(String[] args) {
		
		variables obj = new variables();
		obj.texas("steak");
		obj.newyork();
		
		System.out.println(obj.country);
		System.out.println(president);
		
		
	
	

	}
	String country= "USA"; // Instance or global variable -variables declared in class level,outside method
	static String president= "Biden";//static variable-variable belong to class and don't required creating object
	
	public static void newyork(){
		String city = "Queens"; //Local variable - variables declared in method
		String police= "NYPD";
		System.out.println(police);
	}
		
	
	


    public static void texas(String food){        //Method parameter- variables used as method parameter
    	String city = "Austin";
    	String police = "APD";
    	System.out.println(police);
    	System.out.println(food);
    }
    	
    }
