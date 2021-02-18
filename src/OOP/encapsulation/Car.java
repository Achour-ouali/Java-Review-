package OOP.encapsulation;

public class Car {
    //encapsulation it's a data hiding
    //it means we can access to private variables from another class by using getter and setter
    // if we want to declare the values in the constructor when we call it from another class we should create them first

    private String model;
    private String year;
    private String color;
    private String seat;
    private String mode;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
        System.out.println("The car model is "+getModel());
    }

    public String getYear() {
        return year;

    }

    public void setYear(String year) {
        this.year = year;
        System.out.println("the car year is "+getYear());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("the car color is "+getColor());
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
        System.out.println("the car seat is "+getSeat()+" saets");
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
        System.out.println("the car is "+getMode()+" mode");
    }
}
