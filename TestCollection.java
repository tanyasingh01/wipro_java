/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public class TestJavaCollection{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("tanya");
        list.add("ved");
        list.add("ravi");
        list.add("vinay");
        Iterator itr=list.iterator();  
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}