package cs.nyuad.se.notifications;

public class NotifierDecorator extends Notifier {
    private Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public void sendNotification(String message) {
        notifier.sendNotification(message);
    }

}
