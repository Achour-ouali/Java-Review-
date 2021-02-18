package volume3;

public class lesson13Classes {
    //class is a template it's like a master copie like a template for writing something
    //classe define the template for example a car:speed ,color,model
    //object define the class or we can say specific instance of the tamplate example car:90km/h, black,toyota


    public static void main(String[]args){

        brother hamid=new brother();
        hamid.age=42;
        hamid.colorEyes='G';
        hamid.hight=1.82;
        hamid.kids=3;
        brother hocine=new brother();
        hocine.kids=2;
        hocine.colorEyes='g';
        hocine.age=47;
        System.out.println( hocine.age);

    }}
    class brother{
        int age;
        int kids;
        double hight;
        char colorEyes;
        char status;

    }


