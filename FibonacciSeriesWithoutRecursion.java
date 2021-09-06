package javaLearning;

import java.util.Scanner;

public class FibonacciSeriesWithoutRecursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter fibonacci series length:");
		int count = input.nextInt();
		int num1=0, num2 =1, num3;
		System.out.println("The Fibonacci Series for lenght : "+count);
		System.out.print(num1+" "+num2+" ");
		for (int i = 2; i < count; i++) {
			num3 = num1+num2;
			System.out.print(num3+" ");
			num1 = num2;
			num2 = num3;		
		}
		input.close();
	}

}
