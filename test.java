import java.util.*;
class Test{
    public static void main(String[] args){
    int a;
     Scanner sc=new Scanner(System.in);
     a=sc.nextInt();
     if(a<0){
         System.out.println("negative number");
     }else if(a>0){
         System.out.println("positive number");
     }else{
         System.out.println("zero");
     }

    }
}