/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package englishfunny;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Signinform extends javax.swing.JPanel {

    public static int kt =0;
    Color xcolor = new Color(204,204,204);
    Color color = new Color(255,255,255);
    public Signinform() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Text_Signup = new javax.swing.JLabel();
        Text_Password = new javax.swing.JLabel();
        Text_NameUser = new javax.swing.JLabel();
        Text_Email = new javax.swing.JLabel();
        Line_Fullname = new javax.swing.JSeparator();
        Line_Email = new javax.swing.JSeparator();
        Line_Password = new javax.swing.JSeparator();
        CheckBox = new javax.swing.JCheckBox();
        Button_Signup = new javax.swing.JButton();
        TextField_UserName = new javax.swing.JTextField();
        TextField_Email = new javax.swing.JTextField();
        PasswordField_Pass = new javax.swing.JPasswordField();
        Text_FullName = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TextField_Fullname = new javax.swing.JTextField();
        Back = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 204, 255));

        Text_Signup.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        Text_Signup.setForeground(new java.awt.Color(255, 255, 255));
        Text_Signup.setText("????NG K??");

        Text_Password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Text_Password.setForeground(new java.awt.Color(255, 255, 255));
        Text_Password.setText("M???T KH???U");

        Text_NameUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Text_NameUser.setForeground(new java.awt.Color(255, 255, 255));
        Text_NameUser.setText("T??N ????NG NH???P");

        Text_Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Text_Email.setForeground(new java.awt.Color(255, 255, 255));
        Text_Email.setText("EMAIL");

        CheckBox.setBackground(new java.awt.Color(102, 204, 255));
        CheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckBox.setForeground(new java.awt.Color(255, 255, 255));
        CheckBox.setText("T??i ?????ng ?? v???i c??c ??i???u kho???n c???a ???ng d???ng n??y");
        CheckBox.setBorder(null);
        CheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckBoxMouseClicked(evt);
            }
        });
        CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxActionPerformed(evt);
            }
        });

        Button_Signup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Button_Signup.setForeground(new java.awt.Color(102, 204, 255));
        Button_Signup.setText("????ng k??");
        Button_Signup.setBorder(null);
        Button_Signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_SignupMouseClicked(evt);
            }
        });
        Button_Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SignupActionPerformed(evt);
            }
        });

        TextField_UserName.setBackground(new java.awt.Color(102, 204, 255));
        TextField_UserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextField_UserName.setForeground(new java.awt.Color(204, 204, 204));
        TextField_UserName.setBorder(null);
        TextField_UserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextField_UserNameMouseClicked(evt);
            }
        });
        TextField_UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_UserNameActionPerformed(evt);
            }
        });

        TextField_Email.setBackground(new java.awt.Color(102, 204, 255));
        TextField_Email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextField_Email.setForeground(new java.awt.Color(204, 204, 204));
        TextField_Email.setBorder(null);
        TextField_Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextField_EmailMouseClicked(evt);
            }
        });
        TextField_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_EmailActionPerformed(evt);
            }
        });

        PasswordField_Pass.setBackground(new java.awt.Color(102, 204, 255));
        PasswordField_Pass.setForeground(new java.awt.Color(204, 204, 204));
        PasswordField_Pass.setBorder(null);
        PasswordField_Pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordField_PassMouseClicked(evt);
            }
        });

        Text_FullName.setBackground(new java.awt.Color(255, 255, 255));
        Text_FullName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Text_FullName.setForeground(new java.awt.Color(255, 255, 255));
        Text_FullName.setText("T??N HI???N TH???");

        TextField_Fullname.setBackground(new java.awt.Color(102, 204, 255));
        TextField_Fullname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextField_Fullname.setForeground(new java.awt.Color(204, 204, 204));
        TextField_Fullname.setBorder(null);
        TextField_Fullname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextField_FullnameMouseClicked(evt);
            }
        });
        TextField_Fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_FullnameActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(102, 204, 255));
        Back.setForeground(new java.awt.Color(153, 204, 255));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Public\\Pictures\\ICON C???C M???NH\\1x\\outline_arrow_back_ios_white_24dp.png")); // NOI18N

        javax.swing.GroupLayout BackLayout = new javax.swing.GroupLayout(Back);
        Back.setLayout(BackLayout);
        BackLayout.setHorizontalGroup(
            BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        BackLayout.setVerticalGroup(
            BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Line_Fullname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_Password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Line_Email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckBox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_NameUser, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField_UserName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField_Email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_FullName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_Email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Line_Password)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextField_Fullname, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(7, 7, 7))
                            .addComponent(PasswordField_Pass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(Button_Signup, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(Text_Signup)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Text_Signup)
                        .addGap(18, 18, 18)))
                .addComponent(Text_NameUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextField_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Line_Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Text_Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Line_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(Text_FullName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextField_Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Text_Email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Line_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(CheckBox)
                .addGap(27, 27, 27)
                .addComponent(Button_Signup, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextField_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_EmailActionPerformed

    private void TextField_UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_UserNameActionPerformed

    private void Button_SignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_SignupMouseClicked
        if(kt==1){
            JOptionPane.showMessageDialog(this, "????ng k?? th??nh c??ng");
            EnglishFunnyFrame.scene.signup.setVisible(false);
            EnglishFunnyFrame.scene.signin.setVisible(true);
        }
       
        
       
        
    }//GEN-LAST:event_Button_SignupMouseClicked

    private void Button_SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SignupActionPerformed
        try {
            UserDAO userDAO = new UserDAO();
            String username = TextField_UserName.getText();
            String password = PasswordField_Pass.getText();
            String fullname = TextField_Fullname.getText();
            String email = TextField_Email.getText();
            
            if(userDAO.selectUser(username) != null){
                JOptionPane.showMessageDialog(this, "T??i kho???n ???? t???n t???i!");
                return;
            }
            if(userDAO.selectUser(email) != null){
                JOptionPane.showMessageDialog(this, "T??i kho???n ???? t???n t???i!");
                return;
            }
            
            if(TextField_UserName.equals("") || TextField_UserName.getForeground().equals(xcolor) ){
                JOptionPane.showMessageDialog(this, "B???n h??y nh???p t??n ????ng nh???p");
                return;
            }
            if(PasswordField_Pass.equals("") || PasswordField_Pass.getForeground().equals(xcolor)){
                JOptionPane.showMessageDialog(this, "B???n h??y nh???p m???t kh???u");
                return;
            }
            if(TextField_Email.equals("") || TextField_Email.getForeground().equals(xcolor) ){
                JOptionPane.showMessageDialog(this, "B???n h??y nh???p email");
                return;
            }
            if(TextField_Fullname.equals("") || TextField_Fullname.getForeground().equals(xcolor) ){
                JOptionPane.showMessageDialog(this, "B???n h??y nh???p t??n hi???n th???");
                return;
            }
            if(CheckBox.isSelected()== false){
                JOptionPane.showMessageDialog(this, "B???n c?? ?????ng ?? v???i ??i???u kho???n c???a ch??ng t??i?");
                return;
            }
        
            
            
            UserModel user = new UserModel(userDAO.selectAllUsers().size()+1, username, password, email," ", fullname, 0);
            userDAO.insertUser(user);
        } catch (SQLException ex) {
            Logger.getLogger(Signinform.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_Button_SignupActionPerformed

    private void CheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckBoxMouseClicked
        if(CheckBox.isSelected()) kt=1;
        
    }//GEN-LAST:event_CheckBoxMouseClicked

    private void CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxActionPerformed
        
    }//GEN-LAST:event_CheckBoxActionPerformed

    private void TextField_FullnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextField_FullnameMouseClicked
        TextField_Fullname.setText("");
        TextField_Fullname.setForeground(color);
    }//GEN-LAST:event_TextField_FullnameMouseClicked

    private void TextField_FullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_FullnameActionPerformed
        
    }//GEN-LAST:event_TextField_FullnameActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        EnglishFunnyFrame.scene.signup.setVisible(false);
        EnglishFunnyFrame.scene.signin.setVisible(true);
        
        
    }//GEN-LAST:event_BackMouseClicked

    private void PasswordField_PassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordField_PassMouseClicked
        PasswordField_Pass.setText("");
        PasswordField_Pass.setForeground(color);
    }//GEN-LAST:event_PasswordField_PassMouseClicked

    private void TextField_UserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextField_UserNameMouseClicked
        TextField_UserName.setText("");
        TextField_UserName.setForeground(color);
    }//GEN-LAST:event_TextField_UserNameMouseClicked

    private void TextField_EmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextField_EmailMouseClicked
        TextField_Email.setText("");
        TextField_Email.setForeground(color);
    }//GEN-LAST:event_TextField_EmailMouseClicked
    public void Init(){
        TextField_Fullname.setForeground(xcolor);
        TextField_Fullname.setText("H??y nh???p t??n ?????y ?????");
        TextField_UserName.setForeground(xcolor);
        TextField_UserName.setText("H??y nh???p t??n ????ng nh???p");
        PasswordField_Pass.setForeground(xcolor);
        PasswordField_Pass.setText("H??y nh???p t??n ?????y ?????");
        TextField_Email.setForeground(xcolor);
        TextField_Email.setText("H??y nh???p t??n ????ng nh???p");
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Back;
    private javax.swing.JButton Button_Signup;
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JSeparator Line_Email;
    private javax.swing.JSeparator Line_Fullname;
    private javax.swing.JSeparator Line_Password;
    private javax.swing.JPasswordField PasswordField_Pass;
    private javax.swing.JTextField TextField_Email;
    private javax.swing.JTextField TextField_Fullname;
    private javax.swing.JTextField TextField_UserName;
    private javax.swing.JLabel Text_Email;
    private javax.swing.JLabel Text_FullName;
    private javax.swing.JLabel Text_NameUser;
    private javax.swing.JLabel Text_Password;
    private javax.swing.JLabel Text_Signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
