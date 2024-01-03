package Collections;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) throws IOException {
        //create an empty LinkedList to store group of elements
        LinkedList<String> ll = new LinkedList<String>();
        //add some names to linked list
        ll.add("Orange");
        ll.add("Grapes");
        ll.add("Bananas");

        //display the elements in the linked list
        System.out.println("List:" + ll);

        //vars
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String element;
        int choice=0,position;

        //Menu
        while(choice<4){
            System.out.println("\nLinked List Operations");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Insert Element");
            System.out.println("4. EXIT");
            System.out.println("Enter your Choice");
            choice=Integer.parseInt(br.readLine());

            //perform a task depending on user choice

            switch (choice)
            {
                case 1:
                    System.out.println("Enter Element:");
                    element=br.readLine();
                    System.out.println("At what position?");
                    position=Integer.parseInt(br.readLine());
                    ll.add(position-1,element);
                            break;
                case 2:
                    System.out.println("which element do you want Remove?");
                    element=br.readLine();
                    ll.remove(element);
                    break;

                case 3:
                    System.out.println("Enter position:");
                    position=Integer.parseInt(br.readLine());
                    System.out.println("Enter New Element:");
                    element=br.readLine();
                    ll.set(position,element);
                    break;

                default: return;

            }
                    //use Iterator to Retrive Elements
            System.out.println("List:");
            Iterator it=ll.iterator();
            while(it.hasNext())
                System.out.println(it.next()+" ");

        }//end of while
    }
}
