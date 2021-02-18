package volume02;

public class lesson06IfElseLadder {
    public static void main(String[]args){
        int grade=49;
        if(grade>90)System.out.println("you earned an A on the exam");
        else if((grade>80)&&(grade<90))System.out.println("you earned an A on the exam");
        else if((grade>70)&&(grade<80))System.out.println("you earned an B on the exam");
        else if((grade>60)&&(grade<70))System.out.println("you earned an C on the exam");
        else if((grade>=50)&&(grade<60))System.out.println("you earned an C on the exam");
        else System.out.println("you failed on your exam");
    }
}
