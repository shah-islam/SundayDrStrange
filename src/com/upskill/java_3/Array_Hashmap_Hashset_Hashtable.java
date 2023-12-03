package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_Hashtable {

	public static void main(String[] args) {
	// Array store multiple data using index
		
		int age = 30;
		int[] ageDrStrange = new int[]{25,21,30,35,28};
		
		//Array index           [0] [1] [2] [3] [4]
		
		System.out.println(age);
		System.out.println(ageDrStrange[2]);
		
		String[] nameDrStrange=new String [] {"shah", "ashik", "mahdi", "rasel"};
		
         System.out.println(nameDrStrange[0]);
         
         //Multi-Dimentional Array 
         int[][] ageDrStrange2D = {{25,21,30,35,28}, //[0][0] [0][1] [0][2] [0][3] [0][4]
        		                 {31,32,25}};        //[1][0] [1][1] [1][2]
         
         System.out.println(ageDrStrange2D[1][2]);
         
         //Hashmap store multiple data using key-value pair, Implementation of map interface
         HashMap <String , Integer> Student = new HashMap <String,Integer>();
         Student.put("shah",25);
         Student.put("ahik", 26);
         Student.put("mahdi",27);
         Student.put("rasel", 28);
         
         System.out.println(Student.get("shah"));
         
         HashMap <String ,String> Capital = new HashMap <String,String>();
         Capital.put("BD", "Dhaka");
         Capital.put("usa", "washington DC");
         
         System.out.println ("Capital City: " + Capital.get("BD"));
         
         //Hashset store unordered collection containing unique value,implementation of set interface
         
          HashSet <String> car = new HashSet <String>();
          car.add("BMW");
          car.add("Toyota");
         car.add("Tesla");
	   car.add("Audi");
	   
	   System.out.println(car);
	   //HashTable store multiple data using key value pair,
	   
	   
	   Hashtable<String,String>Region = new Hashtable <String,String>();
	   Region.put("BD", "Asia");
	   Region.put("usa","American");
	   System.out.println ("Region : " + Region.get("BD"));
	
	}
} 
