/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.gui;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import quizapp.dao.PerformanceDAO;
import quizapp.dao.QuestionDAO;
import quizapp.pojo.Answer;
import quizapp.pojo.AnswerStore;
import quizapp.pojo.ExamDTO;
import quizapp.pojo.Performance;
import quizapp.pojo.QuestionDTO;
import quizapp.pojo.QuestionStore;
import quizapp.pojo.UserProfile;

/**
 *
 * @author jp
 */
public class TakeTestFrame extends javax.swing.JFrame {

    private ExamDTO exam;
    private QuestionStore qstore;
    private AnswerStore astore;
  private  int qno,pos;
    private boolean answersavednext;
    private boolean answersavedprevious;
    private int sizebug;
   
    

    /**
     * Creates new form TakeTestFrame
     */
    public TakeTestFrame() {
        initComponents();
        
        setResizable(false);
         super.setLocationRelativeTo(null);
          lblhello.setText("Hello "+UserProfile.getUsername());
          qstore=new QuestionStore();
          astore=new AnswerStore();
          qno=1;
          lblQuestionNo.setText("Que :"+qno);
    }
    

    TakeTestFrame(ExamDTO exam) {
        this();
        this.exam=exam;
        lblTitle.setText(exam.getLanguage().toUpperCase()+" PAPER");
        loadQuestions();
        showQuestion();
    }

  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblHello = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblQuestionNo = new javax.swing.JLabel();
        btnnext = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        lblhello = new javax.swing.JLabel();
        jrbOption1 = new javax.swing.JRadioButton();
        jrbOption2 = new javax.swing.JRadioButton();
        jrbOption3 = new javax.swing.JRadioButton();
        jrbOption4 = new javax.swing.JRadioButton();
        btnPrevious = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHello.setBackground(new java.awt.Color(52, 137, 223));
        lblHello.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Java Paper");

        lblQuestionNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblQuestionNo.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestionNo.setText("Q.  ");

        btnnext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnext.setForeground(new java.awt.Color(0, 0, 102));
        btnnext.setText("Next");
        btnnext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 102));
        btnCancel.setText("Cancel");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDone.setForeground(new java.awt.Color(0, 0, 102));
        btnDone.setText("Done");
        btnDone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        lblhello.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblhello.setForeground(new java.awt.Color(255, 255, 255));
        lblhello.setText("Hello");

        jrbOption1.setBackground(new java.awt.Color(52, 137, 223));
        buttonGroup1.add(jrbOption1);
        jrbOption1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbOption1.setForeground(new java.awt.Color(0, 0, 51));
        jrbOption1.setText("option1");
        jrbOption1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOption1ActionPerformed(evt);
            }
        });

        jrbOption2.setBackground(new java.awt.Color(52, 137, 223));
        buttonGroup1.add(jrbOption2);
        jrbOption2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbOption2.setForeground(new java.awt.Color(0, 0, 51));
        jrbOption2.setText("option2");
        jrbOption2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOption2ActionPerformed(evt);
            }
        });

        jrbOption3.setBackground(new java.awt.Color(52, 137, 223));
        buttonGroup1.add(jrbOption3);
        jrbOption3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbOption3.setForeground(new java.awt.Color(0, 0, 51));
        jrbOption3.setText("option3");
        jrbOption3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jrbOption4.setBackground(new java.awt.Color(52, 137, 223));
        buttonGroup1.add(jrbOption4);
        jrbOption4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrbOption4.setForeground(new java.awt.Color(0, 0, 51));
        jrbOption4.setText("option4");
        jrbOption4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbOption4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOption4ActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(0, 0, 102));
        btnPrevious.setText("Previous");
        btnPrevious.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(52, 137, 223));

        label1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("GOOD");

        label2.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("LUCK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        txtQuestion.setEditable(false);
        txtQuestion.setColumns(20);
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        javax.swing.GroupLayout lblHelloLayout = new javax.swing.GroupLayout(lblHello);
        lblHello.setLayout(lblHelloLayout);
        lblHelloLayout.setHorizontalGroup(
            lblHelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblHelloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblHelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblHelloLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(lblHelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jrbOption1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(146, 146, 146)
                        .addGroup(lblHelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbOption2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbOption4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(182, 182, 182))
                    .addGroup(lblHelloLayout.createSequentialGroup()
                        .addGroup(lblHelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblhello, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(lblHelloLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(lblHelloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuestionNo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lblHelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lblHelloLayout.createSequentialGroup()
                        .addComponent(btnPrevious)
                        .addGap(112, 112, 112)
                        .addComponent(btnnext)
                        .addGap(264, 264, 264)
                        .addComponent(btnDone))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        lblHelloLayout.setVerticalGroup(
            lblHelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblHelloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblhello)
                .addGroup(lblHelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblHelloLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lblHelloLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblTitle)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblHelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuestionNo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblHelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbOption2)
                    .addComponent(jrbOption1))
                .addGap(38, 38, 38)
                .addGroup(lblHelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbOption3)
                    .addComponent(jrbOption4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(lblHelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnext)
                    .addComponent(btnCancel)
                    .addComponent(btnDone)
                    .addComponent(btnPrevious))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHello, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHello, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
     String chosenAnswer=getUserAnswer();
       
           if(chosenAnswer!=null){
    QuestionDTO question=qstore.getQuestion(pos);
    String correctAnswer=question.getCorrectAnswer();
           Answer ans=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
          Answer answerTest=astore.getAnswerByQno(qno);
          if(answerTest==null){
             
           astore.addAnswer(ans);
          }
          else{
              if(ans.getChosenAnswer().equals(answerTest.getChosenAnswer())==false){
          int apos=astore.removeAnswer(answerTest);
           astore.setAnswerAt(apos, ans);
              }
          }
           }
          pos++;
          if(pos>=qstore.getCount()){
           pos=0;
          }
         
          qno++;
           System.out.println("list size "+astore.getAllAnswer().size());
          if(qno>qstore.getCount()){
           qno=1;
              
               
           }
           lblQuestionNo.setText("Que. "+qno);
        showQuestion();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        PaperSelectionFrame spaper=new PaperSelectionFrame();
        spaper.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        String chosenAnswer=getUserAnswer();
       
           if(chosenAnswer!=null){
          QuestionDTO question=qstore.getQuestion(pos);
    String correctAnswer=question.getCorrectAnswer();
           Answer ans=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
          Answer answerTest=astore.getAnswerByQno(qno);
          if(answerTest==null){
             
           astore.addAnswer(ans);
          }
          else{
              if(ans.getChosenAnswer().equals(answerTest.getChosenAnswer())==false){
          int apos=astore.removeAnswer(answerTest);
           astore.setAnswerAt(apos, ans);
              }
          }
           }
           int right=0,wrong=0;
           for(QuestionDTO question:qstore.getAllQuestion()){
               int qno=question.getQno();
               Answer answer=astore.getAnswerByQno(qno);
               if(answer==null)
                   continue;
               else{
                   String chosenAnswer1=answer.getChosenAnswer();
                   String correctAnswer=answer.getCorrectAnswer();
                   if(chosenAnswer1.equals(correctAnswer))
                       ++right;
                   else
                       ++wrong;
               }
           }
           String reportCard="Total Question : "+qstore.getCount();
           reportCard+="\nRight Answer: "+right;
           reportCard+="\nWrong Answer:"+wrong;
           reportCard+="\nUnAttempted : "+(qstore.getCount()-(right+wrong));
           JOptionPane.showMessageDialog(null,reportCard,"your Result!",JOptionPane.INFORMATION_MESSAGE);
           try{
               Performance perform=new Performance(UserProfile.getUsername(),exam.getExamId(),right,wrong,(qstore.getCount()-(right+wrong))
                       ,(double)right/qstore.getCount()*100,exam.getLanguage());
               PerformanceDAO.addperformance(perform);
               PaperSelectionFrame pselect=new PaperSelectionFrame();
               pselect.setVisible(true);
               this.dispose();
           }catch(SQLException ex){
               JOptionPane.showMessageDialog(null,"SQL Error"+ex,"Error!",JOptionPane.ERROR_MESSAGE);
           }
           
    }//GEN-LAST:event_btnDoneActionPerformed

    private void jrbOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOption2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbOption2ActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        String chosenAnswer=getUserAnswer();
       
           if(chosenAnswer!=null){
    QuestionDTO question=qstore.getQuestion(pos);
    String correctAnswer=question.getCorrectAnswer();
           Answer ans=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
          Answer answerTest=astore.getAnswerByQno(qno);
          if(answerTest==null){
             
           astore.addAnswer(ans);
          }
          else{
              if(ans.getChosenAnswer().equals(answerTest.getChosenAnswer())==false){
          int apos=astore.removeAnswer(answerTest);
           astore.setAnswerAt(apos, ans);
              }
          }
           }
           
        pos--;
          if(pos<=0){
          pos=qstore.getCount()-1;
          }
          
          qno--;
           System.out.println("list size "+astore.getAllAnswer().size());
          if(qno<=1){
           qno=qstore.getCount();
              
               
           }
           lblQuestionNo.setText("Que. "+qno);
        showQuestion();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void jrbOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOption1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbOption1ActionPerformed

    private void jrbOption4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOption4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbOption4ActionPerformed

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
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTestFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnnext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrbOption1;
    private javax.swing.JRadioButton jrbOption2;
    private javax.swing.JRadioButton jrbOption3;
    private javax.swing.JRadioButton jrbOption4;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JPanel lblHello;
    private javax.swing.JLabel lblQuestionNo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblhello;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables

    private void loadQuestions() {
       try{
          ArrayList<QuestionDTO> list=QuestionDAO.getQuestionByExamId(exam.getExamId());
          for(QuestionDTO obj:list){
              qstore.addQuestion(obj);
          }
       }catch(SQLException ex){
         JOptionPane.showMessageDialog(null,"SQl Error"+ex,"Error",JOptionPane.ERROR_MESSAGE);
       }
    }
    public void showQuestion(){
        QuestionDTO question=qstore.getQuestion(pos);
        buttonGroup1.clearSelection();
        txtQuestion.setText(question.getQuestion());
        jrbOption1.setText(question.getAnswer1());
        jrbOption2.setText(question.getAnswer2());
        jrbOption3.setText(question.getAnswer3());
        jrbOption4.setText(question.getAnswer4());
        
        Answer answer=astore.getAnswerByQno(qno);
        if(answer==null){
            return;
        
        }
        String chosenAnswer=answer.getChosenAnswer();
        switch(chosenAnswer){
            case "Answer1":
                jrbOption1.setSelected(true);
                break;
            case "Answer2":
                jrbOption2.setSelected(true);
                break;
            case "Answer3":
                 jrbOption3.setSelected(true);
                 break;
            case "Answer4":
                 jrbOption4.setSelected(true);
           
                break;
              
        }
    }
    public String getUserAnswer(){
        
        if(jrbOption1.isSelected()){
           return "Answer1";
        }
        else if(jrbOption2.isSelected()){
            return "Answer2";
        }
        else if(jrbOption3.isSelected()){
            return "Answer3";
        }
        else if(jrbOption4.isSelected()){
             return "Answer4";
        }
        else
        {
            return null;
        }
    }
}
