package volume1;

public class lesson07 {
    public static void main (String[] arg){
        int i;
        char uppercase ,lowercase;
        uppercase='A';
        lowercase='a';
        for (i=1;i<=26;i++){
            System.out.println(uppercase + " is equal " + lowercase );
            uppercase++;
            lowercase++; }
        System.out.println("");
        int a;
        char Maj ,Mins;
        Maj='Z';
        Mins='z';
        for(a=26;a>=1;a--){
            System.out.println(Maj +" is equal " + Mins);
            Maj--;
            Mins--;
        }
    }



}
