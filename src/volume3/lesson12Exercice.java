package volume3;

import java.util.Scanner;

public class lesson12Exercice {
    public static void main (String[]args){
        int number;
        number=1;
        System.out.println("enter your number 1=spring,2=summer,3=fall,4=winter");
        Scanner call=new Scanner(System.in);
      number=call.nextInt();
        if(number==1)
            spring();
        if(number==2)
           summer();
        if(number==3)
            fall();
        if(number==4)
            winter();
    }
    public static void spring (){System.out.println("it's my favorite Saison");}
    public static void summer (){System.out.println("it's my favorite Saison");}
    public static void fall (){System.out.println("it's my favorite Saison");}
    public static void winter (){System.out.println("it's my favorite Saison");}
}
