package volume02;

public class lesson09Remainder {
    public static void main(String[] args) {
        int i;
        for (i=1; i<=50 ;i++){
            if(i%2 !=0){System.out.println(i+" it's a even number");
            continue;}
            System.out.println(i);
        }
    }
}