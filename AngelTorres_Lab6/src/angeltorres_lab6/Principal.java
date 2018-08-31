
package angeltorres_lab6;

import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author angel
 */
public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_movies = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_peliculas = new javax.swing.JTree();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_peliculas_nombre = new javax.swing.JTextField();
        sp_peliculas_duracion = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        cb_peliculas_cat = new javax.swing.JComboBox<>();
        bt_peliculas_guardar = new javax.swing.JButton();
        bt_peliculas_agregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_peliculas_actori = new javax.swing.JTextField();
        tf_peliculas_director = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbm_subs_si = new javax.swing.JRadioButton();
        rbm_subs_no = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        rbm_dubs_si = new javax.swing.JRadioButton();
        rbm_dubs_no = new javax.swing.JRadioButton();
        tf_peliculas_idioma = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_peliculas_productora = new javax.swing.JTextField();
        jd_series = new javax.swing.JDialog();
        btg_peliculas_subs = new javax.swing.ButtonGroup();
        btg_peliculas_dub = new javax.swing.ButtonGroup();
        ppm_peliculas = new javax.swing.JPopupMenu();
        jmi_ppm_peliculas_ver = new javax.swing.JMenuItem();
        jmi_ppm_peliculas_edir = new javax.swing.JMenuItem();
        jmi_ppm_peliculas_delete = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_menu_inico = new javax.swing.JMenu();
        jmi_inicio_login = new javax.swing.JMenuItem();
        jmi_inicio_logout = new javax.swing.JMenuItem();
        jmi_inicio_salir = new javax.swing.JMenuItem();
        jm_menu_administrar = new javax.swing.JMenu();
        jmi_administrar_peliculas = new javax.swing.JMenuItem();
        jmi_administrar_series = new javax.swing.JMenuItem();

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Peliculas");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Suspenso");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Terror");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Accion");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Romanticas");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("SciFi");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Animacion");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Fantasia");
        treeNode1.add(treeNode2);
        jt_peliculas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_peliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_peliculasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jt_peliculas);

        jLabel9.setText("Nombre:");

        jLabel10.setText("Duración:");

        jLabel11.setText("Categoría:");

        sp_peliculas_duracion.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel13.setText("mins.");

        cb_peliculas_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suspenso", "Terror", "Accion", "Romanticas", "SciFi", "Animacion", "Fantasia" }));

        bt_peliculas_guardar.setText("Guardar");
        bt_peliculas_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_peliculas_guardarMouseClicked(evt);
            }
        });

        bt_peliculas_agregar.setText("Agregar");
        bt_peliculas_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_peliculas_agregarMouseClicked(evt);
            }
        });

        jLabel1.setText("Actor:");

        jLabel2.setText("Director:");

        jLabel3.setText("Idioma:");

        jLabel4.setText("Subtítulos:");

        btg_peliculas_subs.add(rbm_subs_si);
        rbm_subs_si.setText("Si");

        btg_peliculas_subs.add(rbm_subs_no);
        rbm_subs_no.setSelected(true);
        rbm_subs_no.setText("No");

        jLabel5.setText("Doblaje:");

        btg_peliculas_dub.add(rbm_dubs_si);
        rbm_dubs_si.setText("Si");

        btg_peliculas_dub.add(rbm_dubs_no);
        rbm_dubs_no.setSelected(true);
        rbm_dubs_no.setText("No");

        jLabel6.setText("Productora:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_peliculas_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(sp_peliculas_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)))
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(bt_peliculas_guardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bt_peliculas_agregar))
                                    .addComponent(tf_peliculas_director)
                                    .addComponent(tf_peliculas_idioma, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(rbm_subs_si)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rbm_subs_no))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(rbm_dubs_si)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rbm_dubs_no))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel1)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cb_peliculas_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_peliculas_actori, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(tf_peliculas_productora, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tf_peliculas_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(sp_peliculas_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cb_peliculas_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_peliculas_actori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf_peliculas_productora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_peliculas_director, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_peliculas_idioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbm_subs_si)
                            .addComponent(rbm_subs_no)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbm_dubs_si)
                            .addComponent(rbm_dubs_no)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_peliculas_guardar)
                            .addComponent(bt_peliculas_agregar))
                        .addGap(40, 40, 40))))
        );

        javax.swing.GroupLayout jd_moviesLayout = new javax.swing.GroupLayout(jd_movies.getContentPane());
        jd_movies.getContentPane().setLayout(jd_moviesLayout);
        jd_moviesLayout.setHorizontalGroup(
            jd_moviesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_moviesLayout.setVerticalGroup(
            jd_moviesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_seriesLayout = new javax.swing.GroupLayout(jd_series.getContentPane());
        jd_series.getContentPane().setLayout(jd_seriesLayout);
        jd_seriesLayout.setHorizontalGroup(
            jd_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_seriesLayout.setVerticalGroup(
            jd_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jmi_ppm_peliculas_ver.setText("Ver");
        ppm_peliculas.add(jmi_ppm_peliculas_ver);

        jmi_ppm_peliculas_edir.setText("Modificar");
        jmi_ppm_peliculas_edir.setToolTipText("");
        jmi_ppm_peliculas_edir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ppm_peliculas_edirActionPerformed(evt);
            }
        });
        ppm_peliculas.add(jmi_ppm_peliculas_edir);

        jmi_ppm_peliculas_delete.setText("Eliminar");
        ppm_peliculas.add(jmi_ppm_peliculas_delete);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NeSfliS");

        jm_menu_inico.setText("Inicio");

        jmi_inicio_login.setText("Sign In");
        jm_menu_inico.add(jmi_inicio_login);

        jmi_inicio_logout.setText("Sign Out");
        jm_menu_inico.add(jmi_inicio_logout);

        jmi_inicio_salir.setText("Salir");
        jm_menu_inico.add(jmi_inicio_salir);

        jMenuBar1.add(jm_menu_inico);

        jm_menu_administrar.setText("Administrar");

        jmi_administrar_peliculas.setText("Peliculas");
        jmi_administrar_peliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_administrar_peliculasActionPerformed(evt);
            }
        });
        jm_menu_administrar.add(jmi_administrar_peliculas);

        jmi_administrar_series.setText("Series");
        jm_menu_administrar.add(jmi_administrar_series);

        jMenuBar1.add(jm_menu_administrar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_administrar_peliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_administrar_peliculasActionPerformed
        jd_movies.pack();
        jd_movies.setModal(true);
        jd_movies.setLocationRelativeTo(this);
        jd_movies.setVisible(true);
    }//GEN-LAST:event_jmi_administrar_peliculasActionPerformed

    private void bt_peliculas_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_peliculas_agregarMouseClicked

        String nombre, categoria, actor, director,productora, idioma,subs,dubs;
        int duracion;

        try{

            nombre = tf_peliculas_nombre.getText();
            categoria = cb_peliculas_cat.getSelectedItem().toString();
            actor = tf_peliculas_actori.getText();
            director = tf_peliculas_director.getText();
            productora = tf_peliculas_director.getText();
            duracion = (Integer)sp_peliculas_duracion.getValue();
            idioma = tf_peliculas_idioma.getText();
            
            if(rbm_subs_si.isSelected()){
                subs = "Si";
            }else{
                subs="No";
            }
            if(rbm_dubs_si.isSelected()){
                dubs = "Si";
            }else{
                dubs="No";
            }

            Pelicula p = new Pelicula(director, nombre, categoria, actor, productora, idioma, dubs, subs, duracion);

            DefaultTreeModel m = (DefaultTreeModel)jt_peliculas.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)m.getRoot();

            if(categoria.equals("Suspenso")){
                for (int i = 0; i < raiz.getChildCount(); i++) {

                    if(raiz.getChildAt(i).toString().equals("Suspenso")){
                        DefaultMutableTreeNode suspenso = new DefaultMutableTreeNode(p);
                        ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(suspenso);
                    }
                }
            }

            if(categoria.equals("Terror")){
                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if(raiz.getChildAt(i).toString().equals("Terror")){
                        DefaultMutableTreeNode terror = new DefaultMutableTreeNode(p);
                        ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(terror);
                    }
                }
            }

            if(categoria.equals("Accion")){
                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if(raiz.getChildAt(i).toString().equals("Accion")){
                        DefaultMutableTreeNode accion = new DefaultMutableTreeNode(p);
                        ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(accion);
                    }
                }
            }

            if(categoria.equals("Romanticas")){
                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if(raiz.getChildAt(i).toString().equals("Romanticas")){
                        DefaultMutableTreeNode romanticas = new DefaultMutableTreeNode(p);
                        ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(romanticas);
                    }
                }
            }

            if(categoria.equals("SciFi")){
                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if(raiz.getChildAt(i).toString().equals("SciFi")){
                        DefaultMutableTreeNode scifi = new DefaultMutableTreeNode(p);
                        ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(scifi);
                    }
                }
            }

            if(categoria.equals("Animacion")){
                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if(raiz.getChildAt(i).toString().equals("Animacion")){
                        DefaultMutableTreeNode animacion = new DefaultMutableTreeNode(p);
                        ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(animacion);
                    }
                }
            }
            
            if(categoria.equals("Fantasia")){
                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if(raiz.getChildAt(i).toString().equals("Fantasia")){
                        DefaultMutableTreeNode fantasia = new DefaultMutableTreeNode(p);
                        ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(fantasia);
                    }
                }
            }

            JOptionPane.showMessageDialog(jd_movies,"Agregado con éxito");
            m.reload();
            limpiarPeliculas();
        }catch(Exception e){
            JOptionPane.showMessageDialog(jd_movies,"Error");
        }
    }//GEN-LAST:event_bt_peliculas_agregarMouseClicked

    private void bt_peliculas_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_peliculas_guardarMouseClicked

        try{
            pelicula_seleccionada.setCategoria(cb_peliculas_cat.getSelectedItem().toString());
            //pelicula_seleccionada.setClasificacion(tf_boleteria_clasificacion.getText());
            pelicula_seleccionada.setDuracion((Integer)sp_peliculas_duracion.getValue());
            pelicula_seleccionada.setNombre(tf_peliculas_nombre.getText());

            DefaultTreeModel m
            = (DefaultTreeModel)jt_peliculas.getModel();
            m.reload();

            JOptionPane.showMessageDialog(jd_movies, "Modificado con éxito");
            limpiarPeliculas();
            bt_peliculas_agregar.setVisible(true);
            bt_peliculas_guardar.setVisible(false);

        }catch(Exception e){
            JOptionPane.showMessageDialog(jd_movies, "Error");
        }
    }//GEN-LAST:event_bt_peliculas_guardarMouseClicked

    private void jt_peliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_peliculasMouseClicked

        if(evt.isMetaDown()){
            int row = jt_peliculas.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_peliculas.setSelectionRow(row);

            Object v1 = jt_peliculas.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode)v1;
            if(nodo_seleccionado.getUserObject() instanceof Pelicula){
                pelicula_seleccionada = (Pelicula)nodo_seleccionado.getUserObject();
                ppm_peliculas.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jt_peliculasMouseClicked

    private void jmi_ppm_peliculas_edirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ppm_peliculas_edirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_ppm_peliculas_edirActionPerformed

    public void limpiarPeliculas(){
        tf_peliculas_nombre.setText("");
        cb_peliculas_cat.setSelectedIndex(0);
        tf_peliculas_actori.setText("");
        tf_peliculas_productora.setText("");
        tf_peliculas_director.setText("");
        sp_peliculas_duracion.setValue(0);
        tf_peliculas_idioma.setText("");
        cb_peliculas_cat.setSelectedIndex(0);
        rbm_subs_si.setSelected(true);
        rbm_subs_no.setSelected(false);
        rbm_dubs_si.setSelected(true);
        rbm_dubs_no.setSelected(false);
    }
    
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
    private javax.swing.JButton bt_peliculas_agregar;
    private javax.swing.JButton bt_peliculas_guardar;
    private javax.swing.ButtonGroup btg_peliculas_dub;
    private javax.swing.ButtonGroup btg_peliculas_subs;
    private javax.swing.JComboBox<String> cb_peliculas_cat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JDialog jd_movies;
    private javax.swing.JDialog jd_series;
    private javax.swing.JMenu jm_menu_administrar;
    private javax.swing.JMenu jm_menu_inico;
    private javax.swing.JMenuItem jmi_administrar_peliculas;
    private javax.swing.JMenuItem jmi_administrar_series;
    private javax.swing.JMenuItem jmi_inicio_login;
    private javax.swing.JMenuItem jmi_inicio_logout;
    private javax.swing.JMenuItem jmi_inicio_salir;
    private javax.swing.JMenuItem jmi_ppm_peliculas_delete;
    private javax.swing.JMenuItem jmi_ppm_peliculas_edir;
    private javax.swing.JMenuItem jmi_ppm_peliculas_ver;
    private javax.swing.JTree jt_peliculas;
    private javax.swing.JPopupMenu ppm_peliculas;
    private javax.swing.JRadioButton rbm_dubs_no;
    private javax.swing.JRadioButton rbm_dubs_si;
    private javax.swing.JRadioButton rbm_subs_no;
    private javax.swing.JRadioButton rbm_subs_si;
    private javax.swing.JSpinner sp_peliculas_duracion;
    private javax.swing.JTextField tf_peliculas_actori;
    private javax.swing.JTextField tf_peliculas_director;
    private javax.swing.JTextField tf_peliculas_idioma;
    private javax.swing.JTextField tf_peliculas_nombre;
    private javax.swing.JTextField tf_peliculas_productora;
    // End of variables declaration//GEN-END:variables
    Pelicula pelicula_seleccionada;
    DefaultMutableTreeNode nodo_seleccionado;
    
}
