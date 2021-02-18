package volume02;

public class lesson01ExerciceThrowsExeption {
    public static void main (String[] args)
    throws java.io.IOException{
     System.out.println("Guess the first letter on my first name\n I am thinking ");
     char Guess;
     Guess=(char)System.in.read();
     if((Guess=='A')||(Guess=='a'))System.out.println("yes is correct");
     if((Guess!='A')&&(Guess!='a'))System.out.println("Nope is incorrect");




    }
}
