package volume4;

public class lesson08determiningIfTwoStringsAreEqual {
    public static void main(String args[]){
        //equal
    String name1="asdfghjkl";
    String name2="ASDFGHJKL";
    System.out.println(name1+"\n"+name2);
    System.out.println("determining if the two strings are equal "+name1.equals(name2));
    //compare
        System.out.println("");
        if(name1.compareTo(name2)>0)System.out.println(name1+" comes first");
        if(name1.compareTo(name2)<0)System.out.println(name2+" comes first");

}}
