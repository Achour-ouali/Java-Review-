package volume1;
//if and for loop with block code using curly braces
public class Lesson06 {
    public static void main (String [] args){
        int a = 1;
        if(a==1){
            a=a+2;
            System.out.println("a was equal to 1 now is equal to "+a);
            int s=2,multiply;
            for(s=2;s<10;s++)
            {multiply=s*5;
                System.out.println("s is equal to " +s+ " multiply is "+ multiply);
                int age =35;
                if(age>=30){
                    System.out.println("oh no i am older than 30 years old");
                    System.out.println("maybe not");
                    System.out.println("maybe a little wiser");
                    int inches,counter=0 ;
                    double feet;
                    for(inches=1;inches<=20;inches++){
                        feet=inches/12;
                        if(inches==1)System.out.println(inches+ " inch is equal to " +feet+("feet"));
                        if(inches!=1)System.out.println(inches+ " inches is equal to " +feet+("feet")); 
                    counter++;
                    if(counter==4){
                        System.out.println();
                        counter=0;
                    }}
                }
            }

        }

    }
}
