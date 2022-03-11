public class Inheritance {
    int age;
    String name;


     Inheritance (int age,String name){
        this.age =age;
        this.name=name;
    }
    public void getage(){
        System.out.println("The value of the variable named age is super class is:"+age+name);
    }
}
     class subclass extends Inheritance {
        subclass(int age,String name){
            super(age,name);
        }
    }
class run{
    public static void main(String args[]){
            subclass s = new subclass (24,"hello");
            s.getage();
        }
}
    

