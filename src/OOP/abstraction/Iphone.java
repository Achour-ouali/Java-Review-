package OOP.abstraction;

public class Iphone extends ModernPhone implements Mobile {
    @Override
    public void storage() {
        System.out.println("the have different storage");
    }

    @Override
    public void camera() {
        System.out.println("double and triple camera");
    }

    @Override
    public void CameraResulution() {
        System.out.println("it's a 4K camera");
    }

    @Override
    public void tClavier() {
        System.out.println("it's a digital clavier ");
    }

    @Override
    public void fingerPrint() {
        System.out.println("it has finger perint ");
    }

    @Override
    public void Hdcamera() {
        System.out.println("it's a Hd and 4K camera");
    }


    @Override
    public void flashLight() {
        System.out.println("it's has flash light ");
    }

    @Override
    public void digitalScreen() {
        System.out.println("it has a digital screen");
    }

    @Override
    public void faceId() {
        System.out.println("it has the face id option");
    }
}
