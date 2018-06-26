package com.TestQuestion1;

import java.util.Scanner;

public class BowlerAverageCalculate {
	private int count;
	private int chageIntoInt[];
	//	private int a[];
	private String input2[];

	public BowlerAverageCalculate(int count) {
		super();
		this.count = count;
		input2 = new String[count];
	}

	Scanner scanner = new Scanner(System.in);

	public void init() {
		for (int i = 0; i < input2.length; i++) {
			input2[i] = scanner.nextLine();

		}
	}

	public void calculate() {
		for (int i = 0; i < input2.length; i++) {
			char[]a=input2[i].toCharArray();
			chageIntoInt=new int[a.length];
			for(int j=0;j<chageIntoInt.length;j++){
				chageIntoInt[i]=Character.getNumericValue(a[i]);
			}
			
			


		}

		scanner.close();
	}

}
