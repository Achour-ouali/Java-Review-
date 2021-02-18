package volume4;

public class lesson11arrayOfString {
    public static void main(String args[]){
        String array[]={"i\t","like\t","to play coccer"};
        System.out.println(array[0]+array[1]+array[2]);
        array[1]="don't like\t";//chane the value of the second array character in my string
        System.out.println(array[0]+array[1]+array[2]);

    }
}
