package mans.csknowledge.chapter1.strategy;

public class StrategyTester {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item A = new Item("KundolA", 100);
        Item B = new Item("KundolB", 300);

        cart.addItem(A);
        cart.addItem(B);

        cart.pay(new LUNACardStrategy("kundol@example.com", "pukubababo"));
        cart.pay(new KAKAOCardStrategy("Ju hongchul", "123456789",  "123", "12/01"));
        
    }
}
