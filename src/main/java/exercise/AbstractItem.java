package exercise;

public abstract class AbstractItem implements Item {
    private String name;
    private double price;
    private String type;

    public AbstractItem(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return type;
    }
}
