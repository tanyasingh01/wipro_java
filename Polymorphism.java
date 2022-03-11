class Polymorphism {
static int multiply(int a, int b) {
    return a*b;
}
static double multiply (int a, int b, int c) {
     return a*b;  
}
}
class poly{
    public static void main(String args[]){
        System.out.println(Polymorphism.multiply(2,4));
        System.out.println(Polymorphism.multiply(5,5,9));
    }
}
