package com.TestQuestion1;
import java.util.Scanner;
public class Test {
	public static void main(String args[]){
		int input1;
		
		
 		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the Count :");
		input1=scanner.nextInt();
		
		
		BowlerAverageCalculate bowlerAverageCalculate=new BowlerAverageCalculate( input1 );
		
		bowlerAverageCalculate.init();
		bowlerAverageCalculate.calculate();
		
		
		
		
		scanner.close();
		
		
		
		
		
		
		
		
		
	}

}
