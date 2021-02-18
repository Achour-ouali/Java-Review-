package volume02;

import java.util.Scanner;

public class lesson04ifElseOneStatement {
    public static void main(String[]args){
        int age=34;
        Scanner Guess=new Scanner(System.in);
        if(Guess.nextInt()==age)System.out.println("its correct");else System.out.println("you are wrong");
    }
}
