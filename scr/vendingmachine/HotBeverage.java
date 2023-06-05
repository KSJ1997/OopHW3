package scr.vendingmachine;
public abstract class HotBeverage {
    private String name;
    private int volume;

    public HotBeverage(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
