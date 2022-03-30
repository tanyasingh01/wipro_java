class Exception{
    public static void main(String[] args){
       String s=null; 
       try{
           System.out.println(s.length());
       }
       catch(NullPointerException p){
           System.out.println(p);
        }
    }
}