package cs.nyuad.se.notifications;

public class FacebookDecorator extends NotifierDecorator {

    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    public void sendNotification(String message) {
        super.sendNotification(message);
        sendFacebook(message);
    }

    public void sendFacebook(String message) {
        System.out.println("Sent message to Facebook");
    }
    
}
