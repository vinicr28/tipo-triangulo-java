/**
 * @author VINICIUS REIS
 */
package tipo_triangulo;

public class TelaTipo extends javax.swing.JFrame {

    public TelaTipo() {
        initComponents();
        panResult.setVisible(false);
        x.setVisible(false);
        isoceles.setVisible(false);
        escaleno.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        legendaA = new javax.swing.JLabel();
        sliA = new javax.swing.JSlider();
        lblA = new javax.swing.JLabel();
        legendaB = new javax.swing.JLabel();
        sliB = new javax.swing.JSlider();
        lblB = new javax.swing.JLabel();
        sliC = new javax.swing.JSlider();
        legendaC = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        panResult = new javax.swing.JPanel();
        lblTip = new javax.swing.JLabel();
        lblSit = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        equilatero = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        isoceles = new javax.swing.JLabel();
        escaleno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        legendaA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        legendaA.setText("<html>Segmento <strong>A</strong></html>");
        getContentPane().add(legendaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 95, -1, -1));

        sliA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sliA.setMaximum(20);
        sliA.setValue(0);
        sliA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliAStateChanged(evt);
            }
        });
        getContentPane().add(sliA, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 101, -1, -1));

        lblA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblA.setText("0");
        getContentPane().add(lblA, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 95, 22, -1));

        legendaB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        legendaB.setText("<html>Segmento <strong>B</strong></html>");
        getContentPane().add(legendaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 179, -1, -1));

        sliB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sliB.setMaximum(20);
        sliB.setValue(0);
        sliB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliBStateChanged(evt);
            }
        });
        getContentPane().add(sliB, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 185, -1, -1));

        lblB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblB.setText("0");
        getContentPane().add(lblB, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 179, 22, -1));

        sliC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sliC.setMaximum(20);
        sliC.setValue(0);
        sliC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliCStateChanged(evt);
            }
        });
        getContentPane().add(sliC, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 269, -1, -1));

        legendaC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        legendaC.setText("<html>Segmento <strong>C</strong></html>");
        getContentPane().add(legendaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 263, -1, -1));

        lblC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblC.setText("0");
        getContentPane().add(lblC, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 263, 22, -1));

        btnVerificar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 341, 196, 56));

        lblTip.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblTip.setForeground(new java.awt.Color(255, 51, 0));
        lblTip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTip.setText("Tipo do Trinagulo");

        lblSit.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblSit.setForeground(new java.awt.Color(51, 51, 255));
        lblSit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSit.setText("Forma ou não?");

        javax.swing.GroupLayout panResultLayout = new javax.swing.GroupLayout(panResult);
        panResult.setLayout(panResultLayout);
        panResultLayout.setHorizontalGroup(
            panResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTip, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panResultLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblSit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panResultLayout.setVerticalGroup(
            panResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblTip)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panResultLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(lblSit)
                    .addContainerGap(52, Short.MAX_VALUE)))
        );

        getContentPane().add(panResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Tipo de Trângulo");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 819, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, -1, 50));

        equilatero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/equilatero-removebg-preview.png"))); // NOI18N
        getContentPane().add(equilatero, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x-removebg-preview.png"))); // NOI18N
        getContentPane().add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        isoceles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/isoceles-removebg-preview.png"))); // NOI18N
        getContentPane().add(isoceles, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        escaleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/escaleno.png"))); // NOI18N
        getContentPane().add(escaleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // apos clique no botão 
        panResult.setVisible(true);
        int a = sliA.getValue();
        int b = sliB.getValue();
        int c = sliC.getValue();
        
        if (a<b+c && b<a+c && c<a+b) {
            lblSit.setVisible(true);
            lblSit.setText("Forma um Triangulo!!");
            
            if (a==b && b==c) {
                lblTip.setText("Tipo Equilátero.");
                equilatero.setVisible(true);
                x.setVisible(false);
                isoceles.setVisible(false);
                escaleno.setVisible(false);
            } else if (a!=b && b!=c && a!=c) {
                lblTip.setText("Tipo Escaleno.");
                escaleno.setVisible(true);
                equilatero.setVisible(false);
                x.setVisible(false);
                isoceles.setVisible(false);
            }else {
                lblTip.setText("Tipo Isôsceles.");
                escaleno.setVisible(false);
                equilatero.setVisible(false);
                x.setVisible(false);
                isoceles.setVisible(true);
            }
            
        }else {
            lblSit.setVisible(false);
            equilatero.setVisible(false);
            isoceles.setVisible(false);
            escaleno.setVisible(false);
            x.setVisible(true);
            lblTip.setText("Não forma nenhum Triangulo!");
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void sliAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliAStateChanged
        // TODO add your handling code here:
        lblA.setText(Integer.toString(sliA.getValue()));
    }//GEN-LAST:event_sliAStateChanged

    private void sliBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliBStateChanged
        // TODO add your handling code here:
        lblB.setText(Integer.toString(sliB.getValue()));
    }//GEN-LAST:event_sliBStateChanged

    private void sliCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliCStateChanged
        // TODO add your handling code here:
        lblC.setText(Integer.toString(sliC.getValue()));
    }//GEN-LAST:event_sliCStateChanged


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
            java.util.logging.Logger.getLogger(TelaTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel equilatero;
    private javax.swing.JLabel escaleno;
    private javax.swing.JLabel isoceles;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblSit;
    private javax.swing.JLabel lblTip;
    private javax.swing.JLabel legendaA;
    private javax.swing.JLabel legendaB;
    private javax.swing.JLabel legendaC;
    private javax.swing.JPanel panResult;
    private javax.swing.JSlider sliA;
    private javax.swing.JSlider sliB;
    private javax.swing.JSlider sliC;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
