package singleton;

public class EagerInitializationSingleton {

    private static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {} // To create a new object of this class we make the constructor method private

    public static EagerInitializationSingleton getInstance() {
        return INSTANCE;
    }

    public void singletonTest() {
        System.out.println("eager initialization singleton");
    }
}
