/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import mp3p1.Archivo;
import mp3p1.Cancion;

/**
 *
 * @author ALEJANDRA
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    DefaultListModel modeloLista = new DefaultListModel();
    DefaultListModel listaAuxiliar = new DefaultListModel();
    ArrayList<Cancion> canciones = new ArrayList<Cancion>();

    public Principal() throws IOException {
        initComponents();
        setTitle("MP3 LECTOR");
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/iconos/fondo.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
        this.Lcanciones.setModel(modeloLista);
        inicioTodo();
    }

    public void inicioTodo() throws IOException {

        Archivo archivo = new Archivo();
        canciones = archivo.leerTodas();
        for (Cancion song : canciones) {
            modeloLista.addElement(song);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOpciones = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        PanelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lcanciones = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbArtista = new javax.swing.JLabel();
        lbAlbum = new javax.swing.JLabel();
        lbAnio = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(880, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(880, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelOpciones.setBackground(new java.awt.Color(51, 51, 51));
        panelOpciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Buscar por artista");

        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));

        btnBuscar.setBackground(new java.awt.Color(102, 102, 102));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/vidrio-de-aumento.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jList1.setBackground(new java.awt.Color(255, 255, 255));
        jList1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(51, 51, 51));
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel15)
                    .addGroup(panelOpcionesLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        PanelLista.setBackground(new java.awt.Color(51, 51, 51));
        PanelLista.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Lcanciones.setBackground(new java.awt.Color(255, 255, 255));
        Lcanciones.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Lcanciones.setForeground(new java.awt.Color(51, 51, 51));
        Lcanciones.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                LcancionesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(Lcanciones);

        javax.swing.GroupLayout PanelListaLayout = new javax.swing.GroupLayout(PanelLista);
        PanelLista.setLayout(PanelListaLayout);
        PanelListaLayout.setHorizontalGroup(
            PanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        PanelListaLayout.setVerticalGroup(
            PanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(PanelLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 225, 465, 320));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel114.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(204, 204, 204));
        jLabel114.setText("Año:");

        jLabel115.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(204, 204, 204));
        jLabel115.setText("Titulo:");

        jLabel116.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(204, 204, 204));
        jLabel116.setText("Artista:");

        jLabel117.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(204, 204, 204));
        jLabel117.setText("Album:");

        jLabel118.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(204, 204, 204));
        jLabel118.setText("INFORMACIÓN DE LA CANCIÓN");

        lbTitulo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(204, 204, 204));

        lbArtista.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbArtista.setForeground(new java.awt.Color(204, 204, 204));

        lbAlbum.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbAlbum.setForeground(new java.awt.Color(204, 204, 204));

        lbAnio.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbAnio.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel118)
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel114)
                    .addComponent(jLabel117)
                    .addComponent(jLabel116)
                    .addComponent(jLabel115))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel118)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel115)
                            .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel116, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbArtista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel117))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel114)
                    .addComponent(lbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 320, -1));

        agregar.setBackground(new java.awt.Color(102, 102, 102));
        agregar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/folder.png"))); // NOI18N
        agregar.setText("Agregar carpeta");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 280, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1040, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        Buscador venta = new Buscador();
        venta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agregarActionPerformed

    private void LcancionesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_LcancionesValueChanged
        // TODO add your handling code here:
        int index = this.Lcanciones.getSelectedIndex();
        Cancion aux = (Cancion) modeloLista.getElementAt(index);
        this.lbTitulo.setText(aux.getTitulo());
        this.lbArtista.setText(aux.getArtista());
        this.lbAlbum.setText(aux.getAlbum());
        this.lbAnio.setText(aux.getAnio());
    }//GEN-LAST:event_LcancionesValueChanged
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        this.jList1.removeAll();
        this.listaAuxiliar.removeAllElements();
        String artista = this.jTextField1.getText();//recibe el texto del buscador
        for (int i = 0; i < modeloLista.size(); i++) {//recorre el listado de canciones
            Cancion aux = (Cancion) modeloLista.getElementAt(i);// variable temporal con cada cancion
            if (artista.equals(aux.getArtista())) { //si el buscador es igual a un artista de la lista
                //System.out.println("siiii");
                listaAuxiliar.addElement(aux); //se grega esa cancion a la lista auxiliar
            }
        }
        this.jList1.setModel(listaAuxiliar);// se agrega la lista auxiliar a la pantalla
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        //this.jList1.setModel(listaAuxiliar);
        int index = this.jList1.getSelectedIndex();
        Cancion aux = (Cancion) listaAuxiliar.getElementAt(index);
        this.lbTitulo.setText(aux.getTitulo());
        this.lbArtista.setText(aux.getArtista());
        this.lbAlbum.setText(aux.getAlbum());
        this.lbAnio.setText(aux.getAnio());
    }//GEN-LAST:event_jList1ValueChanged

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Lcanciones;
    private javax.swing.JPanel PanelLista;
    private javax.swing.JButton agregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbAlbum;
    private javax.swing.JLabel lbAnio;
    private javax.swing.JLabel lbArtista;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel panelOpciones;
    // End of variables declaration//GEN-END:variables
}
