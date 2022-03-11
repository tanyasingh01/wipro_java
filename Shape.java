abstract class Shape {
  abstract void draw ();  
}
class rectangle extends Shape {
    void draw(){
         System.out.println("drawing rectangle");}
    }
    class circle1 extends Shape{
        void draw(){
             System.out.println("drawing circle"); }
    }
    class TestAbstraction1{
        public static void main(String[] args){
          Shape S=new circle1();
            S .draw();
        }
    }

