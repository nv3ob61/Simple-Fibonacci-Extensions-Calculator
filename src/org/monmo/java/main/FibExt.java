/* 
 * Copyright (C) 2020 mon_mode   0mon.mode@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.monmo.java.main;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author nv3ob61
 */
public class FibExt extends javax.swing.JFrame {

  private static final long serialVersionUID = 1L;

  public static double[] lvl = new double[31];  //for testing...

  public FibExt() {
    initBefore();
    initComponents();
    initPost();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    jPanelHeader = new javax.swing.JPanel();
    jLabel19 = new javax.swing.JLabel();
    jPanelInput = new javax.swing.JPanel();
    jPanel4 = new javax.swing.JPanel();
    jTextFieldIni = new javax.swing.JTextField();
    jTextFieldFin = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jTextField7 = new javax.swing.JTextField();
    jTextField6 = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jTextField8 = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jTextField9 = new javax.swing.JTextField();
    jTextField10 = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jTextField11 = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    jTextField12 = new javax.swing.JTextField();
    jLabel10 = new javax.swing.JLabel();
    jTextField13 = new javax.swing.JTextField();
    jLabel11 = new javax.swing.JLabel();
    jTextField14 = new javax.swing.JTextField();
    jLabel12 = new javax.swing.JLabel();
    jTextField15 = new javax.swing.JTextField();
    jLabel13 = new javax.swing.JLabel();
    jTextField16 = new javax.swing.JTextField();
    jTextField5 = new javax.swing.JTextField();
    jLabel14 = new javax.swing.JLabel();
    jTextField4 = new javax.swing.JTextField();
    jLabel15 = new javax.swing.JLabel();
    jTextField3 = new javax.swing.JTextField();
    jLabel16 = new javax.swing.JLabel();
    jTextField2 = new javax.swing.JTextField();
    jLabel17 = new javax.swing.JLabel();
    jTextField1 = new javax.swing.JTextField();
    jLabel18 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(153, 153, 153));
    setPreferredSize(new java.awt.Dimension(634, 600));
    setResizable(false);

    jPanelHeader.setBackground(new java.awt.Color(9, 13, 57));
    jPanelHeader.setPreferredSize(new java.awt.Dimension(800, 50));
    jPanelHeader.setLayout(new java.awt.CardLayout());

    jLabel19.setBackground(new java.awt.Color(0, 0, 51));
    jLabel19.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
    jLabel19.setForeground(new java.awt.Color(255, 255, 255));
    jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel19.setText("FIBONACCI EXTENSION / RETRACEMENT CALCULATOR");
    jLabel19.setPreferredSize(new java.awt.Dimension(366, 22));
    jPanelHeader.add(jLabel19, "card2");

    getContentPane().add(jPanelHeader, java.awt.BorderLayout.PAGE_START);

    jPanelInput.setBackground(new java.awt.Color(6, 6, 44));
    jPanelInput.setPreferredSize(new java.awt.Dimension(250, 350));
    jPanelInput.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel4.setBackground(new java.awt.Color(255, 255, 255));
    jPanel4.setLayout(new java.awt.GridBagLayout());

    jTextFieldIni.setBackground(new java.awt.Color(204, 204, 204));
    jTextFieldIni.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jTextFieldIni.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        jTextFieldIniKeyPressed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 2;
    gridBagConstraints.ipadx = 101;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(32, 28, 0, 24);
    jPanel4.add(jTextFieldIni, gridBagConstraints);

    jTextFieldFin.setBackground(new java.awt.Color(204, 204, 204));
    jTextFieldFin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jTextFieldFin.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        jTextFieldFinKeyPressed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridheight = 2;
    gridBagConstraints.ipadx = 101;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(18, 28, 29, 24);
    jPanel4.add(jTextFieldFin, gridBagConstraints);

    jLabel1.setForeground(new java.awt.Color(51, 51, 51));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("INIT VALUE");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(34, 21, 0, 0);
    jPanel4.add(jLabel1, gridBagConstraints);

    jLabel2.setForeground(new java.awt.Color(51, 51, 51));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("END VALUE");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(20, 21, 0, 0);
    jPanel4.add(jLabel2, gridBagConstraints);

    jPanelInput.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, -1, 130));

    getContentPane().add(jPanelInput, java.awt.BorderLayout.LINE_START);

    jPanel1.setBackground(new java.awt.Color(204, 204, 204));
    jPanel1.setMinimumSize(new java.awt.Dimension(156, 524));
    jPanel1.setPreferredSize(new java.awt.Dimension(100, 495));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 106, -1));
    jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 106, -1));

    jLabel4.setForeground(new java.awt.Color(255, 0, 0));
    jLabel4.setText("0.236");
    jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

    jLabel3.setForeground(new java.awt.Color(0, 0, 0));
    jLabel3.setText("0");
    jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));
    jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 106, -1));

    jLabel5.setForeground(new java.awt.Color(255, 255, 51));
    jLabel5.setText("0.382");
    jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

    jLabel6.setForeground(new java.awt.Color(51, 255, 0));
    jLabel6.setText("0.5");
    jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));
    jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 106, -1));
    jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 106, -1));

    jLabel7.setForeground(new java.awt.Color(0, 255, 204));
    jLabel7.setText("0.618");
    jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

    jLabel8.setForeground(new java.awt.Color(0, 102, 204));
    jLabel8.setText("0.786");
    jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));
    jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 106, -1));

    jLabel9.setBackground(new java.awt.Color(153, 153, 153));
    jLabel9.setForeground(new java.awt.Color(153, 153, 153));
    jLabel9.setText("1");
    jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));
    jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 106, -1));

    jLabel10.setForeground(new java.awt.Color(0, 0, 153));
    jLabel10.setText("1.618");
    jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));
    jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 106, -1));

    jLabel11.setForeground(new java.awt.Color(102, 0, 0));
    jLabel11.setText("2.618");
    jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));
    jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 106, -1));

    jLabel12.setForeground(new java.awt.Color(102, 0, 153));
    jLabel12.setText("3.618");
    jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));
    jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 106, -1));

    jLabel13.setForeground(new java.awt.Color(255, 51, 204));
    jLabel13.setText("4.236");
    jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));
    jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 106, -1));
    jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 106, -1));

    jLabel14.setForeground(new java.awt.Color(102, 102, 102));
    jLabel14.setText("-0.236");
    jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));
    jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 106, -1));

    jLabel15.setForeground(new java.awt.Color(102, 102, 102));
    jLabel15.setText("-0.382");
    jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));
    jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 106, -1));

    jLabel16.setForeground(new java.awt.Color(102, 102, 102));
    jLabel16.setText("-0.5");
    jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));
    jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 106, -1));

    jLabel17.setForeground(new java.awt.Color(102, 102, 102));
    jLabel17.setText("-0.618");
    jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));
    jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 106, -1));

    jLabel18.setForeground(new java.awt.Color(102, 102, 102));
    jLabel18.setText("-0.786");
    jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jTextFieldFinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFinKeyPressed
    int key = evt.getKeyCode();
    if (key == KeyEvent.VK_ENTER) {
      startCalc();
    }
  }//GEN-LAST:event_jTextFieldFinKeyPressed

  private void jTextFieldIniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIniKeyPressed
    int key = evt.getKeyCode();
    if (key == KeyEvent.VK_ENTER) {
      startCalc();
    }
  }//GEN-LAST:event_jTextFieldIniKeyPressed

  private void startCalc() {
    try {
      double dato1 = Double.parseDouble(jTextFieldIni.getText());
      double dato2 = Double.parseDouble(jTextFieldFin.getText());

      if (!jTextFieldIni.getText().isBlank()
              && !jTextFieldFin.getText().isBlank()) {
        //detecta cual es el mayor 
        if (dato1 > dato2) {
          //calcula el rango
          calcFibDesc(dato1, dato2, lvl);
          showFib(lvl);
        } else if (dato1 < dato2) {
          //calcula el rango
          calcFib(dato1, dato2, lvl);
          showFib(lvl);
        } else if (dato1 == dato2) {
          JOptionPane.showMessageDialog(jPanel4, "El rango introducido es 0",
                  "ERROR: MEEEEC", JOptionPane.ERROR_MESSAGE);
          //salida consola
          System.out.println("ERROR: El rango de datos es 0.");
          System.out.println();
        }
      } else {   //si los dos datos son 0
        //to do
        JOptionPane.showMessageDialog(jPanel4, "El rango introducido es 0",
                "ERROR: MEEEEC", JOptionPane.ERROR_MESSAGE);
        //salida consola
        System.out.println("ERROR: El rango de datos es 0.");
        System.out.println();
      }
    } catch (NumberFormatException numberFormatException) {
      System.out.println("UOOOPS!");
    } catch (HeadlessException headlessException) {
      System.out.println("UOOOP2!");
    }
  }

  private void initBefore() {
  }

  private void initPost() {
    genModel();
    jTextFieldIni.setToolTipText("Insert value #1");
    jTextFieldFin.setToolTipText("Insert value #2");
  }

  private void genModel() {
  }

//do the math here...
  public static final void calcFib(
          double fibIni, double fibFin, double[] lvl) {

    double range = Math.abs(fibIni - fibFin);

    lvl[10] = fibIni - range * 0.786;   //-0.786
    lvl[11] = fibIni - range * 0.618;   //-0.618
    lvl[12] = fibIni - range * 0.5;     //-0.5
    lvl[13] = fibIni - range * 0.382;   //-0.382
    lvl[14] = fibIni - range * 0.236;   //-0.236
    lvl[15] = fibIni;                   // 0
    lvl[16] = fibIni + range * 0.236;   // 0.236
    lvl[17] = fibIni + range * 0.382;   // 0.382
    lvl[18] = fibIni + range * 0.5;     // 0.5
    lvl[19] = fibIni + range * 0.618;   // 618
    lvl[20] = fibIni + range * 0.786;   // 0.786
    lvl[21] = fibFin;                   // 1
    lvl[22] = fibIni + range * 1.618;   // 1.618
    lvl[23] = fibIni + range * 2.618;   // 2.618
    lvl[24] = fibIni + range * 3.618;   // 3.618
    lvl[25] = fibIni + range * 4.236;   // 4.236
  }

  public static final void calcFibDesc(
          double fibIni, double fibFin, double[] lvl) {

    double range = Math.abs(fibIni - fibFin);

    lvl[10] = fibIni + range * 0.786;   //-0.786
    lvl[11] = fibIni + range * 0.618;   //-0.618
    lvl[12] = fibIni + range * 0.5;     //-0.5
    lvl[13] = fibIni + range * 0.382;   //-0.382
    lvl[14] = fibIni + range * 0.236;   //-0.236
    lvl[15] = fibIni;                   // 0
    lvl[16] = fibIni - range * 0.236;   // 0.236
    lvl[17] = fibIni - range * 0.382;   // 0.382
    lvl[18] = fibIni - range * 0.5;     // 0.5
    lvl[19] = fibIni - range * 0.618;   // 618
    lvl[20] = fibIni - range * 0.786;   // 0.786
    lvl[21] = fibFin;                   // 1
    lvl[22] = fibIni - range * 1.618;   // 1.618
    lvl[23] = fibIni - range * 2.618;   // 2.618
    lvl[24] = fibIni - range * 3.618;   // 3.618
    lvl[25] = fibIni - range * 4.236;   // 4.236
  }

  public final void showFib(double[] lvl) {
    jTextField1.setText(String.format("%.2f", Double.parseDouble(String.valueOf(lvl[10]))));
    jTextField2.setText(String.format("%.2f", Double.parseDouble(String.valueOf(lvl[11]))));
    jTextField3.setText(String.format("%.2f", Double.parseDouble(String.valueOf(lvl[12]))));
    jTextField4.setText(String.format("%.2f", Double.parseDouble(String.valueOf(lvl[13]))));
    jTextField5.setText(String.format("%.2f", Double.parseDouble(String.valueOf(lvl[14]))));
    jTextField6.setText(String.format("%.2f", Double.parseDouble(String.valueOf(lvl[15]))));
    jTextField7.setText(String.format("%.2f", Double.parseDouble(String.valueOf(lvl[16]))));
    jTextField8.setText(String.format("%.2f", Double.parseDouble(String.valueOf(lvl[17]))));
    jTextField9.setText(String.format("%.2f", Double.parseDouble(String.valueOf(lvl[18]))));
    jTextField10.setText(String.format("%.2f", Double.parseDouble(String.valueOf(lvl[19]))));
    jTextField11.setText(String.format("%.2f", Double.parseDouble(String.valueOf(lvl[20]))));
    jTextField12.setText(String.format("%.2f", Double.parseDouble(String.valueOf(lvl[21]))));
    jTextField13.setText(String.format("%.2f", Double.parseDouble(String.valueOf(lvl[22]))));
    jTextField14.setText(String.format("%.2f", Double.parseDouble(String.valueOf(lvl[23]))));
    jTextField15.setText(String.format("%.2f", Double.parseDouble(String.valueOf(lvl[24]))));
    jTextField16.setText(String.format("%.2f", Double.parseDouble(String.valueOf(lvl[25]))));
  }

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
      java.util.logging.Logger.getLogger(FibExt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FibExt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FibExt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FibExt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        new FibExt().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel16;
  private javax.swing.JLabel jLabel17;
  private javax.swing.JLabel jLabel18;
  private javax.swing.JLabel jLabel19;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPanel jPanelHeader;
  private javax.swing.JPanel jPanelInput;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JTextField jTextField10;
  private javax.swing.JTextField jTextField11;
  private javax.swing.JTextField jTextField12;
  private javax.swing.JTextField jTextField13;
  private javax.swing.JTextField jTextField14;
  private javax.swing.JTextField jTextField15;
  private javax.swing.JTextField jTextField16;
  private javax.swing.JTextField jTextField2;
  private javax.swing.JTextField jTextField3;
  private javax.swing.JTextField jTextField4;
  private javax.swing.JTextField jTextField5;
  private javax.swing.JTextField jTextField6;
  private javax.swing.JTextField jTextField7;
  private javax.swing.JTextField jTextField8;
  private javax.swing.JTextField jTextField9;
  private javax.swing.JTextField jTextFieldFin;
  private javax.swing.JTextField jTextFieldIni;
  // End of variables declaration//GEN-END:variables

}
