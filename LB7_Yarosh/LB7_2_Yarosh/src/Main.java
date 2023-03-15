abstract class Coffee {
    public void makeCoffee() {
    }
    public void pourIntoCup() {
    }
    public void addSomeSpecial() {
    }
}
class Americano extends Coffee {}
class Cappuccino extends Coffee {}
class CaffeLatte extends Coffee {}
class Espresso extends Coffee {}

class ItalianStyleAmericano extends Coffee {}
class ItalianStyleCappuccino extends Coffee {}
class ItalianStyleCaffeLatte extends Coffee {}
class ItalianStyleEspresso extends Coffee {}

class AmericanStyleAmericano extends Coffee {
    @Override
    public void addSomeSpecial() {
        System.out.println("The use of our secret secret originated in South America…");
    }
}
class AmericanStyleCappuccino extends Coffee {}
class AmericanStyleCaffeLatte extends Coffee {}
class AmericanStyleEspresso extends Coffee {}

class LunarStyleAmericano extends Coffee {
    @Override
    public void addSomeSpecial() {
        System.out.println("With the addition of moon dust...");
    }
}
class LunarStyleCappuccino extends Coffee {
    @Override
    public void addSomeSpecial() {
        System.out.println("Adding a drop of sunlight...");
    }
}
class LunarStyleCaffeLatte extends Coffee {
    @Override
    public void addSomeSpecial() {
        System.out.println("Adding some stars...");
    }
}
class LunarStyleEspresso extends Coffee {
    @Override
    public void addSomeSpecial() {
        System.out.println("Adding our secret ingredient...");
    }
}
enum CoffeeType {
    ESPRESSO,
    AMERICANO,
    CAFFE_LATTE,
    CAPPUCCINO
}
class SimpleCoffeeFactory {
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new Americano();
                break;
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new CaffeLatte();
                break;
        }
        return coffee;
    }
}
abstract class CoffeeShop {
    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);
        coffee.makeCoffee();
        coffee.pourIntoCup();
        coffee.addSomeSpecial();
        System.out.println("Bon appetit!");
        return coffee;
    }
    protected abstract Coffee createCoffee(CoffeeType type);
}

class ItalianCoffeeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO:
                coffee = new ItalianStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new ItalianStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new ItalianStyleCappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new ItalianStyleCaffeLatte();
                break;
        }
        return coffee;
    }
}
class AmericanCoffeeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new AmericanStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new AmericanStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new AmericanStyleCappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new AmericanStyleCaffeLatte();
                break;
        }
        return coffee;
    }
}
class LunarCoffeeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new LunarStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new LunarStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new LunarStyleCappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new LunarStyleCaffeLatte();
                break;
        }
        return coffee;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to <<Lunar ship>>, my own open-space CoffeeShop!");
        CoffeeShop lunarCoffeeShop = new LunarCoffeeShop();
        CoffeeShop americanCoffeeShop = new AmericanCoffeeShop();
        lunarCoffeeShop.orderCoffee(CoffeeType.AMERICANO);
        americanCoffeeShop.orderCoffee(CoffeeType.AMERICANO);
        lunarCoffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);
    }
}