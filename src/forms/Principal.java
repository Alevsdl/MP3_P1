/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

/**
 *
 * @author ALEJANDRA
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        panelOpciones = new javax.swing.JPanel();
        seleccionarCarpeta = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        PanelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        generoL8 = new javax.swing.JLabel();
        disqueraL17 = new javax.swing.JLabel();
        pagOtroL8 = new javax.swing.JLabel();
        direccionL8 = new javax.swing.JLabel();
        yearL8 = new javax.swing.JLabel();
        pagDisqueraL8 = new javax.swing.JLabel();
        noAlbumL8 = new javax.swing.JLabel();
        duracionL8 = new javax.swing.JLabel();
        letraL8 = new javax.swing.JLabel();
        pagArtistaL8 = new javax.swing.JLabel();
        albumL8 = new javax.swing.JLabel();
        artistaL8 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        disqueraL8 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelOpciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        seleccionarCarpeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setText("Seleccionar carpeta de canciones:");

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(seleccionarCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seleccionarCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        PanelLista.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Lista);

        javax.swing.GroupLayout PanelListaLayout = new javax.swing.GroupLayout(PanelLista);
        PanelLista.setLayout(PanelListaLayout);
        PanelListaLayout.setHorizontalGroup(
            PanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        PanelListaLayout.setVerticalGroup(
            PanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );

        generoL8.setText("jLabel1");

        disqueraL17.setText("jLabel1");

        pagOtroL8.setText("jLabel1");

        direccionL8.setText("jLabel1");

        yearL8.setText("jLabel1");

        pagDisqueraL8.setText("jLabel1");

        noAlbumL8.setText("jLabel1");

        duracionL8.setText("jLabel1");

        letraL8.setText("jLabel1");

        pagArtistaL8.setText("jLabel1");

        albumL8.setText("jLabel1");

        artistaL8.setText("jLabel1");

        jLabel106.setForeground(new java.awt.Color(102, 102, 102));
        jLabel106.setText("Página artista:");

        jLabel107.setForeground(new java.awt.Color(102, 102, 102));
        jLabel107.setText("Página artista:");

        jLabel108.setForeground(new java.awt.Color(102, 102, 102));
        jLabel108.setText("Página disquera:");

        jLabel109.setForeground(new java.awt.Color(102, 102, 102));
        jLabel109.setText("Enlaces:");

        jLabel110.setForeground(new java.awt.Color(102, 102, 102));
        jLabel110.setText("Letra:");

        jLabel111.setForeground(new java.awt.Color(102, 102, 102));
        jLabel111.setText("Duración:");

        jLabel112.setForeground(new java.awt.Color(102, 102, 102));
        jLabel112.setText("Dirección:");

        jLabel113.setForeground(new java.awt.Color(102, 102, 102));
        jLabel113.setText("Género:");

        jLabel114.setForeground(new java.awt.Color(102, 102, 102));
        jLabel114.setText("Año:");

        jLabel115.setForeground(new java.awt.Color(102, 102, 102));
        jLabel115.setText("Disquera:");

        disqueraL8.setText("jLabel1");

        jLabel116.setForeground(new java.awt.Color(102, 102, 102));
        jLabel116.setText("Artista:");

        jLabel117.setForeground(new java.awt.Color(102, 102, 102));
        jLabel117.setText("Album: ");

        jLabel118.setForeground(new java.awt.Color(102, 102, 102));
        jLabel118.setText("No.:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel115)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(disqueraL8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel116)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(artistaL8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generoL8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel109)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(disqueraL17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel107)
                            .addComponent(jLabel111)
                            .addComponent(jLabel112)
                            .addComponent(jLabel110)
                            .addComponent(jLabel108)
                            .addComponent(jLabel106))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccionL8)
                            .addComponent(duracionL8)
                            .addComponent(letraL8)
                            .addComponent(pagArtistaL8)
                            .addComponent(pagDisqueraL8)
                            .addComponent(pagOtroL8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel117)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(albumL8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel114)
                            .addComponent(jLabel118))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noAlbumL8)
                            .addComponent(yearL8))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(disqueraL8)
                    .addComponent(jLabel115))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116)
                    .addComponent(artistaL8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel117)
                    .addComponent(albumL8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(noAlbumL8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114)
                    .addComponent(yearL8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(generoL8))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112)
                    .addComponent(direccionL8))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(duracionL8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(letraL8))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109)
                    .addComponent(disqueraL17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(pagArtistaL8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(pagDisqueraL8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(pagOtroL8))
                .addGap(19, 19, 19))
        );

        agregar.setText("Agregar carpeta");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregar))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        Buscador buscar=new Buscador();
        buscar.setVisible(true);
    }//GEN-LAST:event_agregarActionPerformed

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
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Lista;
    private javax.swing.JPanel PanelLista;
    private javax.swing.JButton agregar;
    private javax.swing.JLabel albumL;
    private javax.swing.JLabel albumL1;
    private javax.swing.JLabel albumL2;
    private javax.swing.JLabel albumL3;
    private javax.swing.JLabel albumL4;
    private javax.swing.JLabel albumL5;
    private javax.swing.JLabel albumL6;
    private javax.swing.JLabel albumL7;
    private javax.swing.JLabel albumL8;
    private javax.swing.JLabel artistaL;
    private javax.swing.JLabel artistaL1;
    private javax.swing.JLabel artistaL2;
    private javax.swing.JLabel artistaL3;
    private javax.swing.JLabel artistaL4;
    private javax.swing.JLabel artistaL5;
    private javax.swing.JLabel artistaL6;
    private javax.swing.JLabel artistaL7;
    private javax.swing.JLabel artistaL8;
    private javax.swing.JLabel direccionL;
    private javax.swing.JLabel direccionL1;
    private javax.swing.JLabel direccionL2;
    private javax.swing.JLabel direccionL3;
    private javax.swing.JLabel direccionL4;
    private javax.swing.JLabel direccionL5;
    private javax.swing.JLabel direccionL6;
    private javax.swing.JLabel direccionL7;
    private javax.swing.JLabel direccionL8;
    private javax.swing.JLabel disqueraL;
    private javax.swing.JLabel disqueraL1;
    private javax.swing.JLabel disqueraL10;
    private javax.swing.JLabel disqueraL11;
    private javax.swing.JLabel disqueraL12;
    private javax.swing.JLabel disqueraL13;
    private javax.swing.JLabel disqueraL14;
    private javax.swing.JLabel disqueraL15;
    private javax.swing.JLabel disqueraL16;
    private javax.swing.JLabel disqueraL17;
    private javax.swing.JLabel disqueraL2;
    private javax.swing.JLabel disqueraL3;
    private javax.swing.JLabel disqueraL4;
    private javax.swing.JLabel disqueraL5;
    private javax.swing.JLabel disqueraL6;
    private javax.swing.JLabel disqueraL7;
    private javax.swing.JLabel disqueraL8;
    private javax.swing.JLabel disqueraL9;
    private javax.swing.JLabel duracionL;
    private javax.swing.JLabel duracionL1;
    private javax.swing.JLabel duracionL2;
    private javax.swing.JLabel duracionL3;
    private javax.swing.JLabel duracionL4;
    private javax.swing.JLabel duracionL5;
    private javax.swing.JLabel duracionL6;
    private javax.swing.JLabel duracionL7;
    private javax.swing.JLabel duracionL8;
    private javax.swing.JLabel generoL;
    private javax.swing.JLabel generoL1;
    private javax.swing.JLabel generoL2;
    private javax.swing.JLabel generoL3;
    private javax.swing.JLabel generoL4;
    private javax.swing.JLabel generoL5;
    private javax.swing.JLabel generoL6;
    private javax.swing.JLabel generoL7;
    private javax.swing.JLabel generoL8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollBar jScrollBar3;
    private javax.swing.JScrollBar jScrollBar4;
    private javax.swing.JScrollBar jScrollBar5;
    private javax.swing.JScrollBar jScrollBar6;
    private javax.swing.JScrollBar jScrollBar7;
    private javax.swing.JScrollBar jScrollBar8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel letraL;
    private javax.swing.JLabel letraL1;
    private javax.swing.JLabel letraL2;
    private javax.swing.JLabel letraL3;
    private javax.swing.JLabel letraL4;
    private javax.swing.JLabel letraL5;
    private javax.swing.JLabel letraL6;
    private javax.swing.JLabel letraL7;
    private javax.swing.JLabel letraL8;
    private javax.swing.JLabel noAlbumL;
    private javax.swing.JLabel noAlbumL1;
    private javax.swing.JLabel noAlbumL2;
    private javax.swing.JLabel noAlbumL3;
    private javax.swing.JLabel noAlbumL4;
    private javax.swing.JLabel noAlbumL5;
    private javax.swing.JLabel noAlbumL6;
    private javax.swing.JLabel noAlbumL7;
    private javax.swing.JLabel noAlbumL8;
    private javax.swing.JLabel pagArtistaL;
    private javax.swing.JLabel pagArtistaL1;
    private javax.swing.JLabel pagArtistaL2;
    private javax.swing.JLabel pagArtistaL3;
    private javax.swing.JLabel pagArtistaL4;
    private javax.swing.JLabel pagArtistaL5;
    private javax.swing.JLabel pagArtistaL6;
    private javax.swing.JLabel pagArtistaL7;
    private javax.swing.JLabel pagArtistaL8;
    private javax.swing.JLabel pagDisqueraL;
    private javax.swing.JLabel pagDisqueraL1;
    private javax.swing.JLabel pagDisqueraL2;
    private javax.swing.JLabel pagDisqueraL3;
    private javax.swing.JLabel pagDisqueraL4;
    private javax.swing.JLabel pagDisqueraL5;
    private javax.swing.JLabel pagDisqueraL6;
    private javax.swing.JLabel pagDisqueraL7;
    private javax.swing.JLabel pagDisqueraL8;
    private javax.swing.JLabel pagOtroL;
    private javax.swing.JLabel pagOtroL1;
    private javax.swing.JLabel pagOtroL2;
    private javax.swing.JLabel pagOtroL3;
    private javax.swing.JLabel pagOtroL4;
    private javax.swing.JLabel pagOtroL5;
    private javax.swing.JLabel pagOtroL6;
    private javax.swing.JLabel pagOtroL7;
    private javax.swing.JLabel pagOtroL8;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelInfo1;
    private javax.swing.JPanel panelInfo2;
    private javax.swing.JPanel panelInfo3;
    private javax.swing.JPanel panelInfo4;
    private javax.swing.JPanel panelInfo5;
    private javax.swing.JPanel panelInfo6;
    private javax.swing.JPanel panelInfo7;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JComboBox<String> seleccionarCarpeta;
    private javax.swing.JLabel yearL;
    private javax.swing.JLabel yearL1;
    private javax.swing.JLabel yearL2;
    private javax.swing.JLabel yearL3;
    private javax.swing.JLabel yearL4;
    private javax.swing.JLabel yearL5;
    private javax.swing.JLabel yearL6;
    private javax.swing.JLabel yearL7;
    private javax.swing.JLabel yearL8;
    // End of variables declaration//GEN-END:variables
}
