/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import java.awt.Color;

/**
 *
 * @author shawn.harden
 */
public class WSForm extends javax.swing.JFrame {

    /**
     * Creates new form DVLForm
     */
    public WSForm() {
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

        ModeGroup = new javax.swing.ButtonGroup();
        jMaintDialog = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jJpesPanel = new javax.swing.JPanel();
        jModeLable = new javax.swing.JLabel();
        jInitialButton = new javax.swing.JRadioButton();
        jMaintenanceButton = new javax.swing.JRadioButton();
        jRefScrollPane = new javax.swing.JScrollPane();
        RefList = new javax.swing.JList<>();
        jReferenceLabel = new javax.swing.JLabel();
        jClearSelectb = new javax.swing.JButton();
        jStartb = new javax.swing.JButton();
        jExitButton = new javax.swing.JButton();
        jRxsPanel = new javax.swing.JPanel();
        jGfmdiPanel = new javax.swing.JPanel();
        jDmdcPanel = new javax.swing.JPanel();

        javax.swing.GroupLayout jMaintDialogLayout = new javax.swing.GroupLayout(jMaintDialog.getContentPane());
        jMaintDialog.getContentPane().setLayout(jMaintDialogLayout);
        jMaintDialogLayout.setHorizontalGroup(
            jMaintDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jMaintDialogLayout.setVerticalGroup(
            jMaintDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DRRS-A Web Services");

        jModeLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jModeLable.setText("Mode:");

        ModeGroup.add(jInitialButton);
        jInitialButton.setText("Intial/Baseline");
        jInitialButton.setToolTipText("This selection retrieves all the reference data items.");
        jInitialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInitialButtonActionPerformed(evt);
            }
        });

        ModeGroup.add(jMaintenanceButton);
        jMaintenanceButton.setText("Maintenance");
        jMaintenanceButton.setToolTipText("This selection retrieves only the selected data items.");
        jMaintenanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMaintenanceButtonActionPerformed(evt);
            }
        });

        RefList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "CargoExtent", "CargoType", "Cin", "Component", "CountryCode", "FmToCinLink", "FmToPinLink", "Geolocation", "Means", "Mod", "ModeSource", "PidComposite", "Pid", "Pin", "SeriesPermission", "Service", "Source", "Split", "StopType", "TuchaCargo3", "TuchaCargo4", "Tucha", "Tudet", "ULNTucha", "UnitLevel", "UnitTypeRecord" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        RefList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefListMouseClicked(evt);
            }
        });
        jRefScrollPane.setViewportView(RefList);

        jReferenceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jReferenceLabel.setText("Reference Data:");

        jClearSelectb.setText("Clear Selection");
        jClearSelectb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearSelectbActionPerformed(evt);
            }
        });

        jStartb.setText("Start");
        jStartb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStartbActionPerformed(evt);
            }
        });

        jExitButton.setText("Close");

        javax.swing.GroupLayout jJpesPanelLayout = new javax.swing.GroupLayout(jJpesPanel);
        jJpesPanel.setLayout(jJpesPanelLayout);
        jJpesPanelLayout.setHorizontalGroup(
            jJpesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jJpesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jJpesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jJpesPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jInitialButton)
                        .addGap(33, 33, 33)
                        .addComponent(jMaintenanceButton))
                    .addComponent(jModeLable)
                    .addComponent(jReferenceLabel)
                    .addGroup(jJpesPanelLayout.createSequentialGroup()
                        .addComponent(jClearSelectb)
                        .addGap(30, 30, 30)
                        .addComponent(jStartb))
                    .addComponent(jRefScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(453, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jJpesPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jExitButton)
                .addContainerGap())
        );
        jJpesPanelLayout.setVerticalGroup(
            jJpesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jJpesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jModeLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jJpesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jInitialButton)
                    .addComponent(jMaintenanceButton))
                .addGap(22, 22, 22)
                .addComponent(jReferenceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRefScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jJpesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jClearSelectb)
                    .addComponent(jStartb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jExitButton)
                .addContainerGap())
        );

        jTabbedPane1.addTab("JPES", jJpesPanel);

        javax.swing.GroupLayout jRxsPanelLayout = new javax.swing.GroupLayout(jRxsPanel);
        jRxsPanel.setLayout(jRxsPanelLayout);
        jRxsPanelLayout.setHorizontalGroup(
            jRxsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );
        jRxsPanelLayout.setVerticalGroup(
            jRxsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("RXS 2.0", jRxsPanel);

        javax.swing.GroupLayout jGfmdiPanelLayout = new javax.swing.GroupLayout(jGfmdiPanel);
        jGfmdiPanel.setLayout(jGfmdiPanelLayout);
        jGfmdiPanelLayout.setHorizontalGroup(
            jGfmdiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );
        jGfmdiPanelLayout.setVerticalGroup(
            jGfmdiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("GFM-DI", jGfmdiPanel);

        javax.swing.GroupLayout jDmdcPanelLayout = new javax.swing.GroupLayout(jDmdcPanel);
        jDmdcPanel.setLayout(jDmdcPanelLayout);
        jDmdcPanelLayout.setHorizontalGroup(
            jDmdcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );
        jDmdcPanelLayout.setVerticalGroup(
            jDmdcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("DMDC", jDmdcPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jInitialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInitialButtonActionPerformed
        RefList.setEnabled(false);
       
        //RefList.setBackground(Color.WHITE);
        
        int start = 0;
        int end = RefList.getModel().getSize() - 1;
         if (end >= 0) {
           RefList.setSelectionInterval(start, end);
    }//GEN-LAST:event_jInitialButtonActionPerformed
    }
    private void jMaintenanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMaintenanceButtonActionPerformed
        RefList.setEnabled(true);
        //RefList.setBackground(Color.GREEN);
        jMaintDialog.setVisible(true);
        jMaintDialog.setTitle("Maintenance Mode Selected...");
    }//GEN-LAST:event_jMaintenanceButtonActionPerformed

    private void jClearSelectbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearSelectbActionPerformed
      RefList.clearSelection();
      
       //jMaintenanceButton.setSelected(false); not working???
      //jInitialButton.setSelected(false); not working???
       
    }//GEN-LAST:event_jClearSelectbActionPerformed

    private void jStartbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStartbActionPerformed
        RefList.setEnabled(false); 
    }//GEN-LAST:event_jStartbActionPerformed

    private void RefListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefListMouseClicked
        jMaintenanceButton.setSelected(true);
        RefList.setBackground(Color.GREEN);
    }//GEN-LAST:event_RefListMouseClicked

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
            java.util.logging.Logger.getLogger(WSForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WSForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WSForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WSForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WSForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ModeGroup;
    private javax.swing.JList<String> RefList;
    private javax.swing.JButton jClearSelectb;
    private javax.swing.JPanel jDmdcPanel;
    private javax.swing.JButton jExitButton;
    private javax.swing.JPanel jGfmdiPanel;
    private javax.swing.JRadioButton jInitialButton;
    private javax.swing.JPanel jJpesPanel;
    private javax.swing.JDialog jMaintDialog;
    private javax.swing.JRadioButton jMaintenanceButton;
    private javax.swing.JLabel jModeLable;
    private javax.swing.JScrollPane jRefScrollPane;
    private javax.swing.JLabel jReferenceLabel;
    private javax.swing.JPanel jRxsPanel;
    private javax.swing.JButton jStartb;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
