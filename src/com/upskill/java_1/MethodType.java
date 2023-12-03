package com.upskill.java_1;

public class MethodType {
	
	/* Types of Method
	 1. void Method
	 2. static Method
	 3. Return Type method
	 */
	

	public static void main(String[] args) {
		MethodType obj=new MethodType ();
		obj.annualIncomeVoid();
		
		WeeklyIncomeStatic();
		
		System.out.println("My Monthly Income = "+ obj.monthlyIncomeReturn());
		System.out.println(name());
		
	}
	static int hourlyIncome =65;
	//Void Method
	public void annualIncomeVoid(){
		int calculateAnnualIncome=hourlyIncome * 2000;
		System.out.println("My Annual Income= " + calculateAnnualIncome);
	}
	//Static method
	public static void WeeklyIncomeStatic(){
		int calculateWeeklyIncome=hourlyIncome * 40;
		System.out.println("My weekly Income= " + calculateWeeklyIncome);

}
	//return type method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome= hourlyIncome * 180;
		return calculateMonthlyIncome;
		
		
		
		
	}
	
	public static String name (){
		return "shah";
	}
}
