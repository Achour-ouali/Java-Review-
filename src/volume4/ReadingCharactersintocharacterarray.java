package volume4;

public class ReadingCharactersintocharacterarray {
    public static void main(String args[]){
        String str="i like to ";
        char array[]=new char [10];
        str.getChars(0,10,array,0);
        System.out.println(array[0]);


    }
}
