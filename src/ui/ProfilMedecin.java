/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Medecin;

/**
 *
 * @author pak
 */
public class ProfilMedecin extends javax.swing.JFrame {

    /**
     * Creates new form RegisterMedecinUi
     */
    public ProfilMedecin() {
        initComponents();
        
        jPanel6.setVisible(false);
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
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        urlImageM = new javax.swing.JTextPane();
        jLabel18 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setBackground(new java.awt.Color(0,0,0,0));
        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout_rounded_left_48px.png"))); // NOI18N
        jButton8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 50, 50));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_32px.png"))); // NOI18N
        jButton1.setBorder(null);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 40, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Acceuil");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 80, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/list_16px.png"))); // NOI18N
        jButton2.setBorder(null);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 40, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Liste Patient");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_to_clipboard_24px.png"))); // NOI18N
        jButton3.setBorder(null);
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 40, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nouvelle consultation");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 350, 130, -1));

        jButton5.setBackground(new java.awt.Color(51, 51, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/archive_folder_24px.png"))); // NOI18N
        jButton5.setBorder(null);
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 40, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Parametre");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 440, 70, -1));

        jButton9.setBackground(new java.awt.Color(51, 51, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin_settings_male_16px.png"))); // NOI18N
        jButton9.setBorder(null);
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 40, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Archives");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 390, 70, -1));

        jPanel1.setBackground(new java.awt.Color(255, 249, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 204));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 50, 40));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/round_48px.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 50, 50));

        profil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user123.PNG"))); // NOI18N
        jPanel1.add(profil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 115));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 180));

        email.setText("jLabel6");
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 80, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 590));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about_26px.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 40, 30));

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_arrow_24px.png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 740, 80));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 270, 210));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("NOM:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 40, -1));

        nomMedecin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nomMedecin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        nomMedecin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomMedecinActionPerformed(evt);
            }
        });
        jPanel4.add(nomMedecin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 250, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("PRENOM:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 70, 20));

        prenomMedecin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        prenomMedecin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        prenomMedecin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomMedecinActionPerformed(evt);
            }
        });
        jPanel4.add(prenomMedecin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 250, 30));

        sexeM.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sexeM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme" }));
        jPanel4.add(sexeM, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 250, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("SEXE:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 41, 23));

        service.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        service.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Imagerie", "Radio", "Scanner", "Analyse", " " }));
        service.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceActionPerformed(evt);
            }
        });
        jPanel4.add(service, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 170, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Service");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        password.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 89, 250, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("mot de passe ");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, 20));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("E-mail :");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        emailMedecin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        emailMedecin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.add(emailMedecin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 39, 250, 30));

        telMedecin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jPanel4.add(telMedecin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 4, 250, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("TEL:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 30, 20));

        jButton6.setBackground(new java.awt.Color(127, 6, 229));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Modifier");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 280, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 30, 190));

        urlImageM.setEditable(false);
        jScrollPane2.setViewportView(urlImageM);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 130, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Image:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 60, -1));

        jButton10.setBackground(new java.awt.Color(240, 255, 255));
        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton10.setText("Pacourir...");
        jButton10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 247, 60, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 690, 420));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Profil du medecin connecté");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 740, 40));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0, 0)
        );
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Voulez-vous vraiment modifier vos informations ?");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jButton11.setBackground(new java.awt.Color(0, 204, 0));
        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("OUI");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jButton12.setBackground(new java.awt.Color(255, 51, 51));
        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("NON");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info_30px.png"))); // NOI18N
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 730, 220));

        setSize(new java.awt.Dimension(935, 628));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
       // new QuestionUi().setVisible(true);
       // this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new AboutPageUi().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new MedecinDashboardUi().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nomMedecinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomMedecinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomMedecinActionPerformed

    private void serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serviceActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(true);
//  new ModifQuestionMedecinUi().setVisible(true);

//        Medecin foto=new Medecin(nomMedecin.getText(), prenomMedecin.getText(), service.getSelectedItem().toString(), telMedecin.getComponentCount(), emailMedecin.getText(),password.getText(),urlImageM.getText(),sexeM.getSelectedItem().toString());
//        boolean ok=foto.saveMedecin();
//        if(ok==true){
//            JOptionPane.showMessageDialog(null, "Enregistrement du médecin "+nomMedecin.getText()+" "+prenomMedecin.getText()+" effectuer avec succes ");
//            MedecinDashboardUi p= new MedecinDashboardUi();
//            String n=nomMedecin.getText().toUpperCase();
//            String P=prenomMedecin.getText().toUpperCase();
//            p.name.setText((n.charAt(0))+""+P.charAt(0));
//            p.setVisible(true);
//        }
//        else
//        JOptionPane.showMessageDialog(null, "Erreur de l'enregistrement du médecin "+nomMedecin.getText()+" "+nomMedecin.getText());

    }//GEN-LAST:event_jButton6ActionPerformed

    private void prenomMedecinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomMedecinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomMedecinActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        JFileChooser brose= new JFileChooser();
        //extension
        FileNameExtensionFilter ext=new FileNameExtensionFilter("png", "jpg","jpeg");
        brose.addChoosableFileFilter(ext);
        int showopen= brose.showOpenDialog(null);
        if(showopen ==JFileChooser.APPROVE_OPTION ){
            File selectfile=  brose.getSelectedFile();
            String path= selectfile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectfile);
            urlImageM.setText(path);
            //       display image in jlabel

            ImageIcon Ii=new ImageIcon(path);
            image.setIcon(Ii);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
      
        Medecin foto=new Medecin(nomMedecin.getText(), prenomMedecin.getText(), service.getSelectedItem().toString(),(int)telMedecin.getValue(), email.getText(),password.getText(),image.getText(),sexeM.getSelectedItem().toString());
        foto.updateMedecin();
        if( foto.updateMedecin()){
            JOptionPane.showMessageDialog(this, "Parfait");
            MedecinDashboardUi p= new MedecinDashboardUi();
            ImageIcon Ii=new ImageIcon(urlImageM.getText());
                String n=nomMedecin.getText().toUpperCase();
                String P=prenomMedecin.getText().toUpperCase();
                p.name.setText((n.charAt(0))+""+P.charAt(0));
                p.mail.setText(emailMedecin.getText());
                p.url.setText(urlImageM.getText());
                if(this.urlImageM.getText()==null){
                     ImageIcon Ii1=new ImageIcon("C:\\Users\\pak\\Documents\\NetBeansProjects\\Main_Projet_Of_Gestion_des_Imageries_POO\\src\\images\\user123.PNG");
                   p.statut.setIcon(Ii1);
                }  else{
                     p.statut.setIcon(Ii);
                }
                p.setVisible(true);
                this.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Erreur");

        }

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        new MedecinDashboardUi().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(ProfilMedecin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfilMedecin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfilMedecin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfilMedecin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfilMedecin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JLabel email = new javax.swing.JLabel();
    public static final javax.swing.JTextField emailMedecin = new javax.swing.JTextField();
    public static final javax.swing.JLabel image = new javax.swing.JLabel();
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static final javax.swing.JLabel name = new javax.swing.JLabel();
    public static final javax.swing.JTextField nomMedecin = new javax.swing.JTextField();
    public static final javax.swing.JPasswordField password = new javax.swing.JPasswordField();
    public static final javax.swing.JTextField prenomMedecin = new javax.swing.JTextField();
    public static final javax.swing.JLabel profil = new javax.swing.JLabel();
    public static final javax.swing.JComboBox<String> service = new javax.swing.JComboBox<>();
    public static final javax.swing.JComboBox<String> sexeM = new javax.swing.JComboBox<>();
    public static final javax.swing.JSpinner telMedecin = new javax.swing.JSpinner();
    private javax.swing.JTextPane urlImageM;
    // End of variables declaration//GEN-END:variables
}
