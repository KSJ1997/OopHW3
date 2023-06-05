package scr.vendingmachine;
public interface VendingMachine {
    void addProduct(HotBeverage product);
    HotBeverage getProduct(String name, int volume);
}
