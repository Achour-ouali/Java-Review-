package volume3;

import java.util.Scanner;

public class lesson12MethodesWithNoParametersReturnType {
    public static void main(String[]args){
        int a,b,greater;
        a=1;
        b=1;
        System.out.println("type two seperate number");
        Scanner type=new Scanner(System.in);
        a=type.nextInt();
        b=type.nextInt();
        greater=num(a,b);
        System.out.println(greater);
    }
    public static int num(int a,int b){
        if(a>b) return a;


        else return b;

    }
}
