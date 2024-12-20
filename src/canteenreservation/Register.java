
package canteenreservation;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author John Romel Lucot
 */
public class Register extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public Register() {
        initComponents();
        con = Dbconnect.getConnected();
    }
     public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        fname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pword = new javax.swing.JPasswordField();
        showpw = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        cpword = new javax.swing.JPasswordField();
        showcpw = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 722));

        jPanel4.setBackground(new java.awt.Color(230, 61, 65));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fname.setBackground(new java.awt.Color(255, 204, 153));
        fname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fname.setForeground(new java.awt.Color(0, 0, 0));
        fname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 320, 350, 30));

        email.setBackground(new java.awt.Color(255, 204, 153));
        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 260, 350, 30));

        jLabel3.setFont(new java.awt.Font("Artifakt Element", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("FIRSTNAME:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 0));
        jLabel1.setText("-REGISTRATION-");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Artifakt Element", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("EMAIL:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClientIcons/LOG IN BG.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -140, -1, -1));

        jPanel1.setBackground(new java.awt.Color(227, 230, 229));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 110));

        jPanel5.setBackground(new java.awt.Color(255, 204, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Artifakt Element", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("LASTNAME:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lname.setBackground(new java.awt.Color(255, 204, 153));
        lname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lname.setForeground(new java.awt.Color(0, 0, 0));
        lname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 260, 350, 30));

        jLabel5.setFont(new java.awt.Font("Artifakt Element", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("USERNAME:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        uname.setBackground(new java.awt.Color(255, 204, 153));
        uname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        uname.setForeground(new java.awt.Color(0, 0, 0));
        uname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 320, 350, 30));

        jLabel6.setFont(new java.awt.Font("Artifakt Element", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("PASSWORD:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        pword.setBackground(new java.awt.Color(255, 204, 153));
        pword.setForeground(new java.awt.Color(0, 0, 0));
        pword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(pword, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 380, 210, 30));

        showpw.setBackground(new java.awt.Color(255, 204, 153));
        showpw.setFont(new java.awt.Font("Artifakt Element", 0, 12)); // NOI18N
        showpw.setForeground(new java.awt.Color(0, 0, 0));
        showpw.setText("Show Password");
        showpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpwActionPerformed(evt);
            }
        });
        jPanel5.add(showpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        jLabel7.setFont(new java.awt.Font("Artifakt Element", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CONFIRM PASSWORD:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        cpword.setBackground(new java.awt.Color(255, 204, 153));
        cpword.setForeground(new java.awt.Color(0, 0, 0));
        cpword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(cpword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 210, 30));

        showcpw.setBackground(new java.awt.Color(255, 204, 153));
        showcpw.setFont(new java.awt.Font("Artifakt Element", 0, 12)); // NOI18N
        showcpw.setForeground(new java.awt.Color(0, 0, 0));
        showcpw.setText("Show Password");
        showcpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showcpwActionPerformed(evt);
            }
        });
        jPanel5.add(showcpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SUBMIT");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 240, 70));

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setFont(new java.awt.Font("Artifakt Element", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("BACK TO LOGIN");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 170, 37));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 380, 630));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String getEmail = email.getText();
        String getFname = fname.getText();
        String getLname = lname.getText();
        String getUname = uname.getText();
        String getPword = pword.getText();
        String getCPword = cpword.getText();
        if(!getPword.equals(getCPword)){
            JOptionPane.showMessageDialog(rootPane, "Confirm Password and Password must match", null, HEIGHT);
            return;
        }
        try{
            pst = con.prepareStatement("INSERT INTO `account`(`id`, `email`, `firstname`, `lastname`, `username`, `password`) VALUES(null,?, ?, ?, ?, ?)");
            pst.setString(1, getEmail);
            pst.setString(2, getFname);
            pst.setString(3, getLname);
            pst.setString(4, getUname);
            pst.setString(5, getPword);
            
            int rowsaffected = pst.executeUpdate();
            if(rowsaffected == 1){
                JOptionPane.showMessageDialog(rootPane, "Registration Successful");
                email.setText("");
                fname.setText("");
                lname.setText("");
                uname.setText("");
                pword.setText("");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Registration Failed", null, HEIGHT);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpwActionPerformed
        // TODO add your handling code here:
        if(showpw.isSelected()){
            pword.setEchoChar((char)0);
        }else{
            pword.setEchoChar('*');
        }
    }//GEN-LAST:event_showpwActionPerformed

    private void showcpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showcpwActionPerformed
        // TODO add your handling code here:
        if(showcpw.isSelected()){
            cpword.setEchoChar((char)0);
        }else{
            cpword.setEchoChar('*');
        }
    }//GEN-LAST:event_showcpwActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Login log = new Login();
      log.setVisible(true);
      close();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cpword;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField pword;
    private javax.swing.JCheckBox showcpw;
    private javax.swing.JCheckBox showpw;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
