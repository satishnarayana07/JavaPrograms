package Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) throws IOException {
        //create Hashmap
        HashMap<String, Long> hm=new HashMap<String, Long>();

        //vars
        String name,str=null;
        Long phno;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        //menu
        while(true){
            System.out.println("1 Enter phone Entries:");
            System.out.println("2 Look up in the book");
            System.out.println("3 Display names in book");
            System.out.println("4 EXIT");

            System.out.print("Enter your Choice:");
            int n=Integer.parseInt(br.readLine());

            switch (n)
            {
                case 1:
                    System.out.println("Enter name:");
                    name=br.readLine();
                    System.out.println("Enter Phone no:");
                    try {
                        phno = Long.parseLong(br.readLine());
                        hm.put(name,phno);
                    }
                    catch (NumberFormatException e){
                        System.out.println("Invalid phone number format");
                    }
                    //store name and phno into Hashmap

                    break;

                case 2:
                    System.out.println("Enter Name:");
                    name=br.readLine();
                    name=name.trim(); //remove unnecessary spaces
                    //pass name and get phno
                    phno=hm.get(name);
                    System.out.println("phone number is:"+phno);
                    break;

                case 3: //use keyset() to display the names
                       //create Hashset object to store names and refer it by set reference
                    Set<String> set=new HashSet<String>();
                    set=hm.keySet();
                    System.out.println(set);
                    break;
                case 4:
                    return;


            }
        }


    }
}
