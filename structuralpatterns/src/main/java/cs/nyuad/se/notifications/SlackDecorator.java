package cs.nyuad.se.notifications;

public class SlackDecorator extends NotifierDecorator {
    
    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    public void sendNotification(String message) {
        super.sendNotification(message);
        sendToSlack(message);
    }

    public void sendToSlack(String message) {
        System.out.println("Sent message to SLACK");
    }
    
}
