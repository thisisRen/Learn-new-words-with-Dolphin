/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package englishfunny;

import java.awt.Color;

/**
 *
 * @author Administrator
 */
public class LearnMenu extends javax.swing.JPanel {

    Color cover = new Color(153,204,255);
    Color back = new Color(255,255,255);
    public LearnMenu() {
        initComponents();
    }

    private void LoadTheme(){
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Item_theme = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Family_theme = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Vegetable_theme = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Animal_theme = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Food_Theme = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Drink_theme = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        Item_theme.setBackground(new java.awt.Color(255, 255, 255));
        Item_theme.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(51, 204, 255)));
        Item_theme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Item_themeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Item_themeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Item_themeMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Item");

        javax.swing.GroupLayout Item_themeLayout = new javax.swing.GroupLayout(Item_theme);
        Item_theme.setLayout(Item_themeLayout);
        Item_themeLayout.setHorizontalGroup(
            Item_themeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Item_themeLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32))
        );
        Item_themeLayout.setVerticalGroup(
            Item_themeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Item_themeLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        Family_theme.setBackground(new java.awt.Color(255, 255, 255));
        Family_theme.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 204, 255), new java.awt.Color(102, 204, 255)));
        Family_theme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Family_themeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Family_themeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Family_themeMouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 255));
        jLabel2.setText("Family");

        javax.swing.GroupLayout Family_themeLayout = new javax.swing.GroupLayout(Family_theme);
        Family_theme.setLayout(Family_themeLayout);
        Family_themeLayout.setHorizontalGroup(
            Family_themeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Family_themeLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        Family_themeLayout.setVerticalGroup(
            Family_themeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Family_themeLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Vegetable_theme.setBackground(new java.awt.Color(255, 255, 255));
        Vegetable_theme.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 204, 255), new java.awt.Color(153, 204, 255)));
        Vegetable_theme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Vegetable_themeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Vegetable_themeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Vegetable_themeMouseReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Vegetable");

        javax.swing.GroupLayout Vegetable_themeLayout = new javax.swing.GroupLayout(Vegetable_theme);
        Vegetable_theme.setLayout(Vegetable_themeLayout);
        Vegetable_themeLayout.setHorizontalGroup(
            Vegetable_themeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        Vegetable_themeLayout.setVerticalGroup(
            Vegetable_themeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Vegetable_themeLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        Animal_theme.setBackground(new java.awt.Color(255, 255, 255));
        Animal_theme.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(51, 204, 255)));
        Animal_theme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Animal_themeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Animal_themeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Animal_themeMouseReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Animal");

        javax.swing.GroupLayout Animal_themeLayout = new javax.swing.GroupLayout(Animal_theme);
        Animal_theme.setLayout(Animal_themeLayout);
        Animal_themeLayout.setHorizontalGroup(
            Animal_themeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Animal_themeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        Animal_themeLayout.setVerticalGroup(
            Animal_themeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Animal_themeLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        Food_Theme.setBackground(new java.awt.Color(255, 255, 255));
        Food_Theme.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(51, 204, 255)));
        Food_Theme.setForeground(new java.awt.Color(102, 204, 255));
        Food_Theme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Food_ThemeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Food_ThemeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Food_ThemeMouseReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Food ");

        javax.swing.GroupLayout Food_ThemeLayout = new javax.swing.GroupLayout(Food_Theme);
        Food_Theme.setLayout(Food_ThemeLayout);
        Food_ThemeLayout.setHorizontalGroup(
            Food_ThemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Food_ThemeLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(26, 26, 26))
        );
        Food_ThemeLayout.setVerticalGroup(
            Food_ThemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Food_ThemeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(44, 44, 44))
        );

        Drink_theme.setBackground(new java.awt.Color(255, 255, 255));
        Drink_theme.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(51, 204, 255)));
        Drink_theme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Drink_themeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Drink_themeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Drink_themeMouseReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 0));
        jLabel6.setText("Drink");

        javax.swing.GroupLayout Drink_themeLayout = new javax.swing.GroupLayout(Drink_theme);
        Drink_theme.setLayout(Drink_themeLayout);
        Drink_themeLayout.setHorizontalGroup(
            Drink_themeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Drink_themeLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(29, 29, 29))
        );
        Drink_themeLayout.setVerticalGroup(
            Drink_themeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Drink_themeLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel6)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Item_theme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Animal_theme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Family_theme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Food_Theme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Drink_theme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Vegetable_theme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Item_theme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Family_theme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Vegetable_theme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Animal_theme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Drink_theme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Food_Theme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(198, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Item_themeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item_themeMouseClicked
        EnglishFunnyFrame.scene.learnMenu.setVisible(false);
        EnglishFunnyFrame.scene.write.setVisible(false);
        EnglishFunnyFrame.scene.learn.setVisible(true);
        EnglishFunnyFrame.scene.learn.SetTheme("Item");
        EnglishFunnyFrame.scene.learn.CallStart();
        
    }//GEN-LAST:event_Item_themeMouseClicked

    private void Family_themeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Family_themeMouseClicked
        EnglishFunnyFrame.scene.learnMenu.setVisible(false);
        EnglishFunnyFrame.scene.write.setVisible(false);
        EnglishFunnyFrame.scene.learn.setVisible(true);
        EnglishFunnyFrame.scene.learn.SetTheme("Family");
        EnglishFunnyFrame.scene.learn.CallStart();
    }//GEN-LAST:event_Family_themeMouseClicked

    private void Vegetable_themeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vegetable_themeMouseClicked
        EnglishFunnyFrame.scene.learnMenu.setVisible(false);
        EnglishFunnyFrame.scene.write.setVisible(false);
        EnglishFunnyFrame.scene.learn.setVisible(true);
        EnglishFunnyFrame.scene.learn.SetTheme("Vegetable");
        EnglishFunnyFrame.scene.learn.CallStart();
    }//GEN-LAST:event_Vegetable_themeMouseClicked

    private void Animal_themeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Animal_themeMouseClicked
        EnglishFunnyFrame.scene.learnMenu.setVisible(false);
        EnglishFunnyFrame.scene.write.setVisible(false);
        EnglishFunnyFrame.scene.learn.setVisible(true);
        EnglishFunnyFrame.scene.learn.SetTheme("Animal");
        EnglishFunnyFrame.scene.learn.CallStart();
    }//GEN-LAST:event_Animal_themeMouseClicked

    private void Food_ThemeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Food_ThemeMouseClicked
        EnglishFunnyFrame.scene.learnMenu.setVisible(false);
        EnglishFunnyFrame.scene.write.setVisible(false);
        EnglishFunnyFrame.scene.learn.setVisible(true);
        EnglishFunnyFrame.scene.learn.SetTheme("Food");
        EnglishFunnyFrame.scene.learn.CallStart();
    }//GEN-LAST:event_Food_ThemeMouseClicked

    private void Drink_themeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Drink_themeMouseClicked
        EnglishFunnyFrame.scene.learnMenu.setVisible(false);
        EnglishFunnyFrame.scene.write.setVisible(false);
        EnglishFunnyFrame.scene.learn.setVisible(true);
        EnglishFunnyFrame.scene.learn.SetTheme("Drink");
        EnglishFunnyFrame.scene.learn.CallStart();
    }//GEN-LAST:event_Drink_themeMouseClicked

    private void Item_themeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item_themeMousePressed
        Item_theme.setBackground(cover);
    }//GEN-LAST:event_Item_themeMousePressed

    private void Item_themeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Item_themeMouseReleased
        Item_theme.setBackground(back);
    }//GEN-LAST:event_Item_themeMouseReleased

    private void Family_themeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Family_themeMousePressed
        Family_theme.setBackground(cover);
    }//GEN-LAST:event_Family_themeMousePressed

    private void Family_themeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Family_themeMouseReleased
        Family_theme.setBackground(back);
    }//GEN-LAST:event_Family_themeMouseReleased

    private void Vegetable_themeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vegetable_themeMousePressed
        Vegetable_theme.setBackground(cover);
    }//GEN-LAST:event_Vegetable_themeMousePressed

    private void Vegetable_themeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vegetable_themeMouseReleased
        Vegetable_theme.setBackground(back);
    }//GEN-LAST:event_Vegetable_themeMouseReleased

    private void Animal_themeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Animal_themeMousePressed
        Animal_theme.setBackground(cover);
    }//GEN-LAST:event_Animal_themeMousePressed

    private void Animal_themeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Animal_themeMouseReleased
        Animal_theme.setBackground(back);
    }//GEN-LAST:event_Animal_themeMouseReleased

    private void Food_ThemeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Food_ThemeMousePressed
        Food_Theme.setBackground(cover);
    }//GEN-LAST:event_Food_ThemeMousePressed

    private void Food_ThemeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Food_ThemeMouseReleased
        Food_Theme.setBackground(back);
    }//GEN-LAST:event_Food_ThemeMouseReleased

    private void Drink_themeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Drink_themeMousePressed
        Drink_theme.setBackground(cover);
    }//GEN-LAST:event_Drink_themeMousePressed

    private void Drink_themeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Drink_themeMouseReleased
        Drink_theme.setBackground(back);
    }//GEN-LAST:event_Drink_themeMouseReleased
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Animal_theme;
    private javax.swing.JPanel Drink_theme;
    private javax.swing.JPanel Family_theme;
    private javax.swing.JPanel Food_Theme;
    private javax.swing.JPanel Item_theme;
    private javax.swing.JPanel Vegetable_theme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
