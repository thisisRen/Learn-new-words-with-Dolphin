/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package englishfunny;

import static englishfunny.Testmenu.Select;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jdk.jshell.spi.ExecutionControl;

public class Write extends javax.swing.JPanel {
    Random generator = new Random();
    private ArrayList <Wordmodel> WordList;
    private int i=0;
    private int count =1;
    private int trueAnswer=0;
    ImageIcon icon = new ImageIcon("Done.png");
    Color color = new Color(102,204,255);
    Color xcolor = new Color(204,204,204);
    Color cover = new Color(102,153,255);
    String word;
    
    
    
    public Write() {
        initComponents();
    }
    public void SetWord(String word){
        this.word = word;
        
    }
    public void CallStart(){
        WordDAO wordDAO = new WordDAO();
        WordList = wordDAO.selectAllWord();
        i = generator.nextInt(WordList.size()) ;
        if(Select == false)
            Show.setText(WordList.get(i).getTranslate());
        else Show.setText(WordList.get(i).getWord());
        Next.setVisible(false);
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Answer = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        Count = new javax.swing.JLabel();
        YourAnswer = new javax.swing.JLabel();
        TrueAnswer = new javax.swing.JLabel();
        Show = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Next = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 204, 255));
        jLabel1.setText("Câu trả lời của bạn: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 204, 255));
        jLabel2.setText("Câu trả lời đúng: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 204, 255));
        jLabel3.setText("TRẢ LỜI");

        Answer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Answer.setForeground(new java.awt.Color(204, 204, 204));
        Answer.setText("Nhập câu trả lời của bạn ở đây");
        Answer.setBorder(null);
        Answer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnswerMouseClicked(evt);
            }
        });
        Answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerActionPerformed(evt);
            }
        });

        Submit.setBackground(new java.awt.Color(102, 204, 255));
        Submit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setText("NỘP BÀI");
        Submit.setBorder(null);
        Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SubmitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SubmitMouseReleased(evt);
            }
        });
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Count.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Count.setForeground(new java.awt.Color(51, 204, 255));

        YourAnswer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        YourAnswer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TrueAnswer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TrueAnswer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Show.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Show.setForeground(new java.awt.Color(102, 204, 255));
        Show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        Next.setIcon(new javax.swing.ImageIcon("C:\\Users\\Public\\Pictures\\ICON CỰC MẠNH\\2x\\outline_navigate_next_white_24dp.png")); // NOI18N
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Next)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Next)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(YourAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(TrueAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(315, 315, 315))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Count, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Show, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Count, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Show, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(YourAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(TrueAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        YourAnswer.setText(Answer.getText());
        if(Select == false) TrueAnswer.setText(WordList.get(i).getWord());
        else TrueAnswer.setText(WordList.get(i).getTranslate());
    }//GEN-LAST:event_SubmitActionPerformed

    private void AnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerActionPerformed

    private void AnswerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnswerMouseClicked
        Answer.setForeground(color);
        Answer.setText("");
        
    }//GEN-LAST:event_AnswerMouseClicked

    private void SubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseClicked
        if(YourAnswer.getText().equals(TrueAnswer.getText())){
            YourAnswer.setForeground(Color.GREEN);
            trueAnswer++;
        }
        else{
            YourAnswer.setForeground(Color.RED);
        }
        Next.setVisible(true);
    }//GEN-LAST:event_SubmitMouseClicked

    private void NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseClicked
        int t=i;
        count++;
        Answer.setForeground(xcolor);
        Answer.setText("Hãy nhập câu trả lời của bạn");
        TrueAnswer.setText("");
        YourAnswer.setText("");
        CallStart();
        if(i==t) CallStart();
        else{
           if(Select == false) Show.setText(WordList.get(i).getTranslate());
           else Show.setText(WordList.get(i).getWord());
        }
        Count.setText(count+"/" + WordList.size());
        if(count > WordList.size()){
            JOptionPane.showMessageDialog(this,"Bạn đã đúng: "+trueAnswer+"/"+ WordList.size() +" câu", "HOÀN THÀNH", 3, icon);
            EnglishFunnyFrame.scene.write.setVisible(false);
            EnglishFunnyFrame.scene.testMenu.setVisible(true);
        }
    }//GEN-LAST:event_NextMouseClicked

    private void SubmitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMousePressed
        Submit.setBackground(cover);
    }//GEN-LAST:event_SubmitMousePressed

    private void SubmitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseReleased
        Submit.setBackground(color);
    }//GEN-LAST:event_SubmitMouseReleased

    private void NextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMousePressed
        Next.setBackground(cover);
    }//GEN-LAST:event_NextMousePressed

    private void NextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseReleased
        Next.setBackground(color);
    }//GEN-LAST:event_NextMouseReleased
    public void Init(){
        count = 1;
        trueAnswer = 0;
        Count.setText(count+"/" + WordList.size());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Answer;
    private javax.swing.JLabel Count;
    private javax.swing.JLabel Next;
    private javax.swing.JLabel Show;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel TrueAnswer;
    private javax.swing.JLabel YourAnswer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
