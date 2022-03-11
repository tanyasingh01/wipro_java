 class CopyArray {
   public static void main(String[] args){
       int arr []={1,2,3,4,5};
       int ar []=new int[5];
       for(int i=0;i<5;i++){
           ar[i]=arr[i];
       }
       for(int i=0;i<5;i++){
           System.out.println(arr[i]);
           System.out.println(ar[i]);
       }
   } 
}
