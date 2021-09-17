package assessmentWeek3;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class OccuranceOfCharUsingMap {
	@Test
	public void findCharOccuranceUsingMap() {
		String inputStr = "Java";
		char[] inputCharArray =inputStr.toCharArray();
        Map<Character,Integer> charCounter=new HashMap<Character,Integer>();
        
        for(int i=0;i<inputStr.length();i++)
        {
        	char ch = inputCharArray[i];
            if(charCounter.containsKey(inputCharArray[i]))
            {
                charCounter.put(ch, charCounter.get(ch)+1);
            } 
            else
            {
                charCounter.put(ch, 1);
            }
       }

       for(Character key:charCounter.keySet())
       {
           System.out.println("Occurance of "+key+" is - "+charCounter.get(key));
       }
	}

}
