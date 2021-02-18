package OOP.polymorphism.overloading;

public class OverLoading {
    //the overloading methods it's a methods with the same name but with different parameters
    //it doesn't mean the same parameters they can be chane ether name or value
    //it happen during the compile time it's a static banding
    public static void main(String[] args) {
        OverLoading doSum=new OverLoading();
        doSum.DoSum(6,9);
    }
    public void DoSum(int a,int b){
         int sum=a+b;
        System.out.println(sum);
    }
    public void DoSum(int a,int b,int c){
        int sum=a+b+c;
        System.out.println(sum);
    }
    public void DoSum(int a,int b,int c,int f){
        int sum=a+b;
        System.out.println(sum);
    }
}
