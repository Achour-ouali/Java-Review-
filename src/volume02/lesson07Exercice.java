package volume02;

import java.util.Scanner;

public class lesson07Exercice {
    public static void main(String[]args)
            throws java.io.IOException {
        char pizza;
        pizza='s';
        System.out.println("select your pizza size");
        pizza=(char)System.in.read();
        switch (pizza){
            case 's':
                System.out.println("10$");
                break;
            case 'm':
                System.out.println("14$");
                break;
            case 'l':
                System.out.println("18$");
                break;
            default:System.out.println("you selected the wrong size");
        }
    }
}
