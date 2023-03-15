abstract class Sushi {
    public void prepareRiceOrNori() {
    }
    public void prepareFilling() {
    }
    public void serving() {
    }
}
enum SushiType {
    MAKI_ROLL,
    TEMAKI,
    NIGIRI,
    SPRING_ROLL,
    URAMAKI
}
class MakiRoll extends Sushi {}
class Temaki extends Sushi {}
class Nigiri extends Sushi {}
class SpringRoll extends Sushi {}
class Uramaki extends Sushi {}

class ChineseStyleMakiRoll extends Sushi {
    @Override
    public void serving() {
        System.out.println("Adding vasabi...");
    }
}
class ChineseStyleTemaki extends Sushi {
    @Override
    public void serving() {
        System.out.println("Adding vasabi...");
    }
}
class ChineseStyleNigiri extends Sushi {
    @Override
    public void serving() {
        System.out.println("Adding vasabi...");
    }
}
class ChineseStyleSpringRoll extends Sushi {
    @Override
    public void serving() {
        System.out.println("Adding vasabi...");
    }
}
class ChineseStyleUramaki extends Sushi {
    @Override
    public void serving() {
        System.out.println("Adding vasabi...");
    }
}
class SimpleSushiFactory {
    public Sushi createSushi (SushiType type) {
        Sushi sushi = null;
        switch (type) {
            case MAKI_ROLL:
                sushi = new MakiRoll();
                break;
            case TEMAKI:
                sushi = new Temaki();
                break;
            case NIGIRI:
                sushi = new Nigiri();
                break;
            case SPRING_ROLL:
                sushi = new SpringRoll();
                break;
            case URAMAKI:
                sushi = new Uramaki();
        }
        return sushi;
    }
}
abstract class SushiShop {
    public Sushi orderSushi(SushiType type) {
        Sushi sushi = createSushi(type);
        sushi.prepareRiceOrNori();
        sushi.prepareFilling();
        sushi.serving();
        System.out.println("Bon appetit!");
        return sushi;
    }
    protected abstract Sushi createSushi(SushiType type);
}
class TraditionalSushiShop extends SushiShop {
    @Override
    public Sushi createSushi (SushiType type) {
        Sushi sushi = null;
        switch (type) {
            case MAKI_ROLL:
                sushi = new MakiRoll();
                break;
            case TEMAKI:
                sushi = new Temaki();
                break;
            case NIGIRI:
                sushi = new Nigiri();
                break;
            case SPRING_ROLL:_ROLL:
                sushi = new SpringRoll();
                break;
            case URAMAKI:
                sushi = new Uramaki();
                break;
        }
        return sushi;
    }
}
class ChineseSushiShop extends SushiShop {
    @Override
    public Sushi createSushi (SushiType type) {
        Sushi sushi = null;
        switch (type) {
            case MAKI_ROLL:
                sushi = new ChineseStyleMakiRoll();
                break;
            case TEMAKI:
                sushi = new ChineseStyleTemaki();
                break;
            case NIGIRI:
                sushi = new ChineseStyleNigiri();
                break;
            case SPRING_ROLL:
                sushi = new ChineseStyleSpringRoll();
                break;
            case URAMAKI:
                sushi = new ChineseStyleUramaki();
                break;
        }
        return sushi;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the SushiBar!");
        SushiShop traditionalSushiShop = new TraditionalSushiShop();
        SushiShop chineseSushiShop = new ChineseSushiShop();
        chineseSushiShop.orderSushi(SushiType.TEMAKI);
        traditionalSushiShop.orderSushi(SushiType.NIGIRI);
    }
}