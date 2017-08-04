
import javax.swing.JOptionPane;

/*
 * Copyright (C) 2017  Norbert Bartko
 *
 * Dieses Programm ist Freie Software: Sie können es unter den Bedingungen
 * der GNU General Public License, wie von der Free Software Foundation,
 * Version 3 der Lizenz oder (nach Ihrer Wahl) jeder neueren
 * veröffentlichten Version, weiterverbreiten und/oder modifizieren.
 * 
 * Dieses Programm wird in der Hoffnung, dass es nützlich sein wird, aber
 * OHNE JEDE GEWÄHRLEISTUNG, bereitgestellt; sogar ohne die implizite
 * Gewährleistung der MARKTFÄHIGKEIT oder EIGNUNG FÜR EINEN BESTIMMTEN ZWECK.
 * Siehe die GNU General Public License für weitere Details.
 * 
 * Sie sollten eine Kopie der GNU General Public License zusammen mit diesem
 * Programm erhalten haben. Wenn nicht, siehe <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Norbert Bartko
 */
public class FormMain extends javax.swing.JFrame {

    /**
     * Creates new form FormMain
     */
    public FormMain() {
        // Initialisiere das form
        initComponents();
        // Die Wahrheitstabelle leeren
        labUA0.setText("");
        labUA1.setText("");
        labUA2.setText("");
        labUA3.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labHeadline = new javax.swing.JLabel();
        labHinweis = new javax.swing.JLabel();
        labEingangsspannung = new javax.swing.JLabel();
        labWiederstand = new javax.swing.JLabel();
        txtEingangsspannung = new javax.swing.JTextField();
        txtWiederstand = new javax.swing.JTextField();
        cmdBerechnen = new javax.swing.JButton();
        labDez = new javax.swing.JLabel();
        labDez1 = new javax.swing.JLabel();
        labDez2 = new javax.swing.JLabel();
        labDez3 = new javax.swing.JLabel();
        labDez4 = new javax.swing.JLabel();
        labS1 = new javax.swing.JLabel();
        labB1 = new javax.swing.JLabel();
        labB2 = new javax.swing.JLabel();
        labB3 = new javax.swing.JLabel();
        labB4 = new javax.swing.JLabel();
        labS0 = new javax.swing.JLabel();
        labA1 = new javax.swing.JLabel();
        labA2 = new javax.swing.JLabel();
        labA3 = new javax.swing.JLabel();
        labA4 = new javax.swing.JLabel();
        labUA = new javax.swing.JLabel();
        labUA0 = new javax.swing.JLabel();
        labUA1 = new javax.swing.JLabel();
        labUA2 = new javax.swing.JLabel();
        labUA3 = new javax.swing.JLabel();
        radS1_0 = new javax.swing.JRadioButton();
        radS1_1 = new javax.swing.JRadioButton();
        radS0_0 = new javax.swing.JRadioButton();
        radS0_1 = new javax.swing.JRadioButton();
        labBild = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("R / 2R Digital Analog Converter");
        setBackground(java.awt.Color.white);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setName("mainform"); // NOI18N
        setResizable(false);

        labHeadline.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 25)); // NOI18N
        labHeadline.setText("R / 2R Digital Analog Converter");
        labHeadline.setName("labHeadline"); // NOI18N

        labHinweis.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labHinweis.setText("Bitte geben Sie die fogenden Werte ein :");
        labHinweis.setName("labHinweis"); // NOI18N

        labEingangsspannung.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labEingangsspannung.setText("Eingangsspannung ( in V )");
        labEingangsspannung.setName("labEingangsspannung"); // NOI18N

        labWiederstand.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labWiederstand.setText("Wiederstand ( in kilo Ohm )");
        labWiederstand.setName("labWiederstand"); // NOI18N

        txtEingangsspannung.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 15)); // NOI18N
        txtEingangsspannung.setName("txtEingangsspanung"); // NOI18N

        txtWiederstand.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 15)); // NOI18N
        txtWiederstand.setName("txtWiederstand"); // NOI18N

        cmdBerechnen.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        cmdBerechnen.setText("Berechnen");
        cmdBerechnen.setName("cmdBerechnen"); // NOI18N
        cmdBerechnen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdBerechnen_MouseClicked(evt);
            }
        });

        labDez.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labDez.setText("Dez.");

        labDez1.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labDez1.setText("0");

        labDez2.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labDez2.setText("1");

        labDez3.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labDez3.setText("2");

        labDez4.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labDez4.setText("3");

        labS1.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labS1.setText("S1");

        labB1.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labB1.setText("0");

        labB2.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labB2.setText("0");

        labB3.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labB3.setText("1");

        labB4.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labB4.setText("1");

        labS0.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labS0.setText("S0");

        labA1.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labA1.setText("0");

        labA2.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labA2.setText("1");

        labA3.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labA3.setText("0");

        labA4.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labA4.setText("1");

        labUA.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labUA.setText("UA in V");

        labUA0.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labUA0.setText("U");

        labUA1.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labUA1.setText("U");

        labUA2.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labUA2.setText("U");

        labUA3.setFont(new java.awt.Font("Bitstream Vera Serif", 2, 16)); // NOI18N
        labUA3.setText("U");

        radS1_0.setSelected(true);
        radS1_0.setText("S1 = 0");
        radS1_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radS1_0MouseClicked(evt);
            }
        });

        radS1_1.setText("S1 = 1");
        radS1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radS1_1MouseClicked(evt);
            }
        });

        radS0_0.setSelected(true);
        radS0_0.setText("S0 = 0");
        radS0_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radS0_0MouseClicked(evt);
            }
        });

        radS0_1.setText("S0 = 1");
        radS0_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radS0_1MouseClicked(evt);
            }
        });

        labBild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dca.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(labHeadline)
                .addContainerGap(471, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(labHinweis))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labDez)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labDez2)
                                                .addComponent(labDez1)
                                                .addComponent(labDez3)
                                                .addComponent(labDez4))))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labS1)
                                        .addComponent(labB1)
                                        .addComponent(labB3)
                                        .addComponent(labB4)
                                        .addComponent(labB2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labS0)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labA1)
                                                .addComponent(labA3)
                                                .addComponent(labA4)
                                                .addComponent(labA2))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(37, 37, 37)
                                            .addComponent(labUA))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(44, 44, 44)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labUA1)
                                                .addComponent(labUA0)
                                                .addComponent(labUA2)
                                                .addComponent(labUA3))))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(labWiederstand)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                    .addComponent(txtWiederstand, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(labEingangsspannung)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEingangsspannung, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(radS1_1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmdBerechnen)
                                        .addGap(50, 50, 50)
                                        .addComponent(radS1_0)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radS0_0)
                                    .addComponent(radS0_1))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labBild, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labHeadline)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labHinweis)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labEingangsspannung)
                            .addComponent(txtEingangsspannung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labWiederstand)
                            .addComponent(txtWiederstand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdBerechnen)
                            .addComponent(radS1_0)
                            .addComponent(radS0_0))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radS1_1)
                            .addComponent(radS0_1))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labDez)
                            .addComponent(labS1)
                            .addComponent(labS0)
                            .addComponent(labUA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labDez1)
                            .addComponent(labB1)
                            .addComponent(labA1)
                            .addComponent(labUA0))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labDez2)
                            .addComponent(labB2)
                            .addComponent(labA2)
                            .addComponent(labUA1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labDez3)
                            .addComponent(labB3)
                            .addComponent(labA3)
                            .addComponent(labUA2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labDez4)
                            .addComponent(labB4)
                            .addComponent(labA4)
                            .addComponent(labUA3)))
                    .addComponent(labBild, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
        // The code ...
    private void cmdBerechnen_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdBerechnen_MouseClicked
        // Variablen Dekleration
        double  U, R;
            // Prüfen und umwandeln der eingabe
        // Stromspanung
        try {
            // Die eingae auslesen und umwandeln
            U = Double.parseDouble(txtEingangsspannung.getText());
        } catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Ihre eingabe ist ungültig", "Error 676", JOptionPane.OK_OPTION);
            return;
        }
        // Stromspanung
        try {
            // Die eingae auslesen und umwandeln
            R = Double.parseDouble(txtWiederstand.getText());
        } catch (NumberFormatException nfe){
                // Fehlermeldung ausgeben und die Methode verlassen
            JOptionPane.showMessageDialog(null, "Ihre eingabe ist ungültig", "Error 676", JOptionPane.OK_OPTION);
            return;
        }
            // Neuse Objekt der Klasse DAC anlegen
        ClassDAC StreberJunge = new ClassDAC(U, R);
        // Prufen ob S1 auf Masse ist oder nicht und dann den Wert setzen
        if (radS1_0.isSelected()) StreberJunge.setS1(0);
        else StreberJunge.setS1(1);
        // Prufen ob S0 auf Masse ist oder nicht und dann den Wert setzen
        if (radS0_0.isSelected()) StreberJunge.setS0(0);
        else StreberJunge.setS0(1);
        
        // Double Variable für das Ergebnis
        double ergebnis;
        // Die Methode rechnet alle Werte aus gibt abber nur UA zurück
        ergebnis = StreberJunge.LosRechneJetzt();
        
        // Ausgabe in der Wertetabelle
        if (radS1_0.isSelected() && radS0_0.isSelected()) labUA0.setText("" + ergebnis);
        if (radS1_0.isSelected() && radS0_1.isSelected()) labUA1.setText("" + ergebnis);
        if (radS1_1.isSelected() && radS0_0.isSelected()) labUA2.setText("" + ergebnis);
        if (radS1_1.isSelected() && radS0_1.isSelected()) labUA3.setText("" + ergebnis);
    }//GEN-LAST:event_cmdBerechnen_MouseClicked

    private void radS1_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radS1_0MouseClicked
        if (!radS1_0.isSelected()){  // S1 wird auf 1 gesetzt
            radS1_0.setSelected(false);
            radS1_1.setSelected(true);
        }
        else{   // S1 wird auf 0 gesetzt
            radS1_0.setSelected(true);
            radS1_1.setSelected(false);
        }
    }//GEN-LAST:event_radS1_0MouseClicked

    private void radS1_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radS1_1MouseClicked
        if (radS1_0.isSelected()){  // S1 wird auf 1 gesetzt
            radS1_0.setSelected(false);
            radS1_1.setSelected(true);
        }
        else{   // S1 wird auf 0 gesetzt
            radS1_0.setSelected(true);
            radS1_1.setSelected(false);
        }
    }//GEN-LAST:event_radS1_1MouseClicked

    private void radS0_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radS0_0MouseClicked
        if (!radS0_0.isSelected()){  // S0 wird auf 1 gesetzt
            radS0_0.setSelected(false);
            radS0_1.setSelected(true);
        }
        else{   // S0 wird auf 0 gesetzt
            radS0_0.setSelected(true);
            radS0_1.setSelected(false);
        }
    }//GEN-LAST:event_radS0_0MouseClicked

    private void radS0_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radS0_1MouseClicked
        if (radS0_0.isSelected()){  // S0 wird auf 1 gesetzt
            radS0_0.setSelected(false);
            radS0_1.setSelected(true);
        }
        else{   // S0 wird auf 0 gesetzt
            radS0_0.setSelected(true);
            radS0_1.setSelected(false);
        }
    }//GEN-LAST:event_radS0_1MouseClicked

    
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
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBerechnen;
    private javax.swing.JLabel labA1;
    private javax.swing.JLabel labA2;
    private javax.swing.JLabel labA3;
    private javax.swing.JLabel labA4;
    private javax.swing.JLabel labB1;
    private javax.swing.JLabel labB2;
    private javax.swing.JLabel labB3;
    private javax.swing.JLabel labB4;
    private javax.swing.JLabel labBild;
    private javax.swing.JLabel labDez;
    private javax.swing.JLabel labDez1;
    private javax.swing.JLabel labDez2;
    private javax.swing.JLabel labDez3;
    private javax.swing.JLabel labDez4;
    private javax.swing.JLabel labEingangsspannung;
    private javax.swing.JLabel labHeadline;
    private javax.swing.JLabel labHinweis;
    private javax.swing.JLabel labS0;
    private javax.swing.JLabel labS1;
    private javax.swing.JLabel labUA;
    private javax.swing.JLabel labUA0;
    private javax.swing.JLabel labUA1;
    private javax.swing.JLabel labUA2;
    private javax.swing.JLabel labUA3;
    private javax.swing.JLabel labWiederstand;
    private javax.swing.JRadioButton radS0_0;
    private javax.swing.JRadioButton radS0_1;
    private javax.swing.JRadioButton radS1_0;
    private javax.swing.JRadioButton radS1_1;
    private javax.swing.JTextField txtEingangsspannung;
    private javax.swing.JTextField txtWiederstand;
    // End of variables declaration//GEN-END:variables
}