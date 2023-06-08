package scr.vendingmachine;

public enum TeaType {
    BLACK_TEA("Черный чай"),
    GREEN_TEA("Зеленый чай");

    private String name;

    private TeaType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
