/**
 *
 * 
 */
package javaapplicationguıapp;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class AnaEkran extends javax.swing.JFrame {

  Universitaet uni = new Universitaet("Turk Alman");
  
    public AnaEkran() {
        initComponents();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_programm_name = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        program = new javax.swing.JTabbedPane();
        jP_student_verwaltung = new javax.swing.JPanel();
        b_studenthiznzufuegen = new javax.swing.JButton();
        lb_s_matrikelno = new javax.swing.JLabel();
        lb_s_nachname = new javax.swing.JLabel();
        tf_matrikelno = new javax.swing.JTextField();
        tf_s_name = new javax.swing.JTextField();
        tf_s_nachname = new javax.swing.JTextField();
        lb_s_hinzufuegen_mesaj = new javax.swing.JLabel();
        lb_s_tc = new javax.swing.JLabel();
        lb_s_adresse = new javax.swing.JLabel();
        lb_s_email = new javax.swing.JLabel();
        lb_s_phonenummer = new javax.swing.JLabel();
        lb_s_fakultaet = new javax.swing.JLabel();
        lb_s_fach = new javax.swing.JLabel();
        lb_s_semester = new javax.swing.JLabel();
        lb_s_name = new javax.swing.JLabel();
        tf_s_tc = new javax.swing.JTextField();
        tf_s_adresse = new javax.swing.JTextField();
        tf_s_email = new javax.swing.JTextField();
        tf_s_phonenummer = new javax.swing.JTextField();
        tf_s_fakultaet = new javax.swing.JTextField();
        tf_s_fach = new javax.swing.JTextField();
        tf_s_semester = new javax.swing.JTextField();
        lb_s_geburtsdatum = new javax.swing.JLabel();
        tf_s_geburtsdatum = new javax.swing.JTextField();
        lb_s_geschlecht = new javax.swing.JLabel();
        tf_s_geschlecht = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_student = new javax.swing.JTable();
        b_s_aktualisieren = new javax.swing.JButton();
        b_s_loeschen = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_student_bearbeiten = new javax.swing.JTable();
        jP_student_suchen = new javax.swing.JPanel();
        lb_ssuchen_matrikno = new javax.swing.JLabel();
        tf_s_suchen_matrikno = new javax.swing.JTextField();
        b_s_suchen = new javax.swing.JButton();
        lb_s_suchen_mesaj = new javax.swing.JLabel();
        lb_s_suchen_mesaj1 = new javax.swing.JLabel();
        lb_s_suchen_mesaj2 = new javax.swing.JLabel();
        jP_dozent_verwaltung = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_d_name = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        tf_d_nachname = new javax.swing.JTextField();
        tf_d_tc = new javax.swing.JTextField();
        tf_d_adresse = new javax.swing.JTextField();
        tf_d_email = new javax.swing.JTextField();
        tf_d_phonenummer = new javax.swing.JTextField();
        tf_d_geschlecht = new javax.swing.JTextField();
        tf_d_geburtsdatum = new javax.swing.JTextField();
        tf_d_raum = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf_d_bereich = new javax.swing.JTextField();
        b_dozent_hinzufuegen = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_dozent = new javax.swing.JTable();
        lb_d_hinzufuegen_mesaj = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_dozent_bearbeiten = new javax.swing.JTable();
        b_d_loeschen = new javax.swing.JButton();
        b_dozent_aktualsieren = new javax.swing.JButton();
        jP_dozent_suchen = new javax.swing.JPanel();
        tf_d_suchen_tc = new javax.swing.JTextField();
        lb_d_suchen_tc = new javax.swing.JLabel();
        b_d_suchen = new javax.swing.JButton();
        lb_d_suchen_mesaj = new javax.swing.JLabel();
        lb_d_suchen_mesaj1 = new javax.swing.JLabel();
        lb_d_suchen_mesaj2 = new javax.swing.JLabel();
        jP_lva_verwaltung = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_lva_name = new javax.swing.JTextField();
        tf_lva_kuerzel = new javax.swing.JTextField();
        tf_lva_fakultaet = new javax.swing.JTextField();
        tf_lva_credits = new javax.swing.JTextField();
        tf_lva_kontingent = new javax.swing.JTextField();
        tf_lva_anwesenheitspflicht = new javax.swing.JTextField();
        tf_lva_sprache = new javax.swing.JTextField();
        tf_lva_raum = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        b_lva_hinzufuegen = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_lva = new javax.swing.JTable();
        lb_lva_hinzufuegen_mesaj = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        table_lva_bearbeiten = new javax.swing.JTable();
        b_lva_aktualisieren = new javax.swing.JButton();
        b_lva_loeschen = new javax.swing.JButton();
        jP_lva_suchen = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        tf_lva_suchen_kuerzel = new javax.swing.JTextField();
        b_lva_suchen = new javax.swing.JButton();
        lb_lva_suchen_mesaj = new javax.swing.JLabel();
        lb_lva_suchen_mesaj1 = new javax.swing.JLabel();
        lb_lva_suchen_mesaj2 = new javax.swing.JLabel();
        jP_anmeldung_abmeldung_operationen = new javax.swing.JPanel();
        b_s_lva_anmelden = new javax.swing.JButton();
        b_s_lva_abmelden = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_s_operation_matrikno = new javax.swing.JTextField();
        tf_s_operation_kuerzel = new javax.swing.JTextField();
        b_s_lva_anzeigen = new javax.swing.JButton();
        lb_s_lva_mesaj = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        tf_d_operation_tc = new javax.swing.JTextField();
        tf_d_operation_lva_kuerzel = new javax.swing.JTextField();
        b_d_lva_zuweisen = new javax.swing.JButton();
        b_d_lva_abmelden = new javax.swing.JButton();
        b_d_lva_anzeigen = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        b_s_lva_anzeigen1 = new javax.swing.JButton();
        b_d_lva_anzeigen1 = new javax.swing.JButton();
        lb_d_lva_mesaj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_programm_name.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        lb_programm_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_programm_name.setText("Studentenmanagementprogramm");

        program.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        program.setAlignmentX(5.0F);
        program.setAlignmentY(5.0F);

        b_studenthiznzufuegen.setText("Hinzufuegen");
        b_studenthiznzufuegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_studenthiznzufuegenActionPerformed(evt);
            }
        });

        lb_s_matrikelno.setText("Matrikelnummer");

        lb_s_nachname.setText("Nachname");

        tf_matrikelno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_matrikelnoActionPerformed(evt);
            }
        });

        tf_s_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_s_nameActionPerformed(evt);
            }
        });

        tf_s_nachname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_s_nachnameActionPerformed(evt);
            }
        });

        lb_s_tc.setText("TC-Nummer");

        lb_s_adresse.setText("Adresse");

        lb_s_email.setText("E-Mail-Addresse");

        lb_s_phonenummer.setText("Phonenummer");

        lb_s_fakultaet.setText("Fakultaet");

        lb_s_fach.setText("Fach");

        lb_s_semester.setText("Semester");

        lb_s_name.setText("Name");

        tf_s_tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_s_tcActionPerformed(evt);
            }
        });

        tf_s_adresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_s_adresseActionPerformed(evt);
            }
        });

        tf_s_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_s_emailActionPerformed(evt);
            }
        });

        tf_s_phonenummer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_s_phonenummerActionPerformed(evt);
            }
        });

        tf_s_fakultaet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_s_fakultaetActionPerformed(evt);
            }
        });

        tf_s_fach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_s_fachActionPerformed(evt);
            }
        });

        tf_s_semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_s_semesterActionPerformed(evt);
            }
        });

        lb_s_geburtsdatum.setText("Geburtsdatum");

        tf_s_geburtsdatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_s_geburtsdatumActionPerformed(evt);
            }
        });

        lb_s_geschlecht.setText("Geschlecht");

        tf_s_geschlecht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_s_geschlechtActionPerformed(evt);
            }
        });

        table_student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Nachname", "Matriklenummer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_student);

        b_s_aktualisieren.setText("Aktualisieren");
        b_s_aktualisieren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_s_aktualisierenActionPerformed(evt);
            }
        });

        b_s_loeschen.setText(" Loeschen");
        b_s_loeschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_s_loeschenActionPerformed(evt);
            }
        });

        table_student_bearbeiten.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Nachname", "Matrikelnummer", "TC-Nummer", "Adresse", "E-mailadresse", "Phonenummer", "Geschlecht", "Geburtsdatum", "Fach", "Semester", "Fakultaet"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_student_bearbeiten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_student_bearbeitenMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table_student_bearbeiten);

        javax.swing.GroupLayout jP_student_verwaltungLayout = new javax.swing.GroupLayout(jP_student_verwaltung);
        jP_student_verwaltung.setLayout(jP_student_verwaltungLayout);
        jP_student_verwaltungLayout.setHorizontalGroup(
            jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_student_verwaltungLayout.createSequentialGroup()
                .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_student_verwaltungLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jP_student_verwaltungLayout.createSequentialGroup()
                                .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lb_s_matrikelno, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(lb_s_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_s_nachname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_s_phonenummer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_s_fakultaet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_s_fach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_s_semester, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_s_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_s_geburtsdatum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_s_geschlecht, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_s_tc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_s_adresse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                                .addGap(62, 62, 62)
                                .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_matrikelno, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(tf_s_name)
                                    .addComponent(tf_s_nachname)
                                    .addComponent(tf_s_tc)
                                    .addComponent(tf_s_adresse)
                                    .addComponent(tf_s_email)
                                    .addComponent(tf_s_phonenummer)
                                    .addComponent(tf_s_fakultaet)
                                    .addComponent(tf_s_fach)
                                    .addComponent(tf_s_semester)
                                    .addComponent(tf_s_geburtsdatum)
                                    .addComponent(tf_s_geschlecht)))
                            .addGroup(jP_student_verwaltungLayout.createSequentialGroup()
                                .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b_s_loeschen, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_s_aktualisieren, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(b_studenthiznzufuegen, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(105, 105, 105)
                        .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_s_hinzufuegen_mesaj, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jP_student_verwaltungLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1734, Short.MAX_VALUE))
        );
        jP_student_verwaltungLayout.setVerticalGroup(
            jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_student_verwaltungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_student_verwaltungLayout.createSequentialGroup()
                        .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_matrikelno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_s_matrikelno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_s_name, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_s_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_s_nachname, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_s_nachname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_s_tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_s_tc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_s_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_s_adresse))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_s_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_s_email))
                        .addGap(8, 8, 8)
                        .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_s_phonenummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_s_phonenummer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_s_fakultaet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_s_fakultaet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_s_fach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_s_fach))
                        .addGap(11, 11, 11)
                        .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_s_semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_s_semester))
                        .addGap(11, 11, 11)
                        .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_s_geburtsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_s_geburtsdatum))
                        .addGap(11, 11, 11)
                        .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_s_geschlecht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_s_geschlecht))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jP_student_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_s_aktualisieren)
                            .addComponent(b_studenthiznzufuegen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_s_loeschen))
                    .addGroup(jP_student_verwaltungLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_s_hinzufuegen_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3009, Short.MAX_VALUE))
        );

        program.addTab("Student Verwaltung", jP_student_verwaltung);

        lb_ssuchen_matrikno.setText("Matrikelnummer");

        tf_s_suchen_matrikno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_s_suchen_matriknoActionPerformed(evt);
            }
        });

        b_s_suchen.setText("Student Suchen");
        b_s_suchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_s_suchenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_student_suchenLayout = new javax.swing.GroupLayout(jP_student_suchen);
        jP_student_suchen.setLayout(jP_student_suchenLayout);
        jP_student_suchenLayout.setHorizontalGroup(
            jP_student_suchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_student_suchenLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jP_student_suchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_s_suchen_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jP_student_suchenLayout.createSequentialGroup()
                        .addComponent(lb_ssuchen_matrikno, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jP_student_suchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_s_suchen, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_s_suchen_matrikno, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lb_s_suchen_mesaj1, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_s_suchen_mesaj2, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_student_suchenLayout.setVerticalGroup(
            jP_student_suchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_student_suchenLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jP_student_suchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_ssuchen_matrikno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_s_suchen_matrikno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_s_suchen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lb_s_suchen_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_s_suchen_mesaj1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_s_suchen_mesaj2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        program.addTab("Student suchen", jP_student_suchen);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Name");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Nachname");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("TC-Nummer");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Adresse");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("E-mailadresse");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Phonenummer");

        jTextField2.setText("jTextField1");

        tf_d_nachname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_d_nachnameActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Geschlecht");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Geburtsdatum");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Raum");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Bereich");

        b_dozent_hinzufuegen.setText("Hinzufuegen");
        b_dozent_hinzufuegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_dozent_hinzufuegenActionPerformed(evt);
            }
        });

        table_dozent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Nachname", "TC-Nummer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table_dozent);

        table_dozent_bearbeiten.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Nachname", "TC-Nummer", "Adresse", "E-mailadresse", "Phonenummer", "Geschlecht", "Geburtsdatum", "Bereich", "Raum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_dozent_bearbeiten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_dozent_bearbeitenMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table_dozent_bearbeiten);

        b_d_loeschen.setText("Loeschen");
        b_d_loeschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_d_loeschenActionPerformed(evt);
            }
        });

        b_dozent_aktualsieren.setText("Aktualisieren");
        b_dozent_aktualsieren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_dozent_aktualsierenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_dozent_verwaltungLayout = new javax.swing.GroupLayout(jP_dozent_verwaltung);
        jP_dozent_verwaltung.setLayout(jP_dozent_verwaltungLayout);
        jP_dozent_verwaltungLayout.setHorizontalGroup(
            jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_dozent_verwaltungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_dozent_verwaltungLayout.createSequentialGroup()
                        .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b_dozent_aktualsieren, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(b_d_loeschen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_d_nachname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_d_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_d_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_d_email, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_d_phonenummer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_d_geschlecht, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_d_geburtsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_d_raum, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_d_bereich, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_dozent_hinzufuegen, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jP_dozent_verwaltungLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_d_name, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71)
                .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_d_hinzufuegen_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1652, Short.MAX_VALUE))
            .addGroup(jP_dozent_verwaltungLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jP_dozent_verwaltungLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jP_dozent_verwaltungLayout.setVerticalGroup(
            jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_dozent_verwaltungLayout.createSequentialGroup()
                .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_dozent_verwaltungLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_d_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_d_nachname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_d_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_d_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_d_email, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_d_phonenummer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_d_geschlecht, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_d_geburtsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_d_raum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_dozent_verwaltungLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jP_dozent_verwaltungLayout.createSequentialGroup()
                        .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_d_bereich, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_dozent_hinzufuegen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_dozent_aktualsieren, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_d_loeschen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_d_hinzufuegen_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2862, Short.MAX_VALUE))
            .addGroup(jP_dozent_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jP_dozent_verwaltungLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        program.addTab("Dozent Verwaltung", jP_dozent_verwaltung);

        tf_d_suchen_tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_d_suchen_tcActionPerformed(evt);
            }
        });

        lb_d_suchen_tc.setText("TC-Nummer");

        b_d_suchen.setText("Suchen");
        b_d_suchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_d_suchenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_dozent_suchenLayout = new javax.swing.GroupLayout(jP_dozent_suchen);
        jP_dozent_suchen.setLayout(jP_dozent_suchenLayout);
        jP_dozent_suchenLayout.setHorizontalGroup(
            jP_dozent_suchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_dozent_suchenLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jP_dozent_suchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_d_suchen_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jP_dozent_suchenLayout.createSequentialGroup()
                        .addComponent(lb_d_suchen_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jP_dozent_suchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b_d_suchen, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(tf_d_suchen_tc)))
                    .addComponent(lb_d_suchen_mesaj1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_d_suchen_mesaj2, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(2119, Short.MAX_VALUE))
        );
        jP_dozent_suchenLayout.setVerticalGroup(
            jP_dozent_suchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_dozent_suchenLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jP_dozent_suchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_d_suchen_tc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_d_suchen_tc, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(b_d_suchen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lb_d_suchen_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_d_suchen_mesaj1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_d_suchen_mesaj2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3379, Short.MAX_VALUE))
        );

        program.addTab("Dozent suchen", jP_dozent_suchen);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Name");

        jLabel15.setText("Name");
        jLabel15.setMaximumSize(new java.awt.Dimension(26, 13));
        jLabel15.setMinimumSize(new java.awt.Dimension(26, 13));

        tf_lva_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_lva_nameActionPerformed(evt);
            }
        });

        tf_lva_kuerzel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_lva_kuerzelActionPerformed(evt);
            }
        });

        jLabel16.setText("Kuerzel");
        jLabel16.setMaximumSize(new java.awt.Dimension(26, 13));
        jLabel16.setMinimumSize(new java.awt.Dimension(26, 13));

        jLabel17.setText("Fakultaet");
        jLabel17.setMaximumSize(new java.awt.Dimension(26, 13));
        jLabel17.setMinimumSize(new java.awt.Dimension(26, 13));

        jLabel18.setText("Credits");
        jLabel18.setMaximumSize(new java.awt.Dimension(26, 13));
        jLabel18.setMinimumSize(new java.awt.Dimension(26, 13));

        jLabel19.setText("Anwesenheitspflicht");
        jLabel19.setMaximumSize(new java.awt.Dimension(26, 13));
        jLabel19.setMinimumSize(new java.awt.Dimension(26, 13));

        jLabel20.setText("Raum");
        jLabel20.setMaximumSize(new java.awt.Dimension(26, 13));
        jLabel20.setMinimumSize(new java.awt.Dimension(26, 13));

        jLabel21.setText("Kontingent");
        jLabel21.setMaximumSize(new java.awt.Dimension(26, 13));
        jLabel21.setMinimumSize(new java.awt.Dimension(26, 13));

        jLabel22.setText("Sprache");
        jLabel22.setMaximumSize(new java.awt.Dimension(26, 13));
        jLabel22.setMinimumSize(new java.awt.Dimension(26, 13));

        b_lva_hinzufuegen.setText("Hinzufuegen");
        b_lva_hinzufuegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_lva_hinzufuegenActionPerformed(evt);
            }
        });

        table_lva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kuerzel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(table_lva);

        table_lva_bearbeiten.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kuerzel", "Name", "Fakultaet", "Anwesenheitspflicht", "Credits", "Raum", "Kontingent", "Sprache"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_lva_bearbeiten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_lva_bearbeitenMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(table_lva_bearbeiten);

        b_lva_aktualisieren.setText("Aktualisieren");
        b_lva_aktualisieren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_lva_aktualisierenActionPerformed(evt);
            }
        });

        b_lva_loeschen.setText("Loeschen");
        b_lva_loeschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_lva_loeschenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_lva_verwaltungLayout = new javax.swing.GroupLayout(jP_lva_verwaltung);
        jP_lva_verwaltung.setLayout(jP_lva_verwaltungLayout);
        jP_lva_verwaltungLayout.setHorizontalGroup(
            jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_lva_verwaltungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_lva_loeschen, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jP_lva_verwaltungLayout.createSequentialGroup()
                        .addGroup(jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP_lva_verwaltungLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_lva_name, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jP_lva_verwaltungLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_lva_kuerzel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jP_lva_verwaltungLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_lva_fakultaet, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jP_lva_verwaltungLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_lva_credits, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jP_lva_verwaltungLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_lva_anwesenheitspflicht, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jP_lva_verwaltungLayout.createSequentialGroup()
                                .addGroup(jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_lva_aktualisieren, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_lva_kontingent, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(tf_lva_raum, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(tf_lva_sprache, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(b_lva_hinzufuegen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(43, 43, 43)
                        .addGroup(jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_lva_hinzufuegen_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(1735, Short.MAX_VALUE))
            .addGroup(jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jP_lva_verwaltungLayout.createSequentialGroup()
                    .addGap(1031, 1031, 1031)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1702, Short.MAX_VALUE)))
        );
        jP_lva_verwaltungLayout.setVerticalGroup(
            jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_lva_verwaltungLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jP_lva_verwaltungLayout.createSequentialGroup()
                        .addGroup(jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_lva_name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_lva_kuerzel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_lva_fakultaet, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_lva_credits, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_lva_anwesenheitspflicht, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_lva_raum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_lva_kontingent, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_lva_sprache, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_lva_hinzufuegen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_lva_aktualisieren, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jP_lva_verwaltungLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_lva_hinzufuegen_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_lva_loeschen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3003, Short.MAX_VALUE))
            .addGroup(jP_lva_verwaltungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jP_lva_verwaltungLayout.createSequentialGroup()
                    .addGap(1291, 1291, 1291)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(2393, Short.MAX_VALUE)))
        );

        program.addTab("LVA Verwaltung", jP_lva_verwaltung);

        jLabel23.setText("Kuerzel der LVA");

        tf_lva_suchen_kuerzel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_lva_suchen_kuerzelActionPerformed(evt);
            }
        });

        b_lva_suchen.setText("Suchen");
        b_lva_suchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_lva_suchenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_lva_suchenLayout = new javax.swing.GroupLayout(jP_lva_suchen);
        jP_lva_suchen.setLayout(jP_lva_suchenLayout);
        jP_lva_suchenLayout.setHorizontalGroup(
            jP_lva_suchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_lva_suchenLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jP_lva_suchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jP_lva_suchenLayout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jP_lva_suchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b_lva_suchen, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(tf_lva_suchen_kuerzel)))
                    .addComponent(lb_lva_suchen_mesaj2, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_lva_suchen_mesaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_lva_suchen_mesaj1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(2144, Short.MAX_VALUE))
        );
        jP_lva_suchenLayout.setVerticalGroup(
            jP_lva_suchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_lva_suchenLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jP_lva_suchenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lva_suchen_kuerzel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(b_lva_suchen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lb_lva_suchen_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_lva_suchen_mesaj1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_lva_suchen_mesaj2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3385, Short.MAX_VALUE))
        );

        program.addTab("LVA suchen", jP_lva_suchen);

        b_s_lva_anmelden.setText("Anmelden");
        b_s_lva_anmelden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_s_lva_anmeldenActionPerformed(evt);
            }
        });

        b_s_lva_abmelden.setText("Abmelden");
        b_s_lva_abmelden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_s_lva_abmeldenActionPerformed(evt);
            }
        });

        jLabel1.setText("Matrikelnummer des Studenten");

        jLabel2.setText("Kuerzel der LVA");

        tf_s_operation_matrikno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_s_operation_matriknoActionPerformed(evt);
            }
        });

        b_s_lva_anzeigen.setText("Alle LVAs dieses Studenten anzeigen");
        b_s_lva_anzeigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_s_lva_anzeigenActionPerformed(evt);
            }
        });

        jLabel24.setText("jLabel24");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel25.setText("Student Anmeldung- Abmeldung");

        jLabel26.setText("TC-Nummer des Dozenten");

        jLabel27.setText("Kuerzel der LVA");

        b_d_lva_zuweisen.setText("Zuweisen");
        b_d_lva_zuweisen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_d_lva_zuweisenActionPerformed(evt);
            }
        });

        b_d_lva_abmelden.setText("Abmelden");
        b_d_lva_abmelden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_d_lva_abmeldenActionPerformed(evt);
            }
        });

        b_d_lva_anzeigen.setText("Alle LVAs dieses Dozenten anzeigen");
        b_d_lva_anzeigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_d_lva_anzeigenActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel28.setText("Dozent Anmeldung-Abmeldung");

        b_s_lva_anzeigen1.setText("Alle Studenten dieser LVA anzeigen");
        b_s_lva_anzeigen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_s_lva_anzeigen1ActionPerformed(evt);
            }
        });

        b_d_lva_anzeigen1.setText("Alle Dozenten dieser LVA anzeigen");
        b_d_lva_anzeigen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_d_lva_anzeigen1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_anmeldung_abmeldung_operationenLayout = new javax.swing.GroupLayout(jP_anmeldung_abmeldung_operationen);
        jP_anmeldung_abmeldung_operationen.setLayout(jP_anmeldung_abmeldung_operationenLayout);
        jP_anmeldung_abmeldung_operationenLayout.setHorizontalGroup(
            jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                                    .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                                            .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                                                    .addComponent(b_s_lva_anmelden, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tf_s_operation_matrikno, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                .addComponent(tf_s_operation_kuerzel, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                .addComponent(b_s_lva_abmelden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(b_s_lva_anzeigen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(b_s_lva_anzeigen1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                                            .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                                                    .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(b_d_lva_zuweisen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(b_d_lva_abmelden, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(b_d_lva_anzeigen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(b_d_lva_anzeigen1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 8, Short.MAX_VALUE)))
                                    .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                                            .addGap(63, 63, 63)
                                            .addComponent(lb_d_lva_mesaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(lb_s_lva_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 2375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(tf_d_operation_lva_kuerzel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_d_operation_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jP_anmeldung_abmeldung_operationenLayout.setVerticalGroup(
            jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_s_operation_matrikno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_s_operation_kuerzel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b_s_lva_anmelden, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(b_s_lva_abmelden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_s_lva_anzeigen, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(b_s_lva_anzeigen1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lb_s_lva_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_d_operation_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_d_operation_lva_kuerzel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jP_anmeldung_abmeldung_operationenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_d_lva_zuweisen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_d_lva_abmelden, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_d_lva_anzeigen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_d_lva_anzeigen1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_anmeldung_abmeldung_operationenLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lb_d_lva_mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2968, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        program.addTab("Abmeldung und Anmeldung", jP_anmeldung_abmeldung_operationen);

        jScrollPane2.setViewportView(program);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_programm_name, javax.swing.GroupLayout.DEFAULT_SIZE, 2361, Short.MAX_VALUE)
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_programm_name, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_lva_suchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_lva_suchenActionPerformed
        int j=0;
        for (int i = 0; i < uni.lva.size(); i++) {
            if (tf_lva_suchen_kuerzel.getText().equals(uni.lva.get(i).getKuerzel())==true){
                j=1;
                lb_lva_suchen_mesaj.setText("Name=" + uni.lva.get(i).getName() + ", Kuerzel=" + uni.lva.get(i).getKuerzel() + ", Fakultaet=" + uni.lva.get(i).getFakultaet()+ uni.lva.get(i).getCredits() );
                lb_lva_suchen_mesaj1.setText(" Credits=" + uni.lva.get(i).getCredits()+ ", Anwesenheitspflicht="+ uni.lva.get(i).getAnwesenheitspflicht() + ", Raum=" + uni.lva.get(i).getRaum() );
                lb_lva_suchen_mesaj2.setText(" Sprache="+ uni.lva.get(i).getSprache()+", Kontingent="+uni.lva.get(i).getKontingent());
            }
        }
        if(j==0){
            lb_lva_suchen_mesaj.setText("LVA existiert nicht.");
            lb_lva_suchen_mesaj1.setText(" ");
            lb_lva_suchen_mesaj2.setText(" ");
        }
    }//GEN-LAST:event_b_lva_suchenActionPerformed

    private void tf_lva_suchen_kuerzelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_lva_suchen_kuerzelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_lva_suchen_kuerzelActionPerformed

    private void b_d_lva_anzeigen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_d_lva_anzeigen1ActionPerformed
//wenn lva existiert,können wir sehen, welche dozenten von dieser lva verantwotlich sind.
        int fl1=0;
        for (int i = 0; i < uni.lva.size(); i++) {
            if (tf_d_operation_lva_kuerzel.getText().equals(uni.lva.get(i).getKuerzel())==true){
                fl1=1;
                for(int ii=0; ii< uni.lva.get(i).lva_d.size();ii++)
                lb_d_lva_mesaj.setText(uni.lva.get(i).lva_d.toString());
                if(uni.lva.get(i).lva_d.size()==0)
                lb_d_lva_mesaj.setText("Es gibt keine verantwortlichen Dozenten der LVA.");

            }

        }

        if(fl1==0)
        lb_d_lva_mesaj.setText("LVA existiert nicht.");
    }//GEN-LAST:event_b_d_lva_anzeigen1ActionPerformed

    private void b_s_lva_anzeigen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_s_lva_anzeigen1ActionPerformed
//wenn lva existiert,können wir seine studenten auf dem Bilschirm sehen.
        int fl1=0;
        for (int i = 0; i < uni.lva.size(); i++) {
            if (tf_s_operation_kuerzel.getText().equals(uni.lva.get(i).getKuerzel())==true){
                fl1=1;
                for(int ii=0; ii< uni.lva.get(i).lva_s.size();ii++)
                lb_s_lva_mesaj.setText(uni.lva.get(i).lva_s.toString());
                if(uni.lva.get(i).lva_s.size()==0)
                lb_s_lva_mesaj.setText("Es gibt keine angemeldeten Studenten der LVA.");

            }

        }

        if(fl1==0)
        lb_s_lva_mesaj.setText("LVA existiert nicht.");
    }//GEN-LAST:event_b_s_lva_anzeigen1ActionPerformed

    private void b_d_lva_anzeigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_d_lva_anzeigenActionPerformed
//wenn dozent existiert,können wir seine LVA's auf dem Bilschirm sehen.
        int jj=0;
        for (int i = 0; i < uni.d.size(); i++) {
            if(uni.d.get(i).getTCNummer().equals(tf_d_operation_tc.getText())){
                jj=1;
                if(uni.d.get(i).d_lva.size()!=0){
                    lb_d_lva_mesaj.setText(uni.d.get(i).d_lva.toString());
                }
                else
                {       lb_d_lva_mesaj.setText("Dozent wurde noch nicht zu einer LVA angemeldet.");
                }
            }
        }
        if(jj==0)
        lb_d_lva_mesaj.setText("Dozent existiert nicht.");
    }//GEN-LAST:event_b_d_lva_anzeigenActionPerformed

    private void b_d_lva_abmeldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_d_lva_abmeldenActionPerformed
//Zuerst teste ich,ob die dozent und LVA existieren.
//Dann wird dozent durch "remove" Methode abgemeldet.       
        int jj=0;
        if(Universitaet.control_space(tf_d_operation_tc.getText())==true || Universitaet.control_space(tf_d_operation_lva_kuerzel.getText())==true){
                lb_d_lva_mesaj.setText("TC-Nummer und Kuerzel der LVA sollen nicht leer sein.");  }
        else{
        for (int i = 0; i < uni.d.size(); i++){
            if (tf_d_operation_tc.getText().equals(uni.d.get(i).getTCNummer())==true){
                jj=1;
                int jjj=0;
                for (int z = 0; z < uni.lva.size(); z++){
                    if (tf_d_operation_lva_kuerzel.getText().equals(uni.lva.get(z).getKuerzel())==true  ){
                        jjj=1;
                        if(uni.lva.get(z).lva_d.contains(uni.d.get(i))){
									
			   uni.d.get(i).d_lva.remove(uni.lva.get(z)); 
                           uni.lva.get(z).lva_d.remove(uni.d.get(i));
			   lb_d_lva_mesaj.setText("Dozent wurde von LVA erfolgreich abgemeldet.");
			  
									
			}
                        else lb_d_lva_mesaj.setText("Dozent wurde bereits nicht zur diesen LVA zugewiesen.");
                    }
                }

                if(jjj==0){
                    lb_d_lva_mesaj.setText("LVA existiert nicht.");

                }

            }

        }

        if(jj==0)
        lb_d_lva_mesaj.setText("Dozent existiert nicht.");}
    }//GEN-LAST:event_b_d_lva_abmeldenActionPerformed

    private void b_d_lva_zuweisenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_d_lva_zuweisenActionPerformed
//Zuerst teste ich,ob die Dozent und LVA existieren.
//wenn Dozent zur LVA schon zugewiesen wurde,wird eine Meldung auf der Bildschirm.
//wenn alle Bedingungen erfüllt werden,wird LVA zur Arraylist in der Dozent Klasse 
//und Dozent zur Arraylist in der Klasse LVA hinzugefügt.       
        int jj=0;
        if(Universitaet.control_space(tf_d_operation_tc.getText())==true || Universitaet.control_space(tf_d_operation_lva_kuerzel.getText())==true){
                lb_d_lva_mesaj.setText("TC-Nummer und Kuerzel der LVA sollen nicht leer sein.");  }
        else{
        for (int i = 0; i < uni.d.size(); i++){
            if (tf_d_operation_tc.getText().equals(uni.d.get(i).getTCNummer())==true){
                jj=1;
                int jjj=0;
                for (int z = 0; z < uni.lva.size(); z++){
                    if (tf_d_operation_lva_kuerzel.getText().equals(uni.lva.get(z).getKuerzel())==true  ){
                        jjj=1;
                        if(Dozent.alreadyExistsLVA(uni.lva.get(z), uni.d.get(i))==false){

                            uni.d.get(i).d_lva.add(uni.lva.get(z));
                            uni.lva.get(z).lva_d.add(uni.d.get(i));
                            lb_d_lva_mesaj.setText("Dozent wurde zur LVA erfolgreich zugewiesen.");
                           
                        }
                        else lb_d_lva_mesaj.setText("Dozent wurde zur LVA schon zugewiesen.");
                    }
                }

                if(jjj==0){
                    lb_d_lva_mesaj.setText("LVA existiert nicht.");

                }

            }

        }

        if(jj==0)
        lb_d_lva_mesaj.setText("Dozent existiert nicht.");}

    }//GEN-LAST:event_b_d_lva_zuweisenActionPerformed

    private void b_s_lva_anzeigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_s_lva_anzeigenActionPerformed
//wenn student existiert,können wir seine LVA's auf dem Bilschirm sehen.
        int jj=0;
        for (int i = 0; i < uni.liste.size(); i++) {
            if(uni.liste.get(i).getMatrikelnummer().equals(tf_s_operation_matrikno.getText())){
                jj=1;
                if(uni.liste.get(i).s_lva.size()!=0){
                    lb_s_lva_mesaj.setText(uni.liste.get(i).s_lva.toString());
                }
                else
                {       lb_s_lva_mesaj.setText("Student wurde noch nicht zu einer LVA angemeldet.");
                }
            }
        }
        if(jj==0)
        lb_s_lva_mesaj.setText("Student existiert nicht.");
    }//GEN-LAST:event_b_s_lva_anzeigenActionPerformed

    private void tf_s_operation_matriknoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_s_operation_matriknoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_s_operation_matriknoActionPerformed

    private void b_s_lva_abmeldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_s_lva_abmeldenActionPerformed
//Zuerst teste ich,ob die Student und LVA existieren.
//Dann wird Student durch "remove" Methode abgemeldet.        
        int jj=0;
        if(Universitaet.control_space(tf_s_operation_matrikno.getText())==true || Universitaet.control_space(tf_s_operation_kuerzel.getText())==true){
                lb_s_lva_mesaj.setText("Matrikelnummer und Kuerzel der LVA sollen nicht leer sein.");  }
        else {
                
        for (int i = 0; i < uni.liste.size(); i++) {
             
             
            if (tf_s_operation_matrikno.getText().equals(uni.liste.get(i).getMatrikelnummer())==true ){
                jj=1;
                int jjj=0;
                for (int z = 0; z < uni.lva.size(); z++) {
                    if (tf_s_operation_kuerzel.getText().equals(uni.lva.get(z).getKuerzel())==true ){
                        jjj=1;
                        if(uni.lva.get(z).lva_s.contains(uni.liste.get(i))){
			   uni.liste.get(i).s_lva.remove(uni.lva.get(z)); 
			   lb_s_lva_mesaj.setText("Student wurde von LVA erfolgreich abgemeldet.");
			   uni.lva.get(z).lva_s.remove(uni.liste.get(i));
								}
                        else lb_s_lva_mesaj.setText("Student wird bereits nicht zur diesen LVA angemeldet.");
                    }
                }
                if(jjj==0){
                    lb_s_lva_mesaj.setText("LVA existiert nicht.");

                }
            }
            
        
        
        }
        if(jj==0)
        lb_s_lva_mesaj.setText("Student existiert nicht.");}
    }//GEN-LAST:event_b_s_lva_abmeldenActionPerformed

    private void b_s_lva_anmeldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_s_lva_anmeldenActionPerformed
//Zuerst teste ich,ob die Student und LVA existieren.
//wenn student zur LVA schon zugewiesen wurde,wird eine Meldung auf der Bildschirm.
//wenn alle Bedingungen erfüllt werden,wird LVA zur Arraylist in der student Klasse 
//und student zur Arraylist in der Klasse LVA hinzugefügt.
        int jj=0;
        if(Universitaet.control_space(tf_s_operation_matrikno.getText())==true || Universitaet.control_space(tf_s_operation_kuerzel.getText())==true){
                lb_s_lva_mesaj.setText("Matrikelnummer und Kuerzel der LVA sollen nicht leer sein.");  }
        else {
                
        for (int i = 0; i < uni.liste.size(); i++) {
             
             
            if (tf_s_operation_matrikno.getText().equals(uni.liste.get(i).getMatrikelnummer())==true ){
                jj=1;
                int jjj=0;
                for (int z = 0; z < uni.lva.size(); z++) {
                    if (tf_s_operation_kuerzel.getText().equals(uni.lva.get(z).getKuerzel())==true ){
                        jjj=1;
                        if(Student.alreadyExistsLVA(uni.lva.get(z), uni.liste.get(i))==false){
                            uni.liste.get(i).s_lva.add(uni.lva.get(z));
                            uni.lva.get(z).lva_s.add(uni.liste.get(i));
                            lb_s_lva_mesaj.setText("Student wurde zur LVA erfolgreich angemeldet.");
                            
                        }
                        else lb_s_lva_mesaj.setText("Student wurde zur LVA schon angemeldet.");
                    }
                }
                if(jjj==0){
                    lb_s_lva_mesaj.setText("LVA existiert nicht.");

                }
            }
            
        
        
        }
        if(jj==0)
        lb_s_lva_mesaj.setText("Student existiert nicht.");}
    }//GEN-LAST:event_b_s_lva_anmeldenActionPerformed

    private void b_lva_loeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_lva_loeschenActionPerformed
//wenn es selected row gibt,loesche ich dieser lva von der student und dozent dann der lva .

        int x= table_lva_bearbeiten.getSelectedRow();

        if(x>=0){
            for (int z = 0; z < uni.d.size(); z++){
		if(uni.d.get(z).d_lva.contains(uni.lva.get(x))){
		   uni.d.get(z).d_lva.remove(uni.lva.get(x));
						
	   }
		}
						
	    for (int e = 0; e < uni.liste.size(); e++){
		if(uni.liste.get(e).s_lva.contains(uni.lva.get(x))){
		   uni.liste.get(e).s_lva.remove(uni.lva.get(x));
		}
	    }
            
            
            uni.lva.remove(x);
            DefaultTableModel dtt = (DefaultTableModel) table_lva_bearbeiten.getModel();
            dtt.removeRow(x);

            DefaultTableModel dd = (DefaultTableModel) table_lva.getModel();
            dd.removeRow(x);
            lb_lva_hinzufuegen_mesaj.setText("LVA wurde erfolgreich geloescht.");
        }        
        else lb_lva_hinzufuegen_mesaj.setText("Bitte wählen Sie eine Lva aus der Tabelle.");
    }//GEN-LAST:event_b_lva_loeschenActionPerformed

    private void b_lva_aktualisierenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_lva_aktualisierenActionPerformed
       //zuerst habe ich kontrolliert kuerzel der lva
       //wenn alle bedingungen erfüllt,habe ich tabellen und arraylist aktualisisert.
       //wenn es kein  selected row gibt,bekommt der benutzer eine meldung.
       //durch mauseclicked kann ich ınformationen aus der selected row zu text field.
        int x= table_lva_bearbeiten.getSelectedRow();

        if(x>=0){
            DefaultTableModel d = (DefaultTableModel) table_lva.getModel();
            DefaultTableModel dt = (DefaultTableModel) table_lva_bearbeiten.getModel();
            
            if(uni.control_space(tf_lva_name.getText())==true|| uni.control_space(tf_lva_kuerzel.getText())==true    ){
            lb_lva_hinzufuegen_mesaj.setText("Name und Kuerzel der LVA muessen ausgefüllt werden und nicht mit einem Leerzeichen beginnen und beenden.");
            }
            else if(LVA.kontrolKuerzel(tf_lva_kuerzel.getText())==false){
            lb_lva_hinzufuegen_mesaj.setText("Laenge die Kuerzel von LVA soll 6 sein, mit drei Grossbuchstaben anfangen und mit 3 Ziffern beenden.");

            }//else if( (dt.getValueAt(x, 2).toString()).equals(tf_d_tc.getText())==false && Universitaet.control_tc(tf_d_tc.getText(), uni)==true )
                else if( dt.getValueAt(x, 0).toString().equals(tf_lva_kuerzel.getText())==false && uni.alreadyExistslva2(uni,tf_lva_kuerzel.getText()) ){
                   
                    lb_lva_hinzufuegen_mesaj.setText("LVA existiert bereits. ");
                    
                
                }
                    else{
                        uni.lva.get(x).setName(tf_lva_name.getText());uni.lva.get(x).setFakultaet(tf_lva_fakultaet.getText());uni.lva.get(x).setAnwesenheitspflicht(tf_lva_anwesenheitspflicht.getText());uni.lva.get(x).setCredits(tf_lva_credits.getText());
                        uni.lva.get(x).setKontingent(tf_lva_kontingent.getText());uni.lva.get(x).setRaum(tf_lva_raum.getText());uni.lva.get(x).setSprache(tf_lva_sprache.getText()); uni.lva.get(x).setKuerzel(tf_lva_kuerzel.getText());
                        
                        d.setValueAt(tf_lva_kuerzel.getText(), x, 0);
                        
                        dt.setValueAt(tf_lva_name.getText(), x, 1);dt.setValueAt(tf_lva_kuerzel.getText(), x, 0);
                        dt.setValueAt(tf_lva_fakultaet.getText(), x, 2);dt.setValueAt(tf_lva_anwesenheitspflicht.getText(), x, 3);
                        dt.setValueAt(tf_lva_credits.getText(), x, 4);dt.setValueAt(tf_lva_raum.getText(), x, 5);
                        dt.setValueAt(tf_lva_kontingent.getText(), x, 6);dt.setValueAt(tf_lva_sprache.getText(), x, 7);
                
                       
                        lb_lva_hinzufuegen_mesaj.setText("LVA wurde erfolgreich aktualisiert.");
                    }

       }
        else lb_lva_hinzufuegen_mesaj.setText("Bitte wählen Sie eine Lva aus der Tabelle.");
    }//GEN-LAST:event_b_lva_aktualisierenActionPerformed

    private void b_lva_hinzufuegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_lva_hinzufuegenActionPerformed
//zuerst kontrolliere ich,ob einige ınformationen leer ist.
//dann kuerzel der lva
//wenn alle bedingungen erfüllt werden,kann man ınformationen auf der tabellen sehen.
        if(uni.control_space(tf_lva_name.getText())==true|| uni.control_space(tf_lva_kuerzel.getText())==true    ){
            lb_lva_hinzufuegen_mesaj.setText("Name und Kuerzel der LVA muessen ausgefüllt werden und nicht mit einem Leerzeichen beginnen und beenden.");
        }
        else if(LVA.kontrolKuerzel(tf_lva_kuerzel.getText())==false){
            lb_lva_hinzufuegen_mesaj.setText("Laenge die Kuerzel von LVA soll 6 sein, mit drei Grossbuchstaben anfangen und mit 3 Ziffern beenden.");

        }
        else {
            LVA l = new LVA();
            l.setKuerzel(tf_lva_kuerzel.getText());
            if(uni.alreadyExistslva(uni,l)==true){
                lb_lva_hinzufuegen_mesaj.setText("LVA existiert bereits");

            }
            else{
                l.setName(tf_lva_name.getText());l.setFakultaet(tf_lva_fakultaet.getText());l.setAnwesenheitspflicht(tf_lva_anwesenheitspflicht.getText());l.setCredits(tf_lva_credits.getText());
                l.setKontingent(tf_lva_kontingent.getText());l.setRaum(tf_lva_raum.getText());l.setSprache(tf_lva_sprache.getText());
                uni.lva.add(l);
                String[] str=new String[8];
                str[1]= tf_lva_name.getText();
                str[0]= tf_lva_kuerzel.getText();
                str[2]= tf_lva_fakultaet.getText();
                str[3]= tf_lva_anwesenheitspflicht.getText();
                str[4]= tf_lva_credits.getText();
                str[5]= tf_lva_raum.getText();
                str[6]= tf_lva_kontingent.getText();
                str[7]= tf_lva_sprache.getText();

                DefaultTableModel dd = (DefaultTableModel) table_lva.getModel();
                dd.addRow(str);

                DefaultTableModel dtt = (DefaultTableModel) table_lva_bearbeiten.getModel();
                dtt.addRow(str);
                lb_lva_hinzufuegen_mesaj.setText("LVA wurde erfolgreich hinzufuegt. ");

            }

        }
    }//GEN-LAST:event_b_lva_hinzufuegenActionPerformed

    private void tf_lva_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_lva_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_lva_nameActionPerformed

    private void b_d_suchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_d_suchenActionPerformed
        //wenn dozent existiert,kann mann alle ınformationen von disem dozent sehen.
        int j=0;
        for (int i = 0; i < uni.d.size(); i++) {
            if (tf_d_suchen_tc.getText().equals(uni.d.get(i).getTCNummer())==true){
                j=1;
                lb_d_suchen_mesaj.setText("Name=" + uni.d.get(i).getName() + ", Nachname=" + uni.d.get(i).getNachname() + ", TCNummer=" + uni.d.get(i).getTCNummer() );

                lb_d_suchen_mesaj1.setText(" Geburtsdatum=" + uni.d.get(i).getGeburtsdatum()+ ", Adresse="+ uni.d.get(i).getAdresse() + ", emailadresse=" + uni.d.get(i).getEmailadresse() );
                lb_d_suchen_mesaj2.setText(" Geschlecht="+ uni.d.get(i).getGeschlecht()+", Bereich="+uni.d.get(i).getBereich()+ ", Raum="+uni.d.get(i).getRaum()+ ", phonenummer="+ uni.d.get(i).getPhonenummer());
            }
        }
        if(j==0){
            lb_d_suchen_mesaj.setText("Dozent existiert nicht.");
            lb_d_suchen_mesaj1.setText(" ");
            lb_d_suchen_mesaj2.setText(" ");
        }
    }//GEN-LAST:event_b_d_suchenActionPerformed

    private void tf_d_suchen_tcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_d_suchen_tcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_d_suchen_tcActionPerformed

    private void b_d_loeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_d_loeschenActionPerformed
        //wenn es selected row gibt,loesche ich dieser dozent von der tabellen und lva
        //dozent silindiğinde görevli olduğu dersten de siliyorum.
        int x= table_dozent_bearbeiten.getSelectedRow();

        if(x>=0){
            for(int k=0; k<uni.lva.size();k++){
		if(uni.lva.get(k).lva_d.contains(uni.d.get(x))){
		   uni.lva.get(k).lva_d.remove(uni.d.get(x));
		}
							
	}
            uni.d.remove(x);
           
            DefaultTableModel dtt = (DefaultTableModel) table_dozent_bearbeiten.getModel();
            dtt.removeRow(x);

            DefaultTableModel dd = (DefaultTableModel) table_dozent.getModel();
            dd.removeRow(x);
            uni.tc.remove(uni.d.get(x).getTCNummer());
            lb_d_hinzufuegen_mesaj.setText("Dozent wurde erfolgreich geloescht. ");
        }
        else lb_d_hinzufuegen_mesaj.setText("Bitte waehlen Sie eine Zeile. ");
    }//GEN-LAST:event_b_d_loeschenActionPerformed

    private void b_dozent_hinzufuegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_dozent_hinzufuegenActionPerformed
       //wenn es selected row gibt,kontroliere ich zuerst, ob einige felden leer ist.
       //dann tc-nummer(tc-nummer soll 11 ziffern sein,und jeder person soll verschidene tc-nummer haben)
       //wenn alle bedinungen erfüllt werden,koönne wir informationen auf der tabellen sehen.
       
        if(uni.control_space(tf_d_tc.getText())==true|| uni.control_space(tf_d_name.getText())==true || uni.control_space(tf_d_nachname.getText())==true){
            lb_d_hinzufuegen_mesaj.setText("TC-nummer,Name und Nachname muessen ausgefüllt werden und nicht mit einem Leerzeichen beginnen und beenden.");
        }
        else if(Dozent.kontrolTC(tf_d_tc.getText())==false){
            lb_d_hinzufuegen_mesaj.setText("TC Nummer soll aus 11 Ziffern bestehen.");

        }
        else{
            Dozent d1=new Dozent();
            d1.setTCNummer(tf_d_tc.getText());

            if((Dozent.kontrolTC(tf_d_tc.getText()))!=false &&  uni.control_tc(tf_d_tc.getText(),uni)==false){
                uni.d.add(d1);
                d1.setName(tf_d_name.getText());d1.setNachname(tf_d_name.getText());d1.setGeschlecht(tf_d_nachname.getText());d1.setGeburtsdatum(tf_d_geburtsdatum.getText());
                d1.setAdresse(tf_d_adresse.getText());d1.setEmailadresse(tf_d_email.getText());d1.setPhonenummer(tf_d_phonenummer.getText());
                d1.setRaum(tf_d_raum.getText());d1.setBereich(tf_d_bereich.getText());

                uni.tc.add(d1.getTCNummer());
                lb_d_hinzufuegen_mesaj.setText("Dozent wurde erfolgreich hinzufuegt.");

                String[] str=new String[10];
                str[0]= tf_d_name.getText();
                str[1]= tf_d_nachname.getText().toUpperCase();
                str[2]= tf_d_tc.getText();
                str[3]= tf_d_adresse.getText();
                str[4]= tf_d_email.getText();
                str[5]= tf_d_phonenummer.getText();
                str[6]= tf_d_geschlecht.getText();
                str[7]= tf_d_geburtsdatum.getText();
                str[8]= tf_d_bereich.getText();
                str[9]= tf_d_raum.getText();

                DefaultTableModel dd = (DefaultTableModel) table_dozent.getModel();
                dd.addRow(str);

                DefaultTableModel dtt = (DefaultTableModel) table_dozent_bearbeiten.getModel();
                dtt.addRow(str);
            }
            else {
                lb_d_hinzufuegen_mesaj.setText("Person mit dieser TC-Nummer existiert bereits.");

            }
        }
    }//GEN-LAST:event_b_dozent_hinzufuegenActionPerformed

    private void tf_d_nachnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_d_nachnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_d_nachnameActionPerformed

    private void b_s_aktualisierenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_s_aktualisierenActionPerformed
       //wenn es selected row gibt,kontroliere ich zuerst, ob einige felden leer ist.
       //dann tc-nummer und matrikelnummer bedingungen erfüllen,veraendern die ınformationen
       //wenn alle bedigungen erfüllen ,können wir die neue ınformationen auf der tabellen sehen.
       //wenn es kein  selected row gibt,bekommt der benutzer eine meldung.
       //durch mauseclicked kann ich ınformationen aus der selected row zu text field.
        int x= table_student_bearbeiten.getSelectedRow();

        if(x>=0){
            DefaultTableModel d = (DefaultTableModel) table_student.getModel();
            DefaultTableModel dt = (DefaultTableModel) table_student_bearbeiten.getModel();
            
            if(uni.control_space(tf_s_tc.getText())==true|| uni.control_space(tf_s_name.getText())==true || uni.control_space(tf_s_nachname.getText())==true||uni.control_space(tf_matrikelno.getText())==true){
                lb_s_hinzufuegen_mesaj.setText("TC-nummer,Matrikelnummer,Name und Nachname muessen ausgefüllt werden und nicht mit einem Leerzeichen beginnen und beenden.");
            }
            else if(Dozent.kontrolTC(tf_s_tc.getText())==false){
                lb_s_hinzufuegen_mesaj.setText("TC Nummer soll aus 11 Ziffern bestehen.");
            }
               
            else if( (dt.getValueAt(x, 3).toString()).equals(tf_s_tc.getText())==false && Universitaet.control_tc(tf_s_tc.getText(), uni)==true ){
                lb_s_hinzufuegen_mesaj.setText("Person mir dieser TC-Nummer existiert bereits.");
                    
            }
            else if((dt.getValueAt(x, 2).toString()).equals(tf_matrikelno.getText())==false &&uni.alreadyExists2(uni,tf_matrikelno.getText() )==true){
                 lb_s_hinzufuegen_mesaj.setText("Student mit dieser Matriklenummer existiert bereits.");
            }
            else{
                uni.liste.get(x).setName(tf_s_name.getText());uni.liste.get(x).setNachname(tf_s_name.getText());uni.liste.get(x).setGeschlecht(tf_s_nachname.getText());uni.liste.get(x).setGeburtsdatum(tf_s_geburtsdatum.getText());
                uni.liste.get(x).setAdresse(tf_s_adresse.getText());uni.liste.get(x).setEmailadresse(tf_s_email.getText());uni.liste.get(x).setPhonenummer(tf_s_phonenummer.getText());
                uni.liste.get(x).setMatrikelnummer(tf_matrikelno.getText());uni.liste.get(x).setSemester(tf_s_semester.getText());uni.liste.get(x).setTCNummer(tf_s_tc.getText());
                uni.liste.get(x).setFach(tf_s_fach.getText());uni.liste.get(x).setFakultaet(tf_s_fakultaet.getText());
                        
                        d.setValueAt(tf_s_name.getText(), x, 0);d.setValueAt(tf_s_nachname.getText(), x, 1);d.setValueAt(tf_matrikelno.getText(), x, 2);
                        
                        dt.setValueAt(tf_s_name.getText(), x, 0);dt.setValueAt(tf_s_nachname.getText(), x, 1);
                        dt.setValueAt(tf_matrikelno.getText(), x, 2);dt.setValueAt(tf_s_tc.getText(), x, 3);
                        dt.setValueAt(tf_s_adresse.getText(), x, 4);dt.setValueAt(tf_s_email.getText(), x, 5);
                        dt.setValueAt(tf_s_phonenummer.getText(), x, 6);dt.setValueAt(tf_d_geburtsdatum.getText(), x, 8);
                        dt.setValueAt(tf_s_geschlecht.getText(), x, 7); dt.setValueAt(tf_s_fach.getText(), x, 9);
                        dt.setValueAt(tf_s_semester.getText(), x, 10);dt.setValueAt(tf_s_fakultaet.getText(), x, 11);
                
                       
                        lb_s_hinzufuegen_mesaj.setText("Student wurde erfolgreich aktualisiert.");
            }
        
        
        }  
        else lb_d_hinzufuegen_mesaj.setText("Bitte waehlen Sie eine Zeile.");
    }//GEN-LAST:event_b_s_aktualisierenActionPerformed

    private void b_s_loeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_s_loeschenActionPerformed
        //wenn es selcted row gibt,loesche ich diese student von der tabellen und lva auch.
        //eğer aldığı dersler varsa oradan da silinir.
        int x= table_student_bearbeiten.getSelectedRow();

        if(x>=0){
            for(int p=0;p<uni.lva.size();p++){
		if(uni.lva.get(p).lva_s.contains(uni.liste.get(x))){
		    uni.lva.get(p).lva_s.remove(uni.liste.get(x));
		}
	    }
            
            uni.liste.remove(x);
            

     
            
            DefaultTableModel dt = (DefaultTableModel) table_student_bearbeiten.getModel();
            dt.removeRow(x);

            DefaultTableModel d = (DefaultTableModel) table_student.getModel();
            d.removeRow(x);
            lb_s_hinzufuegen_mesaj.setText("Student wurde erfolgreich geloescht.");
            uni.tc.remove(uni.liste.get(x).getTCNummer());
        }
        else lb_s_hinzufuegen_mesaj.setText("Bitte waehlen Sie eine Zeile.");// TODO add your handling code here:
    }//GEN-LAST:event_b_s_loeschenActionPerformed

    private void b_s_suchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_s_suchenActionPerformed
//wenn student gibt,kann man sehen alle ınformationen von diesem Student.
        int j=0;
        for (int i = 0; i < uni.liste.size(); i++) {
            if (tf_s_suchen_matrikno.getText().equals(uni.liste.get(i).getMatrikelnummer())==true){
                j=1;
                lb_s_suchen_mesaj.setText("Name=" + uni.liste.get(i).getName() + ", Nachname=" + uni.liste.get(i).getNachname() + ", TCNummer=" + uni.liste.get(i).getTCNummer() + ", Matrikelnummer="+uni.liste.get(i).getMatrikelnummer());

                lb_s_suchen_mesaj1.setText(" Geburtsdatum=" + uni.liste.get(i).getGeburtsdatum()+ ", Adresse="+ uni.liste.get(i).getAdresse() + ", emailadresse=" + uni.liste.get(i).getEmailadresse() + ", phonenummer="+ uni.liste.get(i).getPhonenummer());
                lb_s_suchen_mesaj2.setText(" Geschlecht="+ uni.liste.get(i).getGeschlecht()+", Fakultaet="+uni.liste.get(i).getFakultaet()+", Fach="+uni.liste.get(i).getFach()+ ", Semester="+uni.liste.get(i).getSemester());
            }
        }
        if(j==0){
            lb_s_suchen_mesaj.setText("Student existiert nicht.");
            lb_s_suchen_mesaj1.setText(" ");
            lb_s_suchen_mesaj2.setText(" ");
        }
    }//GEN-LAST:event_b_s_suchenActionPerformed

    private void tf_s_suchen_matriknoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_s_suchen_matriknoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_s_suchen_matriknoActionPerformed

    private void tf_s_geschlechtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_s_geschlechtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_s_geschlechtActionPerformed

    private void tf_s_geburtsdatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_s_geburtsdatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_s_geburtsdatumActionPerformed

    private void tf_s_semesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_s_semesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_s_semesterActionPerformed

    private void tf_s_fachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_s_fachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_s_fachActionPerformed

    private void tf_s_fakultaetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_s_fakultaetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_s_fakultaetActionPerformed

    private void tf_s_phonenummerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_s_phonenummerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_s_phonenummerActionPerformed

    private void tf_s_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_s_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_s_emailActionPerformed

    private void tf_s_adresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_s_adresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_s_adresseActionPerformed

    private void tf_s_tcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_s_tcActionPerformed

    }//GEN-LAST:event_tf_s_tcActionPerformed

    private void tf_s_nachnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_s_nachnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_s_nachnameActionPerformed

    private void tf_s_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_s_nameActionPerformed

    }//GEN-LAST:event_tf_s_nameActionPerformed

    private void tf_matrikelnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_matrikelnoActionPerformed

    }//GEN-LAST:event_tf_matrikelnoActionPerformed

    private void b_studenthiznzufuegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_studenthiznzufuegenActionPerformed

        //wenn matrikelnummer nicht die bedingungen erfüllt,bekommt man ein Meldung.
        //wenn ein student dieser matrikelnummer schon haben,bekommt man ein Meldung.
        //jeder hat verschidene tc-nummer,deswegen sind diese tc-nummer in Arraylist in der Person Klasse.
        //zuletzt kontrolle ich, ob informationen leer sind oder mit Leerzeichnen beginnen und beenden.
        //wenn es kein problem gibt,sieht der benutzer auf dem bildschirm "Student wird erfolgreich hinzufuegt."
        if(uni.control_space(tf_matrikelno.getText())==true||uni.control_space(tf_s_tc.getText())==true|| uni.control_space(tf_s_name.getText())==true || uni.control_space(tf_s_nachname.getText())==true  ){
            lb_s_hinzufuegen_mesaj.setText("TC-nummer,Name,Nachname und Matrikelnummer muessen ausgefüllt werden und nicht mit einem Leerzeichen beginnen und beenden.");
        }
        else if(Student.num(tf_matrikelno.getText())==false){
            lb_s_hinzufuegen_mesaj.setText("Matrikelnummer sollte aus 7 Ziffern bestehen, keine Leerzeichen enthalten und erste Ziffer sollte nicht 0 sein.");

        }
        else{
            Student s1 = new Student(tf_matrikelno.getText());
            s1.setMatrikelnummer(tf_matrikelno.getText());
            if(uni.alreadyExists(uni,s1) == true){
                lb_s_hinzufuegen_mesaj.setText("Student mit dieser Matrikelummer existiert bereits");
            }
            else if(Dozent.kontrolTC(tf_s_tc.getText())==false){
                lb_s_hinzufuegen_mesaj.setText("TC Nummer soll aus 11 Ziffern bestehen.");

            }
            else {

                s1.setName(tf_s_name.getText());s1.setNachname(tf_s_nachname.getText()); s1.setGeburtsdatum(tf_s_geburtsdatum.getText());
                s1.setGeschlecht( tf_s_geschlecht.getText()); s1.setAdresse(tf_s_adresse.getText()); s1.setEmailadresse(tf_s_email.getText());
                s1.setPhonenummer(tf_s_phonenummer.getText()); s1.setFakultaet(tf_s_fakultaet.getText()); s1.setFach(tf_s_fach.getText());
                s1.setSemester(tf_s_semester.getText());  s1.setTCNummer(tf_s_tc.getText());

                if(Universitaet.control_tc(tf_s_tc.getText(),uni)==true){

                    lb_s_hinzufuegen_mesaj.setText("Person mit dieser TC-Nummer existiert bereits");

                }
                else {
                    uni.liste.add(s1);
                    uni.tc.add(tf_s_tc.getText());
                    lb_s_hinzufuegen_mesaj.setText("Student wurde erfolgreich hinzufuegt.");

                    String[] st=new String[12];
                    st[0]= tf_s_name.getText();
                    st[1]= tf_s_nachname.getText().toUpperCase();
                    st[2]= tf_matrikelno.getText();
                    st[3]= tf_s_tc.getText();
                    st[4]= tf_s_adresse.getText();
                    st[5]= tf_s_email.getText();
                    st[6]= tf_s_phonenummer.getText();
                    st[7]= tf_s_geschlecht.getText();
                    st[8]= tf_s_geburtsdatum.getText();
                    st[9]= tf_s_fach.getText();
                    st[10]= tf_s_semester.getText();
                    st[11]= tf_s_fakultaet.getText();

                    DefaultTableModel d = (DefaultTableModel) table_student.getModel();
                    d.addRow(st);

                    DefaultTableModel dt = (DefaultTableModel) table_student_bearbeiten.getModel();
                    dt.addRow(st);

                }
            }
        }
    }//GEN-LAST:event_b_studenthiznzufuegenActionPerformed
/**/
    private void table_lva_bearbeitenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_lva_bearbeitenMouseClicked
        int x= table_lva_bearbeiten.getSelectedRow();
        if(x>=0){
            DefaultTableModel dt = (DefaultTableModel) table_lva_bearbeiten.getModel();
            tf_lva_name.setText((String) dt.getValueAt(x, 1));
            tf_lva_kuerzel.setText((String) dt.getValueAt(x, 0));
            tf_lva_fakultaet.setText((String) dt.getValueAt(x, 2));
            tf_lva_anwesenheitspflicht.setText((String) dt.getValueAt(x, 3));
            tf_lva_credits.setText((String) dt.getValueAt(x, 4));
            tf_lva_raum.setText((String) dt.getValueAt(x, 5));
            tf_lva_kontingent.setText((String) dt.getValueAt(x, 6));
            tf_lva_sprache.setText((String) dt.getValueAt(x, 7));
            
            
            
            
        }
        
    }//GEN-LAST:event_table_lva_bearbeitenMouseClicked

    private void b_dozent_aktualsierenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_dozent_aktualsierenActionPerformed
       //wenn es selected row gibt,kontroliere ich zuerst, ob einige felden leer ist.
       //dann tc-nummer  bedingungen erfüllen,veraendern die ınformationen
       //wenn alle bedigungen erfüllen ,können wir die neue ınformationen auf der tabellen sehen.
       //wenn es kein  selected row gibt,bekommt der benutzer eine meldung.
       //durch mauseclicked kann ich ınformationen aus der selected row zu text field.
        int x= table_dozent_bearbeiten.getSelectedRow();

        if(x>=0){
            DefaultTableModel d = (DefaultTableModel) table_dozent.getModel();
            DefaultTableModel dt = (DefaultTableModel) table_dozent_bearbeiten.getModel();
            
            if(uni.control_space(tf_d_tc.getText())==true|| uni.control_space(tf_d_name.getText())==true || uni.control_space(tf_d_nachname.getText())==true){
                lb_d_hinzufuegen_mesaj.setText("TC-nummer,Name und Nachname muessen ausgefüllt werden und nicht mit einem Leerzeichen beginnen und beenden.");
            }
            else if(Dozent.kontrolTC(tf_d_tc.getText())==false){
                lb_d_hinzufuegen_mesaj.setText("TC Nummer soll aus 11 Ziffern bestehen.");
            }
               
            else if( (dt.getValueAt(x, 2).toString()).equals(tf_d_tc.getText())==false && Universitaet.control_tc(tf_d_tc.getText(), uni)==true ){
                lb_d_hinzufuegen_mesaj.setText("Person mir dieser TC-Nummer existiert bereits.");
                    
            }
            else{
                uni.d.get(x).setName(tf_d_name.getText());uni.d.get(x).setNachname(tf_d_name.getText());uni.d.get(x).setGeschlecht(tf_d_nachname.getText());uni.d.get(x).setGeburtsdatum(tf_d_geburtsdatum.getText());
                uni.d.get(x).setAdresse(tf_d_adresse.getText());uni.d.get(x).setEmailadresse(tf_d_email.getText());uni.d.get(x).setPhonenummer(tf_d_phonenummer.getText());
                uni.d.get(x).setRaum(tf_d_raum.getText());uni.d.get(x).setBereich(tf_d_bereich.getText());
                        
                        d.setValueAt(tf_d_name.getText(), x, 0);d.setValueAt(tf_d_nachname.getText(), x, 1);d.setValueAt(tf_d_tc.getText(), x, 2);
                        
                        dt.setValueAt(tf_d_name.getText(), x, 0);dt.setValueAt(tf_d_nachname.getText(), x, 1);
                        dt.setValueAt(tf_d_tc.getText(), x, 2);dt.setValueAt(tf_d_adresse.getText(), x, 3);
                        dt.setValueAt(tf_d_email.getText(), x, 4);dt.setValueAt(tf_d_phonenummer.getText(), x, 5);
                        dt.setValueAt(tf_d_geschlecht.getText(), x, 6);dt.setValueAt(tf_d_geburtsdatum.getText(), x, 7);
                        dt.setValueAt(tf_d_bereich.getText(), x, 8); dt.setValueAt(tf_d_raum.getText(), x, 9);
                
                       
                        lb_d_hinzufuegen_mesaj.setText("Dozent wurde erfolgreich aktualisiert.");
            }
        
        
        }  
        else lb_d_hinzufuegen_mesaj.setText("Bitte waehlen Sie eine Zeile.");
    }//GEN-LAST:event_b_dozent_aktualsierenActionPerformed

    private void table_dozent_bearbeitenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_dozent_bearbeitenMouseClicked
int x= table_dozent_bearbeiten.getSelectedRow();
        if(x>=0){
            DefaultTableModel dt = (DefaultTableModel) table_dozent_bearbeiten.getModel();
            tf_d_name.setText((String) dt.getValueAt(x, 0));
            tf_d_nachname.setText((String) dt.getValueAt(x, 1));
            tf_d_tc.setText((String) dt.getValueAt(x, 2));
            tf_d_adresse.setText((String) dt.getValueAt(x, 3));
            tf_d_email.setText((String) dt.getValueAt(x, 4));
            tf_d_phonenummer.setText((String) dt.getValueAt(x, 5));
            tf_d_geschlecht.setText((String) dt.getValueAt(x, 6));
            tf_d_geburtsdatum.setText((String) dt.getValueAt(x, 7));
            tf_d_bereich.setText((String) dt.getValueAt(x, 8));
            tf_d_raum.setText((String) dt.getValueAt(x, 9));
            
            
            
            
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_table_dozent_bearbeitenMouseClicked

    private void tf_lva_kuerzelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_lva_kuerzelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_lva_kuerzelActionPerformed

    private void table_student_bearbeitenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_student_bearbeitenMouseClicked
      int x= table_student_bearbeiten.getSelectedRow();
        if(x>=0){
            DefaultTableModel dt = (DefaultTableModel) table_student_bearbeiten.getModel();
            tf_s_name.setText((String) dt.getValueAt(x, 0));
            tf_s_nachname.setText((String) dt.getValueAt(x, 1));
            tf_matrikelno.setText((String) dt.getValueAt(x, 2));
            tf_s_tc.setText((String) dt.getValueAt(x, 3));
            tf_s_adresse.setText((String) dt.getValueAt(x, 4));
            tf_s_email.setText((String) dt.getValueAt(x,5 ));
            tf_s_phonenummer.setText((String) dt.getValueAt(x, 6));
            tf_s_geschlecht.setText((String) dt.getValueAt(x, 7));
            tf_s_geburtsdatum.setText((String) dt.getValueAt(x, 8));
            tf_s_fach.setText((String) dt.getValueAt(x, 9));
            tf_s_semester.setText((String) dt.getValueAt(x, 10));
            tf_s_fakultaet.setText((String) dt.getValueAt(x, 11));
            
            
            
            
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_table_student_bearbeitenMouseClicked
        
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
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_d_loeschen;
    private javax.swing.JButton b_d_lva_abmelden;
    private javax.swing.JButton b_d_lva_anzeigen;
    private javax.swing.JButton b_d_lva_anzeigen1;
    private javax.swing.JButton b_d_lva_zuweisen;
    private javax.swing.JButton b_d_suchen;
    private javax.swing.JButton b_dozent_aktualsieren;
    private javax.swing.JButton b_dozent_hinzufuegen;
    private javax.swing.JButton b_lva_aktualisieren;
    private javax.swing.JButton b_lva_hinzufuegen;
    private javax.swing.JButton b_lva_loeschen;
    private javax.swing.JButton b_lva_suchen;
    private javax.swing.JButton b_s_aktualisieren;
    private javax.swing.JButton b_s_loeschen;
    private javax.swing.JButton b_s_lva_abmelden;
    private javax.swing.JButton b_s_lva_anmelden;
    private javax.swing.JButton b_s_lva_anzeigen;
    private javax.swing.JButton b_s_lva_anzeigen1;
    private javax.swing.JButton b_s_suchen;
    private javax.swing.JButton b_studenthiznzufuegen;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP_anmeldung_abmeldung_operationen;
    private javax.swing.JPanel jP_dozent_suchen;
    private javax.swing.JPanel jP_dozent_verwaltung;
    private javax.swing.JPanel jP_lva_suchen;
    private javax.swing.JPanel jP_lva_verwaltung;
    private javax.swing.JPanel jP_student_suchen;
    private javax.swing.JPanel jP_student_verwaltung;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lb_d_hinzufuegen_mesaj;
    private javax.swing.JLabel lb_d_lva_mesaj;
    private javax.swing.JLabel lb_d_suchen_mesaj;
    private javax.swing.JLabel lb_d_suchen_mesaj1;
    private javax.swing.JLabel lb_d_suchen_mesaj2;
    private javax.swing.JLabel lb_d_suchen_tc;
    private javax.swing.JLabel lb_lva_hinzufuegen_mesaj;
    private javax.swing.JLabel lb_lva_suchen_mesaj;
    private javax.swing.JLabel lb_lva_suchen_mesaj1;
    private javax.swing.JLabel lb_lva_suchen_mesaj2;
    private javax.swing.JLabel lb_programm_name;
    private javax.swing.JLabel lb_s_adresse;
    private javax.swing.JLabel lb_s_email;
    private javax.swing.JLabel lb_s_fach;
    private javax.swing.JLabel lb_s_fakultaet;
    private javax.swing.JLabel lb_s_geburtsdatum;
    private javax.swing.JLabel lb_s_geschlecht;
    private javax.swing.JLabel lb_s_hinzufuegen_mesaj;
    private javax.swing.JLabel lb_s_lva_mesaj;
    private javax.swing.JLabel lb_s_matrikelno;
    private javax.swing.JLabel lb_s_nachname;
    private javax.swing.JLabel lb_s_name;
    private javax.swing.JLabel lb_s_phonenummer;
    private javax.swing.JLabel lb_s_semester;
    private javax.swing.JLabel lb_s_suchen_mesaj;
    private javax.swing.JLabel lb_s_suchen_mesaj1;
    private javax.swing.JLabel lb_s_suchen_mesaj2;
    private javax.swing.JLabel lb_s_tc;
    private javax.swing.JLabel lb_ssuchen_matrikno;
    private javax.swing.JTabbedPane program;
    private javax.swing.JTable table_dozent;
    private javax.swing.JTable table_dozent_bearbeiten;
    private javax.swing.JTable table_lva;
    private javax.swing.JTable table_lva_bearbeiten;
    private javax.swing.JTable table_student;
    private javax.swing.JTable table_student_bearbeiten;
    private javax.swing.JTextField tf_d_adresse;
    private javax.swing.JTextField tf_d_bereich;
    private javax.swing.JTextField tf_d_email;
    private javax.swing.JTextField tf_d_geburtsdatum;
    private javax.swing.JTextField tf_d_geschlecht;
    private javax.swing.JTextField tf_d_nachname;
    private javax.swing.JTextField tf_d_name;
    private javax.swing.JTextField tf_d_operation_lva_kuerzel;
    private javax.swing.JTextField tf_d_operation_tc;
    private javax.swing.JTextField tf_d_phonenummer;
    private javax.swing.JTextField tf_d_raum;
    private javax.swing.JTextField tf_d_suchen_tc;
    private javax.swing.JTextField tf_d_tc;
    private javax.swing.JTextField tf_lva_anwesenheitspflicht;
    private javax.swing.JTextField tf_lva_credits;
    private javax.swing.JTextField tf_lva_fakultaet;
    private javax.swing.JTextField tf_lva_kontingent;
    private javax.swing.JTextField tf_lva_kuerzel;
    private javax.swing.JTextField tf_lva_name;
    private javax.swing.JTextField tf_lva_raum;
    private javax.swing.JTextField tf_lva_sprache;
    private javax.swing.JTextField tf_lva_suchen_kuerzel;
    private javax.swing.JTextField tf_matrikelno;
    private javax.swing.JTextField tf_s_adresse;
    private javax.swing.JTextField tf_s_email;
    private javax.swing.JTextField tf_s_fach;
    private javax.swing.JTextField tf_s_fakultaet;
    private javax.swing.JTextField tf_s_geburtsdatum;
    private javax.swing.JTextField tf_s_geschlecht;
    private javax.swing.JTextField tf_s_nachname;
    private javax.swing.JTextField tf_s_name;
    private javax.swing.JTextField tf_s_operation_kuerzel;
    private javax.swing.JTextField tf_s_operation_matrikno;
    private javax.swing.JTextField tf_s_phonenummer;
    private javax.swing.JTextField tf_s_semester;
    private javax.swing.JTextField tf_s_suchen_matrikno;
    private javax.swing.JTextField tf_s_tc;
    // End of variables declaration//GEN-END:variables
}
