package package2;

import java.util.Objects;

public class NotificationManager implements PaymentListener {

    private final String id;

    public NotificationManager(String id) {
        this.id = id;
    }

    @Override
    public void paymentMade(PaymentEvent event) {
        sendNotification();
    }

    private void sendNotification() {
        System.out.println("Notification sent");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationManager that = (NotificationManager) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
