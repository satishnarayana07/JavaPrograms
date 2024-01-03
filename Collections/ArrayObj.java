package Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayObj {
    //to initialize instance variables
    int id;
    String name;

    ArrayObj(int i, String n){
       id=i;
       name=n;
    }
    public void display(){

        System.out.println(id+"\t"+name);
    }
}

class Group{
    public static void main(String[] args) throws IOException {
        //To accept the data from keyboard
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//create ArrayObj type array with size 5
        ArrayObj arr[]=new ArrayObj[5];
//To store 5 employee's data into array
        for(int i=0;i<5;i++){
            System.out.println("Enter id:");
            int id=Integer.parseInt(br.readLine());

            System.out.println("Enter Name:");
            String name= br.readLine();
            arr[i]= new ArrayObj(id,name);
        }
//display the ArrayObj data from the array
        for(int i=0;i<arr.length;i++){
            arr[i].display();
        }
    }
}
