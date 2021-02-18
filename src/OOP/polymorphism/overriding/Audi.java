package OOP.polymorphism.overriding;

public class Audi extends car{
    //overriding is happening during the run time it means in dynamic banding it keeps the same name of
    // the methods where the class was extended it has the same name the same parameters and the same return
    //or we can say it provid the subclass or shild class to use the methods implemented by the super class
    // or the father class
    @Override
    public void color() {
        super.color();
    }

    @Override
    public void year() {
        super.year();
    }

    @Override
    public void saets() {
        super.saets();
    }
}
