package itsmTraining;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SessionOne {

	public static void main(String[] args) {
		int numberlist[] = {21,34,98,1,4};
		String nameList[] = {"Peas","Mahamudul","Islam"};
		System.out.println(Arrays.toString(numberlist));
		System.out.println(Arrays.toString(nameList));
		
//		for (int i=0 ; i<numberlist.length; i++)
//		{
//			if (numberlist[i] % 2 ==0)
//			{
//				System.out.println("Even NUmbers:" + numberlist[i]);
//			}
//			else
//			{
//				System.out.println("Odd NUmbers:" + numberlist[i]);
//			}
//		}
//		Enhanced for loop
		for (int iteratingVarible : numberlist)
		{
			if (iteratingVarible % 2 ==0)
			{
				System.out.println("Even NUmbers:" + iteratingVarible);
			}
			else
			{
				System.out.println("Odd NUmbers:" + iteratingVarible);
			}
		}
		
//		String[] nameList2 = new String[2];	
		ArrayList <String> 	nameList3 = new ArrayList<String>();
		nameList3.add("Peas");
		nameList3.add("Fatbot");
		nameList3.add("Selenium");
		nameList3.add("Java");
//		System.out.println(nameList3.contains("Peas"));
//		System.out.println(nameList3.get(0));
//		System.out.println(nameList3);
		for (int iteration = 0; iteration < nameList3.size(); iteration++)
		{
			System.out.println(nameList3.get(iteration));
		}
		System.out.println("***************");
//		Enhaced For Loop
		for(String iter : nameList3)
		{
			System.out.println(iter);
		}
		System.out.println("***************");
//		Converting normal list to arraylist
		List<String> convertedNameList = Arrays.asList(nameList);
//		System.out.println(convertedNameList.isEmpty());
		for(String iter2 : convertedNameList)
		{
			System.out.println(iter2);
		}
		System.out.println("***************");

	}

}