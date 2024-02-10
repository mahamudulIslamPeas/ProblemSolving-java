package heterogram;
public class Heterogram{
    public static void main(String[] args) {
        HeterogramChecker("tthe big dwarf only jumps");
    }
    private static void HeterogramChecker(String giveString){
        char[] arr = giveString.toCharArray();
        int count = 0;
        for (int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            //The nested for loop will increase the time complexity to (n*n) thus found another approach
        //    for(int j=i+1; j<arr.length;j++){
        //     if(arr[i]==arr[j]){
        //         count++;
        //     }
           }
        if(count > 0){
            System.out.println("Has Repeating letter");
        }
        else{
            System.out.println("Does not have repeating letters");
        }
        }

    }