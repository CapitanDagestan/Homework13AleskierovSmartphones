public class Program {
    public static void main(String[] args){
        Smartphones androidPhone = new Android();
        Smartphones iPhone = new IPhone();

        ((Android) androidPhone).runLinuxApp();
        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        System.out.println();

        ((IPhone) iPhone).runIOSApp();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();

    }
}
