package singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton staticBlockSingleton;

    static {
        try {
            staticBlockSingleton = new StaticBlockSingleton();
        } catch (Exception ignored) {}
    }

    private StaticBlockSingleton() {}

    public static StaticBlockSingleton getStaticBlockSingleton() {
        return staticBlockSingleton;
    }

    public void staticBlockSingletonTest() {
        System.out.println("static block singleton");
    }
}
