package gestordocumental.interfaces;

import gestordocumental.conexion.conexion;
import java.awt.HeadlessException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class eliminar extends javax.swing.JFrame {

    public eliminar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numfinca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Eliminar Propiedad");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Número de finca");

        jButton1.setText("Eliminar");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(numfinca, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numfinca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String finca = numfinca.getText();
        if("".equals(finca)){
            JOptionPane.showMessageDialog(null, "Debe ingresar el número de finca", "Error de ingreso", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        try{
            int numeroFinca = Integer.parseInt(finca);
            Connection nueva = conexion.getConexion();
            PreparedStatement consulta;
            consulta = nueva.prepareStatement("select esquema.validarPropiedad("+numeroFinca+")");
            ResultSet respuesta = consulta.executeQuery();
            ArrayList<String> info = new ArrayList<>();

            while(respuesta.next()){
                info.add(respuesta.getString(1));
            }

            if (Integer.parseInt(info.get(0)) == 0){
                JOptionPane.showMessageDialog(null, numeroFinca+" no es una finca válida", "Error de ingreso", JOptionPane.PLAIN_MESSAGE);
            }else{
                if(JOptionPane.showConfirmDialog(null,"Está seguro de eliminar la propiedad?","CUIDADO",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    String query = "execute esquema.eliminarPropiedad @numeroFinca = ?";
                    CallableStatement pst = nueva.prepareCall(query);
                    pst.setInt(1,numeroFinca);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Se eliminó la propiedad con éxito", "ÉXITO", JOptionPane.PLAIN_MESSAGE);
                    this.dispose();
                }
            }

        }catch (HeadlessException | NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "El numero de finca debe ser un valor númerico", "Error de ingreso", JOptionPane.PLAIN_MESSAGE);
            return;
        }catch(SQLException m){
            JOptionPane.showMessageDialog(null, m);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField numfinca;
    // End of variables declaration//GEN-END:variables
}
