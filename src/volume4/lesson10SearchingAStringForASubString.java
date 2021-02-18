package volume4;

public class lesson10SearchingAStringForASubString {
    public static void main (String args[]){
        //if your are looking in database or big text for substring you can just do it that way
        String name="i like to play soccer to relax";
        System.out.println(name.indexOf("like"));
        //if you are loking for the last substring
        System.out.println(name.lastIndexOf("to"));

    }
}
