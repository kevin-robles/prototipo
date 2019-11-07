package gestordocumental.interfaces;

import static gestordocumental.conexion.conexion.getConexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class escogerModificar extends javax.swing.JFrame {
    public escogerModificar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numFinca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Modificar Propiedad");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Número de finca");

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(247, 247, 247)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(jLabel2)
                            .addGap(26, 26, 26)
                            .addComponent(numFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String finca = numFinca.getText();
        if("".equals(finca)){
            JOptionPane.showMessageDialog(null, "Debe ingresar el número de finca", "Error de ingreso", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        try{
            int numeroFinca = Integer.parseInt(finca);
            Connection con = getConexion();
            PreparedStatement consulta = con.prepareStatement("select * from esquema.consultarPropiedad("+numeroFinca+")");
            ResultSet respuesta = consulta.executeQuery();
            ArrayList<String> numeroPlano = new ArrayList<>();
            while(respuesta.next()){
                numeroPlano.add(respuesta.getString("numeroPlano"));
            }
            if(numeroPlano.isEmpty()){
                JOptionPane.showMessageDialog(null,"Propiedad no existe","Error",JOptionPane.PLAIN_MESSAGE);
                return;
            }
            
            modificar interfaz = new modificar();
            interfaz.setVisible(true);
            interfaz.setLocationRelativeTo(null);
            interfaz.setDefaultCloseOperation(modificar.HIDE_ON_CLOSE);
            modificar.numeroFinca.setText(finca);
            modificar.numeroFinca.setEditable(false);
        }catch (HeadlessException | NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "El número de finca debe ser un valor númerico", "Error de ingreso", JOptionPane.PLAIN_MESSAGE);
            return;
        }catch(SQLException m){
            JOptionPane.showMessageDialog(null, m);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField numFinca;
    // End of variables declaration//GEN-END:variables
}
