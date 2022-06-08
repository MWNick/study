package mans.csknowledge.chapter1.factory;

public class Latte extends Coffee{
    private int price;

    public Latte(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
