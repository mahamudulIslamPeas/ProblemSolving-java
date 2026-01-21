package reverseString;
/* Reverse String problem
   write a function which reverses a string
 */

import java.lang.reflect.Array;

public class ReverseString {
    public static void main(String[] args) {
        String originalString = "Peas";
        String reversedString = reverse(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);

    }


    private static String reverse(String givenValue){
        char [] givenValue_Arr = givenValue.toCharArray();
        int leftPointer = 0;
        int rightPointer = givenValue_Arr.length - 1;
        while (leftPointer < rightPointer){
            char temp = givenValue_Arr[leftPointer];
            givenValue_Arr [leftPointer] = givenValue_Arr[rightPointer];
            givenValue_Arr[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }
        return new String(givenValue_Arr);
    }


}
