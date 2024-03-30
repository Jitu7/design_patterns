package package2;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager {

    private final List<PaymentListener> paymentListeners = new ArrayList<>();

    public void pay(PaymentEvent event) { // notify -> some payment listeners
        // do something
       paymentListeners.forEach(paymentListeners -> paymentListeners.paymentMade(event));
    }

    public void registerPaymentListener(PaymentListener listener) {
        paymentListeners.add(listener);
    }

    public void unregisterPaymentListener(PaymentListener listener) {
        paymentListeners.remove(listener);
    }
}
