/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import Koneksi.*;
import javax.swing.JOptionPane;
import Koneksi.koneksi;
import Koneksi.koneksi;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import static java.time.zone.ZoneRulesProvider.refresh;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Lihat extends javax.swing.JFrame {
    Koneksi.koneksi k = new koneksi();
   
 int index_baris;
 Connection con;

 
    /**
     * Creates new form Lihat
     */
    private DefaultTableModel tabeldokumen;
    
    public Lihat() {
  initComponents();
        
        k.koneksi();
        con=k.con;
        
       tabeldokumen = new DefaultTableModel() ;
tabel.setModel(tabeldokumen);

tabeldokumen.addColumn("Kode");
tabeldokumen.addColumn("Nama");
tabeldokumen.addColumn("Kategori");
tabeldokumen.addColumn("LokasiDokumen");
tabeldokumen.addColumn("Deskripsi");
tabeldokumen.addColumn("Tanggal");


 Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnTampilkan = new javax.swing.JButton();
        kode = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        kategori = new javax.swing.JComboBox();
        lokasi = new javax.swing.JTextField();
        pilih = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        deskripsi = new javax.swing.JTextArea();
        tanggal = new com.toedter.calendar.JDateChooser();
        btnHapus = new javax.swing.JToggleButton();
        btnEdit = new javax.swing.JToggleButton();
        txtcari = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnkeluar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnLihat = new javax.swing.JButton();
        labelLihat = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        labelhome1 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        Jlabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(249, 252, 250));
        jPanel1.setMinimumSize(new java.awt.Dimension(920, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(920, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(34, 50, 91));
        jLabel1.setFont(new java.awt.Font("Meiryo UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 50, 91));
        jLabel1.setText("Lihat Data");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        tabel.setAutoCreateRowSorter(true);
        tabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tabel.setRowHeight(26);
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 410, 250));

        btnTampilkan.setText("Tampilkan");
        btnTampilkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilkanActionPerformed(evt);
            }
        });
        jPanel1.add(btnTampilkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 90, 30));
        jPanel1.add(kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 200, 30));
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 200, 30));

        kategori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Resmi", "Pribadi" }));
        kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriActionPerformed(evt);
            }
        });
        jPanel1.add(kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 110, 30));
        jPanel1.add(lokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 60, 30));

        pilih.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        pilih.setText("Browser");
        pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihActionPerformed(evt);
            }
        });
        jPanel1.add(pilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 50, 30));

        deskripsi.setColumns(20);
        deskripsi.setRows(5);
        jScrollPane2.setViewportView(deskripsi);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 200, 70));
        jPanel1.add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 110, 30));

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 90, 30));

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 90, 30));

        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        jPanel1.add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 150, 30));

        btncari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarr/car.png"))); // NOI18N
        btncari.setContentAreaFilled(false);
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        jPanel1.add(btncari, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 40, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tanggal");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Kode Dokumen");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nama Dokumen");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Kategori");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Lokasi Dokumen");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Deskripsi");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Kode Dokumen");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarr/Untitled-1.png"))); // NOI18N
        btnClose.setBorder(null);
        btnClose.setContentAreaFilled(false);
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 50, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 820, 520));

        jPanel2.setBackground(new java.awt.Color(34, 50, 91));
        jPanel2.setInheritsPopupMenu(true);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnkeluar.setBackground(new java.awt.Color(255, 255, 255));
        btnkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarr/Logout_37127.png"))); // NOI18N
        btnkeluar.setBorder(null);
        btnkeluar.setBorderPainted(false);
        btnkeluar.setContentAreaFilled(false);
        btnkeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnkeluar.setMaximumSize(new java.awt.Dimension(250, 261));
        btnkeluar.setMinimumSize(new java.awt.Dimension(250, 261));
        btnkeluar.setPreferredSize(new java.awt.Dimension(250, 261));
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        jPanel2.add(btnkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 40, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Logout");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        btnLihat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarr/folder.png"))); // NOI18N
        btnLihat.setBorder(null);
        btnLihat.setContentAreaFilled(false);
        btnLihat.setMaximumSize(new java.awt.Dimension(250, 261));
        btnLihat.setMinimumSize(new java.awt.Dimension(250, 261));
        btnLihat.setPreferredSize(new java.awt.Dimension(250, 2611));
        btnLihat.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarr/Home.png"))); // NOI18N
        btnLihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatActionPerformed(evt);
            }
        });
        jPanel2.add(btnLihat, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 50, 50));

        labelLihat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLihat.setForeground(new java.awt.Color(255, 255, 255));
        labelLihat.setText("Lihat Data");
        labelLihat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLihatMouseClicked(evt);
            }
        });
        jPanel2.add(labelLihat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 70, -1));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarr/Home.png"))); // NOI18N
        btnHome.setBorder(null);
        btnHome.setContentAreaFilled(false);
        btnHome.setMaximumSize(new java.awt.Dimension(250, 261));
        btnHome.setMinimumSize(new java.awt.Dimension(250, 261));
        btnHome.setPreferredSize(new java.awt.Dimension(250, 2611));
        btnHome.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarr/Home.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 50, 50));

        labelhome1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelhome1.setForeground(new java.awt.Color(255, 255, 255));
        labelhome1.setText("Home");
        labelhome1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelhome1MouseClicked(evt);
            }
        });
        jPanel2.add(labelhome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 70, 40, -1));

        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarr/tambah.png"))); // NOI18N
        btnTambah.setBorder(null);
        btnTambah.setContentAreaFilled(false);
        btnTambah.setMaximumSize(new java.awt.Dimension(250, 261));
        btnTambah.setMinimumSize(new java.awt.Dimension(250, 261));
        btnTambah.setPreferredSize(new java.awt.Dimension(250, 2611));
        btnTambah.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarr/Home.png"))); // NOI18N
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        jPanel2.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 50, 50));

        Jlabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Jlabel2.setForeground(new java.awt.Color(255, 255, 255));
        Jlabel2.setText("Tambah Data");
        Jlabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jlabel2MouseClicked(evt);
            }
        });
        jPanel2.add(Jlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 90, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        new Login().show();
        dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new Login().show();
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void labelLihatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLihatMouseClicked
        // TODO add your handling code here:
        new Lihat().show();
        dispose();
    }//GEN-LAST:event_labelLihatMouseClicked

    private void labelhome1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelhome1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelhome1MouseClicked

    private void Jlabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jlabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Jlabel2MouseClicked

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:

     int r = tabel.getSelectedRow();
     if (r != -1){
     int kode = Integer.parseInt(tabel.getValueAt(r, 0).toString());
     String nama = tabel.getValueAt(r, 1).toString();
     String kategori = tabel.getValueAt(r, 2).toString();
     String lokasi = tabel.getValueAt(r, 3).toString();
     String deskripsi = tabel.getValueAt(r, 4).toString();
     String tanggal = tabel.getValueAt(r, 5).toString();
     this.nama.setText(nama);
     this.kategori.setSelectedItem(kategori);
     this.lokasi.setText(lokasi);
     this.deskripsi.setText(deskripsi);
     index_baris = r;}
    }//GEN-LAST:event_tabelMouseClicked

    private void btnTampilkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilkanActionPerformed
        // TODO add your handling code here:
        tabeldokumen.getDataVector().removeAllElements();//untuk mengkosongkan isi tabel di form
        tabeldokumen.fireTableDataChanged();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/luthfiel", "root", "");
            Statement statement = connection.createStatement();
            String sql = "select * from arsip_dokumen order by kode";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                Object [] o = new Object[6];
                o[0] = rs.getString("kode");
                o[1] = rs.getString("nama");
                o[2] = rs.getString("kategori");
                o[3] = rs.getString("lokasi");
                o[4] = rs.getString("deskripsi");
                o[5] = rs.getString("tanggal");
                tabeldokumen.addRow(o);
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal koneksi "+e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lihat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTampilkanActionPerformed

    private void kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kategoriActionPerformed

    private void pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihActionPerformed
        // TODO add your handling code here:

        // TODO add your handling code here:
        JFileChooser OpenFile = new JFileChooser();
        OpenFile.showOpenDialog(null);
        File x_file = OpenFile.getSelectedFile();
        String NamaFile = x_file.getAbsolutePath();
        lokasi.setText(NamaFile);
    }//GEN-LAST:event_pilihActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
           // TODO add your handling code here:
        
int pilihan = JOptionPane.showConfirmDialog(this, ""
            +"Apakah anda yakin ingin menghapus data ini?", "komfirmasi",
            JOptionPane.YES_NO_CANCEL_OPTION);
        if (pilihan ==0) {
            tabeldokumen.removeRow(index_baris);
            refresh();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        
        String tampilan ="yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(this.tanggal.getDate()));

        if(kode.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Lengkapi data");
        }else{
         try{
             Class.forName("com.mysql.jdbc.Driver");
               Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/luthfiel", "root", "");
                Statement statement = connection.createStatement();
                String sql="UPDATE arsip_dokumen set "
                + "nama='"+this.nama.getText()+"',kategori='"+this.kategori.getSelectedItem()
                +"',lokasi='"+lokasi.getText()+"',deskripsi='"+this.deskripsi.getText()
                +"',tanggal='"+this.tanggal+"' WHERE kode='"+this.kode.getText()+"'";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null,"Berhasil Update Data");
        kosong();       
    }catch(SQLException e){
         JOptionPane.showMessageDialog(this, "GAGAL \n"+e.getMessage());
    }    catch (ClassNotFoundException ex) {
             Logger.getLogger(Lihat.class.getName()).log(Level.SEVERE, null, ex);
         }
         kosong();   
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed

        String Cari=txtcari.getText();
        tabeldokumen.getDataVector().removeAllElements();
        tabeldokumen.fireTableDataChanged();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/luthfiel", "root", "");
            Statement statement = connection.createStatement();
            String sql = "select * from arsip_dokumen WHERE kode like'"+Cari+"'OR nama like'"+Cari+"%'OR kategori like'"
                    +Cari+"%';";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                Object [] o = new Object[6];
                o[0] = rs.getString("kode");
                o[1] = rs.getString("Nama");
                o[2] = rs.getString("Kategori");
                o[3] = rs.getString("Lokasi");
                o[4] = rs.getString("Deskripsi");
                o[5] = rs.getString("Tanggal");
                tabeldokumen.addRow(o);
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal koneksi "+e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lihat.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btncariActionPerformed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        new Home().show();
        dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        new HALAMAN_TAMBAH().show();
        dispose();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnLihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatActionPerformed
        // TODO add your handling code here:
        new Lihat().show();
        dispose();
    }//GEN-LAST:event_btnLihatActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null,
            "Apakah anda akan menutup system?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCloseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lihat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lihat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lihat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lihat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lihat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel2;
    private javax.swing.JButton btnClose;
    private javax.swing.JToggleButton btnEdit;
    private javax.swing.JToggleButton btnHapus;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLihat;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTampilkan;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JTextArea deskripsi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox kategori;
    private javax.swing.JTextField kode;
    private javax.swing.JLabel labelLihat;
    private javax.swing.JLabel labelhome1;
    private javax.swing.JTextField lokasi;
    private javax.swing.JTextField nama;
    private javax.swing.JToggleButton pilih;
    private javax.swing.JTable tabel;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
    private void kosong(){
        this.kode.setText(null);
        this.nama.setText(null);
        this.kategori.setSelectedItem(this);
        lokasi.setText(null);
        deskripsi.setText(null);  
        this.tanggal.setDateFormatString("");
    }





}
