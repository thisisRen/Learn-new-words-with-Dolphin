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
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Flashcard extends javax.swing.JPanel {

    private int t=0;
    Color color = new Color(102,204,255);
    Color xcolor = new Color(204,204,204);
    
    public Flashcard() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        AmountNum = new javax.swing.JLabel();
        Voice = new javax.swing.JTextField();
        Word = new javax.swing.JTextField();
        Translate = new javax.swing.JTextField();
        Image = new javax.swing.JTextField();
        CountWord = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        DoneButton = new javax.swing.JButton();
        Theme = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 300, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setText("Chọn chủ đề");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 204, 255), new java.awt.Color(102, 204, 255)));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 204, 255));
        jLabel2.setText("Thêm từ");

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 204, 255));
        jLabel3.setText("Định nghĩa");

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 204, 255));
        jLabel5.setText("Phát âm");

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 204, 255));
        jLabel6.setText("Hình ảnh");

        AmountNum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AmountNum.setForeground(new java.awt.Color(102, 204, 255));

        Voice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Voice.setForeground(new java.awt.Color(204, 204, 204));
        Voice.setText("Thêm từ của bạn ở đây");
        Voice.setBorder(null);
        Voice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoiceMouseClicked(evt);
            }
        });
        Voice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoiceActionPerformed(evt);
            }
        });

        Word.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Word.setForeground(new java.awt.Color(204, 204, 204));
        Word.setText("Thêm từ của bạn ở đây");
        Word.setBorder(null);
        Word.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WordMouseClicked(evt);
            }
        });
        Word.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WordActionPerformed(evt);
            }
        });

        Translate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Translate.setForeground(new java.awt.Color(204, 204, 204));
        Translate.setText("Thêm từ của bạn ở đây");
        Translate.setBorder(null);
        Translate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TranslateMouseClicked(evt);
            }
        });
        Translate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TranslateActionPerformed(evt);
            }
        });

        Image.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Image.setForeground(new java.awt.Color(204, 204, 204));
        Image.setText("Thêm từ của bạn ở đây");
        Image.setBorder(null);
        Image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImageMouseClicked(evt);
            }
        });
        Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImageActionPerformed(evt);
            }
        });

        CountWord.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        CountWord.setForeground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Translate, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AmountNum)
                                .addGap(21, 21, 21)
                                .addComponent(CountWord, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(jSeparator4)
                                        .addComponent(jSeparator2)
                                        .addComponent(jSeparator3)
                                        .addComponent(jLabel3)
                                        .addComponent(jSeparator5)
                                        .addComponent(Voice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Word)))
                                .addGap(0, 50, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(AmountNum)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CountWord, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Word, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Translate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Voice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 580, 370));

        AddButton.setBackground(new java.awt.Color(153, 204, 255));
        AddButton.setForeground(new java.awt.Color(102, 204, 255));
        AddButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Public\\Pictures\\ICON CỰC MẠNH\\2x\\outline_add_box_white_24dp.png")); // NOI18N
        AddButton.setBorder(null);
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 40, 40));

        DoneButton.setBackground(new java.awt.Color(153, 204, 255));
        DoneButton.setForeground(new java.awt.Color(102, 204, 255));
        DoneButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Public\\Pictures\\ICON CỰC MẠNH\\2x\\outline_check_white_24dp.png")); // NOI18N
        DoneButton.setBorder(null);
        DoneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoneButtonMouseClicked(evt);
            }
        });
        add(DoneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 40, 40));

        Theme.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Theme.setForeground(new java.awt.Color(0, 153, 255));
        Theme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item", "Family", "Vegetable", "Animal", "Food", "Drink" }));
        Theme.setBorder(null);
        Theme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemeActionPerformed(evt);
            }
        });
        add(Theme, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 300, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void VoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VoiceActionPerformed

    private void VoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoiceMouseClicked
       JOptionPane.showMessageDialog(this,"Nâng cấp tài khoản VIP để sử dụng tính năng này!");
    }//GEN-LAST:event_VoiceMouseClicked

    private void WordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WordMouseClicked
        Word.setText("");
        Word.setForeground(color);
    }//GEN-LAST:event_WordMouseClicked

    private void WordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WordActionPerformed

    private void TranslateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TranslateMouseClicked
        Translate.setText("");
        Translate.setForeground(color);
    }//GEN-LAST:event_TranslateMouseClicked

    private void TranslateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TranslateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TranslateActionPerformed

    private void ImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImageMouseClicked
      JOptionPane.showMessageDialog(this,"Nâng cấp tài khoản VIP để sử dụng tính năng này!");
    }//GEN-LAST:event_ImageMouseClicked

    private void ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImageActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        
            WordDAO wordDAO = new WordDAO();
            String theme;
            int t= Theme.getSelectedIndex();
            theme = Theme.getItemAt(t);
            String word = Word.getText();
            String translate = Translate.getText();
            
           
            if(Word.getForeground().equals(color) == false || word.equals("")){
                JOptionPane.showMessageDialog(this,"Hãy thêm từ");
                return;
            }
            if(Translate.getForeground().equals(color) == false || translate.equals("")){
                JOptionPane.showMessageDialog(this,"Hãy thêm nghĩa của từ");
                return;
            }
            Wordmodel worddata = new Wordmodel(wordDAO.selectAllWord().size()+1, theme, word, translate,0,0);
        try {
            wordDAO.insertWord(worddata);
        } catch (SQLException ex) {
            Logger.getLogger(Flashcard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
     
    }//GEN-LAST:event_AddButtonActionPerformed

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        t++;
        Word.setForeground(xcolor);
        Word.setText("Thêm từ của bạn vào đây");
        Translate.setForeground(xcolor);
        Translate.setText("Thêm từ của bạn vào đây");
        
        CountWord.setText(Integer.toString(t)+"/1500");
    }//GEN-LAST:event_AddButtonMouseClicked

    private void DoneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneButtonMouseClicked
        int choice = JOptionPane.showConfirmDialog(this, "BẠN ĐÃ HOÀN THÀNH CHỦ ĐỀ?", "LƯU Ý",JOptionPane.YES_NO_OPTION);
        switch(choice){
            case JOptionPane.YES_OPTION:
            Init();
            case JOptionPane.NO_OPTION:
            return;
        }
     
        
    }//GEN-LAST:event_DoneButtonMouseClicked

    private void ThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThemeActionPerformed
    public void Init(){
        CountWord.setText("0/1500");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel AmountNum;
    private javax.swing.JLabel CountWord;
    private javax.swing.JButton DoneButton;
    private javax.swing.JTextField Image;
    private javax.swing.JComboBox<String> Theme;
    private javax.swing.JTextField Translate;
    private javax.swing.JTextField Voice;
    private javax.swing.JTextField Word;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}