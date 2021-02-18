package volume02;

public class lesson01Exercice2ThrowsExpt {
    public static void main (String[] args)
   throws java.io.IOException {
        System.out.println("Enter a lowercase letter and convert it to uppercase");
        char lowercase,uppercase;
        lowercase=(char)System.in.read();
        uppercase=(char)(lowercase-32);
        System.out.println("the uppercase of the letter is "+ uppercase);

    }




    }

