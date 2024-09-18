package cs.nyuad.se;

import java.util.HashSet;
import java.util.Set;

import cs.nyuad.se.notifications.NotifierDecorator;
import cs.nyuad.se.notifications.SMSDecorator;
import cs.nyuad.se.notifications.SlackDecorator;
import cs.nyuad.se.notifications.Notifier;
import cs.nyuad.se.notifications.FacebookDecorator;


public class Main {

    private static Set<String> configure(){
        // ask user for types of notifications they want: email, sms, slack
        Set<String> notificationMethods = new HashSet<String>();

        do{
            System.out.println("Please enter the extra type of notification you want: facebook, sms, slack. Enter done to finish");
            String notificationMethod = System.console().readLine();
            if(notificationMethod.equals("done")){
                break;
            }
            notificationMethods.add(notificationMethod);
        }while(true);
        
        return notificationMethods;

    }

    public static void main(String[] args) {
        Set<String> notificationMethods = configure();

        Notifier notifier = new Notifier();

        for (String notificationMethod : notificationMethods) {

            if (notificationMethod.equals("sms")) {
                notifier = new SMSDecorator(notifier);
            }
            
            if (notificationMethod.equals("facebook")) {
                notifier = new FacebookDecorator(notifier);
            }

            if (notificationMethod.equals("slack")) {
                notifier = new SlackDecorator(notifier);
            }
        }

        notifier.sendNotification("EMERGENCY: The building is on fire");

    }
}