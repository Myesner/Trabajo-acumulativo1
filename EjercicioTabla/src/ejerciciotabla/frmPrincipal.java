package ejerciciotabla;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */

/**
 *
 * @author yesner
 */
public class frmPrincipal extends javax.swing.JFrame {

  /**
   * Creates new form frmPrincipal
   */
  public frmPrincipal() {
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

    desktopPane = new javax.swing.JDesktopPane();
    menuBar = new javax.swing.JMenuBar();
    SalirMenu = new javax.swing.JMenu();
    exitMenuItem = new javax.swing.JMenuItem();
    editMenu = new javax.swing.JMenu();
    ClienteMenuItem = new javax.swing.JMenuItem();
    ProductoMenuItem = new javax.swing.JMenuItem();
    helpMenu = new javax.swing.JMenu();
    AcercadeMenuItem = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    desktopPane.setLayout(null);

    SalirMenu.setMnemonic('f');
    SalirMenu.setText("Arcivos");

    exitMenuItem.setMnemonic('x');
    exitMenuItem.setText("Salir");
    exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exitMenuItemActionPerformed(evt);
      }
    });
    SalirMenu.add(exitMenuItem);

    menuBar.add(SalirMenu);

    editMenu.setMnemonic('e');
    editMenu.setText("Catalogo");

    ClienteMenuItem.setMnemonic('t');
    ClienteMenuItem.setText("Cliente");
    ClienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ClienteMenuItemActionPerformed(evt);
      }
    });
    editMenu.add(ClienteMenuItem);

    ProductoMenuItem.setMnemonic('y');
    ProductoMenuItem.setText("Productos");
    ProductoMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ProductoMenuItemActionPerformed(evt);
      }
    });
    editMenu.add(ProductoMenuItem);

    menuBar.add(editMenu);

    helpMenu.setMnemonic('h');
    helpMenu.setText("Ayuda");

    AcercadeMenuItem.setMnemonic('a');
    AcercadeMenuItem.setText("Acerca de");
    helpMenu.add(AcercadeMenuItem);

    menuBar.add(helpMenu);

    setJMenuBar(menuBar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
      System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

  private void ClienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteMenuItemActionPerformed
    frmClientes Tc = new frmClientes();
    this.setContentPane(Tc);
    Tc.setVisible(true);
  }//GEN-LAST:event_ClienteMenuItemActionPerformed

  private void ProductoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoMenuItemActionPerformed
    frmProductos Tp = new frmProductos();
    this.setContentPane(Tp);
    Tp.setVisible(true);
  }//GEN-LAST:event_ProductoMenuItemActionPerformed

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
      java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new frmPrincipal().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuItem AcercadeMenuItem;
  private javax.swing.JMenuItem ClienteMenuItem;
  private javax.swing.JMenuItem ProductoMenuItem;
  private javax.swing.JMenu SalirMenu;
  private javax.swing.JDesktopPane desktopPane;
  private javax.swing.JMenu editMenu;
  private javax.swing.JMenuItem exitMenuItem;
  private javax.swing.JMenu helpMenu;
  private javax.swing.JMenuBar menuBar;
  // End of variables declaration//GEN-END:variables

}
