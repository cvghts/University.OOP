package carshop.cars;
public class Sedan extends Car {
    int length;
    public void setLength(int length) {
        this.length = length;
    }
    double salePrice;
    @Override
    public double getSalePrice(double regularPrice) {
        if (length > 20) { salePrice = regularPrice - (regularPrice / 20 );}
        return salePrice;
};
};