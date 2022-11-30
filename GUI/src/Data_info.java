
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author TUNG
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
public class Data_info extends javax.swing.JFrame {

    /**
     * Creates new form Data_info
     */
    Data data = new Data();
    public Data_info() {
        initComponents();
        this.ObjectChooser.addItem("Route");
        this.ObjectChooser.addItem("MCP");
        this.ObjectChooser.addItem("Collector");
        this.ObjectChooser.addItem("Janitor");
        this.ObjectChooser.addItem("Vechicle");
        this.ObjectChooser.setSelectedIndex(-1);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ObjectPane = new javax.swing.JScrollPane();
        ObjectList = new javax.swing.JList<>();
        BackButton = new javax.swing.JButton();
        ObjectChooser = new javax.swing.JComboBox<>();
        SearchField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        GetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ObjectList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ObjectListMouseClicked(evt);
            }
        });
        ObjectPane.setViewportView(ObjectList);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        ObjectChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObjectChooserActionPerformed(evt);
            }
        });

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Result:");

        GetButton.setText("Get");
        GetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ObjectPane, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ObjectChooser, javax.swing.GroupLayout.Alignment.LEADING, 0, 113, Short.MAX_VALUE)
                            .addComponent(SearchField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchButton)
                            .addComponent(GetButton))))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(BackButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ObjectChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ObjectPane, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BackButton)
                        .addGap(15, 15, 15))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ObjectChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObjectChooserActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ObjectChooserActionPerformed

    private void GetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetButtonActionPerformed
        // TODO add your handling code here:
        String selected;
        if(this.ObjectChooser.getSelectedItem() == null) return;
        selected = this.ObjectChooser.getSelectedItem().toString();
        DefaultListModel listmodel = new DefaultListModel();
        Function.getData(listmodel,selected);
        Function.showObjectonList(listmodel,this.ObjectList, this.ObjectPane);
    }//GEN-LAST:event_GetButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        String searchString;
        if((searchString = this.SearchField.getText()).equals("")){
            JOptionPane.showMessageDialog(this, "Enter something to search");
        }
        String selected = this.ObjectChooser.getSelectedItem().toString();
        DefaultListModel listmodel = new DefaultListModel();
        Function.search(listmodel, searchString,selected);
        Function.showObjectonList(listmodel,this.ObjectList, this.ObjectPane);
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void ObjectListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ObjectListMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() >= 2) {
            String select = ObjectList.getSelectedValue();
            switch(this.ObjectChooser.getSelectedItem().toString()){
                case "Route":
                    Route route = Function.getRouteByName(select);
                    String out = new String("Route name: "+route.name);
                    out = out +"\nID: "+ route.id;
                    if(route.vechicle == null) out = out + "\nVechicleID: null";
                    else out = out + "\nVechicleID: " + route.vechicle.id;
                    String MCPs = new String("\nMCPs: ");
                    if(route.ListMCPs != null){
                        int size = route.ListMCPs.size();
                        MCPs = MCPs + "MCP "+route.ListMCPs.get(0).id;
                        for(int i = 1; i < size ; i++){
                            MCP mcp = route.ListMCPs.get(i);
                            MCPs = MCPs + "->MCP " +mcp.id; 
                        }
                    }
                    if(MCPs.equals("\nMCPs: ")) out = out + MCPs +"null";
                    else out = out + MCPs;
                    out = out + "\nDistance: " + route.distance+" km";
                    JOptionPane.showMessageDialog(this, out,"Route Info",1);
                    break;
                case "Collector":
                    break;
                case "Janitor":
                    break;
                case "MCP":
                    break;
                case "Vechicle":
                    break;
            }
        }
    }//GEN-LAST:event_ObjectListMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton GetButton;
    private javax.swing.JComboBox<String> ObjectChooser;
    private javax.swing.JList<String> ObjectList;
    private javax.swing.JScrollPane ObjectPane;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
