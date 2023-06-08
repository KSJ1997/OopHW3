package src.main.vendingmachine;

import java.util.Collections;
import java.util.List;

public class VendingMachine {
    private List<Beverage> beverages;

    public VendingMachine(List<Beverage> beverages) {
        this.beverages = beverages;
    }

    public void displayMenu() {
        System.out.println("Чай");
        for (int i = 0; i < beverages.size(); i++) {
            if (beverages.get(i) instanceof Tea) {
                System.out.println((i + 1) + ". " + beverages.get(i));
            }
        }

        System.out.println("Кофе");
        for (int i = 0; i < beverages.size(); i++) {
            if (beverages.get(i) instanceof Coffee) {
                System.out.println((i + 1) + ". " + beverages.get(i));
            }
        }
    }

    public Beverage getBeverage(int choice) {
        if (choice >= 1 && choice <= beverages.size()) {
            return beverages.get(choice - 1);
        }
        return null;
    }

    public void sortByPrice() {
        Collections.sort(beverages);
    }
}
