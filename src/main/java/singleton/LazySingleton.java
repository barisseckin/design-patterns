package singleton;

public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton(){}

    public static LazySingleton getInstance() {
        if (lazySingleton == null)
            lazySingleton = new LazySingleton();

        return lazySingleton;
    }

    public void lazySingletonTest() {
        System.out.println("lazy singleton");
    }
}
