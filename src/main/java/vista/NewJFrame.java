package vista;

import controlador.Controlador;
import javax.swing.JOptionPane;
import modelo.Item;

/**
 *
 * @author Hector
 */
public class NewJFrame extends javax.swing.JFrame {
    
    
    Controlador controlador;
    public NewJFrame() {
        initComponents();
        controlador = new Controlador();
        controlador.crearArrayList();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgregarItem = new javax.swing.JButton();
        VerInventario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AgregarItem.setText("Agregar Item");
        AgregarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarItemActionPerformed(evt);
            }
        });

        VerInventario.setText("Ver inventario");
        VerInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerInventarioActionPerformed(evt);
            }
        });

        jText.setColumns(20);
        jText.setRows(5);
        jScrollPane1.setViewportView(jText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(AgregarItem)
                .addGap(116, 116, 116)
                .addComponent(VerInventario)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VerInventario)
                    .addComponent(AgregarItem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerInventarioActionPerformed
        // TODO add your handling code here:
        jText.setText("");
        jText.setText(controlador.mostrarItems());
    }//GEN-LAST:event_VerInventarioActionPerformed

    private void AgregarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarItemActionPerformed
        String codigo=JOptionPane.showInputDialog("Ingrese el codigo del item");
        String nombre=JOptionPane.showInputDialog("Ingrese el nombre del item");
        Item item = new Item(codigo, nombre);
        controlador.insertarItem(item);
        //JOptionPane.showMe;
        
    }//GEN-LAST:event_AgregarItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarItem;
    private javax.swing.JButton VerInventario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jText;
    // End of variables declaration//GEN-END:variables
}
