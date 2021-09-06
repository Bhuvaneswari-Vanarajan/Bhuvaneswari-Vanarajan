package javaLearning;

public class FindOccuranceOfChars {

	public static void main(String[] args) {

		String inputString = "Learning Java";

		findOccurance(inputString,'L');
		findOccurance(inputString,'e');
		findOccurance(inputString,'a');
	}

	public static void findOccurance(String inputString, char searchChar) {
		int count=0;

		for (int i = 0; i < inputString.length(); i++) {
			if(inputString.charAt(i)==searchChar) {
				count++;
			}
		}
		System.out.println("The Occurance of "+searchChar +" is -"+count);
	}

}
