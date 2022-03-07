import java.util.Scanner;

public class higher_charector {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        char first=sc.next().charAt(0);
        char second=sc.next().charAt(0);
        sc.close();
        if(first>second){
            System.out.println(second+","+first);
        }else{
             System.out.println(first+","+second);
        }
    }
}
