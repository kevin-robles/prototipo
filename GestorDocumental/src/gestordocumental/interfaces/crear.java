package gestordocumental.interfaces;

import gestordocumental.conexion.conexion;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class crear extends javax.swing.JFrame {
    static File imagen;
    public crear() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField13 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        numeroFinca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numeroPlano = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        areaRegistral = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        viasAcceso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        metrosFrente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        abonados = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        valorFiscal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        unidadesHabitacionales = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cantidadLocales = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        topografia = new javax.swing.JComboBox<>();
        nivelTerreno = new javax.swing.JComboBox<>();
        uso = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        serv1 = new javax.swing.JCheckBox();
        serv5 = new javax.swing.JCheckBox();
        serv2 = new javax.swing.JCheckBox();
        serv6 = new javax.swing.JCheckBox();
        serv7 = new javax.swing.JCheckBox();
        serv3 = new javax.swing.JCheckBox();
        serv4 = new javax.swing.JCheckBox();
        serv8 = new javax.swing.JCheckBox();
        imagen2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tipoProp = new javax.swing.JComboBox<>();

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setText("Crear Propiedad");

        numeroFinca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroFincaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Número de finca");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Número de plano");

        numeroPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroPlanoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Área registral");

        areaRegistral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaRegistralActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Categoría");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Servicios Recibidos");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Ancho Vía de acceso");

        viasAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viasAccesoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nivel de terreno");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Uso");

        metrosFrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metrosFrenteActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Metros de frente");

        abonados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abonadosActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Abonados (separar cédulas con coma)");

        valorFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorFiscalActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Valor Fiscal");

        unidadesHabitacionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadesHabitacionalesActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Cantidad unidades habitacionales ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Topografía");

        cantidadLocales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadLocalesActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Cantidad locales");

        categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Finca inscrita", "Finca aproximada", "Finca sin escribir", "Finca exenta", "Fincas de información posesoría" }));

        topografia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Plana", "Ondulada", "Quebrada", "Muy quebrada" }));

        nivelTerreno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "alto", "medio", "bajo" }));

        uso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Vacante", "Residencial", "Comercial", "Industrial", "Turismo", "Educativo", "Recreativo", "Repastos", "Agricultura" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Foto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        serv1.setText("Cementerio");

        serv5.setText("jCheckBox1");

        serv2.setText("Agua");
        serv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serv2ActionPerformed(evt);
            }
        });

        serv6.setText("jCheckBox1");

        serv7.setText("jCheckBox1");

        serv3.setText("jCheckBox1");

        serv4.setText("jCheckBox1");

        serv8.setText("jCheckBox1");

        imagen2.setBackground(new java.awt.Color(204, 204, 255));
        imagen2.setForeground(new java.awt.Color(102, 102, 0));
        imagen2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Tipo Propiedad");

        tipoProp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2" }));
        tipoProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPropActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(topografia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroPlano)
                    .addComponent(areaRegistral)
                    .addComponent(viasAcceso)
                    .addComponent(numeroFinca)
                    .addComponent(categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(serv1)
                            .addComponent(serv4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(serv2)
                                .addComponent(serv3)))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(serv5)
                            .addComponent(serv6)
                            .addComponent(serv7)
                            .addComponent(serv8)))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoProp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(metrosFrente, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(abonados, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorFiscal, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unidadesHabitacionales, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadLocales, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                            .addComponent(nivelTerreno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(178, 178, 178))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numeroFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nivelTerreno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(metrosFrente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abonados, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unidadesHabitacionales, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoProp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(areaRegistral, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serv1)
                            .addComponent(serv5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serv6)
                            .addComponent(serv2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serv7)
                            .addComponent(serv3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serv4)
                            .addComponent(serv8))
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viasAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topografia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadLocales, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(imagen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numeroFincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroFincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroFincaActionPerformed

    private void numeroPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroPlanoActionPerformed

    private void areaRegistralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaRegistralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaRegistralActionPerformed

    private void viasAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viasAccesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viasAccesoActionPerformed

    private void metrosFrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metrosFrenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metrosFrenteActionPerformed

    private void abonadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abonadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abonadosActionPerformed

    private void valorFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorFiscalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorFiscalActionPerformed

    private void unidadesHabitacionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadesHabitacionalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadesHabitacionalesActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void cantidadLocalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadLocalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadLocalesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String numFinca = numeroFinca.getText();
        String numPlano = numeroPlano.getText();
        String areaRegis = areaRegistral.getText();
        String categ = categoria.getSelectedItem().toString();
        boolean a=  serv1.isSelected();
        boolean b=  serv2.isSelected();
        boolean c=  serv3.isSelected();
        boolean d=  serv4.isSelected();
        boolean e=  serv5.isSelected();
        boolean f=  serv6.isSelected();
        boolean g=  serv7.isSelected();
        boolean h=  serv8.isSelected();
        String vias = viasAcceso.getText();
        String topo = topografia.getSelectedItem().toString();
        String nivel = nivelTerreno.getSelectedItem().toString();
        String usoo = uso.getSelectedItem().toString();
        String metros = metrosFrente.getText();
        String listaAbonados = abonados.getText();
        String valor = valorFiscal.getText();
        String habitaciones = unidadesHabitacionales.getText();
        String locales = cantidadLocales.getText();
        String tipo = tipoProp.getSelectedItem().toString();
        
        if("".equals(numFinca) || "".equals(numPlano) || "".equals(areaRegis) || " ".equals(categ) || "".equals(vias) || " ".equals(topo) || " ".equals(nivel) || " ".equals(usoo) || "".equals(metros) || "".equals(listaAbonados) || "".equals(valor) || "".equals(habitaciones) || "".equals(locales) || imagen == null || " ".equals(tipo)){
            JOptionPane.showMessageDialog(null, "Debe ingresar todos los datos", "Error de ingreso", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        int finca,plano,area,viasT,metr,valorF,habita,local;
        try{
            finca =  Integer.parseInt(numFinca);
            plano =  Integer.parseInt(numPlano);
            area =  Integer.parseInt(areaRegis);
            viasT =  Integer.parseInt(vias);
            metr =  Integer.parseInt(metros);
            valorF =  Integer.parseInt(valor);
            habita =  Integer.parseInt(habitaciones);
            local =  Integer.parseInt(locales);
        }catch (HeadlessException | NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "Número de finca, número de plano, Área Registral, Vías de Acceso, Metros de frente, valor fiscal, Cantidad habitaciones y Cantidad de locales deben ser valores númericos", "Error de ingreso", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        String[] arr = listaAbonados.split(",");
        int i = 0;
        while (i < arr.length){
            try{
                int prueba = Integer.parseInt(arr[i]);
                Connection nueva = conexion.getConexion();
                PreparedStatement consulta;
                consulta = nueva.prepareStatement("select esquema.validarAbonado("+prueba+")");
                ResultSet respuesta = consulta.executeQuery();
                ArrayList<String> info = new ArrayList<>();

                while(respuesta.next()){
                    info.add(respuesta.getString(1));
                }
                
                if (Integer.parseInt(info.get(0)) == 0){
                    JOptionPane.showMessageDialog(null, prueba+" no es una cédula válida", "Error de ingreso", JOptionPane.PLAIN_MESSAGE);
                    return;
                }

            }catch (HeadlessException | NumberFormatException x) {
                JOptionPane.showMessageDialog(null, "La cédula debe ser un valor númerico", "Error de ingreso", JOptionPane.PLAIN_MESSAGE);
                return;
            }catch(SQLException m){
            JOptionPane.showMessageDialog(null, "E!");
        } 
            
        i++;
        }
        
        //Se toma la foto para insertar
        String nombre_archivo;
        byte[] foto = null;
        nombre_archivo = imagen.getAbsolutePath();
        try {
            File imageen = new File(nombre_archivo);
            FileInputStream file = new FileInputStream(imageen);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] bytee = new byte[1024];
            for (int readnum; (readnum = file.read(bytee)) != -1;) {
                bos.write(bytee, 0, readnum);
            }
            foto = bos.toByteArray();
        } catch (IOException u) {
            JOptionPane.showMessageDialog(null, "Error de fotografía");
            return;
        }
        try{
            Connection nueva = conexion.getConexion();
            String query = "execute esquema.ingresarPropiedad @numeroFinca = ?,@numeroPlano = ?,@areaRegistral = ?,@categoria = ?,@viasAcceso = ?,@topografia = ?, @nivelTerreno = ?, @uso = ?,@metrosFrente = ?,@valorFiscal = ?,@unidadesHabitacionales = ?,@cantidadLocales = ?,@foto = ?,@tipo =?";
            CallableStatement pst = nueva.prepareCall(query);

            pst.setInt(1,finca);
            pst.setInt(2,plano);
            pst.setInt(3,area);
            pst.setString(4,categ);
            pst.setInt(5,viasT);
            pst.setString(6,topo);
            pst.setString(7,nivel);
            pst.setString(8,usoo);
            pst.setInt(9,metr);
            pst.setInt(10,valorF);
            pst.setInt(11,habita);
            pst.setInt(12,local);
            pst.setBytes(13,foto);
            pst.setString(14,tipo);

            pst.execute();
            
        }
        catch(SQLException u){
            System.out.println(u);
            return;
        }  
        try{
            Connection nueva = conexion.getConexion();
            if(a == true){
                String query = "execute esquema.ingresarPropiedadServicios @numeroFinca = ?,@servicio = ?";
                CallableStatement pst = nueva.prepareCall(query);
                pst.setInt(1,finca);
                pst.setString(2,serv1.getText());
                pst.execute();
            }
            if(b == true){
                String query = "execute esquema.ingresarPropiedadServicios @numeroFinca = ?,@servicio = ?";
                CallableStatement pst = nueva.prepareCall(query);
                pst.setInt(1,finca);
                pst.setString(2,serv2.getText());
                pst.execute();
            }
            if(c == true){
                String query = "execute esquema.ingresarPropiedadServicios @numeroFinca = ?,@servicio = ?";
                CallableStatement pst = nueva.prepareCall(query);
                pst.setInt(1,finca);
                pst.setString(2,serv3.getText());
                pst.execute();
            }
            if(d == true){
                String query = "execute esquema.ingresarPropiedadServicios @numeroFinca = ?,@servicio = ?";
                CallableStatement pst = nueva.prepareCall(query);
                pst.setInt(1,finca);
                pst.setString(2,serv4.getText());
                pst.execute();
            }
            if(e == true){
                String query = "execute esquema.ingresarPropiedadServicios @numeroFinca = ?,@servicio = ?";
                CallableStatement pst = nueva.prepareCall(query);
                pst.setInt(1,finca);
                pst.setString(2,serv5.getText());
                pst.execute();
            }
            if(f == true){
                String query = "execute esquema.ingresarPropiedadServicios @numeroFinca = ?,@servicio = ?";
                CallableStatement pst = nueva.prepareCall(query);
                pst.setInt(1,finca);
                pst.setString(2,serv6.getText());
                pst.execute();
            }
            if(g == true){
                String query = "execute esquema.ingresarPropiedadServicios @numeroFinca = ?,@servicio = ?";
                CallableStatement pst = nueva.prepareCall(query);
                pst.setInt(1,finca);
                pst.setString(2,serv7.getText());
                pst.execute();
            }
            if(h == true){
                String query = "execute esquema.ingresarPropiedadServicios @numeroFinca = ?,@servicio = ?";
                CallableStatement pst = nueva.prepareCall(query);
                pst.setInt(1,finca);
                pst.setString(2,serv8.getText());
                pst.execute();
            }
            
        }catch(SQLException q){
            System.out.println(q);
            return;
        }
        try{
            Connection nueva = conexion.getConexion();
            String query = "execute esquema.ingresarPropiedadAbonado @numeroFinca = ?,@cedula = ?";
            
            
            int o = 0;
            while (o < arr.length){
                CallableStatement pst = nueva.prepareCall(query);
                pst.setInt(1,finca);
                pst.setInt(2,Integer.parseInt(arr[o]));

                pst.execute();
                o++;
            }
            JOptionPane.showMessageDialog(null, "Se registró la propiedad con éxito!");
            this.dispose();
            
        }
        catch(SQLException u){
            JOptionPane.showMessageDialog(null, u);
        }  
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void serv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serv2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serv2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int resultado;
        foto buscador1 = new foto();
        //Filtros
        FileNameExtensionFilter formato = new FileNameExtensionFilter("Images", "jpn", "png", "gif", "bmp");
        foto.jFileChooser1.setFileFilter(formato);

        resultado = foto.jFileChooser1.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == resultado) {
            imagen = foto.jFileChooser1.getSelectedFile();

            try {
                ImageIcon ImgIcon = new ImageIcon(imagen.toString());

                Icon icono = new ImageIcon(ImgIcon.getImage().getScaledInstance(imagen2.getWidth(), imagen2.getHeight(), Image.SCALE_DEFAULT));

                imagen2.setIcon(icono);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al abrir:  " + ex);
            }

        }      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tipoPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoPropActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abonados;
    private javax.swing.JTextField areaRegistral;
    private javax.swing.JTextField cantidadLocales;
    private javax.swing.JComboBox<String> categoria;
    public static javax.swing.JLabel imagen2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField metrosFrente;
    private javax.swing.JComboBox<String> nivelTerreno;
    private javax.swing.JTextField numeroFinca;
    private javax.swing.JTextField numeroPlano;
    private javax.swing.JCheckBox serv1;
    private javax.swing.JCheckBox serv2;
    private javax.swing.JCheckBox serv3;
    private javax.swing.JCheckBox serv4;
    private javax.swing.JCheckBox serv5;
    private javax.swing.JCheckBox serv6;
    private javax.swing.JCheckBox serv7;
    private javax.swing.JCheckBox serv8;
    private javax.swing.JComboBox<String> tipoProp;
    private javax.swing.JComboBox<String> topografia;
    private javax.swing.JTextField unidadesHabitacionales;
    private javax.swing.JComboBox<String> uso;
    private javax.swing.JTextField valorFiscal;
    private javax.swing.JTextField viasAcceso;
    // End of variables declaration//GEN-END:variables
}
