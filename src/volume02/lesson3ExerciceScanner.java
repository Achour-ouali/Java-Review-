package volume02;

import java.util.Scanner;

public class lesson3ExerciceScanner {
    public static void main(String[]args){
        Scanner object =new Scanner(System.in);
        int age,age1;

        System.out.println("how old are you ");
        age=object.nextInt();
        age1=age+14;
        System.out.println("in 14 yrears you will be " + age1);




    }
}
