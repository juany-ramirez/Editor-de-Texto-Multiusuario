package textomultiusuario;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.UndoManager;
import javax.xml.bind.Element;
import java.sql.* ;  // for standard JDBC programs
import java.math.* ; // for BigDecimal and BigInteger support

/**
 *
 * @author Admin
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        //FlamingoSetUp();
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("juanyramirez", "juany"));
        usuarios.add(new Usuario("usuario1", "usuario1"));
        jTextArea1.getCaret().setSelectionVisible(true);
        jTextArea1.getDocument().addUndoableEditListener(
                new UndoableEditListener() {
                    public void undoableEditHappened(UndoableEditEvent e) {
                        undo.addEdit(e.getEdit());
                    }
                });
        try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost3306/demo","juany","juany");
            Statement myStmt = myConn.createStatement();
            ResultSet myRs = myStmt.executeQuery("select * from Usuario");
            while(myRs.next()){
                System.out.println(myRs.getString("last_name"+" - "+myRs.getString(null)));
            }
        }catch(Exception ex){
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jDialog2 = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jDialog1.setMinimumSize(new java.awt.Dimension(1136, 671));
        jDialog1.setResizable(false);
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cloud_data-128.png"))); // NOI18N
        jButton3.setText("Base de Datos");
        jDialog1.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 410, 150));

        jList1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jDialog1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 240, 230));

        jList2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jDialog1.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 240, 230));

        jLabel15.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Mis Archivos");
        jDialog1.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        jLabel16.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Archivos Compartidos");
        jDialog1.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, -1, -1));

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/13-128.png"))); // NOI18N
        jButton4.setText("Editor de Texto");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jDialog1.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 410, 150));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/surface_gray_dark_light_shadow_18440_2048x1152.jpg"))); // NOI18N
        jDialog1.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 640));

        jMenuBar1.setBackground(new java.awt.Color(102, 0, 51));
        jMenuBar1.setForeground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N

        jMenu1.setText("File ");
        jMenu1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N

        jMenuItem1.setText("Bitacora");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Informacion de Perfil");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setText(" Edit");
        jMenu3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jMenuBar1.add(jMenu3);

        jDialog1.setJMenuBar(jMenuBar1);

        jDialog2.setMaximumSize(new java.awt.Dimension(935, 700));
        jDialog2.setMinimumSize(new java.awt.Dimension(935, 700));
        jDialog2.setPreferredSize(new java.awt.Dimension(935, 700));
        jDialog2.setSize(new java.awt.Dimension(935, 750));
        jDialog2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(0, 153, 153));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 28)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 153, 153));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/paste_2-48.png"))); // NOI18N
        jButton5.setText("Paste");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 100));

        jButton6.setBackground(new java.awt.Color(102, 0, 102));
        jButton6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 28)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 204, 204));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/colorwheel-64.png"))); // NOI18N
        jButton6.setText("COLOR");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 170, 100));

        jButton7.setBackground(new java.awt.Color(0, 102, 102));
        jButton7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 28)); // NOI18N
        jButton7.setForeground(new java.awt.Color(153, 153, 153));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/copy_2-32.png"))); // NOI18N
        jButton7.setText("Copy");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 130, 50));

        jButton10.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Bold_Sans-32.png"))); // NOI18N
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 70, -1));

        jButton12.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Italic_Serif-32.png"))); // NOI18N
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jPanel3.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 70, -1));

        jButton11.setBackground(new java.awt.Color(102, 102, 0));
        jButton11.setFont(new java.awt.Font("Sitka Text", 0, 20)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Format_editit-06-48.png"))); // NOI18N
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 70, 60));

        jButton14.setFont(new java.awt.Font("Sitka Text", 0, 20)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/022_060_design_font_smaller_decrease-48.png"))); // NOI18N
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jPanel3.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 70, 60));

        jButton8.setBackground(new java.awt.Color(0, 102, 102));
        jButton8.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 28)); // NOI18N
        jButton8.setForeground(new java.awt.Color(153, 153, 153));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/6-32.png"))); // NOI18N
        jButton8.setText("Cut");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, 50));

        jButton13.setFont(new java.awt.Font("Sitka Text", 0, 20)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/022_061_design_font_larger_increase-48.png"))); // NOI18N
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jPanel3.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 70, 60));

        jButton15.setBackground(new java.awt.Color(102, 102, 0));
        jButton15.setFont(new java.awt.Font("Sitka Text", 0, 20)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Format_editit-01-48.png"))); // NOI18N
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jPanel3.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 70, 60));

        jComboBox1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arial", "Serif", "Times New Roman", "Verdana", "Copperplate" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 190, 30));

        jTabbedPane1.addTab("Home", jPanel3);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 955, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("File", jPanel2);

        jDialog2.getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 170));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jDialog2.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 730, 460));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/transparent_rectangle_bg.png"))); // NOI18N
        jDialog2.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 170));

        jDialog2.getAccessibleContext().setAccessibleDescription("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("High Tower Text", 0, 48)); // NOI18N
        jLabel1.setText("MULTIUSUARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 410, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user-login-man-person-avatar-128.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 130, -1));

        jTextField1.setFont(new java.awt.Font("Sitka Subheading", 0, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 230, 30));

        jLabel3.setFont(new java.awt.Font("Sitka Subheading", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de Usuario: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Subheading", 0, 18)); // NOI18N
        jLabel4.setText("Nombre de Usuario:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Sitka Subheading", 0, 18)); // NOI18N
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 230, 30));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bullet_accept (1).png"))); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 130, 70));

        jLabel8.setFont(new java.awt.Font("High Tower Text", 1, 64)); // NOI18N
        jLabel8.setText("EDITOR DE TEXTO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 780, 70));

        jTextField2.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 220, -1));

        jTextField3.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 220, -1));

        jTextField4.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 220, -1));

        jTextField5.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 220, -1));

        jButton2.setForeground(new java.awt.Color(0, 0, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add-circle-blue-64.png"))); // NOI18N
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 100, 90));

        jLabel12.setFont(new java.awt.Font("Sitka Subheading", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Apellidos: ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));

        jLabel13.setFont(new java.awt.Font("Sitka Subheading", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombres: ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        jLabel14.setFont(new java.awt.Font("Sitka Subheading", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Correo: ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("C r e a r    N u e v o    U s u a r i o");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sitka Subheading", 0, 18)); // NOI18N
        jLabel9.setText("Contraseña:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user_add.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 150, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/transparent_rectangle_bg.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 950, 330));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/130087__textures-metal-mesh-grey_p.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String user = jTextField1.getText();
        String pass = jPasswordField1.getText();
        boolean pase = false;
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(user + ((Usuario) usuarios.get(i)).user);
            System.out.println(pass + ((Usuario) usuarios.get(i)).password);
            if (user.equals(((Usuario) usuarios.get(i)).user) && pass.equals(((Usuario) usuarios.get(i)).password)) {
                jDialog1.pack();
                jDialog1.setModal(true);
                jDialog1.setVisible(true);
                pase = true;
            }
        }
        if (pase == false) {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        jDialog2.pack();
        jDialog2.setModal(true);
        jDialog2.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        try {
            undo.redo();
        } catch (CannotRedoException cre) {

        }
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        Color initialcolor = jTextArea1.getCaretColor();
        Color color = JColorChooser.showDialog(this, "Select a color", initialcolor);
        jTextArea1.setForeground(color);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        int fs = jTextArea1.getFont().getSize() - 1;
        if (fs >= 1 && bold) {
            jTextArea1.setFont(new Font(jTextArea1.getFont().getFontName(), jTextArea1.getFont().getStyle(), fs));
        }
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        int start = jTextArea1.getSelectionStart();
        int end = jTextArea1.getSelectionEnd();

        if (!bold) {
            int fs = jTextArea1.getFont().getSize();
            if (fs >= 1) {
                jTextArea1.setFont(new Font(jTextArea1.getFont().getFontName(), Font.BOLD, fs));
            }
            italic = false;
            bold = true;

        } else {
            int fs = jTextArea1.getFont().getSize();
            if (fs >= 1) {
                jTextArea1.setFont(new Font(jTextArea1.getFont().getFontName(), Font.PLAIN, fs));
            }
            italic = false;
            bold = false;
        }
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        if (!italic) {
            jTextArea1.setFont(new Font(jTextArea1.getFont().getFontName(), Font.ITALIC, jTextArea1.getFont().getSize()));
            italic = true;
            System.out.println("italic true");
            bold = false;
        } else {
            bold = false;
            jTextArea1.setFont(new Font(jTextArea1.getFont().getFontName(), Font.PLAIN, jTextArea1.getFont().getSize()));
            italic = false;
            System.out.println("italic false");
        }
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        int fs = jTextArea1.getFont().getSize() + 1;
        if (fs >= 1) {
            if(bold){
                jTextArea1.setFont(new Font(jTextArea1.getFont().getFontName(),Font.BOLD, fs));
            }else if (italic){
                jTextArea1.setFont(new Font(jTextArea1.getFont().getFontName(),Font.ITALIC, fs));
            }else{
                jTextArea1.setFont(new Font(jTextArea1.getFont().getFontName(),Font.PLAIN, fs));
            }
        }
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        try {
            undo.undo();
        } catch (CannotRedoException cre) {
        }
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        jTextArea1.cut();
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        jTextArea1.copy();
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        jTextArea1.paste();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String font = (String) jComboBox1.getSelectedItem();
        if(bold){
                jTextArea1.setFont(new Font(font,Font.BOLD, jTextArea1.getFont().getSize()));
            }else if (italic){
                jTextArea1.setFont(new Font(font,Font.ITALIC, jTextArea1.getFont().getSize()));
            }else{
                jTextArea1.setFont(new Font(font,Font.PLAIN, jTextArea1.getFont().getSize()));
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /*
     public void FlamingoSetUp(){
     JRibbon ribbon = new JRibbon();
     JRibbonBand clipboardBand = new JRibbonBand("Clipboard", null);
     //Icon pasteIcon = new Icon();
     ;       JCommandButton pasteButton= new JCommandButton("paste", null);
     JCommandButton cutButton= new JCommandButton("cut", null);
        
     pasteButton.setCommandButtonKind(JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
     //pasteButton.setPopupCallback();
     clipboardBand.addCommandButton(pasteButton, RibbonElementPriority.TOP);
     //jDialog2.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 680, 150));
     //jPanel1.add(jButton5);
     ribbon.add(clipboardBand);
     jPanel1.add(ribbon);
     }
     */
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    ArrayList<Usuario> usuarios;
    boolean bold = false;
    boolean italic = false;
    UndoManager undo = new UndoManager();
}
