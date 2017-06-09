package AnimeList.Vista;

import AnimeList.App.App;


/*Para poder centrar la ventana en cualquier ordenador 
import java.awt.Dimension;
import java.awt.Toolkit;*/

import javax.swing.JFrame;

/**
 * La clase crea añade un nuevo Anime a la lista
 * @author Miguel
 */
public class CrearAnime extends javax.swing.JFrame {

   /**
     * Creates new form CrearAnime
     * Ponemos la ventana en el centro de la pàntalla; utilizamos este metodo poque no podemos 
     * reescalar la ventana.
     */     
    public CrearAnime() {
        initComponents();
//Centramos la ventana para cualquier pantalla

    this.setLocationRelativeTo(null);

    //Toolkit myScreen = Toolkit.getDefaultToolkit();
    
    //Dimension dimensionScreen = myScreen.getScreenSize();
    
    //etSize( dimensionScreen.width/2, dimensionScreen.height/2);
    //setLocation( dimensionScreen.width/4, dimensionScreen.height/4);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }

    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        capitulos = new javax.swing.JSpinner();
        exit = new javax.swing.JButton();
        titulo = new javax.swing.JTextField();
        puntuacion = new javax.swing.JSpinner();
        generos = new javax.swing.JComboBox<>();
        addAnime = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        capitulos.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(capitulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 60, 30));

        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 590, 80, 40));

        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 320, 30));

        puntuacion.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        getContentPane().add(puntuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 60, 30));

        generos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mecha", "Shonen", "Shojo", "Seinen" }));
        generos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generosActionPerformed(evt);
            }
        });
        getContentPane().add(generos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 140, 30));

        addAnime.setText("Añadir Anime");
        addAnime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAnimeActionPerformed(evt);
            }
        });
        getContentPane().add(addAnime, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 590, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 240, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/akira2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setFocusCycleRoot(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1255, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Enlazo el menu con el boton de salir
     * @param evt 
     */
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
         Menu menu = new Menu();
         menu.show();
         dispose();
        
    }//GEN-LAST:event_exitActionPerformed

    private void generosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generosActionPerformed
    /**
     * Capturamos el evento del boton que nos indica que los campos han sido rellenos
     * cogemos todos los campos le asignamos variables y se lo mandamos al metodo  
     * crearAnime de la clase App mdiante una instancia de la misma
     * @param evt 
     */
    private void addAnimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAnimeActionPerformed
        // TODO add your handling code here:
        App app = new App();
        
            String cad1 = titulo.getText();
            String cad2 = (String) generos.getSelectedItem();
            int puntua = (Integer) puntuacion.getValue();
            int capi = (Integer)capitulos.getValue();
        
            
            app.crearAnime(cad1, cad2, puntua, capi);
            System.out.println(app.getAnimes());
                                      
    }//GEN-LAST:event_addAnimeActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed

    /**
     * Main que nos hace ide para poder lanzar el JFrame y probarlo , muy util para desarollar
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
            java.util.logging.Logger.getLogger(CrearAnime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearAnime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearAnime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearAnime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearAnime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAnime;
    private javax.swing.JSpinner capitulos;
    private javax.swing.JButton exit;
    private javax.swing.JComboBox<String> generos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner puntuacion;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}