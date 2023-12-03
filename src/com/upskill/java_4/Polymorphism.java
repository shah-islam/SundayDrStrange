package com.upskill.java_4;

public class Polymorphism extends MethodType {
	
	//Polymorphism is the ability of an object to take on many form.
	//- Method overloading(compile time polymorphism/static binding) same method name with different signature to overload
	//-Method overloading (Runtime polymorphism/ Dynamic binding) same method name from parent class to override
	

	public static void main(String[] args) {
		
		car("Red");
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();

	}
	
	//Method Overriding- Runtime polymorphism- Dynamic binding
	//same method name from parent class to override
	
	public static annualIncomeVoid(){
		int pastAnnualIncome = 130000;
		int rentalIncome = 18000;
		int sideIncome = 15000;
		int bonus = 25000;
		int newIncome = pastAnnualIncome + rentalIncome + sideIncome + bonus;
		System.out.println("My Annual Income = " + newIncome);
	}
	
	
	
	
	
	//Method Overloading - compile time polymorphism-static binding
	//same method  name with different signature
	public static void car(){
		System.out.println("my car is tesla");
	}
	public static void car(String Color){
		System.out.println("my car is tesla, its color is" + Color);
		
}
	public static void car(String Color, String Seat){
		System.out.println("my car is tesla, its color is"+ Color + "it has seat"+ Seat);
	}
	public static void car(int door){
		System.out.println("My car is Tesla ,it has door"+ door);
		
	}
}
		
