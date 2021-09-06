package javaLearning;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to find factorial");
		int number = input.nextInt();
		int fact=	factorial(number);
		System.out.println("Factorial of "+number+" is : "+fact);
		input.close();

		// TODO Auto-generated method stub

	}

	public static int factorial(int number) {
		if(number==0) {
			return 1;
		}else
			return (number*factorial(number-1));
	}

}
