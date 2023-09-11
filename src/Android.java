public class Android implements Smartphones, LinuxOS{
    @Override
    public void call() {
        System.out.println("Android is making a call...");
    }

    @Override
    public void sms() {
        System.out.println("Android is sending a text message...");
    }

    @Override
    public void internet() {
        System.out.println("Android is using the internet...");
    }

    @Override
    public void runLinuxApp() {
        System.out.println("Android is launch...");
    }
}
