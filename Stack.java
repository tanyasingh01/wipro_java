
 import java.util.*;
import java.lang.*;
class Stack{
    public static void main(String args[]){
        Stack<Boolean> SB=new Stack <Boolean>();
        SB.add(true);
        SB.add(false);
        SB.add(true);
        SB.add(false);
        Iterator itr= SB.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
















