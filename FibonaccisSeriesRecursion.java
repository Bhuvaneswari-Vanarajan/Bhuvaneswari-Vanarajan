package javaLearning;

import java.util.Scanner;

public class FibonaccisSeriesRecursion {
	static int num1=0, num2=1, num3=0;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter fibonacci series length:");
		int count = input.nextInt();
		
		System.out.println("The Fibonacci Series for lenght : "+count);
		System.out.print(num1+" "+num2+" ");
		printFibonacci(count-2);
		input.close();
	}

	private static void printFibonacci(int count) {
		if(count>0) {
			num3 = num1+num2;
			System.out.print(num3+" ");
			num1 = num2;
			num2 = num3;	
			printFibonacci(count-1);
		}
	}
}


