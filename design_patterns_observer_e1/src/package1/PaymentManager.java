package package1;

public class PaymentManager { // coupled.PaymentManager is highly coupled with coupled.PaymentEventLogger, coupled.NotificationManager
                            // and we can not register and unregister events for example in some cases we don't want
                            // to call logEvent()

    private final PaymentEventLogger paymentEventLogger = new PaymentEventLogger();
    private final NotificationManager notificationManager = new NotificationManager();

    public void pay() {
        notificationManager.sendNotification();
        paymentEventLogger.logEvent();
    }
}
