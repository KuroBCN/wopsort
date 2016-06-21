import java.io.*;
import java.util.*;
import java.lang.*;


import java.util.Comparator;

public class Palindrome {


    static String orderInput(String string) throws Exception{

        String[] input = string.split(" ");
        ArrayList<String> numbers = new ArrayList<String>();
        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<String> result= new ArrayList<String>();

        // Separate info
        for ( String cadena : input){
            boolean isNumeric = Palindrome.isInteger(cadena);
            if  (isNumeric)     numbers.add(cadena);
            else                strings.add(cadena);
        }

        Collections.sort(numbers);
        Collections.sort(strings);

        // Add ordered strings
        int numbersIndex = 0;
        int stringsIndex = 0;

        for ( String cadena : input){
            boolean isNumeric = Palindrome.isInteger(cadena);
            if  (isNumeric){
                result.add(numbers.get(numbersIndex));
                ++numbersIndex;
            }else{
                result.add(strings.get(stringsIndex));
                ++stringsIndex;
            }
        }

        // Convert to string
        String listString = "";
        for (int index=0;index<result.size();++index ) {
            if (index > 0)
                listString += " ";
            listString += result.get(index);
        }

        return listString;
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
};
