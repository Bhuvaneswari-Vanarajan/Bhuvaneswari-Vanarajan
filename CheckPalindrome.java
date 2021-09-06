package javaLearning;

import java.util.Scanner;

public class CheckPalindrome {
public static int number;
	public static void main(String[] args) {
		System.out.println("Enter Number to check Palindrome or not");
		Scanner input = new Scanner(System.in);
		number=input.nextInt();
		int temp=number;
		checkPalindrome(temp);
		input.close();
	}

	public static void checkPalindrome(int temp) {
	int rem, reverse=0;
		while(temp>0) {
			rem = temp%10;
			reverse = (reverse*10)+rem;
			temp = temp/10;
		}
		System.out.println("Reverse of the Number - "+number+" is : "+reverse);
		if(number==reverse) {
			System.out.println("The Number - "+number+" is a Palindrome Number");	
		}else {
			System.out.println("The Number - "+number+" is not a Palindrome Number");
		}
	 
	}
	
}
