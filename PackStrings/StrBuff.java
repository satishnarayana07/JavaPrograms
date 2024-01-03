package PackStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrBuff {

	public static void main(String[] args) throws IOException {
		
		//create empty string buffer object
		
		StringBuffer sb=new StringBuffer();
		
		//To Accept data from keyboard
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		//Accept surname
		System.out.println("Dude! Enter Sur_name:");
		String sur_name=br.readLine();

		//Accept Middle Name
		System.out.println("Enter Middile Name");
		String Mid_name=br.readLine();
		
		//Accept Last Name
		System.out.println("Enter Last Name dude:");
		String Last_name=br.readLine();
		
		//Append sur_name to sb
		sb.append(sur_name);
		
		//Append Last to sb
		sb.append(Last_name);
		
		System.out.println("Name: " + sb);
		
		//insert Mid name after sur_name
		  int n=sur_name.length(); //n represents no.of characters in sur name
		  sb.insert(n,Mid_name); //insert mid name after nth character
		  
		  //display full name
		  System.out.println("Full Name is: "+ sb);
		  
		  //reverse and display the same
		  
		  System.out.println("Reverse Name is:"+sb.reverse());
		  }

}
