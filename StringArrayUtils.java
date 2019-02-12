import java.util.Arrays;
import java.util.ArrayList;
/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int max = array.length;
        int lastNumber = max -1;
        return array[lastNumber];

    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int lastNumber = array.length;
        int secondToLast = lastNumber - 2;
        return array[secondToLast];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean contains = false;
        int arrayLength = array.length;
        int arrayLengths = arrayLength - 1;
        for(int i = 0; i <= arrayLengths; i++) {
            if(array[i] == value) {
                return contains = true;
            };   

        } return contains;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversedArray = new String[array.length];
        int length = array.length -1;
        for(int i=length; i>=0; i--) {
            reversedArray[length-i] = array[i];
        }
        return reversedArray;

        /**
        int arrayList = array.length;
        int arrayLists = arrayList - 1;
        String[] arrayReverse = new String[arrayList];
        for(int j = arrayList; j >=0; j--)
        arrayReverse[j] = array[j];
        return arrayReverse;   */
    } 

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ //return false; TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversedArray = new String[array.length];
        int length = array.length -1;
        boolean isPalindromic = false;
        for(int i=length; i>=0; i--) {
            reversedArray[length-i] = array[i];
        } 
        for(int j = 0; j < (length +1); j++){
            if(array[j] == reversedArray[j]) {
                isPalindromic = true;
        }
        return isPalindromic;
    } return isPalindromic;
}

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean pangramic = false;
        int length = array.length;
        String newArray;
        newArray = Arrays.toString(array);
        String compare = newArray.toLowerCase().replaceAll("\\s","");
        String alphabet = "abcdefghijklmonpqrstuvwxyz";
        alphabet = alphabet.replaceAll(compare, "");
     
        if(alphabet.equals("")) {
            return true;
        }
    
        /*for (char i = 'a'; i <= 'z'; i++) {
        if(compare.contains(i)) {
        }
        }*/
        return pangramic;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        int arrayLength = array.length;
        int arrayLengths = arrayLength - 1;
        for(int i = 0; i <= arrayLengths; i++) {
            if(array[i] == value) {
                counter++;
            };   

        } return counter;
        
    }
        /*int length = array.length;
        int counter = 0;
        for (int i =0; i < length; i++) {
            if(array[i] == value) {
            counter = counter++;
            } return counter++;
        } return counter++;
    }
*/
    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList <String> newArray = new ArrayList<String>();
        for(int i = 0; i<array.length; i++) {
            if(array[i] != valueToRemove) {
            newArray.add(array[i]);}
    }
    String[] array2 = new String[newArray.size()];
    array2 = newArray.toArray(array2);
    return array2;
   
}

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList <String> newArray = new ArrayList <String> ();
        newArray.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if( array[i-1] != array[i]) {
                newArray.add(array[i]);
        }
        
    } 
    String[] stringArray = new String[newArray.size()];
        stringArray = newArray.toArray(stringArray);
    return stringArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList <String> newArray = new ArrayList <String> ();
        
        String consecutive = "";
        for (int i = 0; i < array.length; i++) {
            if(consecutive == "") {
             consecutive = consecutive + array[i];   
            }
            else if( array[i-1] == array[i]) {
                consecutive = consecutive + array[i];
            }
                else if (array[i-1] != array[i]) {
                    newArray.add(consecutive);
                    consecutive = array[i];
                }
            if (i == array.length-1) {
                newArray.add(consecutive);
            } 
        
    } 
    String[] stringArray = new String[newArray.size()];
        stringArray = newArray.toArray(stringArray);
    return stringArray;
    }

}
