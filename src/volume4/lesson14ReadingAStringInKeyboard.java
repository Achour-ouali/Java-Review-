package volume4;

import java.util.Scanner;

public class lesson14ReadingAStringInKeyboard {
    public static void main(String args[]){
        String str="";
        System.out.println("type you name");
        Scanner input=new Scanner(System.in);
        str=input.nextLine();
        System.out.println("My name is "+str);


    }
}
