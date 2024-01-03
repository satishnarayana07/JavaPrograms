package PackStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Search {
	
	public static void main(String[] args) throws  IOException {
		
		//To accept the data from keyboard
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		//ask How many strings
		System.out.println("how many strings?");
        int n=Integer.parseInt(br.readLine());
        
        //create string type array with size n
        String str[]=new String[n];
        
        //store string into str
        for(int i=0;i<n;i++) {
        	System.out.println("enter the string:");
              str[i]=br.readLine();
             }
        
        //accept the string to search
        System.out.println("enter the string which you want to search:");
        String search=br.readLine();
        
        //take boolean value as false
        
        boolean found=false;
        
        //search for the string in str[]
        for(int i=0;i<n;i++)
        	if(search.equalsIgnoreCase(str[i]))
        	{
        		System.out.println("found at position:"+(i+1));
        		found=true;
        	}
        
        //not found display message
        if(!found)
        	System.out.println("not found in the group");
        }

}
