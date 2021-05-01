
package englishfunny;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EnglishFunnyFrame extends javax.swing.JFrame {
    public static Scene scene = new Scene();
    
    public EnglishFunnyFrame() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Học từ vựng cùng Dolphin");
        this.setSize(900, 600);
        scene.welcomeLEFT.setBounds(0, 0, 500, 600);
        scene.signin.setBounds(500, 0, 400, 600);
        scene.signup.setBounds(500, 0, 400, 600);
        
        scene.mainmenu.setBounds(0, 0, 200, 600);
        scene.chart.setBounds(200, 0, 700, 600);
        scene.learnMenu.setBounds(200, 0, 700, 600);
        scene.flashcard.setBounds(200, 0, 700, 600);
        scene.learn.setBounds(200, 0, 700, 600);
        scene.testMenu.setBounds(200, 0, 700, 600);
        scene.changeinfor.setBounds(200, 0, 700, 600);
        scene.write.setBounds(200, 0, 700, 600);
        scene.listen.setBounds(200, 0, 700, 600);
      //  scene.choose.setBounds(200, 0, 700, 600);
        
        
        
        scene.welcomeLEFT.setVisible(true);
        scene.signin.setVisible(true);
        scene.signup.setVisible(false);
        scene.mainmenu.setVisible(false);
        scene.chart.setVisible(false);
        scene.learnMenu.setVisible(false);
        scene.flashcard.setVisible(false);
        scene.learn.setVisible(false);
        scene.testMenu.setVisible(false);
        scene.changeinfor.setVisible(false);
        scene.write.setVisible(false);
        scene.listen.setVisible(false);
      
        add(scene.welcomeLEFT);
        add(scene.signin);
        add(scene.signup);
        add(scene.mainmenu);
        add(scene.chart);
        add(scene.learnMenu);
        add(scene.flashcard);
        add(scene.learn);
        add(scene.testMenu);
        add(scene.changeinfor);
        add(scene.write);
        add(scene.listen);
 
    
      
        
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(900, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EnglishFunnyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnglishFunnyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnglishFunnyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnglishFunnyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnglishFunnyFrame().setVisible(true);
            }
        });
    }

    private void addComp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class englishfunny {

        public englishfunny() {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
