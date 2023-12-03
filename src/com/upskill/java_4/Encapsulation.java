package com.upskill.java_4;

public class Encapsulation {
	// Encapsulation used to hide the data using setter and getter method
	
     private String name = "upskill"; //write & read
     private int ssn = 666666;       // write only
     private String username = "shah";	// read only
     
     
     //setter method-ssn   -- set the data,write
     
     public void setSSN(int value){
    	 ssn = value ;
    	 
    //getter method- username  -- get the data,read
    	 public String getUserName(){
    		 return username;
    	 }
    	 
     // setter method
    	 public void setName(string value){
    		 name = value;
    	 }
    // getter method
    	 public String getName(){
    		 return name;
    	 }
    	 
    	 
    	 
    		 
    	 }
    	 
    	 
     

        
     
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.getName());
		System.out.prinln(obj.getUserName());
		
		obj.setName("shah");
		
		
		

	}

}
