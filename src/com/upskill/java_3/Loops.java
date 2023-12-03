package com.upskill.java_3;

public class Loops {
	/*
	 * Types of loops 1.For Loops 2.While Loops 3.Do While Loops 4.Infinite loop
	 */

	public static void main(String[] args) {
		practiceForLoop();
	//	practiceWhileLoop();
		//practiceDoWhileLoop();
		//practiceNestedForloop();

	}

	public static void practiceForLoop() { // Do again and again up to upper
											// limit
		int i; // initialize variable
		for (i = 1; i <= 10; i++) {// setting lower limit, upper limit,
									// increment or decrement
			System.out.println("For Loops Number = " + i); // statement

		}

	}

	public static void practiceWhileLoop() {                           // Do again and again until condition match
												
		int i = 1;
		while (i < 10) {                                             // setting condition
			System.out.println("While Loops number=" + i);          // statement
			i++;
		}

	}

	public static void practiceDoWhileLoop() {    //Do first then checks the condition
		int i = 1;    // Initialize the variable
		do {
			System.out.println("Do While Loop Number=" + i);
			i++;            //Increment or Decrement

		} while (i <= 10);  // checking condition
	}
	public static void practiceNestedForloop(){     //NestedForLoop- Loop inside another loop
		int i ;
		int j ;
		for(i=1; i<=10; j++){
			for(j=1; j<=10;j++){
			int multiplicationTable = i * j ;  // statement for loop 2
			System.out.print(multiplicationTable + "");
		}
		System.out.println(""); //statement for loop 1
		
	}
	}
}

