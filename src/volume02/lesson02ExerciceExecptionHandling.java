package volume02;

public class lesson02ExerciceExecptionHandling {
    public static void main(String[] args)
    throws java.io.IOException{
        System.out.println("Is it sunny outside");
        char answer;
        answer=(char)System.in.read();
        answer=(char)System.in.read();
        System.out.println("Is it warm outside");
        answer=(char)System.in.read();
        if((answer=='Y')&&(answer=='Y'))System.out.println("yes it is sunny and warm outside");
        if((answer=='Y')&&(answer=='N'))System.out.println("yes it is sunny and cold outside");
        if((answer=='N')&&(answer=='N'))System.out.println(" it is cloudy and cold outside");
        if((answer=='N')&&(answer=='Y'))System.out.println("yes it is cloudy and warm outside"); }
}
