public class test {
    String breed;
    String size;
    int age;
    String color;
    public String getInfo(){
        return("Breed is:"+breed+"size is:"+size+"Age is:"+age+"color is:"+color);
    }
    public static void main(String args[]){
        test maltese = new test();
        maltese.breed = "maltese";
        maltese.size = "small";
        maltese.age = 2;
        maltese.color = "white";
        System.out.println(maltese.getInfo());
    }

}
