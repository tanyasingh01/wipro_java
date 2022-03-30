class throw1 {
    void validate(int age){
        if(age<20){
            throw new ArithmeticException("person is not eligible to vote");
        }
        else{
            System.out.println("person is eligible to vote");
        }
    }
    public static void main(String args []){
        throw1 throw2=new throw1();
        throw2.validate(21);
        System.out.println("rest of the code");
    }
}
