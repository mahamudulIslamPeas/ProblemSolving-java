package reverseString;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindromeChecker("mom"));
    }
    /** Matches the String given and reversed String
     * @param word - String value to check whether it is a palindrome or not
     * @return boolean
     * @author - Mahamudul Islam
     */
    private static boolean palindromeChecker(String word){
        String reversedString  = stringReverse(word);
        return reversedString.equalsIgnoreCase(word);
    }

    /** Reverses a String
     * @param word- String to reverse
     * @return reversed string
     * @author - Mahamudul Islam
     */
    private static String stringReverse(String word){
        char[] wordArray = word.toCharArray();
        int leftPoint = 0;
        int rightPoint = wordArray.length-1;
        while(leftPoint < rightPoint){
            char temp;
            temp = wordArray[leftPoint];
            wordArray[leftPoint] = wordArray[rightPoint];
            wordArray[rightPoint] = temp;
            leftPoint++;
            rightPoint--;
        }
        return new String(wordArray);
    }
}
