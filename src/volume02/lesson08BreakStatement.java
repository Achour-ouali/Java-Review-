package volume02;

public class lesson08BreakStatement {
    public static void main(String[]args)throws java.io.IOException{
        int i;
        char input;
        char lettertest='A';
        System.out.println("type your capitol letter");
        input=(char)System.in.read();
        for(i=1;i<=26;i++){
            if(input==lettertest)break;
            lettertest++;
        }
        System.out.println("you letter is " +input+ "and its number is " +i);



    }
}
