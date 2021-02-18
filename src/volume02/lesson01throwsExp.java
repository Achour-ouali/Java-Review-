package volume02;

public class lesson01throwsExp {
    public static void main(String[]args)
    throws java.io.IOException{
        char input;
        System.out.println("type in keyboard and hit enter");
        input=(char) System.in.read();
        System.out.println("the char you enter is " +input);
        char input1;
        System.out.println("the capital of the united states is wachington DC");
        input1=(char) System.in.read();
        if(input1=='T')System.out.println(" is correct");
        if(input1=='F')System.out.println("is false");

    }
}
