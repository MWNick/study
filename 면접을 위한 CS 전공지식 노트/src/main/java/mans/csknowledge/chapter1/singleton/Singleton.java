package mans.csknowledge.chapter1.singleton;

public class Singleton {
    private static class singleInstanceHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static synchronized Singleton getInstance(){
        return singleInstanceHolder.INSTANCE;
    }
}
