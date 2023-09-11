public class IPhone implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("iPhone is making a call...");
    }

    @Override
    public void sms() {
        System.out.println("iPhone is sending a text message...");
    }

    @Override
    public void internet() {
        System.out.println("iPhone is using the internet...");
    }

    @Override
    public void runIOSApp() {
        System.out.println("iPhone is launch...");
    }
}

