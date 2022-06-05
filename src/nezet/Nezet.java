/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nezet;

import modell.Kerdes;
import modell.Lada;
import modell.Kincsesladak;
import modell.Tipp;

/**
 *
 * @author Ricsi
 */


public class Nezet extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    private Lada lada = new Lada();
    private Kerdes kerdes = new Kerdes();
    private Kerdes alkerdes = new Kerdes("Melyik ládában van a kincs?");
    private Tipp helyes = new Tipp(Kincsesladak.EZUST);
    
    public Nezet() {
        initComponents();
    }
    
    public void initText(){
        aranyLabel.setText(lada.getSzoveg(Kincsesladak.ARANY));
        ezustLabel.setText(lada.getSzoveg(Kincsesladak.EZUST));
        bronzLabel.setText(lada.getSzoveg(Kincsesladak.BRONZ));
        kerdesLabel.setText(kerdes.getKerdes());
        alkerdesLabel.setText(alkerdes.getKerdes());
        eredmenyLabel.setText(" ");
    }
    
    public void kiertekeles(boolean valasz){
        eredmenyLabel.setText(valasz? "JÓ VÁLASZ" : "ROSSZ VÁLASZ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arany = new javax.swing.JButton();
        ezust = new javax.swing.JButton();
        bronz = new javax.swing.JButton();
        aranyLabel = new javax.swing.JLabel();
        ezustLabel = new javax.swing.JLabel();
        bronzLabel = new javax.swing.JLabel();
        kerdesLabel = new javax.swing.JLabel();
        alkerdesLabel = new javax.swing.JLabel();
        eredmenyLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Találóskérdés");

        arany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/arany.jpg"))); // NOI18N
        arany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aranyActionPerformed(evt);
            }
        });

        ezust.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/ezust.jpg"))); // NOI18N
        ezust.setActionCommand("ezust");
        ezust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ezustActionPerformed(evt);
            }
        });

        bronz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/bronz.jpg"))); // NOI18N
        bronz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bronzActionPerformed(evt);
            }
        });

        aranyLabel.setText("Arany");

        ezustLabel.setText("Ezüst");

        bronzLabel.setText("Bronz");

        kerdesLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kerdesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kerdesLabel.setText("Kérdés");

        alkerdesLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        alkerdesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alkerdesLabel.setText("Alkérdés");

        eredmenyLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eredmenyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eredmenyLabel.setText("EREDMÉNY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kerdesLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alkerdesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arany, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ezust, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bronz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ezustLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bronzLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aranyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(eredmenyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(kerdesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alkerdesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eredmenyLabel)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arany, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(aranyLabel)
                        .addGap(17, 17, 17)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ezust, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(ezustLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bronz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bronzLabel)
                        .addGap(21, 21, 21)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aranyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aranyActionPerformed
         kiertekeles(helyes.helyesE(Kincsesladak.ARANY));
    }//GEN-LAST:event_aranyActionPerformed

    private void ezustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ezustActionPerformed
        kiertekeles(helyes.helyesE(Kincsesladak.EZUST));
    }//GEN-LAST:event_ezustActionPerformed

    private void bronzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bronzActionPerformed
        kiertekeles(helyes.helyesE(Kincsesladak.BRONZ));

    }//GEN-LAST:event_bronzActionPerformed

    /**
     * @param args the command line arguments
     */
    public void startGame(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Nezet nezet = new Nezet();
                nezet.setVisible(true);
                nezet.initText();            
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alkerdesLabel;
    private javax.swing.JButton arany;
    private javax.swing.JLabel aranyLabel;
    private javax.swing.JButton bronz;
    private javax.swing.JLabel bronzLabel;
    private javax.swing.JLabel eredmenyLabel;
    private javax.swing.JButton ezust;
    private javax.swing.JLabel ezustLabel;
    private javax.swing.JLabel kerdesLabel;
    // End of variables declaration//GEN-END:variables
}
