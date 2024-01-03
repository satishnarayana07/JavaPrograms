package PackStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) throws IOException {
		
		//Accept the string from keyboard
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String str=br.readLine();
		
		//keep original string in Temp
		String temp=str;
		
		//convert string into string Buffer
		StringBuffer sb=new StringBuffer(str);
		
		//now reverse the string in stringBuffer
		sb.reverse();
		
		//convert the stringbuffer into string
		str=sb.toString();
		
		//compare the original string in temp with reversed string
		
		if(temp.equalsIgnoreCase(str))
                 System.out.println(temp+" is palindrome");
		else
			System.out.println(temp +" is not palindrome");

	}

}
