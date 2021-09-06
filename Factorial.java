package javaLearning;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to find factorial");
		int number = input.nextInt();
		int fact=1;
		for (int i = 1; i <=number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of "+number+" is : "+fact);
		input.close();
	}
}
