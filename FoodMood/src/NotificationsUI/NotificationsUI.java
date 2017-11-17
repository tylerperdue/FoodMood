package NotificationsUI;

import NotificationsController.NotificationsController;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;

/**
 *
 * @author jro5165
 */
public class NotificationsUI extends JFrame {
    
    public NotificationsUI(NotificationsController notificationsCntrl) {
        System.out.println("NotificationsUI Class Instantiated. Test Passed.");
        NotificationsPanel notificationsPanel = new NotificationsPanel();
        String message = "You got a new notification: Enter Mood.";
            String header = "Mood Entry Notification";
            JFrame frame = new JFrame();
            frame.setSize(300,125);
            frame.setLayout(new GridBagLayout());
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.gridx = 0;
            constraints.gridy = 0;
            constraints.weightx = 1.0f;
            constraints.weighty = 1.0f;
            constraints.insets = new Insets(5, 5, 5, 5);
            constraints.fill = GridBagConstraints.BOTH;
            JLabel headingLabel = new JLabel(header);
            headingLabel.setOpaque(false);
            frame.add(headingLabel, constraints);
            constraints.gridx++;
            constraints.weightx = 0f;
            constraints.weighty = 0f;
            constraints.fill = GridBagConstraints.NONE;
            constraints.anchor = GridBagConstraints.NORTH;
            JButton cloesButton = new JButton("X");
            cloesButton.setMargin(new Insets(1, 4, 1, 4));
            cloesButton.setFocusable(false);
            frame.add(cloesButton, constraints);
            constraints.gridx = 0;
            constraints.gridy++;
            constraints.weightx = 1.0f;
            constraints.weighty = 1.0f;
            constraints.insets = new Insets(5, 5, 5, 5);
            constraints.fill = GridBagConstraints.BOTH;
            JLabel messageLabel = new JLabel("<HtMl>"+message);
            frame.add(messageLabel, constraints);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
        //this.setLayout(new BorderLayout());
        // TEST
        this.add(notificationsPanel);
        notificationsCntrl.displayNotification("EXAMPLE");
        notificationsCntrl.setNotificationTime(45);
    }
}
