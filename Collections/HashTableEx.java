package Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) throws IOException {
        //create Hashtable with Names and scores
        Hashtable<String, Integer> ht=new Hashtable<String,Integer>();
        ht.put("Ajay",50);
        ht.put("Sachin",77);
        ht.put("Dravid", 99);
        ht.put("Begum",77);

        //display all players names using Enumerator

        System.out.println("The player Names:");
        Enumeration e=ht.keys();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());

        //accept player name from keyboard
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the player Name:");
        String name=br.readLine();
        name=name.trim(); //remove unnecessary space

        //get score of the player
        Integer score=ht.get(name);
        if(score != null){
            //convert score from Integer object to int value
            int sc=score.intValue();
            System.out.println(name +"scored:"+sc);
        }
        else
            System.out.println("player not found");



    }
}
