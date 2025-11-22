package hackerRank;

import java.util.Scanner;

/* String problem Introduction
    Lexicographically/alphabetically sorting.(Which ever word comes first alphabetically. Like dictionary)
 */
public class StringProblem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        //Taking input from the user
        Scanner InputObj = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String StringOne = InputObj.nextLine(); //Accessing the input String value and storing them in a variable

        System.out.println("Enter second String: ");
        String StringTwo = InputObj.nextLine(); //Accessing the input String value and storing them in a variable

        //Length if the two given strings
        System.out.println(StringOne.length() + StringTwo.length());
        int result = StringOne.compareTo(StringTwo);

        //Checking the strings lexicographically
        if (result <= 0 ){
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }

        //Capitalizing the first letter of String one
        System.out.println(StringOne.substring(0,1).toUpperCase()+StringOne.substring(1)
                +" "+
                StringTwo.substring(0,1).toUpperCase() + StringTwo.substring(1));

        InputObj.close(); //Tear down the resource
    }

}
