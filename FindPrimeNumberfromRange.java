package javaLearning;

import java.util.Scanner;

public class FindPrimeNumberfromRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter from Range");
		int x = input.nextInt();
		System.out.println("Enter to Range");
		int y = input.nextInt();
		System.out.println("Prime numbers between "+x+" and "+y+" is: ");

		for (int i = x; i<=y ; i++) {
			if(i!=0 && i!=1 && i==2) {
				System.out.print(i +" ");
			}
			else if(i>2){
				findPrimeNumber(i);
			}
		}

		input.close();
	}

	public static void findPrimeNumber(int i) {
		int flag=0;
		for (int j=2;j<i;j++) {
			if(i%j==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.print(i+" ");
		}
	}
}
