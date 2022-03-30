
class test{
    int x;
    protected int y=2;
   void t(){
       System.out.println(x);
   }
}
class test1 extends test{
    void t(){
        System.out.println(y);    }
}

public class PrivatePro {
public static void main(String args[]){
    test1 v=new test1();
   // PrivatePro p=new PrivatePro();
    test t=new test();
    t.x=10;
    System.out.println(t.x);
    System.out.println(t.y);
     t.t();
     v.t();
}    

}
