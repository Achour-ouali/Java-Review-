package volume1;
public class Lesson03 {
    //double is a 64 bits number can hold numbers with decimal points
    public static void main(String[] args){
     double inches ,centemeters;
     int num1;
     double num2;
     num1=12/5;
     num2=12.0/5.0;
     inches=5.11;
     centemeters=inches*2.54;
     System.out.println(inches+"inches is equal to " +centemeters +"centemeters");
        System.out.println(num1 + "that one is int number  " +num2 +"is double number");
        double celcius , farenheit;
        celcius=33.0;
        farenheit=(9.0 /5.0)*celcius+32;
        System.out.println(farenheit);
        double celcius1 , farenheit1;
        farenheit1=90;
        celcius1=(farenheit1/(9.0/5.0));
        System.out.println(celcius1);
        double meters, feet;
        feet=10.5;
        meters=feet*0.305;
        System.out.println("feet "+feet +"is = " +meters+("meter"));

    }
}
