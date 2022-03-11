 class Super_class {
     int num=20;
     public void display(){
         System.out.println("This is the display method of superclass");
     }
    
}
class sub_class extends Super_class{
    int num=10;
  public  void display (){
        System.out.println("This is the display method of subclass");

    }
    void my_method(){
        sub_class sub=new sub_class();
        sub.display();
        super.display();
        System.out.println("value of the variable named num in sub class:"+sub.num);
    System.out.println("value of the variable named num in super class:"+super.num);
    }
public static void main(String[] args) {
    sub_class obj=new sub_class();
    obj.my_method();
}   }

