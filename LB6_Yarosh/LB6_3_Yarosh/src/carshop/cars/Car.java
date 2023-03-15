package carshop.cars;
public abstract class Car {
    int speed;
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isSellOut = false;
    public double regularPrice;
    public void setRegularPrice(int regularPrice) {
        this.regularPrice = regularPrice;
    }
    public String color;
    public void setColor(String color) {
        this.color = color;
    }
    public double getSalePrice(double regularPrice) {
        return regularPrice;
    };
};