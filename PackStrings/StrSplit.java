package PackStrings;

public class StrSplit {

	public static void main(String[] args) {
		
		//take a string which is broken
		String str= "hello, this is a book on java";
		
		//declare string type array s to store pieces\words
		String s[];
		
		//split the string where space is found in str
		s=str.split(" ");
		
		//display the pieces from s
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
		
	}

}
