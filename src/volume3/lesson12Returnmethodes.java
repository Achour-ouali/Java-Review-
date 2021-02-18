package volume3;

import java.util.Scanner;

public class lesson12Returnmethodes {
    public static void main (String[]args){
        double grade1,grade2,grade3,Average;
        grade1=0;
        grade2=0;
        grade3=0;
        System.out.println("enter 3 differnt grades");
        Scanner grade=new Scanner(System.in);
        grade1=grade.nextDouble();
        grade2=grade.nextDouble();
        grade3=grade.nextDouble();
        Average=GradeAverage(grade1,grade2,grade3);
        System.out.println("the average of the three grades is " +Average);
    }
    public static double GradeAverage(double A,double B,double C){
double Average=(A+B+C)/3;
return Average;
    }
}
