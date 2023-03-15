package carshop.intrface;
public interface Customer {
    public void getCarsPrice();
    public void getCarsColors();
    public double getCarPrice(int id);
    public String getCarColor(int id);
    public void purchaseCar(int id);
}