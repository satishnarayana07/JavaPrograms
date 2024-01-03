package Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//pushing,popping,searching element in stack.
public class StackEx {
    public static void main(String[] args) throws IOException {
        //create Empty stack to contain int objects
        Stack<Integer> st=new Stack<Integer>();
        //take vars
        int element,position;
        int choice=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        //display the menu as long as user choice <4

        while(choice <4){
            System.out.println("STACK OPERATIONS");
            System.out.println("1 Push an element");
            System.out.println("2 Pop an element");
            System.out.println("3 Search an element");
            System.out.println("4 EXIT");
            System.out.println("your choice:");
            choice=Integer.parseInt(br.readLine());

            //Perform a task depending on user choice

            switch (choice){

                case 1:
                    System.out.println("Enter element:");
                    element=Integer.parseInt(br.readLine());
                    //int type element is converted into Integer Object and then pushed into the stack
                    st.push(element);
                    break;

                case 2:
                    //The top most integer object is popped
                    Integer obj= st.pop();
                    System.out.println("Popped="+obj);
                    break;

                case 3:
                    System.out.println("which element?");
                    element =Integer.parseInt(br.readLine());
                    //int type element is converted into Integer Object and the Searched in the stack
                    position=st.search(element);
                    if(position == -1)
                        System.out.println("Element not found");
                     else
                        System.out.println("Position:"+ position);
                     break;

                default: //come out if user choice is other than 1,2 or 3
                    return;
            }
            //view the contents of stack
            System.out.println("Stack Content:"+st);


        }



    }
}
