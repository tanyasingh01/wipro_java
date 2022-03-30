class Static{
    static int r;
    int e;
}
class StaticTest {
public static void main(String[] args){
Static y=new Static();
Static t=new Static();
y.r=4;
y.e=5;
System.out.println(y.r);
System.out.println(y.e);
System.out.println(t.r);
System.out.println(t.e);
}    
}
