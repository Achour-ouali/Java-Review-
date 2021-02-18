package OOP.inheritance;

public class Test {
    public static void main(String[] args) {
        IphoneG6 myPhone=new IphoneG6();//first level iphone G6 from G1
        IphoneG8 myPhone1=new IphoneG8();//multi level iphone G8 from G6 from G1
        IphoneG8S myphone2=new IphoneG8S();//hierarchical level iphone G8 and G8S from G6 from G1

        myPhone.cameraG1();
        myPhone.ScreenG1();
        myPhone.flashLightG6();
        myPhone.touchIdG6();
        myPhone1.ScreenG1();
        myPhone1.FaceIdG6();
        myPhone1.touchIdG8();
        myphone2.cameraG1();

    }
}
