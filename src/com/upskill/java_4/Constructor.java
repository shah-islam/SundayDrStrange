package com.upskill.java_4;

public class Constructor {
	//constructor is instance of class, method same as class name, java will execute constructor first
			//constructor can not be static or override nor void or return type
			//default constructor : no constructor is initialized 
			// parameterized constructor: Add different signature
			//constructor overloading : different signature
      String studentName;
      int studentAge;
	public Constructor (String name){
		studentName= name;
	
	}
	public Constructor (String name, int age){
		studentName= name;
		studentAge=age;
	}
	public static void main(String[] args) {
		
		
		 Constructor obj = new Constructor("Shah");
		System.out.println(obj.studentName);
		
		Constructor obj2 = new Constructor("Shah", 25);
       System.out.println(obj2.studentName +" "+ obj2.studentAge);
	}
	

}
