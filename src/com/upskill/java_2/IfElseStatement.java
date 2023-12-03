package com.upskill.java_2;

public class IfElseStatement {

	public static void main(String[] args) {
		
		int age = 103;
		
		if (age<=13){
			System.out.println( "you are a child");
		}else if ( age > 13 && age <18){
			System.out.println("you are a teenager");
		}else if (age>=65){
			if (age >= 100){
				System.out.println("you are a champion");
			}else {
			System.out.println("you are senior");
			} 
			System.out.println("you are an adult");
		}
		
		

	}
	}


