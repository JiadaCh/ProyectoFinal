/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Control.CConexion;
import java.awt.Toolkit;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javie
 */
public class MenuCliente extends javax.swing.JFrame {

    CConexion cx = new CConexion();
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    String id, nom, ape, direcc, email, fecha;

    /**
     * Creates new form Menu
     */
    public MenuCliente() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(Toolkit.getDefaultToolkit().getImage("./src/imagen/icono.png")).getImage());
        consulta("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        Buscador = new javax.swing.JTextField();
        Modificar = new javax.swing.JButton();
        Eleminar = new javax.swing.JButton();
        Anadir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BotonAtras = new javax.swing.JButton();
        Imprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jupiter");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        Buscador.setBackground(new java.awt.Color(255, 255, 255));
        Buscador.setForeground(new java.awt.Color(51, 51, 51));
        Buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscadorActionPerformed(evt);
            }
        });
        Buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscadorKeyReleased(evt);
            }
        });

        Modificar.setBackground(new java.awt.Color(255, 255, 255));
        Modificar.setForeground(new java.awt.Color(51, 51, 51));
        Modificar.setText("Modificar");
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
        });
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Eleminar.setBackground(new java.awt.Color(255, 255, 255));
        Eleminar.setForeground(new java.awt.Color(51, 51, 51));
        Eleminar.setText("Eliminar");
        Eleminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleminarActionPerformed(evt);
            }
        });

        Anadir.setBackground(new java.awt.Color(255, 255, 255));
        Anadir.setForeground(new java.awt.Color(51, 51, 51));
        Anadir.setText("Añadir");
        Anadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnadirMouseClicked(evt);
            }
        });
        Anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnadirActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellidos", "Email", "Direccion", "Fecha Nacimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        BotonAtras.setBackground(new java.awt.Color(255, 255, 255));
        BotonAtras.setForeground(new java.awt.Color(51, 51, 51));
        BotonAtras.setText("Atras");
        BotonAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAtrasMouseClicked(evt);
            }
        });

        Imprimir.setBackground(new java.awt.Color(255, 255, 255));
        Imprimir.setForeground(new java.awt.Color(51, 51, 51));
        Imprimir.setText("Imprimir");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Buscador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Imprimir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Anadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Eleminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificar)
                    .addComponent(Eleminar)
                    .addComponent(Anadir)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAtras)
                    .addComponent(Imprimir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscadorActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed

    }//GEN-LAST:event_ModificarActionPerformed

    private void EleminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleminarActionPerformed
        eleminar();
        consulta("");
    }//GEN-LAST:event_EleminarActionPerformed

    private void AnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnadirActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImprimirActionPerformed

    private void AnadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnadirMouseClicked

        FormularioCliente f = new FormularioCliente();
        f.setVisible(true);
        this.dispose();
        limpiarTabla();
    }//GEN-LAST:event_AnadirMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila = jTable1.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se seleccionó una fila");
        } else {
            id = (String) jTable1.getValueAt(fila,0);
            nom = (String) jTable1.getValueAt(fila, 1);
            ape = (String) jTable1.getValueAt(fila, 2);
            email = (String) jTable1.getValueAt(fila, 3);
            direcc = (String) jTable1.getValueAt(fila, 4);
            fecha = jTable1.getValueAt(fila, 5).toString();

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        int fila = jTable1.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se seleccionó una fila");
        } else {
 
            nom = (String) jTable1.getValueAt(fila, 1);
            ape = (String) jTable1.getValueAt(fila, 2);
            email = (String) jTable1.getValueAt(fila, 3);
            direcc = (String) jTable1.getValueAt(fila, 4);
            fecha = jTable1.getValueAt(fila, 5).toString();
            DatoCliente c = new DatoCliente(jTable1.getValueAt(fila, 0).toString(), nom, ape, direcc, email, fecha);
            c.setVisible(true);
            this.dispose();
            limpiarTabla();
        }

    }//GEN-LAST:event_ModificarMouseClicked

    private void BuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscadorKeyReleased
        // TODO add your handling code here:
        consulta(Buscador.getText());
    }//GEN-LAST:event_BuscadorKeyReleased

    private void BotonAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAtrasMouseClicked
        MenuModulos principal = new MenuModulos();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonAtrasMouseClicked

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
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anadir;
    private javax.swing.JButton BotonAtras;
    private javax.swing.JTextField Buscador;
    private javax.swing.JButton Eleminar;
    private javax.swing.JButton Imprimir;
    private javax.swing.JButton Modificar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void limpiarTabla() {
        for (int i = 0; i <= jTable1.getRowCount(); i++) {
            if (this.modelo != null){
                modelo.removeRow(i);
                i -= 1;
            }
        }
    }

    private void eleminar() {
        
        int fila = jTable1.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se seleccionó una fila");
        } else {
            try {
                System.out.println(jTable1.getValueAt(fila, 0));
                if (fila < 0) {
                    JOptionPane.showMessageDialog(null, "Cliente no seleccionado");
                } else {
                    String sql = "delete from clientes where id='" + jTable1.getValueAt(fila, 0) + "'";
                    st = cx.getConexion().createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Cliente eleminado");
                    limpiarTabla();
                }
            } catch (SQLException ex) {
                Logger.getLogger(MenuCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void consulta(String nombre) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Email");
        modelo.addColumn("Direccion");
        modelo.addColumn("Fecha Nacimiento");
        jTable1.setModel(modelo);
        String sql = "";
        if (nombre.equals("")) {
            sql = "Select * from clientes";
        } else {
            sql = "Select * from clientes where nombre like '%" + nombre + "%' or apellidos like '%" + nombre + "%'";
        }

        String[] cliente = new String[6];
        Statement set;
        try {
            set = cx.conectar().createStatement();
            ResultSet rs = set.executeQuery(sql);

            while (rs.next()) {
                cliente[0] = rs.getString(1);
                cliente[1] = rs.getString(2);
                cliente[2] = rs.getString(3);
                cliente[3] = rs.getString(4);
                cliente[4] = rs.getString(5);
                cliente[5] = rs.getObject(6).toString();
                modelo.addRow(cliente);
            }
            jTable1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
