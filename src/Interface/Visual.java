package Interface;

import javax.swing.JOptionPane;

public class Visual extends javax.swing.JFrame implements Runnable{
    
    public int min=0, seg=0;
    
    /**
     * Creates new form prueba
     */
    
        Thread hilo, hilo2;
    
    public Visual() {
        initComponents();
        grupo.add(rMuro);
        grupo.add(rSalida);
        grupo.add(rEntrada);
 
        this.setLocationRelativeTo(null);
        
        hilo= new Thread(this);
        hilo2 = new Thread(this); 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rEntrada = new javax.swing.JRadioButton();
        rSalida = new javax.swing.JRadioButton();
        rMuro = new javax.swing.JRadioButton();
        lbCronometro = new javax.swing.JLabel();
        lb_tiempo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lienzo2 = new Interface.lienzo();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("JFreame"); // NOI18N

        rEntrada.setText("Entrada");
        rEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rEntradaMouseClicked(evt);
            }
        });

        rSalida.setText("Salida");
        rSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSalidaMouseClicked(evt);
            }
        });
        rSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSalidaActionPerformed(evt);
            }
        });

        rMuro.setText("Muro");
        rMuro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rMuroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rEntrada)
                    .addComponent(rSalida, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rMuro, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rEntrada)
                .addGap(18, 18, 18)
                .addComponent(rSalida)
                .addGap(18, 18, 18)
                .addComponent(rMuro)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        lbCronometro.setText("Cronometro");

        jButton1.setText("Resolver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reinicio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lienzo2Layout = new javax.swing.GroupLayout(lienzo2);
        lienzo2.setLayout(lienzo2Layout);
        lienzo2Layout.setHorizontalGroup(
            lienzo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
        );
        lienzo2Layout.setVerticalGroup(
            lienzo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lienzo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(lbCronometro)
                            .addComponent(jButton2))
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lienzo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(lbCronometro)
                        .addGap(40, 40, 40)
                        .addComponent(lb_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(jButton1)
                        .addGap(39, 39, 39)
                        .addComponent(jButton2)))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSalidaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        
        
            try {
            lienzo2.hilo.start();
            lienzo2.hilo2.start();
            jButton1.setEnabled(false);
            lienzo2.f=2;
            hilo.start();
            hilo2.start();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ocurrio un error="+ e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     lienzo2.hilo.stop();
     lienzo2.hilo2.stop();
     lienzo2.reinicio();
     jButton1.setEnabled(true);
     hilo=new Thread(this);
     hilo2 = new Thread(this); 
     min=0;
     seg=0;
     lb_tiempo.setText(min+" min: "+ seg+" seg: ");
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rMuroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rMuroMouseClicked
      if(rMuro.isSelected())
          lienzo2.radioBotones=3;
          
      
    }//GEN-LAST:event_rMuroMouseClicked

    private void rEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rEntradaMouseClicked
  if(rEntrada.isSelected())
    lienzo2.radioBotones=1;

    }//GEN-LAST:event_rEntradaMouseClicked

    private void rSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSalidaMouseClicked
       if(rSalida.isSelected())
           lienzo2.radioBotones=2;   
    }//GEN-LAST:event_rSalidaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visual().setVisible(true);
            }
        });
    }

    @Override
    public void run() {
     while(true){
         try {
             Thread.sleep(999);
             seg++;
             if(seg>=59){
                 min++;
                 seg=0;
             }
             lb_tiempo.setText(min+" min: " + seg +" seg ");
             if(lienzo2.termino==1){
                 hilo.stop();
//                 hilo2.stop();
             }
         } catch (Exception e) {
         }
     }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCronometro;
    private javax.swing.JLabel lb_tiempo;
    private Interface.lienzo lienzo2;
    private javax.swing.JRadioButton rEntrada;
    private javax.swing.JRadioButton rMuro;
    private javax.swing.JRadioButton rSalida;
    // End of variables declaration//GEN-END:variables
     
}
