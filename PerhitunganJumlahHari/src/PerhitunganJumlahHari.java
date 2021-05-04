import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
 
public class PerhitunganJumlahHari extends javax.swing.JFrame {

    public PerhitunganJumlahHari() {
        initComponents();
        
    }
    void hitung(){
          if(inputTahun.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Error : isian tahun kososng!",
                    "Error:isian tahun kosong!",JOptionPane.WARNING_MESSAGE);
        }else{
            int tahun = Integer.parseInt(inputTahun.getText());
            int jumlahHari;
            if(pilihBulan.getSelectedItem().equals("Februari")){
                if (((tahun % 4== 0)&&!(tahun % 100 == 0))||(tahun % 400 == 0))
                    jumlahHari=29;
                else jumlahHari=28;
            }else if(pilihBulan.getSelectedItem().equals("April")||
                     pilihBulan.getSelectedItem().equals("Juni")||
                     pilihBulan.getSelectedItem().equals("September")||
                    pilihBulan.getSelectedItem().equals("November")){
                     jumlahHari=30;
        }else{
    jumlahHari=31;
        }
         Hasil.setText("Jumlah Hari Pada Bulan "+
                pilihBulan.getSelectedItem()+
                 " Tahun "+tahun+" adalah "+jumlahHari);
         }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textTahun = new javax.swing.JLabel();
        textHari = new javax.swing.JLabel();
        Hasil = new javax.swing.JLabel();
        inputTahun = new javax.swing.JTextField();
        pilihBulan = new javax.swing.JComboBox<>();
        hapusButton = new javax.swing.JButton();
        hitungButton = new javax.swing.JButton();
        simpanButton = new javax.swing.JButton();
        keluarButton = new javax.swing.JButton();
        textTahun1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perhitungan Jumlah Hari");
        setAutoRequestFocus(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Penghitung Jumlah Hari v0.1"));

        textTahun.setText("Tahun");

        textHari.setText("Hari");

        inputTahun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputTahunKeyTyped(evt);
            }
        });

        pilihBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selected Month-", "Januari", "Februari", "Maret", "April", "Mei ", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        hitungButton.setText("Hitung");
        hitungButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungButtonActionPerformed(evt);
            }
        });

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        keluarButton.setText("Keluar");
        keluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarButtonActionPerformed(evt);
            }
        });

        textTahun1.setText("Penghitung Jumlah Hari");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textHari, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTahun)
                            .addComponent(hapusButton))
                        .addGap(152, 152, 152)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pilihBulan, 0, 137, Short.MAX_VALUE)
                                        .addComponent(inputTahun))
                                    .addComponent(textTahun1))
                                .addGap(128, 128, 128))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(hitungButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(simpanButton)
                                .addGap(58, 58, 58)))
                        .addComponent(keluarButton)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(textTahun1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTahun)
                    .addComponent(inputTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textHari)
                    .addComponent(pilihBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapusButton)
                    .addComponent(hitungButton)
                    .addComponent(simpanButton)
                    .addComponent(keluarButton))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        inputTahun.setText("");
        inputTahun.requestFocus();
        Hasil.setText("");
        pilihBulan.setSelectedIndex(0);
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void keluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_keluarButtonActionPerformed

    private void hitungButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungButtonActionPerformed
        hitung();
    }//GEN-LAST:event_hitungButtonActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        try{
            try (BufferedWriter out = new BufferedWriter(new FileWriter("Jumlah hari pada " + pilihBulan.getSelectedItem() + " " + inputTahun.getText() + ".txt"))) {
                out.write(Hasil.getText());
                JOptionPane.showMessageDialog(null,"Berhasil disimpan dalam file");
            }
        }catch(IOException | HeadlessException e){
            System.err.println("Error :"+e.getMessage());
        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void inputTahunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTahunKeyTyped
        char c =evt.getKeyChar();
        if (!((Character.isDigit(c)||(c== KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_DELETE))
                )){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Masukan hanya bilangan angka !");
         
            evt.consume();
        }    
    }//GEN-LAST:event_inputTahunKeyTyped

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
            java.util.logging.Logger.getLogger(PerhitunganJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerhitunganJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerhitunganJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerhitunganJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerhitunganJumlahHari().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hasil;
    private javax.swing.JButton hapusButton;
    private javax.swing.JButton hitungButton;
    private javax.swing.JTextField inputTahun;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton keluarButton;
    private javax.swing.JComboBox<String> pilihBulan;
    private javax.swing.JButton simpanButton;
    private javax.swing.JLabel textHari;
    private javax.swing.JLabel textTahun;
    private javax.swing.JLabel textTahun1;
    // End of variables declaration//GEN-END:variables
}
