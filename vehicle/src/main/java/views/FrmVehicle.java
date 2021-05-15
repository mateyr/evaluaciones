/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.PnlVehicleController;
import controllers.PnlViewVehicleController;
import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import javax.swing.JComponent;
import panels.PnlVehicle;
import panels.PnlVehicleTable;
import panels.PnlViewVehicles;

/**
 *
 * @author UZIEL
 */
public class FrmVehicle extends javax.swing.JFrame
{
    private PnlVehicle pnlVehicle;
    private PnlVehicleController pnlVehicleController;
    private PnlViewVehicles pnlViewVehicles;
    private PnlViewVehicleController pnlViewVehicleController;
    /**
     * Creates new form FrmVehicle
     */
    public FrmVehicle()
    {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pnlBottom = new javax.swing.JPanel();
        pnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(120);
        jSplitPane1.setDividerSize(10);
        jSplitPane1.setMinimumSize(new java.awt.Dimension(83, 147));
        jSplitPane1.setOneTouchExpandable(true);
        jSplitPane1.setPreferredSize(new java.awt.Dimension(83, 147));

        jPanel1.setLayout(new java.awt.GridLayout(3, 1, 3, 3));

        btnNew.setBackground(new java.awt.Color(255, 51, 51));
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnNew);

        btnView.setBackground(new java.awt.Color(255, 0, 0));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel1.add(btnView);

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        pnlBottom.setBackground(new java.awt.Color(102, 255, 153));
        jPanel2.add(pnlBottom, java.awt.BorderLayout.PAGE_START);

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));
        pnlContent.setLayout(new java.awt.BorderLayout());
        jPanel2.add(pnlContent, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(jPanel2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(519, 555));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNewActionPerformed
    {//GEN-HEADEREND:event_btnNewActionPerformed
        try 
        {
            if (pnlVehicle == null)
            {
                pnlVehicle = new PnlVehicle();
                pnlVehicleController = new PnlVehicleController(pnlVehicle);
            }
        } catch (FileNotFoundException ex)
        {
        }

        addComponent(pnlVehicle);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnViewActionPerformed
    {//GEN-HEADEREND:event_btnViewActionPerformed

        if (pnlViewVehicles == null)
        {   
            pnlViewVehicles = new PnlViewVehicles();          
        }
        
        pnlViewVehicleController = new PnlViewVehicleController(pnlViewVehicles);
        
        addComponent(pnlViewVehicles);
    }//GEN-LAST:event_btnViewActionPerformed

    private void addComponent(JComponent component)
    {
        pnlContent.removeAll();
        pnlContent.add(component, BorderLayout.CENTER);
        pnlContent.repaint();
        this.validate();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FrmVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FrmVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FrmVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FrmVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FrmVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}
