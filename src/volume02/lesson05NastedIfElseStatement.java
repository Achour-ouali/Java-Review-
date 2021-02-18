package volume02;

import java.util.Scanner;

public class lesson05NastedIfElseStatement {
    public static void main(String[]args){
        int states,guess;
        guess=0;
        states=50;
        System.out.println("how many states in the United states\nType your answer ");
        Scanner answer=new Scanner(System.in);
        if(answer.hasNextInt()==true)guess=answer.nextInt();
        if(guess==states){System.out.println("yes correct");

    }else {System.out.println("not correct");
            if(guess>states)System.out.println("its less then your answer");
            else System.out.println("it's more then your answer");
        }
}}
