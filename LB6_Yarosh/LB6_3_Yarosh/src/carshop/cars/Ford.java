package carshop.cars;
public class Ford extends Car {
    int year;
    public void setYear(int year) {
        this.year = year;
    }
    int manufacturerDiscount;
    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }
    double salePrice;
    @Override
    public double getSalePrice(double regularPrice) {
        double salePrice = regularPrice - manufacturerDiscount;
        return salePrice;
};
};