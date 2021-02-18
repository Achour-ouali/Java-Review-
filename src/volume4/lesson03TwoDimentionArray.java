package volume4;
//9 7 6 8
//3 2 1 0
//0 6 5 4
public class lesson03TwoDimentionArray {
    public static void main(String args[]){
        int table [][]=new int[3][4];
        table[0][0]=9;
        table[0][1]=7;
        table[0][2]=6;
        table[0][3]=8;

        table[1][0]=3;
        table[1][1]=2;
        table[1][2]=1;
        table[1][3]=4;

        table[2][0]=0;
        table[2][1]=6;
        table[2][2]=5;
        table[2][3]=4;
        System.out.println(table[0][3] +"and " +table[2][2]);
    }
}
