/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Test1{
    public static void main(String args[]){
        Vector<String> Al=new Vector<String>();
        Al.add("CSK");
        Al.add("RCB");
        Al.add("MI");
        Al.add("SRH");
        Al.add("DC");
        Iterator ipl=Al.iterator();
        while(ipl.hasNext()){
            System.out.println(ipl.next());
        }
    }
}
