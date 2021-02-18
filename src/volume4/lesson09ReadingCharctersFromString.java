package volume4;

public class lesson09ReadingCharctersFromString {
    public static void main(String args[]){
        String name="Ashor wally";
        //reading the character on number 4
        System.out.println(name.charAt(4)+"\n");

        //if ypou want to read all the characters in you bstring we ude for loop
        for(int i=0;i<=name.length()-1;i++){
            System.out.println(name.charAt(i));
        }


    }
}
