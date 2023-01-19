package prototipobisca;

import java.util.ArrayList;

/**
 *
 * @author alexandre-kde
 */
public class PrototipoBisca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JanelaInicial janelaInicial = new JanelaInicial();
                janelaInicial.setVisible(true);
                
                //JanelaMesa.executaTesteDePrototipo();
            }
        });
    }
    
}
