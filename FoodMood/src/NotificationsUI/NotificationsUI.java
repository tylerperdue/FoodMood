package NotificationsUI;

import NotificationsController.NotificationsController;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author jro5165
 */
public class NotificationsUI extends JFrame {
    
    public NotificationsUI(NotificationsController notificationsCntrl) {
        System.out.println("NotificationsUI Class Instantiated. Test Passed.");
        NotificationsPanel notificationsPanel = new NotificationsPanel();
        this.setLayout(new BorderLayout());
        // TEST
        this.add(notificationsPanel);
        notificationsCntrl.displayNotification("EXAMPLE");
        notificationsCntrl.setNotificationTime(45);
    }
}
