package volume02;

import java.util.Scanner;

public class lesson3Scanner {
    public static void main(String[]args){
        Scanner object=new Scanner(System.in);
        int num;
        System.out.println("enter any number");
        num=object.nextInt();
        System.out.println("the number you entred is " +num);
        double num1;
        System.out.println("enter any decimal number");
        num1=object.nextDouble();
        System.out.println("the decimal number you entred is " +num1);
    }
}
