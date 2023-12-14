package ztemp1;

import java.util.HashMap;
import java.util.Map;

public class MyClass {
	 
   private Map<String, Integer> map;
 
   public MyClass() {
      map = new HashMap<>();
      map.put("foo", 1);
      map.put("bar", 3);
   }
 
   public int getValue(String input, int numRetries) throws Exception {
	   System.out.println("executed");
	   try {
    	  
         return map.get(input);
      }
      catch (Exception e) {
         if (numRetries > 3) {
            throw e;
         }
         return getValue(input, numRetries + 1);
      }
   }
   
   public static void main(String[] args) throws Exception {
	   MyClass temp = new MyClass();
//	   System.out.println("output is "+ temp.getValue("foo",0));
//	   System.out.println("output is "+ temp.getValue("bar",2));
//	   System.out.println("output is "+ temp.getValue("baz",0));
	   System.out.println("output is "+ temp.getValue("fubar",1));
   }
}
