
package view;


public class frameMenu extends javax.swing.JFrame {

    private boolean decide(){
        return true;
    }
    
    public boolean getDecide(){
        return this.decide();
    }
    
    public frameMenu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menuChamado = new javax.swing.JMenuItem();
        menuTecnico = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenuItem();
        menuProblema = new javax.swing.JMenuItem();
        menuPeças = new javax.swing.JMenuItem();
        menuSetor = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuRelatorio_Tecnico = new javax.swing.JMenuItem();
        menuRelatorio_Usuario = new javax.swing.JMenuItem();
        menuRelatorio_Chamado = new javax.swing.JMenuItem();

        jMenu7.setText("File");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar2.add(jMenu8);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setText("Menu");

        menuChamado.setText("Chamado");
        menuChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuChamadoActionPerformed(evt);
            }
        });
        menu.add(menuChamado);

        menuTecnico.setText("Técnico");
        menuTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTecnicoActionPerformed(evt);
            }
        });
        menu.add(menuTecnico);

        menuUsuario.setText("Usuário");
        menuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuarioActionPerformed(evt);
            }
        });
        menu.add(menuUsuario);

        menuProblema.setText("Problema");
        menuProblema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProblemaActionPerformed(evt);
            }
        });
        menu.add(menuProblema);

        menuPeças.setText("Peças");
        menuPeças.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPeçasActionPerformed(evt);
            }
        });
        menu.add(menuPeças);

        menuSetor.setText("Setor");
        menuSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSetorActionPerformed(evt);
            }
        });
        menu.add(menuSetor);

        jMenuBar1.add(menu);

        jMenu1.setText("Relatórios");

        menuRelatorio_Tecnico.setText("Relatório Técnico");
        menuRelatorio_Tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorio_TecnicoActionPerformed(evt);
            }
        });
        jMenu1.add(menuRelatorio_Tecnico);

        menuRelatorio_Usuario.setText("Relatório Usuário");
        menuRelatorio_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorio_UsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(menuRelatorio_Usuario);

        menuRelatorio_Chamado.setText("Relatório Chamado");
        menuRelatorio_Chamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorio_ChamadoActionPerformed(evt);
            }
        });
        jMenu1.add(menuRelatorio_Chamado);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuChamadoActionPerformed
        // TODO add your handling code here:[
        new dialogChamado(this, true).setVisible(true);
    }//GEN-LAST:event_menuChamadoActionPerformed

    private void menuTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTecnicoActionPerformed
        // TODO add your handling code here:
        new dialogTecnico(this, true).setVisible(true);
    }//GEN-LAST:event_menuTecnicoActionPerformed

    private void menuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuarioActionPerformed
        // TODO add your handling code here:
        new dialogUsuario(this, true).setVisible(true);
    }//GEN-LAST:event_menuUsuarioActionPerformed

    private void menuProblemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProblemaActionPerformed
        // TODO add your handling code here:
        new dialogProblema(this, true).setVisible(true);
    }//GEN-LAST:event_menuProblemaActionPerformed

    private void menuPeçasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPeçasActionPerformed
        // TODO add your handling code here:
        new dialogPecas(this, true).setVisible(true);
    }//GEN-LAST:event_menuPeçasActionPerformed

    private void menuSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSetorActionPerformed
        // TODO add your handling code here:
        new dialogSetor(this, true).setVisible(true);
    }//GEN-LAST:event_menuSetorActionPerformed

    private void menuRelatorio_TecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorio_TecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRelatorio_TecnicoActionPerformed

    private void menuRelatorio_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorio_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRelatorio_UsuarioActionPerformed

    private void menuRelatorio_ChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorio_ChamadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRelatorio_ChamadoActionPerformed

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
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem menuChamado;
    private javax.swing.JMenuItem menuPeças;
    private javax.swing.JMenuItem menuProblema;
    private javax.swing.JMenuItem menuRelatorio_Chamado;
    private javax.swing.JMenuItem menuRelatorio_Tecnico;
    private javax.swing.JMenuItem menuRelatorio_Usuario;
    private javax.swing.JMenuItem menuSetor;
    private javax.swing.JMenuItem menuTecnico;
    private javax.swing.JMenuItem menuUsuario;
    // End of variables declaration//GEN-END:variables
}
