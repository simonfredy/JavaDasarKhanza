/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadasar;

import java.sql.PreparedStatement;
import java.sql.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

/**
 *
 * @author GAME
 */
public class formDokter extends javax.swing.JDialog {

    /**
     * Creates new form formDokter
     */
    public formDokter(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        KodeDokter = new javax.swing.JTextField();
        NamaDokter = new javax.swing.JTextField();
        Alamat = new javax.swing.JTextField();
        JenisKelamin = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        Simpan = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("::[ Master Dokter ]::");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.BorderLayout(1, 1));

        jPanel3.setBackground(new java.awt.Color(255, 245, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 255)), "::[ Master Dokter ]::", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(153, 0, 153))); // NOI18N
        jPanel3.setLayout(new java.awt.BorderLayout(1, 1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 255)));
        jPanel1.setPreferredSize(new java.awt.Dimension(2, 150));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Kode Dokter :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 100, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nama Dokter :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 40, 80, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("J.K :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 70, 80, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Alamat :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 100, 80, 23);

        KodeDokter.setBackground(new java.awt.Color(255, 234, 255));
        KodeDokter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        KodeDokter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 94, 255)));
        jPanel1.add(KodeDokter);
        KodeDokter.setBounds(120, 10, 70, 23);

        NamaDokter.setBackground(new java.awt.Color(255, 234, 255));
        NamaDokter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NamaDokter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 94, 255)));
        NamaDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaDokterActionPerformed(evt);
            }
        });
        jPanel1.add(NamaDokter);
        NamaDokter.setBounds(120, 40, 200, 23);

        Alamat.setBackground(new java.awt.Color(255, 234, 255));
        Alamat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Alamat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 94, 255)));
        Alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlamatActionPerformed(evt);
            }
        });
        jPanel1.add(Alamat);
        Alamat.setBounds(120, 100, 430, 23);

        JenisKelamin.setBackground(new java.awt.Color(255, 234, 255));
        JenisKelamin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - Laki", "Perempuan" }));
        JenisKelamin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 94, 255)));
        JenisKelamin.setOpaque(true);
        jPanel1.add(JenisKelamin);
        JenisKelamin.setBounds(120, 70, 200, 23);

        jPanel3.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 255)));
        jPanel4.setPreferredSize(new java.awt.Dimension(2, 100));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        Simpan.setBackground(new java.awt.Color(153, 0, 153));
        Simpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Simpan.setForeground(new java.awt.Color(255, 255, 255));
        Simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/save-16x16.png"))); // NOI18N
        Simpan.setText("Simpan");
        Simpan.setOpaque(true);
        Simpan.setPreferredSize(new java.awt.Dimension(110, 30));
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        jPanel4.add(Simpan);

        Keluar.setBackground(new java.awt.Color(153, 0, 153));
        Keluar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Keluar.setForeground(new java.awt.Color(255, 255, 255));
        Keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/101.png"))); // NOI18N
        Keluar.setText("Keluar");
        Keluar.setOpaque(true);
        Keluar.setPreferredSize(new java.awt.Dimension(95, 30));
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        jPanel4.add(Keluar);

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NamaDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaDokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaDokterActionPerformed

    private void AlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlamatActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        try {
            MysqlDataSource server = new MysqlDataSource();
            server.setServerName("localhost");
            server.setUser("root");
            server.setPassword("");
            server.setPortNumber(3306);
            server.setDatabaseName("javadasar");
            
            Connection koneksi = server.getConnection();
            
            PreparedStatement ps = koneksi.prepareStatement("INSERT INTO dokter VALUES(?,?,?,?)");
            try {
                ps.setString(1, KodeDokter.getText());
                ps.setString(2, NamaDokter.getText());
                ps.setString(3, JenisKelamin.getSelectedItem().toString().substring(0, 1));
                ps.setString(4, Alamat.getText());
                ps.execute();
                
                KodeDokter.setText("");
                NamaDokter.setText("");
                JenisKelamin.setSelectedIndex(0);
                Alamat.setText("");
                
            } catch (Exception e) {
                System.out.println("Notif : " + e);
            }
            
        } catch (Exception e) {
            System.out.println("Notif : " + e);
        }
    }//GEN-LAST:event_SimpanActionPerformed

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
            java.util.logging.Logger.getLogger(formDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formDokter dialog = new formDokter(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JComboBox<String> JenisKelamin;
    private javax.swing.JButton Keluar;
    private javax.swing.JTextField KodeDokter;
    private javax.swing.JTextField NamaDokter;
    private javax.swing.JButton Simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
