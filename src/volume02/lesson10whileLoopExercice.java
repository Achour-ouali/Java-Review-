package volume02;

public class lesson10whileLoopExercice {
    public static void main(String[]args){
        char letter='A';
        while (letter<='Z'){
            System.out.println(letter);
            letter++; }
        int num,sum;
        num=1;
        sum=0;

        while (num<=100){
            sum=sum+num;
            num++;
            System.out.println("the sum for "+num+ " is " +sum);
        }
    }
}
