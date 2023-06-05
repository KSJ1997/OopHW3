package scr.vendingmachine;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HotBeverageMachine machine = new HotBeverageMachine();

        HotBeverage tea = new Tea("Чай", 200, 70);
        HotBeverage coffee = new Coffee("Кофе", 150, 80);

        machine.addProduct(tea);
        machine.addProduct(coffee);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Меню:");
        System.out.println("1. Чай");
        System.out.println("2. Кофе");
        System.out.print("Выберите номер напитка: ");
        int choice = scanner.nextInt();

        HotBeverage selectedProduct = null;

        switch (choice) {
            case 1:
                selectedProduct = machine.getProduct("Чай", 200, 70);
                break;
            case 2:
                selectedProduct = machine.getProduct("Кофе", 150, 80);
                break;
            default:
                System.out.println("Неверный выбор.");
        }

        if (selectedProduct != null) {
            System.out.println("Получен продукт: " + selectedProduct.getName());
        } else {
            System.out.println("Продукт не найден.");
        }

        scanner.close();
    }
}
