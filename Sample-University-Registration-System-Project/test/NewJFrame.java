
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 3kwa
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jPanel2 = new javax.swing.JPanel();
        cbo12 = new javax.swing.JComboBox<>();
        txt2 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbo12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", " " }));
        cbo12.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo12ItemStateChanged(evt);
            }
        });
        cbo12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo12ActionPerformed(evt);
            }
        });
        jPanel2.add(cbo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 190, 40));
        jPanel2.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 190, 60));
        jPanel2.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 190, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents
       static String[][]  arr = new String[2][3];

    private void cbo12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo12ActionPerformed
            arr[0][0] ="1"; 
        if(cbo12.getSelectedItem().toString().equals(arr[0][0])){
           txt1.setText(arr[0][1]);
           txt2.setText(arr[0][2]);
        }else if(cbo12.getSelectedItem().toString().equals(arr[1][0])){
         txt1.setText(arr[1][1]);
         txt2.setText(arr[1][2]);
        }
    }//GEN-LAST:event_cbo12ActionPerformed

    private void cbo12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo12ItemStateChanged
       
    }//GEN-LAST:event_cbo12ItemStateChanged

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
   
        //arr[0][0] ="1"; 
        arr[0][1] ="Ali";
        arr[0][2] ="Amr"; 
        arr[1][0] ="2"; 
        arr[1][1] ="Abdalla"; 
        arr[1][2] ="Gaber"; 
    }
    
  
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbo12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables
}
