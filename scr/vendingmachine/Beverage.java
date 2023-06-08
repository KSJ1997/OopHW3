package scr.vendingmachine;

public abstract class Beverage implements Comparable<Beverage> {
    protected String name;
    protected long price;

    public Beverage(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public int compareTo(Beverage other) {
        return Long.compare(this.price, other.price);
    }
}
