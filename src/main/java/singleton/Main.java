package singleton;

public class Main {
    public static void main(String[] args) {

        EagerInitializationSingleton.getInstance().singletonTest();
        StaticBlockSingleton.getStaticBlockSingleton().staticBlockSingletonTest();
        LazySingleton.getInstance().lazySingletonTest();
        ThreadSafeSingleton.getThreadSafeSingleton().threadSafeSingletonTest();
        BillPughSingleton.getInstance().testBillPughSingleton();
    }
}

/*
    Singleton Design Pattern
        - Eager Initialization
        - Static Block Initialization
        - Lazy Initialization
        - ThreadSafe Singleton
        - Bill Pugh Singleton
 */