/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibookingtiket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class KursiStudioTB extends javax.swing.JFrame {
     public String film;
     public int pil;
     public javax.swing.JButton buttongodzilla;
     public javax.swing.JButton buttonthebox;
     public javax.swing.JButton buttonnerve;
     public String kursi;
     int harga, hasil, jumlah, uang, kembali;
     int jmlkursi;

    /**
     * Creates new form KursiStudioTB
     */
    public KursiStudioTB() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        buttonnext1 = new javax.swing.JButton();
        buttonback1 = new javax.swing.JButton();
        checkbox_b6 = new javax.swing.JCheckBox();
        checkbox_b5 = new javax.swing.JCheckBox();
        checkbox_b4 = new javax.swing.JCheckBox();
        checkbox_b2 = new javax.swing.JCheckBox();
        checkbox_b3 = new javax.swing.JCheckBox();
        checkbox_b1 = new javax.swing.JCheckBox();
        checkbox_a6 = new javax.swing.JCheckBox();
        checkbox_a5 = new javax.swing.JCheckBox();
        checkbox_a3 = new javax.swing.JCheckBox();
        checkbox_a4 = new javax.swing.JCheckBox();
        checkbox_a2 = new javax.swing.JCheckBox();
        checkbox_a1 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tf_namafilm = new javax.swing.JTextField();
        cb_hari = new javax.swing.JComboBox<>();
        tf_nokursi = new javax.swing.JTextField();
        tf_jam = new javax.swing.JTextField();
        tf_harga = new javax.swing.JTextField();
        tf_uangbyr = new javax.swing.JTextField();
        tf_uangkembali = new javax.swing.JTextField();
        buttonreset1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tf_jmltiket = new javax.swing.JTextField();
        judul6 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(70, 130, 180));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Imprint MT Shadow", 0, 50)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("STUDIO ");

        buttonnext1.setBackground(new java.awt.Color(255, 255, 255));
        buttonnext1.setText("BOOK");
        buttonnext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonnext1ActionPerformed(evt);
            }
        });

        buttonback1.setBackground(new java.awt.Color(255, 255, 255));
        buttonback1.setText("BACK");
        buttonback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonback1ActionPerformed(evt);
            }
        });

        checkbox_b6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkbox_b6.setForeground(new java.awt.Color(255, 255, 255));
        checkbox_b6.setText("B6");
        checkbox_b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_b6ActionPerformed(evt);
            }
        });

        checkbox_b5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkbox_b5.setForeground(new java.awt.Color(255, 255, 255));
        checkbox_b5.setText("B5");
        checkbox_b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_b5ActionPerformed(evt);
            }
        });

        checkbox_b4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkbox_b4.setForeground(new java.awt.Color(255, 255, 255));
        checkbox_b4.setText(" B4");
        checkbox_b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_b4ActionPerformed(evt);
            }
        });

        checkbox_b2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkbox_b2.setForeground(new java.awt.Color(255, 255, 255));
        checkbox_b2.setText(" B2");
        checkbox_b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_b2ActionPerformed(evt);
            }
        });

        checkbox_b3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkbox_b3.setForeground(new java.awt.Color(255, 255, 255));
        checkbox_b3.setText(" B3");
        checkbox_b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_b3ActionPerformed(evt);
            }
        });

        checkbox_b1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkbox_b1.setForeground(new java.awt.Color(255, 255, 255));
        checkbox_b1.setText(" B1");
        checkbox_b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_b1ActionPerformed(evt);
            }
        });

        checkbox_a6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkbox_a6.setForeground(new java.awt.Color(255, 255, 255));
        checkbox_a6.setText(" A6");
        checkbox_a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_a6ActionPerformed(evt);
            }
        });

        checkbox_a5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkbox_a5.setForeground(new java.awt.Color(255, 255, 255));
        checkbox_a5.setText(" A5");
        checkbox_a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_a5ActionPerformed(evt);
            }
        });

        checkbox_a3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkbox_a3.setForeground(new java.awt.Color(255, 255, 255));
        checkbox_a3.setText(" A3");
        checkbox_a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_a3ActionPerformed(evt);
            }
        });

        checkbox_a4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkbox_a4.setForeground(new java.awt.Color(255, 255, 255));
        checkbox_a4.setText(" A4");
        checkbox_a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_a4ActionPerformed(evt);
            }
        });

        checkbox_a2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkbox_a2.setForeground(new java.awt.Color(255, 255, 255));
        checkbox_a2.setText(" A2");
        checkbox_a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_a2ActionPerformed(evt);
            }
        });

        checkbox_a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkbox_a1.setForeground(new java.awt.Color(255, 255, 255));
        checkbox_a1.setText(" A1");
        checkbox_a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_a1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel12.setText("Nama Film");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel13.setText("Hari");

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel14.setText("Jam");

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel15.setText("Nomor Kursi");

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel16.setText("Jumlah Tiket");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel17.setText("Harga");

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel18.setText("Uang Bayar");

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel23.setText("Uang Kembali");

        tf_namafilm.setEditable(false);
        tf_namafilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_namafilmActionPerformed(evt);
            }
        });

        cb_hari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu" }));
        cb_hari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_hariActionPerformed(evt);
            }
        });

        tf_nokursi.setEditable(false);

        tf_jam.setEditable(false);
        tf_jam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_jamActionPerformed(evt);
            }
        });
        tf_jam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_jamKeyReleased(evt);
            }
        });

        tf_harga.setEditable(false);
        tf_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_hargaActionPerformed(evt);
            }
        });

        tf_uangbyr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_uangbyrActionPerformed(evt);
            }
        });
        tf_uangbyr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_uangbyrKeyReleased(evt);
            }
        });

        tf_uangkembali.setEditable(false);

        buttonreset1.setBackground(new java.awt.Color(255, 255, 255));
        buttonreset1.setText("RESET");
        buttonreset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonreset1ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel24.setText("LAYAR BIOSKOP");

        tf_jmltiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_jmltiketActionPerformed(evt);
            }
        });
        tf_jmltiket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_jmltiketKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tf_jmltiket);

        judul6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel35.setText("       Senin - Kamis     : 40.000");

        jLabel36.setText("       Jumat                   : 50.000");

        jLabel37.setText("       Sabtu & Minggu  : 65.000");

        javax.swing.GroupLayout judul6Layout = new javax.swing.GroupLayout(judul6);
        judul6.setLayout(judul6Layout);
        judul6Layout.setHorizontalGroup(
            judul6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judul6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(judul6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, judul6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel36))
                    .addGroup(judul6Layout.createSequentialGroup()
                        .addGroup(judul6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel37))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        judul6Layout.setVerticalGroup(
            judul6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judul6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(judul6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_nokursi, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tf_harga, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_jam, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_namafilm, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cb_hari, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_uangbyr, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_uangkembali, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonback1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonreset1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(checkbox_b1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkbox_b2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkbox_b3)
                                        .addGap(96, 96, 96)
                                        .addComponent(checkbox_b4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkbox_b5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkbox_b6)
                                        .addGap(59, 59, 59))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(checkbox_a1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkbox_a2)
                                        .addGap(106, 106, 106)
                                        .addComponent(checkbox_a3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkbox_a4)
                                        .addGap(94, 94, 94)
                                        .addComponent(checkbox_a5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkbox_a6)))
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonnext1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(240, 240, 240))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(348, 348, 348))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkbox_a6)
                    .addComponent(checkbox_a4)
                    .addComponent(checkbox_a3)
                    .addComponent(checkbox_a2)
                    .addComponent(checkbox_a1)
                    .addComponent(checkbox_a5))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkbox_b1)
                    .addComponent(checkbox_b2)
                    .addComponent(checkbox_b3)
                    .addComponent(checkbox_b4)
                    .addComponent(checkbox_b5)
                    .addComponent(checkbox_b6))
                .addGap(169, 169, 169)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonnext1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonreset1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonback1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(judul6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_namafilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_nokursi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cb_hari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(tf_jam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel17))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tf_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf_uangbyr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_uangkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(144, 144, 144))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonnext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonnext1ActionPerformed

        // pesan sukses
        JOptionPane.showMessageDialog(null, "Your Ticket Successfully Booked!");
    }//GEN-LAST:event_buttonnext1ActionPerformed

    private void buttonback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonback1ActionPerformed
        MoviesForm mf = new MoviesForm();
        mf.setVisible(true);
        mf.pack();
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_buttonback1ActionPerformed

    private void checkbox_b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_b6ActionPerformed
        kursi = tf_nokursi.getText()+ checkbox_b6.getText();
        tf_nokursi.setText(kursi);
        checkbox_b6.setEnabled(false);
    }//GEN-LAST:event_checkbox_b6ActionPerformed

    private void checkbox_b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_b5ActionPerformed
        kursi = tf_nokursi.getText()+ checkbox_b5.getText();
        tf_nokursi.setText(kursi);
        checkbox_b5.setEnabled(false);
    }//GEN-LAST:event_checkbox_b5ActionPerformed

    private void checkbox_b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_b4ActionPerformed
        kursi = tf_nokursi.getText()+ checkbox_b4.getText();
        tf_nokursi.setText(kursi);
        checkbox_b4.setEnabled(false);
    }//GEN-LAST:event_checkbox_b4ActionPerformed

    private void checkbox_b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_b2ActionPerformed
        kursi = tf_nokursi.getText()+ checkbox_b2.getText();
        tf_nokursi.setText(kursi);
        checkbox_b2.setEnabled(false);
    }//GEN-LAST:event_checkbox_b2ActionPerformed

    private void checkbox_b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_b3ActionPerformed
        kursi = tf_nokursi.getText()+ checkbox_b3.getText();
        tf_nokursi.setText(kursi);
        checkbox_b3.setEnabled(false);
    }//GEN-LAST:event_checkbox_b3ActionPerformed

    private void checkbox_b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_b1ActionPerformed
        kursi = tf_nokursi.getText()+ checkbox_b1.getText();
        tf_nokursi.setText(kursi);
        checkbox_b1.setEnabled(false);
    }//GEN-LAST:event_checkbox_b1ActionPerformed

    private void checkbox_a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_a6ActionPerformed
        kursi = tf_nokursi.getText()+ checkbox_a6.getText();
        tf_nokursi.setText(kursi);
        checkbox_a6.setEnabled(false);
    }//GEN-LAST:event_checkbox_a6ActionPerformed

    private void checkbox_a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_a5ActionPerformed
        kursi = tf_nokursi.getText()+ checkbox_a5.getText();
        tf_nokursi.setText(kursi);
        checkbox_a5.setEnabled(false);
    }//GEN-LAST:event_checkbox_a5ActionPerformed

    private void checkbox_a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_a3ActionPerformed
        kursi = tf_nokursi.getText()+ checkbox_a3.getText();
        tf_nokursi.setText(kursi);
        checkbox_a3.setEnabled(false);
    }//GEN-LAST:event_checkbox_a3ActionPerformed

    private void checkbox_a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_a4ActionPerformed
        kursi = tf_nokursi.getText()+ checkbox_a4.getText();
        tf_nokursi.setText(kursi);
        checkbox_a4.setEnabled(false);
    }//GEN-LAST:event_checkbox_a4ActionPerformed

    private void checkbox_a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_a2ActionPerformed
        kursi = tf_nokursi.getText()+ checkbox_a2.getText();
        tf_nokursi.setText(kursi);
        checkbox_a2.setEnabled(false);
    }//GEN-LAST:event_checkbox_a2ActionPerformed

    private void checkbox_a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_a1ActionPerformed
        kursi = tf_nokursi.getText()+ checkbox_a1.getText();
        tf_nokursi.setText(kursi);
        checkbox_a1.setEnabled(false);
    }//GEN-LAST:event_checkbox_a1ActionPerformed

    private void cb_hariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_hariActionPerformed
         if(cb_hari.getSelectedItem().equals("Senin")){
            harga = 40000;
        }else if(cb_hari.getSelectedItem().equals("Selasa")){
            harga = 40000;
        }else if(cb_hari.getSelectedItem().equals("Rabu")){
            harga = 40000;
        }else if(cb_hari.getSelectedItem().equals("Kamis")){
            harga = 40000;
        }else if(cb_hari.getSelectedItem().equals("Jumat")){
            harga = 50000;
        }else if(cb_hari.getSelectedItem().equals("Sabtu")){
            harga = 65000;
        }else if(cb_hari.getSelectedItem().equals("Minggu")){
            harga = 65000;
        }
    }//GEN-LAST:event_cb_hariActionPerformed

    private void tf_uangbyrKeyReleased(java.awt.event.KeyEvent evt) {                                       
        uang =Integer.parseInt(String.valueOf(tf_uangbyr.getText()));
        kembali = uang - hasil;
        tf_uangkembali.setText(String.valueOf(kembali));
    }     

    private void buttonreset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonreset1ActionPerformed
        tf_jmltiket.setText("");
        tf_harga.setText("");
        tf_uangbyr.setText("");
        tf_uangkembali.setText("");
        tf_nokursi.setText("");
        cb_hari.setSelectedIndex(0);

        checkbox_a1.setEnabled(true);
        checkbox_a2.setEnabled(true);
        checkbox_a3.setEnabled(true);
        checkbox_a4.setEnabled(true);
        checkbox_a5.setEnabled(true);
        checkbox_a6.setEnabled(true);
        checkbox_b1.setEnabled(true);
        checkbox_b2.setEnabled(true);
        checkbox_b3.setEnabled(true);
        checkbox_b4.setEnabled(true);
        checkbox_b5.setEnabled(true);
        checkbox_b6.setEnabled(true);
        checkbox_a1.setSelected(false);
        checkbox_a2.setSelected(false);
        checkbox_a3.setSelected(false);
        checkbox_a4.setSelected(false);
        checkbox_a5.setSelected(false);
        checkbox_a6.setSelected(false);
        checkbox_b1.setSelected(false);
        checkbox_b2.setSelected(false);
        checkbox_b3.setSelected(false);
        checkbox_b4.setSelected(false);
        checkbox_b5.setSelected(false);
        checkbox_b6.setSelected(false);
    }

    private void tf_jmltiketKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_jmltiketKeyReleased
        jumlah =Integer.parseInt(String.valueOf(tf_jmltiket.getText()));
        hasil = jumlah * harga;
        tf_harga.setText(String.valueOf(hasil));
      
    }//GEN-LAST:event_tf_jmltiketKeyReleased

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
            java.util.logging.Logger.getLogger(KursiStudioTB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KursiStudioTB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KursiStudioTB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KursiStudioTB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KursiStudioTB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonback1;
    private javax.swing.JButton buttonnext1;
    private javax.swing.JButton buttonreset1;
    private javax.swing.JComboBox<String> cb_hari;
    private javax.swing.JCheckBox checkbox_a1;
    private javax.swing.JCheckBox checkbox_a2;
    private javax.swing.JCheckBox checkbox_a3;
    private javax.swing.JCheckBox checkbox_a4;
    private javax.swing.JCheckBox checkbox_a5;
    private javax.swing.JCheckBox checkbox_a6;
    private javax.swing.JCheckBox checkbox_b1;
    private javax.swing.JCheckBox checkbox_b2;
    private javax.swing.JCheckBox checkbox_b3;
    private javax.swing.JCheckBox checkbox_b4;
    private javax.swing.JCheckBox checkbox_b5;
    private javax.swing.JCheckBox checkbox_b6;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel judul6;
    private javax.swing.JTextField tf_harga;
    public static javax.swing.JTextField tf_jam;
    private javax.swing.JTextField tf_jmltiket;
    public static javax.swing.JTextField tf_namafilm;
    private javax.swing.JTextField tf_nokursi;
    private javax.swing.JTextField tf_uangbyr;
    private javax.swing.JTextField tf_uangkembali;
    // End of variables declaration//GEN-END:variables
}
