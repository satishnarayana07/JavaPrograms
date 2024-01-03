
public class DefaultContstructor {
	
	int id;
	String name;
	
	void constructorDisplay() 
	{
		System.out.println(id+"  "+name);
	}

	public static void main(String[] args) {

		DefaultContstructor df1 =new DefaultContstructor();
		DefaultContstructor df2 =new DefaultContstructor();
		
		df1.constructorDisplay(); //output should be 0 null (default constructor gives)
		df2.constructorDisplay(); //output should be 0 null (default constructor gives)
		
		
		
	}

}
