package javaLearning;

public class FindOccuranceOfAllChars {

	public static void main(String[] args) {

		String inputString = "Learning Java";
		findOccurance(inputString);
	}

	public static void findOccurance(String inputString) {
		
		for (int i = 0; i < inputString.length(); i++) {
			int count = 0;
			if(inputString.charAt(i)!= ' ') {
			char searchChar = inputString.charAt(i);
			for (int j = 0; j < inputString.length(); j++) {
				if(inputString.charAt(j)==searchChar) {
					count++;
				}
			}
			inputString = inputString.replace(searchChar,' ');
			System.out.println("The Occurance of "+searchChar+" is :"+count);
			}
			
		}
		
	}

}
