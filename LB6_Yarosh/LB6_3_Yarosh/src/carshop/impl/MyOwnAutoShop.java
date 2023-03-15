package carshop.impl;
import carshop.cars.*;
import carshop.intrface.Admin;
import carshop.intrface.Customer;
import java.util.Scanner;
public class MyOwnAutoShop implements Admin, Customer {
    @Override
    public double getIncome() {
        double income = 0;
        for (Car car : shop) {
            if (car.isSellOut == true) income += car.getSalePrice(car.regularPrice);
        }
        return income;
    };
    @Override
    public void getCarsPrice() {
        for (Car car : shop) {
            System.out.println(car.regularPrice);
        }
    };
    @Override
    public void getCarsColors() {
        for (Car car : shop) {
            System.out.println(car.color);
        };
    };
    @Override
    public double getCarPrice(int id) {
        return shop[id].getSalePrice(shop[id].regularPrice);
    };
    @Override
    public String getCarColor(int id) {
        return shop[id].color;
    };
    @Override
    public void purchaseCar(int id) {
        shop[id].isSellOut = true;
    };
    Car[] shop = new Car[5]; {
    Sedan sedan = new Sedan();
    shop[0] = sedan;
    Ford ford1 = new Ford();
    shop[1] = ford1;
    Ford ford2 = new Ford();
    shop[2] = ford2;
    Truck truck1 = new Truck();
    shop[3] = truck1;
    Truck truck2 = new Truck();
    shop[4] = truck2;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the details about the cars");
        System.out.println("Please enter the details about sedan");
        System.out.println("Enter speed: ");
        sedan.setSpeed(in.nextInt());
        System.out.println("Enter regular price: ");
        sedan.setRegularPrice(in.nextInt());
        System.out.println("Enter color: ");
        sedan.setColor(in.next());
        System.out.println("Enter length: ");
        sedan.setLength(in.nextInt());
        System.out.println("Please enter the details about ford");
        System.out.println("Enter speed: ");
        ford1.setSpeed(in.nextInt());
        System.out.println("Enter regular price: ");
        ford1.setRegularPrice(in.nextInt());
        System.out.println("Enter color: ");
        ford1.setColor(in.next());
        System.out.println("Enter year: ");
        ford1.setYear(in.nextInt());
        System.out.println("Enter manufacturer discount: ");
        ford1.setManufacturerDiscount(in.nextInt());
        System.out.println("Please enter the details about ford");
        System.out.println("Enter speed: ");
        ford2.setSpeed(in.nextInt());
        System.out.println("Enter regular price: ");
        ford2.setRegularPrice(in.nextInt());
        System.out.println("Enter color: ");
        ford2.setColor(in.next());
        System.out.println("Enter year: ");
        ford2.setYear(in.nextInt());
        System.out.println("Enter manufacturer discount: ");
        ford2.setManufacturerDiscount(in.nextInt());
        System.out.println("Please enter the details about truck");
        System.out.println("Enter speed: ");
        truck1.setSpeed(in.nextInt());
        System.out.println("Enter regular price: ");
        truck1.setRegularPrice(in.nextInt());
        System.out.println("Enter color: ");
        truck1.setColor(in.next());
        System.out.println("Enter weight: ");
        truck1.setWeight(in.nextInt());
        System.out.println("Please enter the details about truck");
        System.out.println("Enter speed: ");
        truck2.setSpeed(in.nextInt());
        System.out.println("Enter regular price: ");
        truck2.setRegularPrice(in.nextInt());
        System.out.println("Enter color: ");
        truck2.setColor(in.next());
        System.out.println("Enter weight: ");
        truck2.setWeight(in.nextInt());
        System.out.println("Welcome to CarShop!");
        System.out.println("Here's our assortement of cars:");
        System.out.println("The colors we have: ");
        getCarsColors();
        System.out.println("The pricing we have: ");
        getCarsPrice();
        System.out.println("Enter id of car to see the details about (to end enter 5): ");
        int help = in.nextInt();
        while (help != 5) {
            System.out.println("The price is: " + getCarPrice(help));
            System.out.println("The color is: " + getCarColor(help));
            help = in.nextInt();
        }
        System.out.println("Enter id of car you want to buy (to end purchase enter 5): ");
        help = in.nextInt();
        while (help != 5) {
            purchaseCar(help);
            help = in.nextInt();
        }
        in.close();
        System.out.println("Income of carshop is: " + getIncome());
    }
};