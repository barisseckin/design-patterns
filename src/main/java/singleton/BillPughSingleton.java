package singleton;

public class BillPughSingleton {

    private BillPughSingleton(){}

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void testBillPughSingleton() {
        System.out.println("bill pugh singleton");
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
}
