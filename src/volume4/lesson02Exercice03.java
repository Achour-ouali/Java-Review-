package volume4;

public class lesson02Exercice03 {
    public static void main(String args[]){
        int num[]={9,1,5,8,5,77,8,98,56,32,11,97,64,64};
        int smalNum=num[0];
        int largeNum=num[0];
        int i;
        for (i=0;i<=13;i++){
            if (num[i]<smalNum)smalNum=num[i];
            if (num[i]>largeNum)largeNum=num[i]; }
        System.out.println(smalNum );
        System.out.println(largeNum  );
}}
