/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class InputCT extends javax.swing.JFrame {

    String ctRatioDD1;
    /**
     * Creates new form Input
     */
    public InputCT() {
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

        InputPanel = new javax.swing.JPanel();
        InputLabel = new javax.swing.JLabel();
        InputVariablePanel = new javax.swing.JPanel();
        RatioLabel = new javax.swing.JLabel();
        BurdenLabel = new javax.swing.JLabel();
        BurdenDropDown = new javax.swing.JComboBox<>();
        CoreSizeLabel = new javax.swing.JLabel();
        CoreSizeDropDown = new javax.swing.JComboBox<>();
        ClassLabel = new javax.swing.JLabel();
        ClassDropDown = new javax.swing.JComboBox<>();
        CTRatioLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        EpoxyRadioButton = new javax.swing.JRadioButton();
        OilCooledRadioButton = new javax.swing.JRadioButton();
        STCLabel = new javax.swing.JLabel();
        STCDropDown = new javax.swing.JComboBox<>();
        CTRatioDropDown1 = new javax.swing.JComboBox<>();
        CTRatioDropDown2 = new javax.swing.JComboBox<>();
        RatioLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ComputeButton = new javax.swing.JButton();
        SidePanelInput = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1169, 818));
        setPreferredSize(new java.awt.Dimension(1050, 750));

        InputPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        InputLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        InputLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InputLabel.setText("INPUTS FOR CT");
        InputLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        InputLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        RatioLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RatioLabel.setText("Type                  :");

        BurdenLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BurdenLabel.setText("Burden              :");

        BurdenDropDown.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BurdenDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10 VA", "15 VA", "20 VA ", "20/20 VA" }));
        BurdenDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurdenDropDownActionPerformed(evt);
            }
        });

        CoreSizeLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        CoreSizeLabel.setText("Voltage Rating :");

        CoreSizeDropDown.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CoreSizeDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11 kV", "33 kV" }));


        ClassLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ClassLabel.setText("Class                  :");

        ClassDropDown.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ClassDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.2S", "0.2S/5P10", "0.5/5P10/PS", "0.5S" }));

        CTRatioLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        CTRatioLabel.setText("CT Ratio            :");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("/");

        EpoxyRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EpoxyRadioButton.setText("Epoxy / Dry");
        EpoxyRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EpoxyRadioButtonActionPerformed(evt);
            }
        });

        OilCooledRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        OilCooledRadioButton.setText("Oil Cooled");

        STCLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        STCLabel.setText("STC                   :");

        STCDropDown.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        STCDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 kA/ 1 sec", "6.7 kA/ 1 sec", "13.1 kA/ 1 sec", "26.2 kA/ 1 sec", "31.1 kA/ 1 sec " }));

        CTRatioDropDown1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CTRatioDropDown1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "15", "25", "30", "40", "50", "75", "100", "125", "150", "200", "250", "300", "400", "500", "750", "200/100", "400/200", "400/200/100", "800/400/200" }));
        CTRatioDropDown1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTRatioDropDown1ActionPerformed(evt);
            }
        });

        CTRatioDropDown2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CTRatioDropDown2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "1-1", "1-1-1", "5" }));
        CTRatioDropDown2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTRatioDropDown2ActionPerformed(evt);
            }
        });

        RatioLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RatioLabel1.setText("A");

        javax.swing.GroupLayout InputVariablePanelLayout = new javax.swing.GroupLayout(InputVariablePanel);
        InputVariablePanel.setLayout(InputVariablePanelLayout);
        InputVariablePanelLayout.setHorizontalGroup(
                InputVariablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(InputVariablePanelLayout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addGroup(InputVariablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(InputVariablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(InputVariablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(RatioLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(BurdenLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(CTRatioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ClassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                                                .addComponent(CoreSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(STCLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(InputVariablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(InputVariablePanelLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(InputVariablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(InputVariablePanelLayout.createSequentialGroup()
                                                                .addGap(26, 26, 26)
                                                                .addComponent(OilCooledRadioButton)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(EpoxyRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(InputVariablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(ClassDropDown, javax.swing.GroupLayout.Alignment.LEADING, 0, 176, Short.MAX_VALUE)
                                                                .addComponent(BurdenDropDown, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(CoreSizeDropDown, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(InputVariablePanelLayout.createSequentialGroup()
                                                                .addComponent(CTRatioDropDown1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(CTRatioDropDown2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(RatioLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(InputVariablePanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(STCDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(117, Short.MAX_VALUE))
        );
        InputVariablePanelLayout.setVerticalGroup(
                InputVariablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(InputVariablePanelLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(InputVariablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(RatioLabel)
                                        .addComponent(EpoxyRadioButton)
                                        .addComponent(OilCooledRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(InputVariablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BurdenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BurdenDropDown))
                                .addGap(28, 28, 28)
                                .addGroup(InputVariablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CoreSizeDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CoreSizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(InputVariablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ClassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ClassDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(InputVariablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CTRatioDropDown1)
                                        .addComponent(CTRatioDropDown2)
                                        .addComponent(jLabel1)
                                        .addComponent(RatioLabel1)
                                        .addComponent(CTRatioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(InputVariablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(STCLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(STCDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ComputeButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ComputeButton.setText("Compute");
        ComputeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InputPanelLayout = new javax.swing.GroupLayout(InputPanel);
        InputPanel.setLayout(InputPanelLayout);
        InputPanelLayout.setHorizontalGroup(
                InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(InputPanelLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(InputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(InputPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(InputVariablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(InputPanelLayout.createSequentialGroup()
                                .addGap(569, 569, 569)
                                .addComponent(ComputeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        InputPanelLayout.setVerticalGroup(
                InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(InputPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(InputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(InputPanelLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20)
                                .addComponent(InputVariablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(ComputeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        SidePanelInput.setBackground(new java.awt.Color(147, 252, 251));
        SidePanelInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        BackButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BackButton.setText("Home ");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SidePanelInputLayout = new javax.swing.GroupLayout(SidePanelInput);
        SidePanelInput.setLayout(SidePanelInputLayout);
        SidePanelInputLayout.setHorizontalGroup(
                SidePanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SidePanelInputLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(52, Short.MAX_VALUE))
        );
        SidePanelInputLayout.setVerticalGroup(
                SidePanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SidePanelInputLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(SidePanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SidePanelInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InputPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EpoxyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EpoxyRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EpoxyRadioButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BurdenDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurdenDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BurdenDropDownActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ChooseType().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void CTRatioDropDown1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTRatioDropDown1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTRatioDropDown1ActionPerformed

    private void CTRatioDropDown2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTRatioDropDown2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTRatioDropDown2ActionPerformed

    private void ComputeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputeButtonActionPerformed
        this.setVisible(false);
        new Output().setVisible(true);

    }//GEN-LAST:event_ComputeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InputCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputCT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> BurdenDropDown;
    private javax.swing.JLabel BurdenLabel;
    private javax.swing.JComboBox<String> CTRatioDropDown1;
    public javax.swing.JComboBox<String> CTRatioDropDown2;
    private javax.swing.JLabel CTRatioLabel;
    private javax.swing.JComboBox<String> ClassDropDown;
    private javax.swing.JLabel ClassLabel;
    private javax.swing.JButton ComputeButton;
    private javax.swing.JComboBox<String> CoreSizeDropDown;
    private javax.swing.JLabel CoreSizeLabel;
    private javax.swing.JRadioButton EpoxyRadioButton;
    private javax.swing.JLabel InputLabel;
    private javax.swing.JPanel InputPanel;
    private javax.swing.JPanel InputVariablePanel;
    private javax.swing.JRadioButton OilCooledRadioButton;
    private javax.swing.JLabel RatioLabel;
    private javax.swing.JLabel RatioLabel1;
    private javax.swing.JComboBox<String> STCDropDown;
    private javax.swing.JLabel STCLabel;
    private javax.swing.JPanel SidePanelInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables



}
