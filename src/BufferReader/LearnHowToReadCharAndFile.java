package BufferReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LearnHowToReadCharAndFile {


    public static void main(String args[])
        throws java.io.IOException{
        InputStreamReader obj=new InputStreamReader(System.in);
        BufferedReader ob=new BufferedReader(obj);
        int a=Integer.parseInt(ob.readLine());
        double b=Double.parseDouble(ob.readLine());
        System.out.println(a+b);
    }
}
