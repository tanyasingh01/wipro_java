class Throws1 {
    public int multiply(int a, int b) throws ArithmeticException {
        int i=a/b;
        return(i);
    }
    public static void main(String args[]){
Throws1 Throws2=new Throws1();
Throws2.multiply(4,2);
System.out.println(Throws2.multiply(4,2));
    }
}
