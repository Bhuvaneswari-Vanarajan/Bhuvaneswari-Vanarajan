package javaLearning;

public class StringReverseOddNumbers {

	public static void main(String[] args) {

		String inputString = "Maven";
		String outputString ="";

		int length = inputString.length();
		for(int i=length-1; i>=0; i--) {
			if(i%2==0) {
				outputString=outputString+inputString.charAt(i);
			}
		}
		System.out.println("OutputString : "+outputString);
	}

}
