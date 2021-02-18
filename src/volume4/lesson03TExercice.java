package volume4;

public class lesson03TExercice {
    public static void main (String []args){
        String trial[][]=new  String[2][12];
        trial[0][0]="jan";
        trial[0][1]="feb";
        trial[0][2]="mar";
        trial[0][3]="avr";
        trial[0][4]="mai";
        trial[0][5]="jun";
        trial[0][6]="jul";
        trial[0][7]="aug";
        trial[0][8]="sep";
        trial[0][9]="oct";
        trial[0][10]="nov";
        trial[0][11]="dec";

        trial[1][0]="34$";
        trial[1][1]="44$";
        trial[1][2]="55$";
        trial[1][3]="66$";
        trial[1][4]="77$";
        trial[1][5]="88$";
        trial[1][6]="99$";
        trial[1][7]="100$";
        trial[1][8]="110$";
        trial[1][9]="120$";
        trial[1][10]="130$";
        trial[1][11]="135$";

        for(int i=0;i<=11;i++){
           System.out.println("the revenue for "+trial[0][i]+" is " + trial[1][i]);
        }


    }
}
