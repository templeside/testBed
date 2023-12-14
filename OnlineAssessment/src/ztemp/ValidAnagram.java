package ztemp;

import java.util.HashMap;

public class ValidAnagram {
    /*
    counting should be same
    having the frequency, checking the counter.
    
    a-3
    n-1
    g-1
    r-1
    m-1
    */
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        
        HashMap<Character, Integer> frequency = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char currChar = s.charAt(i);
            frequency.put(currChar, frequency.getOrDefault(currChar,0)+1);
        }
        
        for(int i=0; i< t.length(); i++){
            char currChar = t.charAt(i);
            if(!frequency.containsKey(currChar))
                return false;
            
            frequency.put(currChar, frequency.get(currChar)-1);
            if(frequency.get(currChar)==0)
                frequency.remove(currChar);
        }
        return frequency.size() ==0;
    }
    
    public static void main(String[] args) {
    	
    	System.out.println(isAnagram("cat", "rat"));
    }

}
