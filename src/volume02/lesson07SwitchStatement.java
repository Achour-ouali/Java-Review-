package volume02;

import java.util.Scanner;

public class lesson07SwitchStatement {
    public static void main(String[]args){
        int month;
        month=0;
        System .out.println("Type your favorite month");
        Scanner yourMonth=new Scanner(System.in);
        if(yourMonth.hasNextInt()==true)month=yourMonth.nextInt();
        switch (month){
            case 1:
                System.out.println("january is my favorite month");
                break;
            case 2:
                System.out.println("February is my favorite month");
                break;
            case 3:
                System.out.println("Mars is my favorite month");
                break;
            case 4:
                System.out.println("April is my favorite month");
                break;
            case 5:
                System.out.println("Mai is my favorite month");
                break;
            case 6:
                System.out.println("June is my favorite month");
                break;
            case 7:
                System.out.println("July is my favorite month");
                break;
            case 8:
                System.out.println("Augost is my favorite month");
                break;
            case 9:
                System.out.println("September is my favorite month");
                break;
            case 10:
                System.out.println("october is my favorite month");
                break;
            case 11:
                System.out.println("November is my favorite month");
                break;
            case 12:
                System.out.println("December is my favorite month");
                break;
            default:System.out.println("you entred the wrong number");

        }
    }
}
