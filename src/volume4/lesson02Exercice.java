package volume4;

public class lesson02Exercice {
    public static void main(String args[]){
        double dailyTemp[]={90,87.90,76.2,56,91.9,77,86};
        int i;
        double max;
        max=dailyTemp[0];
        for(i=0;i<=6;i++){
            if(dailyTemp[i]>max)max=dailyTemp[i]; }
        System.out.println(max+(" is the max"));





    }
}
