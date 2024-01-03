package Collections;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) throws IOException {
        //To accept the data from keyboard
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        //create and array
        int[] arr =new int[5];

        //store elements into array
        for(int i=0;i<5;i++){
            System.out.println("Enter some Random Integers");
            arr[i]=Integer.parseInt(br.readLine());
        }
        //display the arr[] contents
        System.out.println("contents of the array:");
        display(arr);

        //sort the array in ascending order
        Arrays.sort(arr);

        //display the sorted content
        System.out.println("the Sorted array is:");
        display(arr);

        //Now search for element
        System.out.println("which element do you want to search");
        int element=Integer.parseInt(br.readLine());
        int index=Arrays.binarySearch(arr,element);
        if(index<0)
            System.out.println("element not found");
            else
            System.out.println("Element found at position:\t"+(index+1));



    }

    //display method uses for each loop
    static void display(int arr[])
    {
        for(int i:arr)
            System.out.println(i);
    }
}//end of arrays Demo class
