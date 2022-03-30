class LocalGlobal {
public static void main(String[] args) {
    LocalGlobal t= new LocalGlobal();
Global G= t.new Global();
G.c();
G.d();
} 
 class Global{
     int i=7;
     void c(){
         int i=5;
         System.out.println(i);
     }
     void d(){
         int i=4;
         System.out.println(i);
     }
 }  
}
