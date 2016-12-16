package textomultiusuario;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.UndoManager;
import java.sql.*;  // for standard JDBC programs
import java.text.MessageFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics2D;
import java.awt.List;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
/*
 import org.apache.poi.xwpf.usermodel.XWPFDocument;
 import org.apache.poi.xwpf.usermodel.XWPFParagraph;
 import org.apache.poi.xwpf.usermodel.XWPFRun;*/

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
        jTextArea1.getCaret().setSelectionVisible(true);
        jTextArea1.getDocument().addUndoableEditListener(
                new UndoableEditListener() {
                    public void undoableEditHappened(UndoableEditEvent e) {
                        undo.addEdit(e.getEdit());
                    }
                });
        bloques = new ArrayList<>();
        numeroLista = 0;
        //DataBaseInit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Home = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_escrituraArchvs = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_lecturaArchvs = new javax.swing.JList();
        jLabel15 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jd_Editor = new javax.swing.JDialog();
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
        jLabel30 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jd_Permisos = new javax.swing.JDialog();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jButton18 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jd_Reporteria = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jd_Bitacora = new javax.swing.JDialog();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
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

        jd_Home.setMinimumSize(new java.awt.Dimension(1136, 671));
        jd_Home.setResizable(false);
        jd_Home.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jd_HomeWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jd_HomeWindowClosing(evt);
            }
        });
        jd_Home.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cloud_data-128.png"))); // NOI18N
        jButton3.setText("Base de Datos");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jd_Home.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 410, 150));

        jList1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jList1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jd_Home.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 240, 230));

        jl_escrituraArchvs.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jl_escrituraArchvs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jl_escrituraArchvsMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jl_escrituraArchvs);

        jd_Home.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, 190, 230));

        jl_lecturaArchvs.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jl_lecturaArchvs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jl_lecturaArchvsMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jl_lecturaArchvs);

        jd_Home.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 190, 230));

        jLabel15.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Mis Archivos");
        jd_Home.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jLabel31.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Lectura:");
        jd_Home.getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 190, -1));

        jLabel32.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Escritura:");
        jd_Home.getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, -1, -1));

        jLabel16.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Archivos Compartidos");
        jd_Home.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, -1, -1));

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/13-128.png"))); // NOI18N
        jButton4.setText("Editor de Texto");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jd_Home.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 410, 150));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jd_Home.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 60, 40));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/fish-blurred-background.jpg"))); // NOI18N
        jd_Home.getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1140, 60));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jd_Home.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 220, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/surface_gray_dark_light_shadow_18440_2048x1152.jpg"))); // NOI18N
        jd_Home.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 640));

        jMenuBar1.setBackground(new java.awt.Color(102, 0, 51));
        jMenuBar1.setForeground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N

        jMenu1.setText("Opciones");
        jMenu1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cog-24.png"))); // NOI18N
        jMenuItem1.setText("Bitacora");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/1-37-24.png"))); // NOI18N
        jMenuItem2.setText("Informacion de Perfil");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jd_Home.setJMenuBar(jMenuBar1);

        jd_Editor.setMaximumSize(new java.awt.Dimension(935, 700));
        jd_Editor.setMinimumSize(new java.awt.Dimension(935, 700));
        jd_Editor.setPreferredSize(new java.awt.Dimension(935, 700));
        jd_Editor.setSize(new java.awt.Dimension(935, 750));
        jd_Editor.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 100));

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
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 130, 50));

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
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 130, 50));

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

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/circle-question-mark-20 (1).png"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel30MouseExited(evt);
            }
        });
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 30, 40));

        jTabbedPane1.addTab("Home", jPanel3);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N

        jButton9.setBackground(new java.awt.Color(102, 102, 0));
        jButton9.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(51, 51, 0));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/floppy-128.png"))); // NOI18N
        jButton9.setText("Guardar");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(102, 102, 0));
        jButton16.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(51, 51, 0));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/docx_file_name_extension-64.png"))); // NOI18N
        jButton16.setText("Convertir");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(102, 102, 0));
        jButton17.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(51, 51, 0));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/68-64.png"))); // NOI18N
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

        jButton10.setBackground(new java.awt.Color(102, 102, 0));
        jButton10.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(51, 51, 0));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/64_web_hosting-64.png"))); // NOI18N
        jButton10.setText("FTP");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
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
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 65, Short.MAX_VALUE)
                    .addComponent(jLabel25)
                    .addGap(0, 66, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 65, Short.MAX_VALUE)
                    .addComponent(jLabel26)
                    .addGap(0, 66, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("File", jPanel2);

        jd_Editor.getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 170));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextArea1MouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTextArea1);
        jTextArea1.setLineWrap(true);

        jd_Editor.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 730, 460));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/transparent_rectangle_bg.png"))); // NOI18N
        jd_Editor.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 170));

        jd_Editor.getAccessibleContext().setAccessibleDescription("");

        jd_Permisos.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jd_PermisosWindowActivated(evt);
            }
        });
        jd_Permisos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setBackground(new java.awt.Color(153, 153, 0));
        jToggleButton1.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jToggleButton1.setText("Lectura y Escritura");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jd_Permisos.getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 320, 120));

        jToggleButton2.setBackground(new java.awt.Color(153, 153, 0));
        jToggleButton2.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jToggleButton2.setText("Lectura");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jd_Permisos.getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 320, 120));

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
        jd_Permisos.getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 340, 100));

        jComboBox2.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox2.setFont(new java.awt.Font("Sitka Subheading", 0, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jd_Permisos.getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 420, 70));

        jLabel22.setFont(new java.awt.Font("Sylfaen", 1, 60)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("P E R M I S O S");
        jd_Permisos.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 480, 90));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/surface_gray_dark_light_shadow_18440_2048x1152.jpg"))); // NOI18N
        jd_Permisos.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 170));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/fish-blurred-background.jpg"))); // NOI18N
        jd_Permisos.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 620));

        jd_Reporteria.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jd_ReporteriaWindowOpened(evt);
            }
        });
        jd_Reporteria.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setBackground(new java.awt.Color(102, 102, 102));
        jTable2.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        jTable2.setForeground(new java.awt.Color(204, 204, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "TAMANO", "FECHA", "OWNER"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(4);
        }

        jd_Reporteria.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 790, 470));

        jButton12.setBackground(new java.awt.Color(0, 102, 102));
        jButton12.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(204, 204, 204));
        jButton12.setText("GENERAR PDF");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jd_Reporteria.getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 340, 210, 130));

        jLabel29.setFont(new java.awt.Font("Sylfaen", 1, 80)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 104, 153));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cloud_data-128.png"))); // NOI18N
        jLabel29.setText(" R E P O R T E R Í A");
        jd_Reporteria.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 960, 160));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/start_background_1080p__windows_8__by_zaktech90-d5xn0lk.jpg"))); // NOI18N
        jd_Reporteria.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        jMenuItem6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/copy_2-24.png"))); // NOI18N
        jMenuItem6.setText("COPY");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cut-24.png"))); // NOI18N
        jMenuItem7.setText("CUT");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/paste_2-24.png"))); // NOI18N
        jMenuItem8.setText("PASTE");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem8);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/document-24.png"))); // NOI18N
        jMenuItem3.setText("Abrir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/docx_file_name_extension-24.png"))); // NOI18N
        jMenuItem4.setText("Convertir a doc");
        jPopupMenu2.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/68-24.png"))); // NOI18N
        jMenuItem5.setText("Permisos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem5);

        jd_Bitacora.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jd_BitacoraWindowActivated(evt);
            }
        });
        jd_Bitacora.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setBackground(new java.awt.Color(102, 102, 102));
        jTable3.setFont(new java.awt.Font("Sitka Subheading", 0, 18)); // NOI18N
        jTable3.setForeground(new java.awt.Color(204, 204, 204));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Usuario conectado", "10:10 p.m."},
                {"Segundo usuario conectado", "10:30 p.m."}
            },
            new String [] {
                "ACCIÓN", "HORA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable3);

        jd_Bitacora.getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 980, 440));

        jLabel34.setFont(new java.awt.Font("SimSun", 1, 90)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(178, 178, 0));
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cog-128 (1).png"))); // NOI18N
        jLabel34.setText(" B I T Á C O R A");
        jd_Bitacora.getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 990, 160));

        jLabel35.setBackground(new java.awt.Color(153, 153, 153));
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/kb4ds6lmyquh3cbp.jpg"))); // NOI18N
        jd_Bitacora.getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 690));

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
        jButton2.setContentAreaFilled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 110, 100));

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
        if(conectados == null){
            conectados = new ArrayList<>();
            System.out.println("SII");
        }
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
                    System.out.println(id + " " + nombre + "CONECTADO ");
                    jLabel19.setText(id + "");
                    jLabel20.setText(nombre + " " + apellido);
                    //con.close();
                    this.setVisible(false);
                    jd_Home.pack();
                    //jDialog1.setModal(true);
                    jd_Home.setVisible(true);
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
        jLabel27.setText("");
        jTextArea1.setText("");
        jTabbedPane1.setVisible(true);
        jTextArea1.setEditable(true);
        jd_Editor.pack();
        jd_Editor.setModal(true);
        jd_Editor.setVisible(true);
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
            jTextArea1.setFont(new Font(jTextArea1.getFont().getFontName(), Font.PLAIN, fs));
        }
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        int fs = jTextArea1.getFont().getSize() + 1;
        if (fs >= 1) {
            jTextArea1.setFont(new Font(jTextArea1.getFont().getFontName(), Font.PLAIN, fs));

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
        FontStyle(font);
    }//GEN-LAST:event_jComboBox1ActionPerformed

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

    private void jd_PermisosWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jd_PermisosWindowActivated
        try {
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from usuario");
            while (rs.next()) {
                String q = rs.getInt("idusuario") + "-" + rs.getString("nombre") + " " + rs.getString("apellido");
                System.out.println(q);
                if (rs.getInt("idusuario") != Integer.parseInt(jLabel19.getText())) {
                    modelo.addElement(q);
                }
            }
            jComboBox2.setModel(modelo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jd_PermisosWindowActivated

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
        jd_Permisos.pack();
        jd_Permisos.setModal(true);
        jd_Permisos.setVisible(true);
    }//GEN-LAST:event_jButton17MouseClicked

    private void jButton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseClicked
        boolean existente = false;
        if (jLabel28.getText() == "") {
            Guardar();
        }
        int permi = 1;
        boolean escogido = false;
        if (jToggleButton2.isSelected()) {
            escogido = true;
            permi = 1;
        } else if (jToggleButton1.isSelected()) {
            escogido = true;
            permi = 2;
        }
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) jComboBox2.getModel();
        String pp = (String) modelo.getSelectedItem();
        String[] persona = pp.split("-");

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        int idusuario = (Integer.parseInt(persona[0]));
        int idarchivo = Integer.parseInt(jLabel28.getText());
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
            st = con.createStatement();
            rs = st.executeQuery("select * from permiso");
            while (rs.next()) {
                if ((rs.getInt("usuario_idusuario") == idusuario)
                        && ((rs.getInt("archivo_idarchivo") == idarchivo))) {
                    existente = true;
                    System.out.println("ENTRO A CONDICION PERMISO EXISTENTE");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (existente) {
            try {
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
                st = con.createStatement();
                String query = "UPDATE permiso SET permiso = '" + permi
                        + "' WHERE (usuario_idusuario= '" + idusuario
                        + "' AND archivo_idarchivo= '" + idarchivo + "')";
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Se ha actualizado el permiso");
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error en almacenamiento");
            }
        } else {
            try {
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
                st = con.createStatement();

                if (escogido) {
                    String Query = "insert into permiso "
                            + "(permiso, usuario_idusuario, archivo_idarchivo)"
                            + "values ('" + permi + "', '" + idusuario + "', '" + idarchivo + "')";
                    System.out.println(Query);
                    st.executeUpdate(Query);
                } else {
                    JOptionPane.showMessageDialog(this, "Error, seleccione una opcion");
                }
                JOptionPane.showMessageDialog(this, "Se ha creado el permiso");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error en almacenamiento");
            }
        }
        jToggleButton2.setSelected(false);
        jToggleButton1.setSelected(false);
    }//GEN-LAST:event_jButton18MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        Guardar();
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
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File("C:\\Users\\Admin\\Editor-de-Texto-Multiusuario\\TextoMultiusuario\\src"));
            int retrival = chooser.showSaveDialog(null);
            if (retrival == JFileChooser.APPROVE_OPTION) {
                //Document document = new Document(PageSize.A4.rotate(), 10,15,10,15);
                Document document = new Document();
                PdfWriter writer;
                File file = new File(chooser.getSelectedFile() + ".pdf");
                //file.mkdirs(); //!wrong  
                file.getParentFile().mkdirs();//!correct
                if (!file.exists()) {
                    file.createNewFile();
                }
                writer = PdfWriter.getInstance(document, new FileOutputStream(file.getPath()));
                // writer = PdfWriter.getInstance(document, new
                // FileOutputStream("my_jtable_fonts.pdf"));
                document.open();

                PdfContentByte cb = writer.getDirectContent();

                cb.beginText();

                BaseFont bf = BaseFont.createFont(BaseFont.TIMES_ROMAN, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
                cb.setFontAndSize(bf, 22);
                //cb.showTextAligned(PdfContentByte.ALIGN_CENTER, "REPORTE DE ARCHIVOS EN LA BASE DE DATOS", 250, 700, 0);
                DefaultTableModel mod = (DefaultTableModel) jTable2.getModel();
                cb.showTextAligned(PdfContentByte.ALIGN_CENTER, "Reporte de Archivos en la Base de Datos", 300, 750, 0);
                cb.setFontAndSize(bf, 16);
                cb.showTextAligned(PdfContentByte.ALIGN_LEFT, mod.getColumnName(0) + "---------------------------"
                        + mod.getColumnName(1) + "-----------------"
                        + mod.getColumnName(2) + "-----------------"
                        + mod.getColumnName(3) + "-----", 10, 710, 0);
                cb.endText();

                PdfTemplate tp = cb.createTemplate(560, 500);
                Graphics2D g2;

                g2 = tp.createGraphicsShapes(560, 500);
                        //.scaleToFit(400,240);

                // g2 = tp.createGraphics(500, 500);
                jTable2.print(g2);
                g2.dispose();
                cb.addTemplate(tp, 10, 200);

                // step 5: we close the document
                document.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        jd_Reporteria.pack();
        jd_Reporteria.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // ABRIR ARCHIVO
        ResultSet rs = null;
        Statement st = null;
        Connection con = null;
        JList jlis = null;
        if (numeroLista == 1) {
            jlis = jList1;
        } else if (numeroLista == 2) {
            jlis = jl_lecturaArchvs;
        } else {
            jlis = jl_escrituraArchvs;
        }
        try {
            if (jlis.getSelectedIndex() != -1) {
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
                st = con.createStatement();

                String[] persona = ((String) jlis.getSelectedValue()).split("-");
                int idarchv = (Integer.parseInt(persona[0]));
                String XMLA;
                try {
                    rs = st.executeQuery("SELECT * FROM archivo WHERE idarchivo='" + idarchv + "'");
                    rs.next();
                    XMLA = rs.getString("contenido");
                } catch (Exception e) {
                    XMLA = "ERROR EXTRAYENDO XML";
                    System.err.printf(XMLA, e);
                }
                Archivo arch = new Archivo();
                arch = arch.DeserielizarXml(XMLA);
                System.out.println(arch.ID);
                jLabel28.setText(arch.ID + "");
                jLabel27.setText(arch.Nombre);
                jTextArea1.setText("");
                if (arch.Contenido != null) {
                    for (int i = 0; i < arch.Contenido.size(); i++) {
                        jTextArea1.append(((Bloque) arch.Contenido.get(i)).contenido + "\n");
                    }
                }
                String[] form = arch.formato.split(";");
                jTextArea1.setFont(new Font(jTextArea1.getFont().getFontName(), Font.PLAIN, Integer.parseInt(form[0])));
                FontStyle(form[1]);
                jd_Editor.pack();
                jd_Editor.setModal(true);
                jd_Editor.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Error!\n Seleccionar archivo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error no se ha encontrado el registro");
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jList1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseReleased
        numeroLista = 1;
        if (evt.isPopupTrigger()) {
            jPopupMenu2.show(jList1, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jList1MouseReleased

    private void jd_HomeWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jd_HomeWindowActivated
        DefaultListModel dtm = new DefaultListModel();
        jList1.setModel(dtm);
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from archivo WHERE usuario_idusuario=" + Integer.parseInt(jLabel19.getText()));
            String nombre, contenido, formato, directorio;
            int id, iduser;
            String q;
            while (rs.next()) {
                q = rs.getInt("idarchivo") + "-" + rs.getString("nombre");
                System.out.println(q);
                dtm.addElement(q);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        DefaultListModel dtml = new DefaultListModel();
        jl_lecturaArchvs.setModel(dtml);

        DefaultListModel dtme = new DefaultListModel();
        jl_escrituraArchvs.setModel(dtme);
        String q;
        try {
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
            Statement stt = conn.createStatement();
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from permiso WHERE usuario_idusuario=" + Integer.parseInt(jLabel19.getText()));
            ResultSet rss;
            int id1, idarch1;
            while (rs.next()) {
                id1 = rs.getInt("permiso");
                idarch1 = rs.getInt("archivo_idarchivo");
                rss = stt.executeQuery("select * from archivo WHERE idarchivo=" + idarch1);
                while (rss.next()) {
                    q = rss.getInt("idarchivo") + "-" + rss.getString("nombre");
                    if (id1 == 1) {
                        dtml.addElement(q);
                    } else if (id1 == 2) {
                        dtme.addElement(q);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jd_HomeWindowActivated

    private void jd_HomeWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jd_HomeWindowClosing
        int id = Integer.parseInt(jLabel19.getText());
        int num = 0;
        for (int i = 0; i < conectados.size(); i++) {
            System.out.println(((Usuario) conectados.get(i)).getId() + " = " + id);
            if (((Usuario) conectados.get(i)).getId() == id) {
                JOptionPane.showMessageDialog(this, ((Usuario) conectados.get(i)).nombre + " ha cerrado sesion");
                conectados.remove(i);
                num = i;
            }
        }
        //conectados.remove(num);
        this.pack();
        this.setVisible(true);
    }//GEN-LAST:event_jd_HomeWindowClosing

    private void jLabel30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseEntered

    }//GEN-LAST:event_jLabel30MouseEntered

    private void jLabel30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseExited

    }//GEN-LAST:event_jLabel30MouseExited

    private void jd_BitacoraWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jd_BitacoraWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_jd_BitacoraWindowActivated

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jd_Bitacora.pack();
        jd_Bitacora.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ResultSet rs = null;
        Statement st = null;
        Connection con = null;
        JList jlis = new JList();
        if (numeroLista == 1) {
            jlis = jList1;
        } else if (numeroLista == 2) {
            jlis = jl_lecturaArchvs;
        } else {
            jlis = jl_escrituraArchvs;
        }
        try {
            if (jlis.getSelectedIndex() != -1) {
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
                st = con.createStatement();
                String[] persona = ((String) jlis.getSelectedValue()).split("-");
                int idarchv = (Integer.parseInt(persona[0]));
                String XMLA;
                try {
                    rs = st.executeQuery("SELECT * FROM archivo WHERE idarchivo='" + idarchv + "'");
                    rs.next();
                    XMLA = rs.getString("contenido");
                } catch (Exception e) {
                    XMLA = "ERROR EXTRAYENDO XML";
                    System.err.printf(XMLA, e);
                }
                Archivo arch = new Archivo();
                arch = arch.DeserielizarXml(XMLA);
                jLabel28.setText(arch.ID + "");
                jLabel27.setText(arch.Nombre);
                jTextArea1.setText("");
                jd_Permisos.pack();
                jd_Permisos.setModal(true);
                jd_Permisos.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Error!\n Seleccionar archivo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error no se ha encontrado el registro");

        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jl_lecturaArchvsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_lecturaArchvsMouseReleased
        numeroLista = 2;
        jTabbedPane1.setVisible(false);
        jTextArea1.setEditable(false);
        if (evt.isPopupTrigger()) {
            jPopupMenu2.show(jl_lecturaArchvs, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jl_lecturaArchvsMouseReleased

    private void jl_escrituraArchvsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_escrituraArchvsMouseReleased
        numeroLista = 3;
        jTabbedPane1.setVisible(true);
        jTextArea1.setEditable(true);
        if (evt.isPopupTrigger()) {
            jPopupMenu2.show(jl_escrituraArchvs, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jl_escrituraArchvsMouseReleased

    private void jd_ReporteriaWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jd_ReporteriaWindowOpened
        DefaultTableModel dtm = new DefaultTableModel();
        String[] ss = {"ID", "NOMBRE", "TAMANO", "FECHA", "OWNER"};

        dtm.setColumnIdentifiers(ss);
        jTable2.setModel(dtm);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(jTable2.getModel());
        jTable2.setRowSorter(sorter);
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
        sortKeys.add(new RowSorter.SortKey(3, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from archivo");
            String nombre, contenido, fecha;
            int id, iduser, size;
            while (rs.next()) {
                id = rs.getInt("idarchivo");
                iduser = rs.getInt("usuario_idusuario");
                nombre = rs.getString("nombre");
                contenido = rs.getString("contenido");
                fecha = rs.getString("fecha");
                byte[] b = contenido.getBytes("UTF-8");
                size = b.length;
                dtm.addRow(new Object[]{id, nombre, size, fecha, iduser});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jd_ReporteriaWindowOpened

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        try {
            FtpEnvio();
        } catch (UnknownHostException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10MouseClicked

    private void jTextArea1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseReleased
        if (evt.isPopupTrigger()) {
            jPopupMenu1.show(jTextArea1, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTextArea1MouseReleased

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        jTextArea1.copy();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        jTextArea1.cut();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        jTextArea1.paste();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
       newWordDoc();
    }//GEN-LAST:event_jButton16MouseClicked

    
    
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JDialog jd_Bitacora;
    private javax.swing.JDialog jd_Editor;
    private javax.swing.JDialog jd_Home;
    private javax.swing.JDialog jd_Permisos;
    private javax.swing.JDialog jd_Reporteria;
    private javax.swing.JList jl_escrituraArchvs;
    private javax.swing.JList jl_lecturaArchvs;
    // End of variables declaration//GEN-END:variables

    public void Guardar() {
        boolean pase = false;
        //if(jLabel28.getText()!= null)
        ResultSet rs = null;
        Statement st = null;
        Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datab", "root", "qwaszx12");
            st = con.createStatement();
            int permi = 1;
            String nombre_archivo = null;

            if (jLabel28.getText().equals("")) {
                nombre_archivo = JOptionPane.showInputDialog("Ingrese el nombre del documento: ");
                int idarchv;
                try {
                    rs = st.executeQuery("SELECT * FROM archivo WHERE idarchivo=(SELECT MAX(idarchivo) FROM archivo)");
                    rs.next();
                    idarchv = rs.getInt("idarchivo") + 1;
                } catch (Exception e) {
                    idarchv = 1;
                }
                String[] bb = jTextArea1.getText().split("\n");
                ArrayList<Bloque> bloqs = new ArrayList<>();

                for (int i = 0; i < bb.length; i++) {
                    bloqs.add(new Bloque(bb[i]));
                }
                String forma = jTextArea1.getFont().getSize() + ";"
                        + (String) jComboBox1.getSelectedItem();
                String dateString = null;

                Date todaysDate = new Date();
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                String testDateString = df.format(todaysDate);

                Archivo arch = new Archivo(
                        idarchv,
                        Integer.parseInt(jLabel19.getText()),
                        nombre_archivo,
                        bloqs,
                        forma,
                        testDateString);

                String xml = arch.SerielizarXml(arch);
                DefaultComboBoxModel modelo = (DefaultComboBoxModel) jComboBox2.getModel();
                String[] persona = ((String) modelo.getSelectedItem()).split(".");
                String Query = "insert into archivo "
                        + "(idarchivo, usuario_idusuario, nombre, contenido, formato, fecha) "
                        + "values ('" + idarchv + "', '" + arch.user
                        + "', '" + nombre_archivo + "', '" + xml
                        + "', '" + forma + "', '" + testDateString + "')";
                st.executeUpdate(Query);
                jLabel28.setText(idarchv + "");
                jLabel27.setText(nombre_archivo);
            } else {
                String idarchv = jLabel28.getText();
                String XMLA;
                try {
                    rs = st.executeQuery("SELECT * FROM archivo WHERE idarchivo='" + idarchv + "'");
                    rs.next();
                    XMLA = rs.getString("contenido");
                } catch (Exception e) {
                    XMLA = "ERROR EXTRAYENDO XML";
                    System.err.printf(XMLA, e);
                }
                Archivo nuevo = new Archivo();
                nuevo = nuevo.DeserielizarXml(XMLA);
                String[] bb = jTextArea1.getText().split("\n");
                ArrayList<Bloque> bloqs = new ArrayList<>();
                for (int i = 0; i < bb.length; i++) {
                    bloqs.add(new Bloque(bb[i]));
                }
                nuevo.setContenido(bloqs);
                String forma = jTextArea1.getFont().getSize() + ";"
                        + (String) jComboBox1.getSelectedItem();
                String query = "UPDATE archivo SET contenido = '" + (nuevo.SerielizarXml(nuevo))
                        + "', formato = '" + forma + "' WHERE idarchivo= " + idarchv + "";
                st.executeUpdate(query);
            }

            pase = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        if (pase == false) {
            JOptionPane.showMessageDialog(this, "Error en almacenamiento");
        } else {
            JOptionPane.showMessageDialog(this, "Se ha almacenado el archivo");
        }
    }

    public void FtpEnvio() throws SocketException, UnknownHostException, IOException {
        try {
            String server = "ftp://ftp.webbpa.com";
            String username = "UsuarioOA@webbpa.com";
            String password = "Seccion25";

            FTPClient ftpClient = new FTPClient();
            ftpClient.connect(InetAddress.getByName(server));
            ftpClient.login(username, password);

            //Verificar conexión con el servidor.
            int reply = ftpClient.getReplyCode();
            System.out.println("Respuesta recibida de conexión FTP:" + reply);

            if (FTPReply.isPositiveCompletion(reply)) {
                System.out.println("Conectado Satisfactoriamente");
            } else {
                System.out.println("Imposible conectarse al servidor");
            }

            //Verificar si se cambia de direcotirio de trabajo
            ftpClient.changeWorkingDirectory("/");//Cambiar directorio de trabajo
            System.out.println("Se cambió satisfactoriamente el directorio");

            //Activar que se envie cualquier tipo de archivo
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            BufferedInputStream buffIn = null;
            buffIn = new BufferedInputStream(new FileInputStream(""));//Ruta del archivo para enviar
            ftpClient.enterLocalPassiveMode();
            ftpClient.storeFile("", buffIn);//Ruta completa de alojamiento en el FTP

            buffIn.close(); //Cerrar envio de arcivos al FTP
            ftpClient.logout(); //Cerrar sesión
            ftpClient.disconnect();//Desconectarse del servidor
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Algo malo sucedió");
        }
    }

    public void FTPfunctionListar() {
        String server = "ftp://ftp.webbpa.com";
        String username = "UsuarioOA@webbpa.com";
        String password = "Seccion25";

        // Cliente de conexion a FTP
        FTPClient ftp = new FTPClient();

        int respuesta, i;
        String[] lista;

        try {
            System.out.println("CONECTANDO AL SERVIDOR FTP");
            // Conectando e identificandose con el servidos
            ftp.connect(server);
            ftp.login(username, password);
            // Entrando a modo pasivo
            ftp.enterLocalPassiveMode();

            // Obteniendo respuesta del servidos
            respuesta = ftp.getReplyCode();
            System.out.println("RESPUESTA " + respuesta);
            // Si la respuesta del servidor indica podemos pasar procedemos 
            if (FTPReply.isPositiveCompletion(respuesta) == true) {
                System.out.println("LISTANDO ARCHIVOS");
                lista = ftp.listNames();

                for (i = 0; i < lista.length; i++) {

                    System.out.println(lista[i]);
                }
                // Si no avisamos
            } else {
                System.out.println("ERROR DE CONEXION");
            }

            // en ambos casos terminaos sesion
            ftp.logout();
            // Y nos desconectamos
            ftp.disconnect();

            // Esta excepcion se lanza en caso de algun error durante el proceso 
        } catch (IOException e) {
            System.out.println("ERROR DE CONEXION");
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

    public void FontStyle(String font) {
        switch (font) {
            case "Arial":
                jTextArea1.setFont(new Font("Arial", Font.PLAIN, jTextArea1.getFont().getSize()));
                break;
            case "Times New Roman":
                jTextArea1.setFont(new Font("Times New Roman", Font.PLAIN, jTextArea1.getFont().getSize()));
                break;
            case "Copperplate":
                jTextArea1.setFont(new Font("Copperplate", Font.PLAIN, jTextArea1.getFont().getSize()));
                break;
            case "Serif":
                jTextArea1.setFont(new Font("Serif", Font.PLAIN, jTextArea1.getFont().getSize()));
                break;
            case "Verdana":
                jTextArea1.setFont(new Font("Verdana", Font.PLAIN, jTextArea1.getFont().getSize()));
                break;
        }
    }

    public void newWordDoc() {
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File("C:\\Users\\Admin\\Editor-de-Texto-Multiusuario\\TextoMultiusuario\\src"));
            int retrival = chooser.showSaveDialog(null);
            if (retrival == JFileChooser.APPROVE_OPTION) {
                XWPFDocument document = new XWPFDocument();
                XWPFParagraph tmpParagraph = document.createParagraph();
                XWPFRun tmpRun = tmpParagraph.createRun();
                String[] content = jTextArea1.getText().split("\n");
                for (int i = 0; i < content.length; i++) {
                    tmpRun.setText(content[i]);
                }
                tmpRun.setFontSize(18);
                FileOutputStream fos = new FileOutputStream(new File(chooser.getSelectedFile()+".doc"));
                document.write(fos);
                fos.close();
                JOptionPane.showMessageDialog(this, "Se ha creado el Documento (.doc) exitosamente");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    ArrayList<Usuario> conectados;
    ArrayList<Bloque> bloques;
    UndoManager undo = new UndoManager();
    Usuario AdminUsuario;
    int numeroLista;
}
