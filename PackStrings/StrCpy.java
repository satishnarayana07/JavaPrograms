package PackStrings;

public class StrCpy {

	public static void main(String[] args) {
		String str= "hello, this is a book on java";
		char arr[]= new char[20];
		//copy from str into arr starting from 7th char to 20th character
		
		//System.out.println("before copy"+arr);
		
		str.getChars(7,21,arr,0);
		
		System.out.println(arr);
		

	}

}
