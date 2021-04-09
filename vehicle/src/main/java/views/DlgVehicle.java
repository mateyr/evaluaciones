/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import backend.pojo.Vehicle;
import controllers.PnlVehicleController;
import java.io.FileNotFoundException;
import panels.PnlVehicle;
import panels.PnlViewVehicles;

/**
 *
 * @author Sistemas-07
 */
public class DlgVehicle extends javax.swing.JDialog {
     
    private PnlVehicle pnlVehicle;
    private PnlVehicleController pnlVehicleController;
    
    PnlViewVehicles pnlViewVehicle;
    
    /**
     * Creates new form DlgVehicle
     */
    public DlgVehicle(java.awt.Frame parent, boolean modal) {
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
    private void initComponents()
    {

        pnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        pnlContent.setLayout(new java.awt.BorderLayout());
        pnlVehicle = new PnlVehicle();
        try{
            pnlVehicleController = new PnlVehicleController(pnlVehicle);
        }catch(FileNotFoundException ext){

        }

        pnlContent.add(pnlVehicle);

        getContentPane().add(pnlContent, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        bindingDataToComponents();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    public void setPnlViewVehicleReference(PnlViewVehicles pnlViewVehicles)
    {
        this.pnlViewVehicle = pnlViewVehicles;
    }
    public void bindingDataToComponents() {
        int row = pnlViewVehicle.getTblViewVehicle().getSelectedRow();
        bindingDataToComponents(row);
    }
    
    public void bindingDataToComponents(int row) {
        if (row < 0) {
            return;
        }
        
        pnlVehicle.getTxtStock().setText(pnlViewVehicle.getTblViewVehicle().getValueAt(row, 0).toString().trim());
        pnlVehicle.getSpnYear().setValue(pnlViewVehicle.getTblViewVehicle().getValueAt(row, 1));
        pnlVehicle.getCmbMake().setSelectedItem(pnlViewVehicle.getTblViewVehicle().getValueAt(row, 2).toString().trim());
        pnlVehicle.getCmbModel().setSelectedItem(pnlViewVehicle.getTblViewVehicle().getValueAt(row, 3).toString().trim());
        pnlVehicle.getTxtStyle().setText(pnlViewVehicle.getTblViewVehicle().getValueAt(row, 4).toString().trim());
        pnlVehicle.getFmtVin().setText(pnlViewVehicle.getTblViewVehicle().getValueAt(row, 5).toString().trim());
        pnlVehicle.getCmbEColor().setSelectedItem(pnlViewVehicle.getTblViewVehicle().getValueAt(row, 6).toString().trim());
        pnlVehicle.getCmbIColor().setSelectedItem(pnlViewVehicle.getTblViewVehicle().getValueAt(row, 7).toString().trim());
        
        if(pnlViewVehicle.getTblViewVehicle().getValueAt(row, 9).toString().trim() == "AUTOMATIC")
            pnlVehicle.getBtngTrans().setSelected(pnlVehicle.getRbtnAut().getModel(), true);
        else
            pnlVehicle.getBtngTrans().setSelected(pnlVehicle.getRbtnMan().getModel(), true);
        pnlVehicle.getTxtEngine().setText(pnlViewVehicle.getTblViewVehicle().getValueAt(row, 11).toString().trim());
        pnlVehicle.getTxtImage().setText(pnlViewVehicle.getTblViewVehicle().getValueAt(row, 12).toString().trim());
        pnlVehicle.getCmbStatus().setSelectedItem(pnlViewVehicle.getTblViewVehicle().getValueAt(row, 13).toString().trim());
        
        pnlVehicle.getSpnMiles().setValue(pnlViewVehicle.getTblViewVehicle().getValueAt(row, 8));
        pnlVehicle.getSpnPrice().setValue(pnlViewVehicle.getTblViewVehicle().getValueAt(row, 9));
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgVehicle dialog = new DlgVehicle(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}
