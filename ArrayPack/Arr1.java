package ArrayPack;
import java.io.*;

public class Arr1 {

	public static void main(String[] args) throws IOException {
		
		//Accept values from keyboard
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("How Many subjects do you want Enter");
		
		int n= Integer.parseInt(br.readLine()); //reading value from keyboard
		
		int marks[]= new int[n]; //Jvm creates size of the array in dynamic memory
		
		for(int i=0;i<n;i++) { //store subject wise marks in array in dynamic memory
			
		System.out.println("enter marks");
			marks[i]=Integer.parseInt(br.readLine()); //marks reading from keyboard
			
		}
		
		int tot=0;
		for(int i=0;i<n;i++) {  //in array index block subject wise marks adding
			tot=tot+marks[i];
		}
			System.out.println("total Marks:"+tot);
		
			float percentage= (float)tot/n; //Percentage of marks with type casting
			
			System.out.println("total marks percentage is:"+percentage);
		
	}

}
