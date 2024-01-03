package PackStrings;

public class StrDemo {
	
	public static void main(String args[]) {
		
		//create strings in 3 ways
		String s1="A book on java";
		String s2= new String("i like it");
		char arr[]= {'D','r','e','m','T','e','c','h','p','r','e','s','s'};
		String s3= new String(arr);
		
		
	     //display all 3 strings
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//find length of the string
		System.out.println("string s1 length is:"+s1.length());
		
		//concatenate two strings
		System.out.println("s1 and s2 strings are:"+s1.concat(s2));
		
		//concatenate 3 strings with +
		System.out.println(s1+" from "+ s3);
		
		//test string s1 starts with A
		boolean x= s1.startsWith("A");
		//System.out.println(x);
		if(x) System.out.println("s1 starts with \'A\'");
		else
			System.out.println("s1 does not start with \'A\'");
		
		//extract substring from s2, starting from 0th char to 6th char
	        String p=s2.substring(0,7);
	        
	        //extract substring from s3 from 0 to 8th char
	        String q=s3.substring(0,8);
	        
	        //concatenate the strings p and q
	        System.out.println(p+q);
	        
	        //convert s1 into uppercase and lowercase
	        
	        System.out.println("uppercase s1:"+s1.toUpperCase());
	        System.out.println("lowercase s2:"+s1.toLowerCase());
	        }

}

