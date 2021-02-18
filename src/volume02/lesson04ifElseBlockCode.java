package volume02;

import java.util.Scanner;

public class lesson04ifElseBlockCode {
    public static void main(String[]args){
        int age;
        age=34;
        Scanner AgeGuess=new Scanner(System.in);
        System.out.println("Type your guess");
        if(AgeGuess.nextInt()==age){System.out.println("yes ,its corrct"); }else {System.out.println("you are wrong im 34");}




    }
}
