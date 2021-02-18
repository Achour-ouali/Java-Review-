package volume4;

public class lesson1Array {
    public static void main(String args[]){
        String friends[]=new String[6];
//        int age[]=new int[6];//this 1st way
//        age[0]=31;
//        age[1]=32;
//        age[2]=33;
//        age[3]=34;
//        age[4]=35;
//        age[5]=36;
        // 2nd way to create an array
        int age[]={31,32,33,35,36,37};

        friends[0]="salah";
        friends[1]="salah1";
        friends[2]="salah2";
        friends[3]="salah3";
        friends[4]="salah4";
        friends[5]="salah5";
        System.out.println("the first element in my array is "+friends[0]+" and the age of the first element is "+age[0]);
        System.out.println("the second element in my array is "+friends[1]+" and the age of the first element is "+age[1]);
        System.out.println("the third element in my array is "+friends[2]+" and the age of the first element is "+age[2]);
        System.out.println("the fourth element in my array is "+friends[3]+" and the age of the first element is "+age[3]);
        System.out.println("the fifth element in my array is "+friends[4]+" and the age of the first element is "+age[4]);
        System.out.println("the sixth element in my array is "+friends[5]+" and the age of the first element is "+age[5]);

    }
}
