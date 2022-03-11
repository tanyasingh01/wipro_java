 class TestEncapsulation {
  
  class Student{
  String name;
 void setName(String name ){
    this.name=name;
      }
   String getName(){
    return name;  
      }
  }
  public static void main(String[] args){
         TestEncapsulation test=new TestEncapsulation();
         Student s=test.new Student();
          s.setName("tanya");
          System.out.println(s.getName());
      }
    
  } 

