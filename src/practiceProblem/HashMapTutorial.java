package practiceProblem;

import java.util.HashMap;
import java.util.Map;

public class HashMapTutorial {
    public static void main(String[] args) {
        System.out.println(studentAgeData());
        System.out.println("________");
        System.out.println(studentAgeData().keySet());
        System.out.println("________");
        System.out.println(studentAgeData());
        System.out.println("________");
        System.out.println(studentAgeData());
        System.out.println("________");
        System.out.println(studentAgeData());
    }
    private static HashMap studentAgeData(){
        HashMap<String, Integer> studentData = new HashMap<String, Integer>();
        studentData.put("Riad",11);
        studentData.put("Rashed",21);
        studentData.put("Akash",30);
        studentData.put("Milon",45);
        studentData.put("RaselViper",13);
        studentData.put("Covid",null);

        studentData.putIfAbsent("covid",20);
        return studentData;
    }
}
