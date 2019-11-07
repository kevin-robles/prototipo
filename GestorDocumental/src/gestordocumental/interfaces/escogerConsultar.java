
package gestordocumental.interfaces;

import static gestordocumental.conexion.conexion.getConexion;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class escogerConsultar extends javax.swing.JFrame {

    public escogerConsultar() {
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
        jLabel1.setText("Consultar Propiedad");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Número de finca");

        jButton1.setText("Consultar");
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
                            .addComponent(numfinca, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numfinca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
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
            Connection con = getConexion();
            PreparedStatement consulta = con.prepareStatement("select * from esquema.consultarPropiedad("+numeroFinca+")");
            ResultSet respuesta = consulta.executeQuery();
            ArrayList<String> numeroPlano = new ArrayList<>();
            ArrayList<String> areaRegistral = new ArrayList<>();
            ArrayList<String> categoria = new ArrayList<>();
            ArrayList<String> viasAcceso = new ArrayList<>();
            ArrayList<String> topografia = new ArrayList<>();
            ArrayList<String> nivelTerreno = new ArrayList<>();
            ArrayList<String> uso = new ArrayList<>();
            ArrayList<String> metrosFrente = new ArrayList<>();
            ArrayList<String> valorFiscal = new ArrayList<>();
            ArrayList<String> unidadesHabitacionales = new ArrayList<>();
            ArrayList<String> cantidadLocales = new ArrayList<>();
            ArrayList<byte[]> foto = new ArrayList<>();
            ArrayList<String> tipo = new ArrayList<>();
            while(respuesta.next()){
                numeroPlano.add(respuesta.getString("numeroPlano"));
                areaRegistral.add(respuesta.getString("areaRegistral"));
                categoria.add(respuesta.getString("categoria"));
                viasAcceso.add(respuesta.getString("viasAcceso"));
                topografia.add(respuesta.getString("topografia"));
                nivelTerreno.add(respuesta.getString("nivelTerreno"));
                uso.add(respuesta.getString("uso"));
                metrosFrente.add(respuesta.getString("metrosFrente"));
                valorFiscal.add(respuesta.getString("valorFiscal"));
                unidadesHabitacionales.add(respuesta.getString("unidadesHabitacionales"));
                cantidadLocales.add(respuesta.getString("cantidadLocales"));
                foto.add(respuesta.getBytes("foto"));
                tipo.add(respuesta.getString("tipo"));
                
            }
            if(numeroPlano.isEmpty()){
                JOptionPane.showMessageDialog(null,"Propiedad no existe","Error",JOptionPane.PLAIN_MESSAGE);
                return;
            }
            consultar interfaz = new consultar();
            interfaz.setVisible(true);
            interfaz.setLocationRelativeTo(null);
            interfaz.setDefaultCloseOperation(consultar.HIDE_ON_CLOSE);
            consultar.numeroFinca.setText(finca);
            consultar.numeroFinca.setEditable(false);
            consultar.numeroPlano1.setText(numeroPlano.get(0));
            consultar.numeroPlano1.setEditable(false);
            consultar.areaRegistral.setText(areaRegistral.get(0));
            consultar.areaRegistral.setEditable(false);
            consultar.categoria.setText(categoria.get(0));
            consultar.categoria.setEditable(false);
            consultar.viasAcceso.setText(viasAcceso.get(0));
            consultar.viasAcceso.setEditable(false);
            consultar.topografia.setText(topografia.get(0));
            consultar.topografia.setEditable(false);
            consultar.nivelTerreno.setText(nivelTerreno.get(0));
            consultar.nivelTerreno.setEditable(false);
            consultar.uso.setText(uso.get(0));
            consultar.uso.setEditable(false);
            consultar.metrosFrente.setText(metrosFrente.get(0));
            consultar.metrosFrente.setEditable(false);
            consultar.valorFiscal.setText(valorFiscal.get(0));
            consultar.valorFiscal.setEditable(false);
            consultar.unidadesHabitacionales.setText(unidadesHabitacionales.get(0));
            consultar.unidadesHabitacionales.setEditable(false);
            consultar.cantidadLocales.setText(cantidadLocales.get(0));
            consultar.cantidadLocales.setEditable(false);
            consultar.tipoProp.setText(tipo.get(0));
            consultar.tipoProp.setEditable(false);
            
            byte demBytes; //instead of null, specify your bytes here.
            File outputFile = new File("Escritorio");
            try (FileOutputStream outputStream = new FileOutputStream(outputFile);) {
                outputStream.write(foto.get(0));  //write the bytes and your done. 
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                ImageIcon ImgIcon = new ImageIcon(outputFile.toString());
                Icon icono = new ImageIcon(ImgIcon.getImage().getScaledInstance(consultar.imagen2.getWidth(), consultar.imagen2.getHeight(), Image.SCALE_DEFAULT));
                consultar.imagen2.setIcon(icono);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al abrir:  " + ex);
            }
            
            PreparedStatement consulta1 = con.prepareStatement("select cedula from esquema.propiedadAbonado where numeroFinca ="+numeroFinca);
            ResultSet respuesta1 = consulta1.executeQuery();
            ArrayList<String> cedulas = new ArrayList<>();
            while(respuesta1.next()){
                cedulas.add(respuesta1.getString("cedula"));
            }
            
            String abonados = "";
            int i = 0;
            while (i < cedulas.size()){
                abonados+=cedulas.get(i)+",";
                i++;
            }
            consultar.abonados.setText(abonados);
            consultar.abonados.setEditable(false);
            
            PreparedStatement consulta2 = con.prepareStatement("select serv.servicio from esquema.propiedadServicios as tabla, esquema.servicios as serv where numeroFinca ="+numeroFinca+" and tabla.idServicio = serv.idServicio");
            ResultSet respuesta2 = consulta2.executeQuery();
            ArrayList<String> servicios = new ArrayList<>();
            while(respuesta2.next()){
                servicios.add(respuesta2.getString("servicio"));
            }
            String servi = "";
            int x = 0;
            while (x < servicios.size()){
                servi+=servicios.get(x)+",";
                x++;
            }
            consultar.servicios.setText(servi);
            consultar.servicios.setEditable(false);
            

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
    private javax.swing.JTextField numfinca;
    // End of variables declaration//GEN-END:variables
}
