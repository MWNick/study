package mans.csknowledge.chapter1.factory;

public class FactoryTester {
    public static void main(String[] args) {
        Coffee latte = CoffeFactory.getCoffee("Latte", 4000);
        Coffee ame = CoffeFactory.getCoffee("Americano", 3000);

        System.out.println("Factory latte ::" + latte);
        System.out.println("Factory ame ::" + ame);

    }
}
