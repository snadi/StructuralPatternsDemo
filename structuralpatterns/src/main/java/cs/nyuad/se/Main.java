package cs.nyuad.se;

import java.util.HashSet;
import java.util.Set;

import cs.nyuad.se.notifications.Notifier;

public class Main {

    private static Set<String> configure(){
        // ask user for types of notifications they want: email, sms, slack
        Set<String> notifications = new HashSet<String>();

        do{
            System.out.println("Please enter the type of notification you want: sms, slack, facebook. Enter done to finish");
            String notification = System.console().readLine();
            if(notification.equals("done")){
                break;
            }
            notifications.add(notification);
        }while(true);
        
        return notifications;

    }

    public static void main(String[] args) {
        Set<String> notifications = configure();

        Notifier smsNotifier = new Notifier();
        smsNotifier.sendEmail("Emergency evacuation. Please leave the building immediately");

    }
}