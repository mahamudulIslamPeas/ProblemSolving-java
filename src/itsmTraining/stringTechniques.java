package itsmTraining;

import java.util.Arrays;

public class stringTechniques {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		string is object in java. It can be declared in two ways. By letarals and by new keywords
		String myName = "Peas";
		String myCopyName = "Peas";
		String myCompanyName = "SELISE Digital Platforms";
		
		String myVirtualName = new String("FatBot96");
		
		String myCopyVirtualName = new String("FatBot96");
		

		System.out.println(myName.charAt(0));
		String[] myCompanyNameSplitted = myCompanyName.split("Digital");
		System.out.println(Arrays.toString(myCompanyNameSplitted));
		for (int i=0;i < myName.length(); i++)
		{
			System.out.println(myName.charAt(i));
		}
	}

}

