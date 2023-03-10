/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ejerciciotabla;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yesner
 */
public class frmProductos extends javax.swing.JInternalFrame {

  DefaultTableModel modelTablaProducto;
   private double cantidad;
   private double precio;
  /**
   * Creates new form frmProductos
   */
  public frmProductos() {
    initComponents();
    confiTablaProducto();
   
  }

  public void confiTablaProducto(){
    
    modelTablaProducto = new DefaultTableModel();
    //nombre de la tabla de diseno
    TbProducto.setModel(modelTablaProducto);
    modelTablaProducto.addColumn("Codigo");
    modelTablaProducto.addColumn("Descripcion p.");
    modelTablaProducto.addColumn("Precio");
    modelTablaProducto.addColumn("Cantidad");
    modelTablaProducto.addColumn("Total");
  }
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    txtcodigo = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    txtdescripcion = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    txtprecio = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    txtcantidad = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    txttotal = new javax.swing.JTextField();
    jPanel2 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    TbProducto = new javax.swing.JTable();
    jPanel5 = new javax.swing.JPanel();
    btguardar = new javax.swing.JButton();
    bteliminar = new javax.swing.JButton();
    btnsalir = new javax.swing.JButton();
    btncalcular = new javax.swing.JButton();

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Productos"));
    jPanel1.setLayout(new java.awt.GridLayout(5, 2));

    jLabel1.setText("Codigo");
    jPanel1.add(jLabel1);
    jPanel1.add(txtcodigo);

    jLabel2.setText("Descripcion P.");
    jPanel1.add(jLabel2);
    jPanel1.add(txtdescripcion);

    jLabel3.setText("Precio");
    jPanel1.add(jLabel3);
    jPanel1.add(txtprecio);

    jLabel4.setText("Cantidad");
    jPanel1.add(jLabel4);
    jPanel1.add(txtcantidad);

    jLabel5.setText("Total");
    jPanel1.add(jLabel5);

    txttotal.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txttotalActionPerformed(evt);
      }
    });
    jPanel1.add(txttotal);

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Productos Guardados"));

    TbProducto.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
      }
    ));
    jScrollPane1.setViewportView(TbProducto);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        .addContainerGap())
    );

    jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Operaciones"));

    btguardar.setText("Guardar");
    btguardar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btguardarActionPerformed(evt);
      }
    });

    bteliminar.setText("Eliminar");
    bteliminar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bteliminarActionPerformed(evt);
      }
    });

    btnsalir.setText("Salir");
    btnsalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnsalirActionPerformed(evt);
      }
    });

    btncalcular.setText("Calcular");
    btncalcular.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btncalcularActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addGap(65, 65, 65)
        .addComponent(btncalcular)
        .addGap(61, 61, 61)
        .addComponent(btguardar)
        .addGap(59, 59, 59)
        .addComponent(bteliminar)
        .addGap(75, 75, 75)
        .addComponent(btnsalir)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addGap(30, 30, 30)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(bteliminar)
          .addComponent(btnsalir)
          .addComponent(btguardar)
          .addComponent(btncalcular))
        .addContainerGap(41, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
    llenarObjeto();
    txttotal.setText("");
    
  }//GEN-LAST:event_btguardarActionPerformed

  private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
    eliminar();
  }//GEN-LAST:event_bteliminarActionPerformed

  private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
   System.exit(0);
  }//GEN-LAST:event_btnsalirActionPerformed

  private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
   
   
  }//GEN-LAST:event_txttotalActionPerformed

  private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
    cantidad = Double.parseDouble(txtcantidad.getText());
    precio = Double.parseDouble(txtprecio.getText());
    double total = cantidad * precio;
   
    txttotal.setText(String.valueOf(total));
   
  }//GEN-LAST:event_btncalcularActionPerformed

  public void llenarObjeto(){
    Object[] oDatos = new Object[5];
    oDatos [0] = txtcodigo.getText();
    oDatos [1] = txtdescripcion.getText();
    oDatos [2] = txtprecio.getText();
    oDatos [3] = txtcantidad.getText();
    oDatos [4] = txttotal.getText();
    modelTablaProducto.addRow(oDatos);
    limpiar();
  }
  
  public void limpiar(){
    txtcodigo.setText("");
    txtdescripcion.setText("");
    txtprecio.setText("");
    txtcantidad.setText("");
   
  
  }
  
  public void eliminar(){
    int fila = TbProducto.getSelectedRow();
    if(fila != -1){
      modelTablaProducto.removeRow(fila);
    }else
    JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
  }
  
 

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTable TbProducto;
  private javax.swing.JButton bteliminar;
  private javax.swing.JButton btguardar;
  private javax.swing.JButton btncalcular;
  private javax.swing.JButton btnsalir;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField txtcantidad;
  private javax.swing.JTextField txtcodigo;
  private javax.swing.JTextField txtdescripcion;
  private javax.swing.JTextField txtprecio;
  private javax.swing.JTextField txttotal;
  // End of variables declaration//GEN-END:variables
}
