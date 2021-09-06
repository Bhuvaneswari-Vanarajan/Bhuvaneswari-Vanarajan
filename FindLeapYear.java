package javaLearning;

public class FindLeapYear {

	public static void main(String[] args) {

		int[] year = {1700,2000,2016};
		for(int i=0; i< year.length; i++) {

			if ((year[i] % 4 == 0) && (year[i] % 100!= 0)|| (year[i]%400 == 0))
				System.out.println(year[i]+" - Leap Year");
			else 
				System.out.println(year[i]+" - Non Leap Year");
		}
	}

}
