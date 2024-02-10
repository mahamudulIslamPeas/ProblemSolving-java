package binarySearch;
public class binarySearch {
    public static void main(String[] args) {
    	//Insert sorted arrays only. Precondition of Binary Search algorithm is a sorted array as input
    	int searchElem[] = {2,1,3,5,6,7,21}; 
        System.out.println(searchNumber(searchElem,5));
    }

    //This method returns the index number of the searched number
    private static int searchNumber(int givenArray[],int numberToFind){
        int low = 0;
        int high = givenArray.length;
        while(low <= high){
            /*These two variables (middlePoint, middleElment) should be intialiazed inside the loop.
            As the loop continues to iterate it will set the values dynamically as the middlePoint 
            is an index and it's value middleElment also changable with each iteration od while loop */ 
            int middlePoint = (high+low)/2;
            int middleElment = givenArray[middlePoint];
            
            if(middleElment == numberToFind){
                return middlePoint;
            }
            if(middleElment > numberToFind){
                high = middlePoint-1;
            }
            else{
                low = middlePoint+1;
            }
        }
        return -1;
    }
}
