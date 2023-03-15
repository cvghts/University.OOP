package carshop.cars;
public class Truck extends Car {
    int weight;
    public void setWeight(int weight) {
        this.weight = weight;
    }
    double salePrice;
    @Override
    public double getSalePrice(double regularPrice) {
        if (weight > 2000) { salePrice = regularPrice - (regularPrice / 10);}
        else salePrice = regularPrice;
        return salePrice;
    };
};