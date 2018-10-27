package co.za.josiahthobejane;

/**
 * This programs reverses a string passed to the reverse() method as a parameter.
 * @author Josiah Thobejane
 * @version 1.0     
 * @since 2018-10-27
 */
public class JosString {
   
    /**
     * This method is used to process the given String, reverse it and return it.          
     * 
     * @param toReverse this parameter holds the given string
     * @return String this method returns the reversed string in "String" format.
     */    
    public static String reverse(String toReverse)
    {        
       String reversed = "";
       int helper;
       
       /* Get the length of the toReverse string
        * This will help in knowing which index we should start decrementing from. 
        */
       helper = toReverse.length();
              
       for(int i = 0; i < toReverse.length(); ++i)
       {
           --helper;
           reversed += toReverse.charAt(helper);
       }
       
        // return the given string in reversed form
        return reversed;
    }
}
