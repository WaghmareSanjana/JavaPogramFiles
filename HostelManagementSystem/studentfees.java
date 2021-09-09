import com.main.mail.gmail;
import java.awt.Color;
import static java.lang.String.join;
import java.util.Date;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.conn;
public class studentfees extends javax.swing.JFrame {
public void clear(){
    jTextField1.setEditable(true);
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField6.setText("");
    DefaultTableModel d=(DefaultTableModel)jTable1.getModel();
    d.setRowCount(0);
}
public void tableDetails(){
    DefaultTableModel d=(DefaultTableModel) jTable1.getModel();
    d.setRowCount(0);
    String mobile=jTextField1.getText();
    try{
        Connection con=conn.getCon();
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("select *from fees where mobile='"+mobile+"'");
        while(rs.next()){
            d.addRow(new Object[]{rs.getString(2),rs.getString(3)});
        }
        
    }catch(Exception e){
        
    }
}
 
    public studentfees() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Month", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 513, 130));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close all jframe.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 0, -1, -1));

        jLabel1.setText("Mobile Number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 68, -1, -1));

        jLabel2.setText("Name'");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 114, -1, -1));

        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 167, -1, -1));

        jLabel4.setText("Room Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 214, -1, -1));

        jLabel6.setText("Month");
        jLabel6.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel6ComponentAdded(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 272, -1, -1));

        jLabel7.setText("Amount To be Paid");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 326, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 65, 94, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 111, 234, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 164, 234, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 208, 234, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 256, 234, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 311, 234, -1));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Documents\\NetBeansProjects\\Hostel Management System\\src\\images\\search.png")); // NOI18N
        jButton2.setText("search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 64, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton3.setText("save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 378, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 378, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pages background.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 540, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel6ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6ComponentAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String mobile=jTextField1.getText();
        SimpleDateFormat dFormat=new SimpleDateFormat("MM-yyy");
        Date date=new Date();
        String month=dFormat.format(date);
        try{
            Connection con=conn.getCon();
            Statement s=con.createStatement();
            ResultSet rs=s.executeQuery("select *from student where mobile='"+mobile+"' AND status='living'");
            if(rs.next()){
                jTextField1.setEditable(false);
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(5));
                jTextField4.setText(rs.getString(9));
                jTextField5.setText(month);
                jTextField6.setText("6000");
               
            }
            else{
                JOptionPane.showMessageDialog(null,"Student Does Not exist");
                clear();
            }
           tableDetails();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String mobile=jTextField1.getText();
        String month=jTextField5.getText();
        String amount=jTextField6.getText();
        try{
             Connection con=conn.getCon();
             PreparedStatement pst=con.prepareStatement("insert into fees values(?,?,?)");
             pst.setString(1,mobile);
             pst.setString(2,month);
             pst.setString(3,amount);
             String to="sanjanawaghmare631@gmail.com";
            String subject="GRWPL";
            String msg="Thank You!!!For Paying fee:)";
	    gmail.send(to, subject, msg);

             pst.executeUpdate();
             tableDetails();
             JOptionPane.showMessageDialog(null, "Successfully Updataed!!");
             clear();
            Statement s=con.createStatement();
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(studentfees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentfees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentfees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentfees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentfees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
