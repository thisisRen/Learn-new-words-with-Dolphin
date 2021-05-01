/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package englishfunny;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Learn extends javax.swing.JPanel {

    String theme;
    private int t=0;
    private int click = 0;
    private ArrayList <Wordmodel> wordList ;
    Color cover = new Color(153,204,255);
    Color back = new Color(102,204,255);
    
    public void SetTheme(String theme){
        this.theme = theme;
        
    }
    public void CallStart(){
        wordList = EnglishFunnyFrame.scene.GetWordByTheme(theme);
        WordText.setText(wordList.get(t).getWord());
        
    }
    public Learn() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        WordText = new javax.swing.JLabel();
        Turn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Next = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Return = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(102, 204, 255), null, new java.awt.Color(51, 204, 255)));

        WordText.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        WordText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Turn.setBackground(new java.awt.Color(102, 204, 255));
        Turn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TurnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TurnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TurnMouseReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Public\\Pictures\\ICON CỰC MẠNH\\1x\\outline_autorenew_white_24dp.png")); // NOI18N

        javax.swing.GroupLayout TurnLayout = new javax.swing.GroupLayout(Turn);
        Turn.setLayout(TurnLayout);
        TurnLayout.setHorizontalGroup(
            TurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TurnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        TurnLayout.setVerticalGroup(
            TurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TurnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Turn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(WordText, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(WordText, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(Turn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 560, 370));

        Next.setBackground(new java.awt.Color(102, 204, 255));
        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NextMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                NextMouseReleased(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Public\\Pictures\\ICON CỰC MẠNH\\1x\\outline_redo_white_24dp.png")); // NOI18N

        javax.swing.GroupLayout NextLayout = new javax.swing.GroupLayout(Next);
        Next.setLayout(NextLayout);
        NextLayout.setHorizontalGroup(
            NextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NextLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NextLayout.setVerticalGroup(
            NextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NextLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, -1, -1));

        Return.setBackground(new java.awt.Color(102, 204, 255));
        Return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ReturnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ReturnMouseReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Public\\Pictures\\ICON CỰC MẠNH\\1x\\outline_undo_white_24dp.png")); // NOI18N

        javax.swing.GroupLayout ReturnLayout = new javax.swing.GroupLayout(Return);
        Return.setLayout(ReturnLayout);
        ReturnLayout.setHorizontalGroup(
            ReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReturnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ReturnLayout.setVerticalGroup(
            ReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReturnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(Return, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseClicked
        t++;
        if(t < wordList.size()){
            WordText.setText(wordList.get(t).getWord());
           
        }
        else t=0;
    }//GEN-LAST:event_NextMouseClicked

    private void ReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMouseClicked
        t--;
        if(t >= 0 ) WordText.setText(wordList.get(t).getWord());
        else t= wordList.size() -1;
    }//GEN-LAST:event_ReturnMouseClicked

    private void TurnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TurnMouseClicked
        if(WordText.getText().equals(wordList.get(t).getTranslate())){
            WordText.setText(wordList.get(t).getWord());
        }
            
        else WordText.setText(wordList.get(t).getTranslate());
    }//GEN-LAST:event_TurnMouseClicked

    private void TurnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TurnMousePressed
        Turn.setBackground(cover);
    }//GEN-LAST:event_TurnMousePressed

    private void TurnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TurnMouseReleased
        Turn.setBackground(back);
    }//GEN-LAST:event_TurnMouseReleased

    private void ReturnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMousePressed
        Return.setBackground(cover);
    }//GEN-LAST:event_ReturnMousePressed

    private void ReturnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMouseReleased
        Return.setBackground(back);
    }//GEN-LAST:event_ReturnMouseReleased

    private void NextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMousePressed
        Next.setBackground(cover);
    }//GEN-LAST:event_NextMousePressed

    private void NextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseReleased
        Next.setBackground(back);
    }//GEN-LAST:event_NextMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Next;
    private javax.swing.JPanel Return;
    private javax.swing.JPanel Turn;
    private javax.swing.JLabel WordText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
