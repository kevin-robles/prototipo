package gestordocumental.main;

import gestordocumental.interfaces.gestionarPropiedad;

public class main {

    public static void main(String[] args) {
        gestionarPropiedad nueva = new gestionarPropiedad();
        nueva.setVisible(true);
        nueva.setLocationRelativeTo(null);
        nueva.setDefaultCloseOperation(gestionarPropiedad.DO_NOTHING_ON_CLOSE);
    }
    
}
