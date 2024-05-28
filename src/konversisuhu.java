/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class konversisuhu extends javax.swing.JFrame {

    /**
     * Creates new form konversisuhu
     */
    public konversisuhu() {
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

        jLabel1 = new javax.swing.JLabel();
        cb_skalaasal = new javax.swing.JComboBox<>();
        tf_inputsuhuawal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cb_skalatujuan = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        bt_konversi = new javax.swing.JToggleButton();
        tf_hasil = new javax.swing.JTextField();
        bt_reset = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        jLabel1.setText("KONVERSI SUHU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 24, -1, -1));

        cb_skalaasal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Kelvin", "Farenheit" }));
        getContentPane().add(cb_skalaasal, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 116, 229, -1));

        tf_inputsuhuawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_inputsuhuawalActionPerformed(evt);
            }
        });
        getContentPane().add(tf_inputsuhuawal, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 88, 229, -1));

        jLabel2.setText("Suhu Asal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 66, -1, -1));

        jLabel3.setText("Suhu Tujuan");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 144, -1, -1));

        cb_skalatujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Kelvin", "Farenheit" }));
        getContentPane().add(cb_skalatujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 166, 229, -1));

        jLabel4.setText("Hasil");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 242, -1, -1));

        bt_konversi.setText("Konversi");
        bt_konversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_konversiActionPerformed(evt);
            }
        });
        getContentPane().add(bt_konversi, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 194, 229, -1));
        getContentPane().add(tf_hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 239, 167, -1));

        bt_reset.setText("Reset");
        bt_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resetActionPerformed(evt);
            }
        });
        getContentPane().add(bt_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 270, 95, -1));

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 270, 95, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_konversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_konversiActionPerformed

double suhuasal = Double.parseDouble(tf_inputsuhuawal.getText());
String skala_asal = cb_skalaasal.getSelectedItem().toString();
String skala_tujuan = cb_skalatujuan.getSelectedItem().toString();

double hasil = 0;
if (skala_asal.equals("Celcius") && skala_tujuan.equals("Celcius")) {
    hasil = suhuasal;
} else if (skala_asal.equals("Celcius") && skala_tujuan.equals("Kelvin")) {
    hasil = suhuasal + 273.15;
} else if (skala_asal.equals("Celcius") && skala_tujuan.equals("Fahrenheit")) {
    hasil = (suhuasal * 9/5) + 32;
} else if (skala_asal.equals("Fahrenheit") && skala_tujuan.equals("Fahrenheit")) {
    hasil = suhuasal;
} else if (skala_asal.equals("Fahrenheit") && skala_tujuan.equals("Celsius")) {
    hasil = (suhuasal - 32) * 5/9;
} else if (skala_asal.equals("Fahrenheit") && skala_tujuan.equals("Kelvin")) {
    hasil = (suhuasal - 32) * 5/9 + 273.15;
} else if (skala_asal.equals("Kelvin") && skala_tujuan.equals("Kelvin")) {
    hasil = suhuasal;
} else if (skala_asal.equals("Kelvin") && skala_tujuan.equals("Celsius")) {
    hasil = suhuasal - 273.15;
} else if (skala_asal.equals("Kelvin") && skala_tujuan.equals("Fahrenheit")) {
    hasil = (suhuasal - 273.15) * 9/5 + 32;
}

String skala = skala_tujuan.substring(0, 1);
tf_hasil.setText(String.format("%.2f", hasil) + "\u00b0" + skala);

    }//GEN-LAST:event_bt_konversiActionPerformed

    private void bt_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resetActionPerformed
    tf_inputsuhuawal.setText("");
    tf_hasil.setText("");
    }//GEN-LAST:event_bt_resetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf_inputsuhuawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_inputsuhuawalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_inputsuhuawalActionPerformed

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
            java.util.logging.Logger.getLogger(konversisuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(konversisuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(konversisuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(konversisuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new konversisuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bt_konversi;
    private javax.swing.JToggleButton bt_reset;
    private javax.swing.JComboBox<String> cb_skalaasal;
    private javax.swing.JComboBox<String> cb_skalatujuan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tf_hasil;
    private javax.swing.JTextField tf_inputsuhuawal;
    // End of variables declaration//GEN-END:variables
}