package package2;

public class Main {
    public static void main(String[] args) {
        var paymentManager = new PaymentManager();
        NotificationManager l1 = new NotificationManager("a");
        paymentManager.registerPaymentListener(l1);
        PaymentEventLogger l2 = new PaymentEventLogger("b");
        paymentManager.registerPaymentListener(l2);
        paymentManager.pay(new PaymentEvent());

        paymentManager.unregisterPaymentListener(new PaymentEventLogger("b")); // works because we override equals and hashcode
        paymentManager.pay(new PaymentEvent());
    }
}