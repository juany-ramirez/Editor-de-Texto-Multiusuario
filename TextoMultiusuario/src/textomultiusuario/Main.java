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
import java.sql.*;  // for standard JDBC programs
import java.math.*; // for BigDecimal and BigInteger support
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
        conectados = new ArrayList<>();
        jTextArea1.getCaret().setSelectionVisible(true);
        jTextArea1.getDocument().addUndoableEditListener(
                new UndoableEditListener() {
                    public void undoableEditHappened(UndoableEditEvent e) {
                        undo.addEdit(e.getEdit());
                    }
                });
        bloques = new ArrayList<>();
        //DataBaseInit();
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
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jDialog2 = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jDialog3 = new javax.swing.JDialog();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jButton18 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jDialog4 = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPopupMenu2 = new javax.swing.JPopupMenu();
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
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jDialog1.setMinimumSize(new java.awt.Dimension(1136, 671));
        jDialog1.setResizable(false);
        jDialog1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jDialog1WindowClosed(evt);
            }
        });
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cloud_data-128.png"))); // NOI18N
        jButton3.setText("Base de Datos");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
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

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jDialog1.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 60, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jDialog1.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 220, 40));

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
        jPanel3.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 70, 60));

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
        jPanel3.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 70, 60));

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

        jButton9.setBackground(new java.awt.Color(0, 102, 153));
        jButton9.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(204, 204, 204));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/floppy-128.png"))); // NOI18N
        jButton9.setText("Guardar");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(0, 102, 153));
        jButton16.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(204, 204, 204));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Text_files_Microsoft_Word_Document-64.png"))); // NOI18N
        jButton16.setText("Convertir");

        jButton17.setBackground(new java.awt.Color(0, 102, 153));
        jButton17.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(204, 204, 204));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user_group_users_add_create_new-64.png"))); // NOI18N
        jButton17.setText("Permisos");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton9)
                .addGap(18, 18, 18)
                .addComponent(jButton16)
                .addGap(18, 18, 18)
                .addComponent(jButton17)
                .addGap(113, 113, 113))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel25)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel26)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel25)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel26)
                    .addGap(0, 0, Short.MAX_VALUE)))
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

        jDialog3.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jDialog3WindowActivated(evt);
            }
        });
        jDialog3.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setBackground(new java.awt.Color(153, 153, 0));
        jToggleButton1.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jToggleButton1.setText("Lectura y Escritura");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jDialog3.getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 320, 120));

        jToggleButton2.setBackground(new java.awt.Color(153, 153, 0));
        jToggleButton2.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jToggleButton2.setText("Lectura");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jDialog3.getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 320, 120));

        jButton18.setBackground(new java.awt.Color(51, 153, 0));
        jButton18.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jButton18.setForeground(new java.awt.Color(204, 204, 204));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/success_medal_done-64.png"))); // NOI18N
        jButton18.setText("G U A R D A R");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton18MouseClicked(evt);
            }
        });
        jDialog3.getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 340, 100));

        jComboBox2.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox2.setFont(new java.awt.Font("Sitka Subheading", 0, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jDialog3.getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 420, 70));

        jLabel22.setFont(new java.awt.Font("Sylfaen", 1, 60)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("P E R M I S O S");
        jDialog3.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 480, 90));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/surface_gray_dark_light_shadow_18440_2048x1152.jpg"))); // NOI18N
        jDialog3.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 170));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/fish-blurred-background.jpg"))); // NOI18N
        jDialog3.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 620));

        jDialog4.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jDialog4WindowActivated(evt);
            }
        });
        jDialog4.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID PROPIETARIO", "NOMBRE", "TAMANO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable2);

        jDialog4.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 820, 470));

        jButton12.setBackground(new java.awt.Color(0, 102, 102));
        jButton12.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(204, 204, 204));
        jButton12.setText("GENERAR PDF");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jDialog4.getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, 210, 130));

        jLabel29.setFont(new java.awt.Font("Sylfaen", 1, 60)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cloud_data-128.png"))); // NOI18N
        jLabel29.setText("  R e p o r t e r í a");
        jDialog4.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 800, 160));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/surface_gray_dark_light_shadow_18440_2048x1152.jpg"))); // NOI18N
        jDialog4.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

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
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 220, 30));

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

        jButton2.setForeground(new java.awt.Color(0, 0, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add-circle-blue-64.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
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
        jLabel14.setText("Contrasena:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("C r e a r    N u e v o    U s u a r i o");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        jLabel21.setFont(new java.awt.Font("Sitka Subheading", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Correo: ");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, -1, -1));

        jPasswordField2.setFont(new java.awt.Font("Sitka Subheading", 0, 18)); // NOI18N
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 230, 30));

        jTextField6.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 220, -1));

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
        String pass = jPasswordField2.getText();
        boolean pase = false;
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from usuario");
            String usuario, password, nombre, apellido, correo;
            int id;
            while (rs.next() && !pase) {
                id = rs.getInt("idusuario");
                nombre = rs.getString("nombre");
                apellido = rs.getString("apellido");
                usuario = rs.getString("username");
                password = rs.getString("password");
                correo = rs.getString("correo");
                if (user.equals(usuario) && pass.equals(password)) {
                    pase = true;
                    AdminUsuario = new Usuario(id, nombre, apellido, usuario, password, correo);
                    conectados.add(AdminUsuario);
                    jLabel19.setText(id + "");
                    jLabel20.setText(nombre + " " + apellido);
                    //con.close();
                    this.setVisible(false);
                    jDialog1.pack();
                    //jDialog1.setModal(true);
                    jDialog1.setVisible(true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (pase == false) {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta");
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        jLabel28.setText("");
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
        if (fs >= 1) {
            jTextArea1.setFont(new Font(jTextArea1.getFont().getFontName(), jTextArea1.getFont().getStyle(), fs));
        }
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        int fs = jTextArea1.getFont().getSize() + 1;
        if (fs >= 1) {
            jTextArea1.setFont(new Font(jTextArea1.getFont().getFontName(), Font.BOLD, fs));

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
        jTextArea1.setFont(new Font(font, Font.BOLD, jTextArea1.getFont().getSize()));

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jDialog1WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog1WindowClosed
        int id = Integer.parseInt(jLabel19.getText());
        int num = 0;
        for (int i = 0; i < conectados.size(); i++) {
            if (((Usuario) conectados.get(i)).getId() == id) {
                conectados.remove(i);
                num = i;
            }
        }
        conectados.remove(num);
    }//GEN-LAST:event_jDialog1WindowClosed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        boolean pase = false;
        int usuarios = 0;
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from usuario");
            while (rs.next()) {
                usuarios++;
                System.out.println(usuarios);
            }
            usuarios++;
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
            Statement st = con.createStatement();
            String usuario, password, nombre, apellido, correo;
            nombre = jTextField4.getText();
            apellido = jTextField2.getText();
            usuario = jTextField3.getText();
            password = jPasswordField1.getText();
            correo = jTextField6.getText();
            String Query = "insert into usuario "
                    + "(idusuario, nombre, apellido, username, password, correo) "
                    + "values ('" + (usuarios) + "', " + " '" + nombre + "', '" + apellido + "', '" + usuario + "', '" + password + "', '" + correo + "')";
            System.out.println(Query);
            st.executeUpdate(Query);
            pase = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (pase == false) {
            JOptionPane.showMessageDialog(this, "Error en la creacion de perfil");
        } else {
            JOptionPane.showMessageDialog(this, "Perfil creado exitosamente");
            jTextField4.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jPasswordField1.setText("");
            jTextField6.setText("");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jDialog3WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog3WindowActivated
        try {
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from usuario");
            while (rs.next()) {
                String q = rs.getInt("idusuario") + "-" + rs.getString("nombre") + " " + rs.getString("apellido");
                System.out.println(q);
                modelo.addElement(q);
                jComboBox2.setModel(modelo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jDialog3WindowActivated

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
        jDialog3.pack();
        jDialog3.setModal(true);
        jDialog3.setVisible(true);
    }//GEN-LAST:event_jButton17MouseClicked

    private void jButton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseClicked
        boolean pase = false;
        //if(jLabel24.getText()!= null)
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
            Statement st = con.createStatement();
            int permi = 1;
            boolean escogido = false;
            if (jToggleButton2.isSelected()) {
                escogido = true;
                permi = 1;
            } else if (jToggleButton1.isSelected()) {
                escogido = true;
                permi = 2;
            }
            if (escogido) {
                DefaultComboBoxModel modelo = (DefaultComboBoxModel) jComboBox2.getModel();
                String pp = (String) modelo.getSelectedItem();
                String[] persona = pp.split("-");
                System.out.println("===============");
                System.out.println(pp);
                for (int i = 0; i < persona.length; i++) {
                    System.out.println(persona[i]);
                }
                String Query = "insert into permiso "
                        + "(permiso, usuario_idusuario, archivo_idarchivo) "
                        + "values ('" + permi + "', '" + (Integer.parseInt(persona[0])) + "', '" + (Integer.parseInt(jLabel28.getText())) + "')";
                System.out.println(Query);
                st.executeUpdate(Query);
            } else {
                JOptionPane.showMessageDialog(this, "Error, seleccione una opcion");
            }

            pase = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (pase == false) {
            JOptionPane.showMessageDialog(this, "Error en almacenamiento");
        } else {
            JOptionPane.showMessageDialog(this, "Se ha creado el permiso");

        }
    }//GEN-LAST:event_jButton18MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        boolean pase = false;
        //if(jLabel28.getText()!= null)
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
            Statement st = con.createStatement();
            int permi = 1;
            String nombre_archivo = null;
            if (jLabel28.getText().equals("")) {
                nombre_archivo = JOptionPane.showInputDialog("Ingrese el nombre del documento");
            } else {
                nombre_archivo = jLabel27.getText();
            }
            int idarchv;
            try {
                ResultSet rs = st.executeQuery("SELECT * FROM archivo WHERE idarchivo=(SELECT MAX(idarchivo) FROM archivo)");
                rs.next();
                idarchv = rs.getInt("idarchivo") + 1;
            } catch (Exception e) {
                idarchv = 1;
            }
            String forma = jTextArea1.getFont().getSize() + ";"
                    + (String) jComboBox1.getSelectedItem();
            Archivo arch = new Archivo(
                    idarchv,
                    Integer.parseInt(jLabel19.getText()),
                    nombre_archivo,
                    bloques,
                    forma, "/");
            String xml = arch.SerielizarXml(arch);
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) jComboBox2.getModel();
            String[] persona = ((String) modelo.getSelectedItem()).split(".");
            String Query = "insert into archivo "
                    + "(idarchivo, usuario_idusuario, nombre, contenido, formato, directorio) "
                    + "values ('" + idarchv + "', '" + arch.user
                    + "', '" + nombre_archivo + "', '" + xml
                    + "', '" + forma + "', '/')";
            System.out.println(Query);
            st.executeUpdate(Query);
            jLabel28.setText(idarchv + "");
            jLabel27.setText(nombre_archivo);
            pase = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (pase == false) {
            JOptionPane.showMessageDialog(this, "Error en almacenamiento");
        } else {
            JOptionPane.showMessageDialog(this, "Se ha almacenado el archivo");
        }
    }//GEN-LAST:event_jButton9MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (jToggleButton2.isSelected() && jToggleButton1.isSelected()) {
            jToggleButton2.setSelected(false);
            jToggleButton1.setSelected(false);
            JOptionPane.showMessageDialog(this, "Solo puede seleccionar un permiso");
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        if (jToggleButton2.isSelected() && jToggleButton1.isSelected()) {
            jToggleButton2.setSelected(false);
            jToggleButton1.setSelected(false);
            JOptionPane.showMessageDialog(this, "Solo puede seleccionar un permiso");
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12MouseClicked

    private void jDialog4WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog4WindowActivated
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from archivo");
            String nombre, contenido;
            int id, iduser, size;
            while (rs.next()) {
                DefaultTableModel dtm = new DefaultTableModel(0, 0);
                String header[] = new String[]{"ID", "ID PROPIETARIO", "NOMBRE", "TAMANO"};
                dtm.setColumnIdentifiers(header);
                jTable2.setModel(dtm);
                id = rs.getInt("idarchivo");
                iduser = rs.getInt("usuario_idusuario");
                nombre = rs.getString("nombre");
                contenido = rs.getString("nombre");
                byte[] b = contenido.getBytes("UTF-8");
                size = b.length;
                dtm.addRow(new Object[]{id, iduser, nombre, size});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jDialog4WindowActivated

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        jDialog4.pack();
        jDialog4.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    public void DB() {
        Conn cn = new Conn();                                         // Obtiene la conexion
        ResultSet rs = null;
        Statement stmt = null;
        String Err = "";
        int i = 0;
        Connection conn = null;
        try {
            String IP;
            String Puerto;
            String BD;
            String Usuario;
            String Clave;
            try {
                /*Datos de la BD*/
                IP = "localhost";
                Puerto = "33066";
                BD = "datab";
                Usuario = "root";
                Clave = "qwaszx12";
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://" + IP + ":" + Puerto + "/" + BD
                        + "?noAccessToProcedureBodies=true&amp;zeroDateTimeBehavior=convertToNull";
                Class.forName(driver);
                conn = DriverManager.getConnection("jdbc:mysql:loadbalance://localhost:3306,localhost:3310/sakila", Usuario, Clave);
            } catch (Exception e) {
                e.printStackTrace();
            }
            /*Crear la conexion a la base de datos */
            if (conn == null) {
                Err = "Error de Conexion a la BD";
            } else {
                stmt = conn.createStatement();
                rs = stmt.executeQuery("select idUsuario, nombre, apellido, username, password, correo \n"
                        + "FROM orgarc.archivos c \n");
                /*Carga los datos de la base de datos a las propiedades de la clase*/
                while (rs.next()) {
                    System.out.println(rs.getInt("idUsuario"));
                    System.out.println(rs.getString("nombre"));
                    System.out.println(rs.getString("apellido"));
                    System.out.println(rs.getString("username"));
                    System.out.println(rs.getString("password"));
                    System.out.println(rs.getString("correo"));
                    /* Blob b = rs.getBlob("contenido"); 
                     this.Contenido = b.getBytes(1, b.length()); */
                    i++;
                }
                if (i == 0) {
                    Err = "Error la consulta no devolvio registros";
                } else {
                    Err = "Consulta de registro exitosa";
                }
                System.out.println(Err);
            }
        } catch (Exception ex) {
            Err = ex.toString();
            System.out.println(Err);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (cn.conn != null) {
                    cn.conn.close();
                }
            } catch (SQLException e) {
                Err = e.toString();
            }
        }

    }

    public void DataBaseInit() {
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from usuario");
            while (rs.next()) {
                System.out.println(rs.getString("nombre"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables

    ArrayList<Usuario> conectados;
    ArrayList<Bloque> bloques;
    UndoManager undo = new UndoManager();
    Usuario AdminUsuario;

}
