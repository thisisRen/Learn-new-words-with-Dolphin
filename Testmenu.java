/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package englishfunny;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Testmenu extends javax.swing.JPanel {
    public static boolean Select;
    Color cover = new Color(153,204,255);
    Color back = new Color(255,255,255);
    public Testmenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Translate = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Panel_Choose = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Panel_Listen = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Panel_Write = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Translate.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Translate.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), new java.awt.Color(102, 204, 255)));
        Panel_Translate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_TranslateMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_TranslateMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_TranslateMouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 204));
        jLabel2.setText("TRANSLATE");

        javax.swing.GroupLayout Panel_TranslateLayout = new javax.swing.GroupLayout(Panel_Translate);
        Panel_Translate.setLayout(Panel_TranslateLayout);
        Panel_TranslateLayout.setHorizontalGroup(
            Panel_TranslateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_TranslateLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(25, 25, 25))
        );
        Panel_TranslateLayout.setVerticalGroup(
            Panel_TranslateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TranslateLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        add(Panel_Translate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 150, -1));

        Panel_Choose.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Choose.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 255), new java.awt.Color(102, 204, 255)));
        Panel_Choose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_ChooseMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_ChooseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_ChooseMouseReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("CHOOSE");

        javax.swing.GroupLayout Panel_ChooseLayout = new javax.swing.GroupLayout(Panel_Choose);
        Panel_Choose.setLayout(Panel_ChooseLayout);
        Panel_ChooseLayout.setHorizontalGroup(
            Panel_ChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ChooseLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(45, 45, 45))
        );
        Panel_ChooseLayout.setVerticalGroup(
            Panel_ChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ChooseLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        add(Panel_Choose, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 150, -1));

        Panel_Listen.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Listen.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 255), new java.awt.Color(102, 204, 255)));
        Panel_Listen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_ListenMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_ListenMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_ListenMouseReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("LISTEN");

        javax.swing.GroupLayout Panel_ListenLayout = new javax.swing.GroupLayout(Panel_Listen);
        Panel_Listen.setLayout(Panel_ListenLayout);
        Panel_ListenLayout.setHorizontalGroup(
            Panel_ListenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ListenLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(45, 45, 45))
        );
        Panel_ListenLayout.setVerticalGroup(
            Panel_ListenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ListenLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        add(Panel_Listen, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        Panel_Write.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Write.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), new java.awt.Color(102, 204, 255)));
        Panel_Write.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_WriteMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_WriteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Panel_WriteMouseReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("WRITE");

        javax.swing.GroupLayout Panel_WriteLayout = new javax.swing.GroupLayout(Panel_Write);
        Panel_Write.setLayout(Panel_WriteLayout);
        Panel_WriteLayout.setHorizontalGroup(
            Panel_WriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_WriteLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(45, 45, 45))
        );
        Panel_WriteLayout.setVerticalGroup(
            Panel_WriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_WriteLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel5)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        add(Panel_Write, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void Panel_TranslateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_TranslateMouseClicked
        Select = true;
        EnglishFunnyFrame.scene.testMenu.setVisible(false);
        EnglishFunnyFrame.scene.write.setVisible(true);
        EnglishFunnyFrame.scene.write.CallStart();
        EnglishFunnyFrame.scene.write.Init();
        
        
        
    }//GEN-LAST:event_Panel_TranslateMouseClicked

    private void Panel_ListenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ListenMouseClicked
        JOptionPane.showMessageDialog(this, "Nâng cấp tài khoản VIP để sử dụng tính năng này!");
    }//GEN-LAST:event_Panel_ListenMouseClicked

    private void Panel_ChooseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ChooseMouseClicked
        JOptionPane.showMessageDialog(this, "Nâng cấp tài khoản VIP để sử dụng tính năng này!");
    }//GEN-LAST:event_Panel_ChooseMouseClicked

    private void Panel_TranslateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_TranslateMousePressed
        Panel_Translate.setBackground(cover);
    }//GEN-LAST:event_Panel_TranslateMousePressed

    private void Panel_TranslateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_TranslateMouseReleased
        Panel_Translate.setBackground(back);
    }//GEN-LAST:event_Panel_TranslateMouseReleased

    private void Panel_ListenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ListenMousePressed
        Panel_Listen.setBackground(cover);
    }//GEN-LAST:event_Panel_ListenMousePressed

    private void Panel_ListenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ListenMouseReleased
        Panel_Listen.setBackground(back);
    }//GEN-LAST:event_Panel_ListenMouseReleased

    private void Panel_ChooseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ChooseMousePressed
        Panel_Choose.setBackground(cover);
    }//GEN-LAST:event_Panel_ChooseMousePressed

    private void Panel_ChooseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ChooseMouseReleased
        Panel_Choose.setBackground(back);
    }//GEN-LAST:event_Panel_ChooseMouseReleased

    private void Panel_WriteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_WriteMouseClicked
        Select = false;
        EnglishFunnyFrame.scene.testMenu.setVisible(false);
        EnglishFunnyFrame.scene.write.CallStart();
        EnglishFunnyFrame.scene.write.setVisible(true);
        
        EnglishFunnyFrame.scene.write.Init();
        
        
        
    }//GEN-LAST:event_Panel_WriteMouseClicked

    private void Panel_WriteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_WriteMousePressed
        Panel_Write.setBackground(cover);
    }//GEN-LAST:event_Panel_WriteMousePressed

    private void Panel_WriteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_WriteMouseReleased
        Panel_Write.setBackground(back);
    }//GEN-LAST:event_Panel_WriteMouseReleased
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Choose;
    private javax.swing.JPanel Panel_Listen;
    private javax.swing.JPanel Panel_Translate;
    private javax.swing.JPanel Panel_Write;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
