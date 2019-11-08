package gestordocumental.main;

import gestordocumental.interfaces.gestionarPropiedad;

public class main {

    public static void main(String[] args) {
        gestionarPropiedad nueva = new gestionarPropiedad();
        nueva.setVisible(true);
        nueva.setLocationRelativeTo(null);
        nueva.setDefaultCloseOperation(gestionarPropiedad.EXIT_ON_CLOSE);
    }
    
}
