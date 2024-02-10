package bubbleSort;
import java.util.*;
@SuppressWarnings("unused")
public class BubbleSort {

	public static void main(String[] args) {
		int initialArray[] = {21,21,3,85,9,1,45,90,6,22};
		System.out.println("\nBefore Sorting");
		printArray(initialArray);
		boolean isSwapped = true; //Inititally isSwapped property set to true thus the while loop gets started the first iteration
		while (isSwapped) {
			isSwapped = false; //The isSwapped is set to false because if the swap is not needed it will be false and stop the while loop
			//Iterating over the list
			for (int i = 0; i < initialArray.length-1; i++) {
				//comparing two elements
				if(initialArray[i] > initialArray[i+1]) {
					isSwapped = true; //If the condition is true then a swap will occur. So the isSwapped property should be set to true
					//Swapping Elements
					int tempVar = initialArray[i];
					initialArray[i] = initialArray[i+1];
					initialArray[i+1] = tempVar;
				}
			}
		}
		System.out.println("\nAfter Sorting:");
		printArray(initialArray);
	}
	//This Method just Prints
	private static void printArray(int arr[]) {
		for(int printVar : arr) {
			System.out.println(printVar);
		}
	}
}
