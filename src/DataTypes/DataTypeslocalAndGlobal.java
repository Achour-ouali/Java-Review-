package DataTypes;
public class DataTypeslocalAndGlobal {
    //Global variables there two type instance variable and static variables
    //static in can be use any wher out side of this class when the access modifier par default it means public
    //memory allotted only one it means it doesnt change
    //direct access
    static int a=34;
    static String b="abc";
    static double c=12.3;
    //declared inside the class
    //instance variable it can be use anywhere by using the object
    int m=10;
    double h=12;
    String l="str";
    public static void main(String args[]){
        //there ie a local variable the one inside the methodes
        //direct access
        int a1=1;
        String b="l";
        char c='@';
        double t=12.9;
       //just call it by the variable name since it inside the methode
        System.out.println(a1);
       //instane one we call it with object name
        DataTypeslocalAndGlobal data=new DataTypeslocalAndGlobal();
        System.out.println(data.h);
        //static just call the variable name since it static
        System.out.println(a);
    }
}
