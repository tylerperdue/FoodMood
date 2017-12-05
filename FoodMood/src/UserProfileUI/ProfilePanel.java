/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserProfileUI;

import FoodUI.CreateFoodPanel;
import UserProfileController.ProfileController;
import UserProfileModel.User;
import UserProfileModel.UserList;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jake
 */
public class ProfilePanel extends javax.swing.JPanel {
    
    /**
     * Creates new form crudProfilePanel
     * @param profileCtrl
     * @param loginCtrl
     */
    
    ArrayList<String> notifications = new ArrayList<String>();
    private final ProfileController profileCtrl;
    DefaultTableModel model = new DefaultTableModel();
    private User user;
    
    public ProfilePanel(ProfileController profileCtrl, User user) {
        System.out.println("ProfilePanel Class Instantiated.");
        this.profileCtrl = profileCtrl;
        this.user = user;
        
        initComponents();
        
        readProfileData();
        
        for(int i =0; i < notifications.size();i++)
        {
            NotificationHistory.append(notifications.get(i)+"\n");
        }
        
        NotificationHistory.setEditable(false);
    }
    
    private void readProfileData() {
        firstnameTxt.setText(user.getFirstname());
        lastnameTxt.setText(user.getLastname());
        usernameTxt.setText(user.getUsername());
        passwordTxt.setText(user.getPassword());
        ageTxt.setText(Integer.toString(user.getAge()));
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profileTabs = new javax.swing.JTabbedPane();
        viewProfileTab = new javax.swing.JPanel();
        updateProfileBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        firstnameTxt = new javax.swing.JLabel();
        lastnameTxt = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ageTxt = new javax.swing.JLabel();
        notificationsTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NotificationHistory = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        updateProfileBtn.setText("Update Profile");
        updateProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProfileBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Username: ");

        jLabel5.setText("Password:");

        jLabel10.setText("Age:");

        javax.swing.GroupLayout viewProfileTabLayout = new javax.swing.GroupLayout(viewProfileTab);
        viewProfileTab.setLayout(viewProfileTabLayout);
        viewProfileTabLayout.setHorizontalGroup(
            viewProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewProfileTabLayout.createSequentialGroup()
                .addGroup(viewProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewProfileTabLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(updateProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewProfileTabLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(viewProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(viewProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastnameTxt)
                            .addComponent(firstnameTxt)
                            .addComponent(usernameTxt)
                            .addComponent(passwordTxt)
                            .addComponent(ageTxt))))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        viewProfileTabLayout.setVerticalGroup(
            viewProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewProfileTabLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(viewProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstnameTxt))
                .addGap(29, 29, 29)
                .addGroup(viewProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lastnameTxt))
                .addGap(27, 27, 27)
                .addGroup(viewProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(usernameTxt))
                .addGap(26, 26, 26)
                .addGroup(viewProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passwordTxt))
                .addGap(25, 25, 25)
                .addGroup(viewProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageTxt)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(updateProfileBtn)
                .addGap(38, 38, 38))
        );

        profileTabs.addTab("View Profile", viewProfileTab);

        NotificationHistory.setColumns(20);
        NotificationHistory.setRows(5);
        jScrollPane1.setViewportView(NotificationHistory);

        jLabel1.setText("Notification History");

        javax.swing.GroupLayout notificationsTabLayout = new javax.swing.GroupLayout(notificationsTab);
        notificationsTab.setLayout(notificationsTabLayout);
        notificationsTabLayout.setHorizontalGroup(
            notificationsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notificationsTabLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notificationsTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(177, 177, 177))
        );
        notificationsTabLayout.setVerticalGroup(
            notificationsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notificationsTabLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        profileTabs.addTab("Notifications", notificationsTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profileTabs, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileTabs)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProfileBtnActionPerformed
        JFrame newFoodUI = new JFrame();
        newFoodUI.setBounds(0, 0, 360, 480);
        newFoodUI.setTitle("Update Profile");
        newFoodUI.setResizable(true);
        newFoodUI.setLocationRelativeTo(null);
        User user = UserList.getUser();
        UpdateProfilePanel profilePanel = new UpdateProfilePanel(this.profileCtrl, newFoodUI, user);
        newFoodUI.add(profilePanel);
        newFoodUI.setVisible(true);
    }//GEN-LAST:event_updateProfileBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea NotificationHistory;
    private javax.swing.JLabel ageTxt;
    private javax.swing.JLabel firstnameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastnameTxt;
    private javax.swing.JPanel notificationsTab;
    private javax.swing.JLabel passwordTxt;
    private javax.swing.JTabbedPane profileTabs;
    private javax.swing.JButton updateProfileBtn;
    private javax.swing.JLabel usernameTxt;
    private javax.swing.JPanel viewProfileTab;
    // End of variables declaration//GEN-END:variables
}
