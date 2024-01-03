package Collections;

import java.util.HashSet;
import java.util.Iterator;

//Hashset Demo
public class HashSetEx {
    public static void main(String[] args) {
        //create hash set to store strings
        HashSet<String> hs=new HashSet<String>();

        //store some string elements
        hs.add("India");
        hs.add("America");
        hs.add("japan");
        hs.add("china");
        hs.add("America");

        //view the Hashset
        System.out.println("Hash set is:"+hs);

        //add an Iterator to hs
        Iterator it=hs.iterator();

        //display element by element using iterator
        System.out.println("Element using Iterator:");
        while(it.hasNext()){
            String s=(String) it.next();
            System.out.println(s);
        }
    }

}
