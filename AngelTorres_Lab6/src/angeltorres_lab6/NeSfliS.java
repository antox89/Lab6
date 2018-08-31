
package angeltorres_lab6;

import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author angel
 */
public class NeSfliS extends javax.swing.JFrame {

    
    public NeSfliS() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        jmi_inicio_logout.setEnabled(false);
        jmi_administrar_peliculas.setEnabled(false);
        jmi_administrar_series.setEnabled(false);
        
        Usuario admin = new Usuario("admin", "admin", 2001);
        Usuario user1 = new Usuario("user1", "user1", 1001);
        Usuario user2 = new Usuario("user2", "user2", 1002);
        
        usuario.add(admin);
        usuario.add(user1);
        usuario.add(user2);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_verDetalles = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtree_producciones = new javax.swing.JTree();
        jd_series = new javax.swing.JDialog();
        btg_peliculas_subs = new javax.swing.ButtonGroup();
        btg_peliculas_dub = new javax.swing.ButtonGroup();
        ppm_peliculas = new javax.swing.JPopupMenu();
        jmi_ppm_peliculas_ver = new javax.swing.JMenuItem();
        jmi_ppm_peliculas_edir = new javax.swing.JMenuItem();
        jmi_ppm_peliculas_delete = new javax.swing.JMenuItem();
        jd_login = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        tf_pass = new javax.swing.JPasswordField();
        bt_signIn = new javax.swing.JButton();
        ppm_prod = new javax.swing.JPopupMenu();
        jmi_ver = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
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

        ta_verDetalles.setColumns(20);
        ta_verDetalles.setRows(5);
        jScrollPane1.setViewportView(ta_verDetalles);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Producciones");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Peliculas");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Series");
        treeNode1.add(treeNode2);
        jtree_producciones.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jtree_producciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtree_produccionesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtree_producciones);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
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
                        .addGap(22, 22, 22)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_peliculas_guardar)
                            .addComponent(bt_peliculas_agregar))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
        jmi_ppm_peliculas_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ppm_peliculas_verActionPerformed(evt);
            }
        });
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
        jmi_ppm_peliculas_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ppm_peliculas_deleteActionPerformed(evt);
            }
        });
        ppm_peliculas.add(jmi_ppm_peliculas_delete);

        jLabel7.setText("Usuario:");

        jLabel8.setText("Password:");

        bt_signIn.setText("Sign In");
        bt_signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_signInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(23, 23, 23)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_user)
                    .addComponent(tf_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_loginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_signIn)
                .addGap(93, 93, 93))
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addComponent(bt_signIn)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jmi_ver.setText("Ver Detalles");
        jmi_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_verActionPerformed(evt);
            }
        });
        ppm_prod.add(jmi_ver);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NeSfliS");

        jButton1.setText("Ver Películas");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jm_menu_inico.setText("Inicio");

        jmi_inicio_login.setText("Sign In");
        jmi_inicio_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_inicio_loginActionPerformed(evt);
            }
        });
        jm_menu_inico.add(jmi_inicio_login);

        jmi_inicio_logout.setText("Sign Out");
        jmi_inicio_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_inicio_logoutActionPerformed(evt);
            }
        });
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jButton1)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_administrar_peliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_administrar_peliculasActionPerformed
        
        DefaultTreeModel m = (DefaultTreeModel)jtree_producciones.getModel();
        
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)m.getRoot();
        
        AdminPelicula ap = new AdminPelicula("./peliculas.txt");
        ap.cargarArchivo();
        
        String nombre, categoria, actor, director,productora, idioma,subs,dubs;
        int duracion;
        
        int centinela=-1;
        int ct=0;
        for (Pelicula pe : ap.getListaPeliculas()) {
            
            nombre = ap.getListaPeliculas().get(ct).getNombre();
            categoria = ap.getListaPeliculas().get(ct).getCategoria();
            actor = ap.getListaPeliculas().get(ct).getActor();
            productora = ap.getListaPeliculas().get(ct).getProductora();
            idioma = ap.getListaPeliculas().get(ct).getIdioma();
            subs = ap.getListaPeliculas().get(ct).getSubtitulos();
            dubs = ap.getListaPeliculas().get(ct).getDoblaje();
            director = ap.getListaPeliculas().get(ct).getDirector();
            duracion = ap.getListaPeliculas().get(ct).getDuracion();
            
            for (int i = 0; i < raiz.getChildCount(); i++) {
                
                if(raiz.getChildAt(i).toString().equals(categoria)){
                    DefaultMutableTreeNode n = 
                            new DefaultMutableTreeNode(
                                    new Pelicula(director, nombre, categoria, 
                                            actor, productora, idioma, dubs, 
                                            subs, duracion));
                    ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(n);
                    centinela=1;
                }
            }
            
            if(centinela ==-1){
                DefaultMutableTreeNode cat = 
                            new DefaultMutableTreeNode(categoria);
                DefaultMutableTreeNode n = 
                        new DefaultMutableTreeNode(
                                new Pelicula(director, nombre, categoria, actor, 
                                        productora, idioma, dubs, subs, duracion));
                n.add(cat);
                raiz.add(n);
            }
            
            m.reload();
            ct++;
            
        }
        
        
        
        

    //File f = new File("./peliculas.txt");
        //m.setRoot(new DefaultMutableTreeNode("hola"));
        //listar_no_orden(f, (DefaultMutableTreeNode)m.getRoot());
        
        jd_movies.pack();
        jd_movies.setModal(true);
        jd_movies.setLocationRelativeTo(this);
        jd_movies.setVisible(true);
    }//GEN-LAST:event_jmi_administrar_peliculasActionPerformed

    public void listar_no_orden(File p_raiz, DefaultMutableTreeNode nodo){
        
        try{
            for (File temp : p_raiz.listFiles()) {
                if(temp.isFile()){
                    DefaultMutableTreeNode n = new DefaultMutableTreeNode(temp.getName());
                    nodo.add(n);
                }else{
                    DefaultMutableTreeNode n = new DefaultMutableTreeNode(temp.getName());
                    nodo.add(n);
                    listar_no_orden(temp, n);
                }
            }
        }catch(Exception e){
            
        }
    }
    
    private void bt_peliculas_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_peliculas_agregarMouseClicked

        String nombre, categoria, actor, director,productora, idioma,subs,dubs;
        int duracion;

        try{

            nombre = tf_peliculas_nombre.getText();
            categoria = cb_peliculas_cat.getSelectedItem().toString();
            actor = tf_peliculas_actori.getText();
            director = tf_peliculas_director.getText();
            productora = tf_peliculas_productora.getText();
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
            
            AdminPelicula apeli= new AdminPelicula("./peliculas.txt");
            apeli.agregarPelicula(p);
            apeli.escribirArchivo();
            System.out.println("agregaada");
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
            e.printStackTrace();
            JOptionPane.showMessageDialog(jd_movies,"Error");
        }
    }//GEN-LAST:event_bt_peliculas_agregarMouseClicked

    private void bt_peliculas_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_peliculas_guardarMouseClicked

        try{
            pelicula_seleccionada.setCategoria(cb_peliculas_cat.getSelectedItem().toString());
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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        AdminPelicula ap= new AdminPelicula("./peliculas.txt");
        ap.cargarArchivo();
        
        String s="";
        for (Pelicula pe : ap.getListaPeliculas()) {
            s+=pe.getNombre()+"\n";
        }
        System.out.println(s);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jmi_ppm_peliculas_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ppm_peliculas_verActionPerformed
        
        ta_verDetalles.append("Título: "+pelicula_seleccionada.getNombre()+"\n"
                +"Duración: "+pelicula_seleccionada.getDuracion()+"\n"
                +"Actor: "+pelicula_seleccionada.getActor()+"\n"
                +"Director: "+pelicula_seleccionada.getDirector()+"\n"
                +"Productora: "+pelicula_seleccionada.getProductora()+"\n"
                +"Idioma: "+pelicula_seleccionada.getIdioma()+"\n"
                +"Tiene Doblaje: "+pelicula_seleccionada.getDoblaje()+"\n"
                +"Tiene Subs en Español: "+pelicula_seleccionada.getSubtitulos()+"\n"
                );
        
    }//GEN-LAST:event_jmi_ppm_peliculas_verActionPerformed

    private void jmi_ppm_peliculas_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ppm_peliculas_deleteActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "¿Desea eliminar la película?","Eliminar Película",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(response == JOptionPane.OK_OPTION){
            DefaultTreeModel m
                    = (DefaultTreeModel)jt_peliculas.getModel();
            m.removeNodeFromParent(nodo_seleccionado);
            m.reload();
            AdminPelicula ap = new AdminPelicula("./peliculas.txt");
            
        }
    }//GEN-LAST:event_jmi_ppm_peliculas_deleteActionPerformed

    private void bt_signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_signInActionPerformed
        
        for (Usuario user : usuario) {
            if(tf_user.getText().equals(user.getNombre()) && tf_pass.getText().equals(user.getPassword())){
                System.out.println("welcome!");
                
                jd_login.dispose();
                tf_pass.setText("");
                tf_user.setText("");
                
                jmi_administrar_peliculas.setEnabled(true);
                jmi_administrar_series.setEnabled(false);
                
                jmi_inicio_logout.setEnabled(true);
                jmi_inicio_login.setEnabled(false);
                break;
            }else{
                System.out.println("No existe");
            }
        }
    }//GEN-LAST:event_bt_signInActionPerformed

    private void jmi_inicio_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_inicio_loginActionPerformed
        jd_login.pack();
        jd_login.setModal(true);
        jd_login.setLocationRelativeTo(this);
        jd_login.setVisible(true);
    }//GEN-LAST:event_jmi_inicio_loginActionPerformed

    private void jmi_inicio_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_inicio_logoutActionPerformed
        
        jmi_administrar_peliculas.setEnabled(false);
        jmi_administrar_series.setEnabled(false);
        
        jmi_inicio_login.setEnabled(true);
        jmi_inicio_logout.setEnabled(false);
    }//GEN-LAST:event_jmi_inicio_logoutActionPerformed

    private void jtree_produccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtree_produccionesMouseClicked
        
        if(evt.isMetaDown()){
            int row = jt_peliculas.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_peliculas.setSelectionRow(row);
            
            Object v1 = jt_peliculas.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode)v1;
            if(nodo_seleccionado.getUserObject() instanceof Pelicula){
                pelicula_seleccionada = (Pelicula)nodo_seleccionado.getUserObject();
                ppm_prod.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
        
    }//GEN-LAST:event_jtree_produccionesMouseClicked

    private void jmi_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_verActionPerformed
        
        ta_verDetalles.append("Título: "+pelicula_seleccionada.getNombre()+"\n"
                +"Duración: "+pelicula_seleccionada.getDuracion()+"\n"
                +"Actor: "+pelicula_seleccionada.getActor()+"\n"
                +"Director: "+pelicula_seleccionada.getDirector()+"\n"
                +"Productora: "+pelicula_seleccionada.getProductora()+"\n"
                +"Idioma: "+pelicula_seleccionada.getIdioma()+"\n"
                +"Tiene Doblaje: "+pelicula_seleccionada.getDoblaje()+"\n"
                +"Tiene Subs en Español: "+pelicula_seleccionada.getSubtitulos()+"\n"
                );
        
    }//GEN-LAST:event_jmi_verActionPerformed

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
            java.util.logging.Logger.getLogger(NeSfliS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NeSfliS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NeSfliS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NeSfliS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NeSfliS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_peliculas_agregar;
    private javax.swing.JButton bt_peliculas_guardar;
    private javax.swing.JButton bt_signIn;
    private javax.swing.ButtonGroup btg_peliculas_dub;
    private javax.swing.ButtonGroup btg_peliculas_subs;
    private javax.swing.JComboBox<String> cb_peliculas_cat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JDialog jd_login;
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
    private javax.swing.JMenuItem jmi_ver;
    private javax.swing.JTree jt_peliculas;
    private javax.swing.JTree jtree_producciones;
    private javax.swing.JPopupMenu ppm_peliculas;
    private javax.swing.JPopupMenu ppm_prod;
    private javax.swing.JRadioButton rbm_dubs_no;
    private javax.swing.JRadioButton rbm_dubs_si;
    private javax.swing.JRadioButton rbm_subs_no;
    private javax.swing.JRadioButton rbm_subs_si;
    private javax.swing.JSpinner sp_peliculas_duracion;
    private javax.swing.JTextArea ta_verDetalles;
    private javax.swing.JPasswordField tf_pass;
    private javax.swing.JTextField tf_peliculas_actori;
    private javax.swing.JTextField tf_peliculas_director;
    private javax.swing.JTextField tf_peliculas_idioma;
    private javax.swing.JTextField tf_peliculas_nombre;
    private javax.swing.JTextField tf_peliculas_productora;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
    Pelicula pelicula_seleccionada;
    DefaultMutableTreeNode nodo_seleccionado;
    ArrayList<Usuario> usuario = new ArrayList();
}
