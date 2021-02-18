package volume02;

import java.util.Scanner;

public class lesson11DoWhileLoopExercice {
    public static void main(String[]args){
        int a,guess;

        guess=0;
        System.out.println("write a number to gues which number i am thinking about between 1 and 20");
        Scanner type=new Scanner(System.in);

        do{
            if(type.hasNextInt()==true)guess=type.nextInt();
           if(guess >17) System.out.println("it's too high ");
          if(guess <17) System.out.println("it's too low ");

        }while (guess !=17);
        System.out.println(" you guessed "+17+" it's correct");




    }
}
