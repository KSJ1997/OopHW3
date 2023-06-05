package scr.vendingmachine;
import java.util.ArrayList;
import java.util.List;

public class HotBeverageMachine implements VendingMachine {
    private List<HotBeverage> products;

    public HotBeverageMachine() {
        products = new ArrayList<>();
    }

    @Override
    public void addProduct(HotBeverage product) {
        products.add(product);
    }

    @Override
    public HotBeverage getProduct(String name, int volume) {
        for (HotBeverage product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume) {
                return product;
            }
        }
        return null;
    }
    
    public HotBeverage getProduct(String name, int volume, int temperature) {
        for (HotBeverage product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume && product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getTemperature() == temperature) {
                    return hotDrink;
                }
            }
        }
        return null;
    }
}
