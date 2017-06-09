/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimeList.Vista;

import AnimeList.App.App;

/**
 *
 * @author nfdar
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Clase Menu que nos permite navegar y utilizar la aplicacion.
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JButton();
        addAnime = new javax.swing.JButton();
        viewAnime = new javax.swing.JButton();
        deleteAnime = new javax.swing.JButton();
        sortAnime = new javax.swing.JButton();
        updateAnime = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1133, 603, 90, 40));

        addAnime.setText("Añadir Anime");
        addAnime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAnimeActionPerformed(evt);
            }
        });
        getContentPane().add(addAnime, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 270, 40));

        viewAnime.setText("Ver Animes");
        viewAnime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAnimeActionPerformed(evt);
            }
        });
        getContentPane().add(viewAnime, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 270, 40));

        deleteAnime.setText("Borrar Anime");
        deleteAnime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAnimeActionPerformed(evt);
            }
        });
        getContentPane().add(deleteAnime, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 270, 40));

        sortAnime.setText("Ordenar Animes");
        sortAnime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortAnimeActionPerformed(evt);
            }
        });
        getContentPane().add(sortAnime, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 270, 40));

        updateAnime.setText("Actualizar Anime");
        updateAnime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAnimeActionPerformed(evt);
            }
        });
        getContentPane().add(updateAnime, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 270, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 230, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu.jpg"))); // NOI18N
        jLabel1.setText("fondo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Los siguientes metodos isntanciamos los otros jFrames mediante los eventos producidos al pulsar los botones ; y los hacemos visibles mientras cerramos el menu.
 * @param evt evento
 */
    private void viewAnimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAnimeActionPerformed
         VerAnime verAnime = new VerAnime();
         verAnime.show();
         dispose();
    }//GEN-LAST:event_viewAnimeActionPerformed

    private void addAnimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAnimeActionPerformed
        CrearAnime crearAnime = new CrearAnime();
         crearAnime.show();
         dispose();
    }//GEN-LAST:event_addAnimeActionPerformed
    
/**
 * Salimos completamente de la aplicacion al utilizar el boton salir de menu
 * @param evt 
 */
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void deleteAnimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAnimeActionPerformed
       BorrarAnime borrarAnime = new BorrarAnime();
        VerAnime verAnime = new VerAnime();
         borrarAnime.show();
         
         verAnime.show();        
         dispose();
    }//GEN-LAST:event_deleteAnimeActionPerformed

    private void updateAnimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAnimeActionPerformed
      ActualizarAnime actualizarAnime = new ActualizarAnime();
        
        actualizarAnime.show();
        
        dispose();
    }//GEN-LAST:event_updateAnimeActionPerformed

    private void sortAnimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortAnimeActionPerformed
        SortAnime sortAnime = new SortAnime();
        sortAnime.show();
        dispose();
    }//GEN-LAST:event_sortAnimeActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAnime;
    private javax.swing.JButton deleteAnime;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton sortAnime;
    private javax.swing.JButton updateAnime;
    private javax.swing.JButton viewAnime;
    // End of variables declaration//GEN-END:variables
}
