/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visão;
import javax.swing.ImageIcon;

/**
 *
 * @author Pretinho
 */
public class Menu extends javax.swing.JFrame {

    /** Creates new form Menu */
    public Menu() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblConMenu = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuColecao = new javax.swing.JMenu();
        jSubColDvd = new javax.swing.JMenuItem();
        jMenuFerramenta = new javax.swing.JMenu();
        jSubFerAgenda = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jSubSairSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setIconImage(new ImageIcon(getClass().getResource("/imagens/Login.png")).getImage()
        );
        setPreferredSize(new java.awt.Dimension(1142, 247));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo menu.png"))); // NOI18N

        jMenuColecao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cole32.png"))); // NOI18N
        jMenuColecao.setText("Coleções");

        jSubColDvd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dvd_coleção.png"))); // NOI18N
        jSubColDvd.setText("DVD´s");
        jSubColDvd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubColDvdActionPerformed(evt);
            }
        });
        jMenuColecao.add(jSubColDvd);

        jMenuBar.add(jMenuColecao);

        jMenuFerramenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tool6.png"))); // NOI18N
        jMenuFerramenta.setText("Ferramentas");

        jSubFerAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/agenda_1.png"))); // NOI18N
        jSubFerAgenda.setText("Agenda");
        jSubFerAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubFerAgendaActionPerformed(evt);
            }
        });
        jMenuFerramenta.add(jSubFerAgenda);

        jMenuBar.add(jMenuFerramenta);

        jMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/saindo.png"))); // NOI18N
        jMenuSair.setText("Sair");

        jSubSairSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/saindo.png"))); // NOI18N
        jSubSairSair.setText("Sair");
        jSubSairSair.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jSubSairSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubSairSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jSubSairSair);

        jMenuBar.add(jMenuSair);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblConMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblConMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1063, 677));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSubFerAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubFerAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSubFerAgendaActionPerformed

    private void jSubSairSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubSairSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jSubSairSairActionPerformed

    private void jSubColDvdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubColDvdActionPerformed
        Principal tela = new Principal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jSubColDvdActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuColecao;
    private javax.swing.JMenu jMenuFerramenta;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenuItem jSubColDvd;
    private javax.swing.JMenuItem jSubFerAgenda;
    private javax.swing.JMenuItem jSubSairSair;
    private javax.swing.JLabel lblConMenu;
    // End of variables declaration//GEN-END:variables

}
