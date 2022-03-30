/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public class TestCollection1{
    public static void main(String args[]){
        LinkedList<Integer> Ul=new LinkedList <Integer>();
        Ul.add(5);
        Ul.add(4);
        Ul.add(3);
        Ul.add(2);
        Iterator itr=Ul.iterator();  
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
