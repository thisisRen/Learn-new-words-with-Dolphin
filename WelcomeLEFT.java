/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package englishfunny;

import static englishfunny.MainMenu.icon;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.ImageIcon;

/**
 *
 * @author Administrator
 */
public class WelcomeLEFT extends javax.swing.JPanel {
    public WelcomeLEFT() {
        initComponents();
        this.setSize(500, 600);
        
        
    }
    public void Init(){
        Icon.setText("");
      //  Image image = new Image("logo.png");
       // Image scaled = EnglishFunnyFrame.scene.scaleImage(image, WIDTH, WIDTH)
     //   ImageIcon scaledIcon = new ImageIcon(scaled);
       // Icon.setIcon(scaledIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Icon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        Icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Pictures\\logo.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icon;
    // End of variables declaration//GEN-END:variables
}
