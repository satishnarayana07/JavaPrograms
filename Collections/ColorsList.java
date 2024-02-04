package Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColorsList {

	public static void main(String[] args) throws Exception {
		List<String>  ls =new ArrayList<String>();
		ls.add("Blue");
		ls.add("Green");
		ls.add("white");
		ls.add("pink");
		 System.out.println("List:" + ls);
		
	//ls.add(0,"Sri Sai");
	//ls.add(6,"Sambasiva");
	
	//System.out.println(ls);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String element;
	int choice=0,position;
	
while(choice<5) {
		System.out.println("Enter your position to print List items:");
	choice=Integer.parseInt(br.readLine());
	switch(choice)
	
	{
	case 1: 
		     
		System.out.println("first postition");
	       //position=Integer.parseInt(br.readLine());
		 element=ls.get(0);
		System.out.println("0th Index element was:"+element);
		break;
		
	case 2:
		System.out.println("second position");
		//position=Integer.parseInt(br.readLine());
		element=ls.get(1);
		System.out.println("second Index element was:"+element);
		break;
		
	case 3:
		System.out.println("3rs position");
		//position=Integer.parseInt(br.readLine());
		element=ls.get(2);
		System.out.println("Third Index element was:"+element);
		break;
		
	case 4:
		System.out.println("4th position");
		//position=Integer.parseInt(br.readLine());
		element=ls.get(3);
		System.out.println("Fourth Index element was:"+element);
		break;
		
		default:
				 System.out.println("sorry invalid!!"+ "\t" +"only four elements allowed");
	}
	      
	}
 
		
	}	}

	


