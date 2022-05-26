package mans.csknowledge.chapter1;

public class SingletonTester {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        if(a==b){
            System.out.println(true);
        }
    }
}
