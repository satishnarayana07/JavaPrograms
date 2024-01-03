package Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        //create ArrayList
        ArrayList<String> arl=new ArrayList<String>();
//add four objects
        arl.add("satish");
        arl.add("Naveen");
        arl.add("Sai");
        arl.add("Sachin");

        System.out.println("Array List Objects are:"+arl); //display contents

        //Remove two objects
        arl.remove(3);
        arl.remove("Naveen");

        System.out.println("Array List Objects are:"+arl); //display contents

        System.out.println("Array List size is:"+arl.size());
        //Extract using Iterator
        Iterator it=arl.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }




    }

}
