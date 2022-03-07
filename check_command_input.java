class CommandInput{
    public static void main(String args[]){
        int a=args.length;
        
        if(a!=0){
        for(int i=0;i<a;i++){
            System.out.print(args[i]+",");
        }
    }else{
        System.out.print("No Value");
    }
       
    }
}