package volume02;
public class lesson02ExecptionHandling {
    public static void main(String[] args)
    throws java.io.IOException{
        char letter ;
        int rawInput,count;
        System.out.println("Enter any capital letter");
        rawInput=System.in.read();
        System.out.println("Letter\t\tAttic");
        for(count=rawInput;count<=90;count++){
            letter=(char) count;
            System.out.println(letter +" \t\t " + count);} }
}
