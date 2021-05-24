package Sistema_usuarios;



import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class usuarios extends javax.swing.JFrame {


    
    Connection con =null;
    public usuarios() {
        initComponents();
        this.setTitle("Registro de usuarios");
        this.setLocation(400, 150);
        
        
        
        bg_estadocivil.clearSelection();
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
                java.util.Date fechaParseada;
        try {
            fechaParseada = new SimpleDateFormat("yyyy/MM/dd").parse("2020/12/01");
             dcFechaRegistro.setDate(fechaParseada);
        } catch (ParseException ex) {
            Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_estadocivil = new javax.swing.ButtonGroup();
        escritorio1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        txt_horasT = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_nuevo = new javax.swing.JButton();
        txt_valorporHora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        dcFechaRegistro = new com.toedter.calendar.JDateChooser();
        rb_soltero = new javax.swing.JRadioButton();
        rb_casado = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_verRegistro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escritorio1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estado civil:");

        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombres:");

        jLabel5.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Horas trabajadas:");

        txt_apellidos.setBackground(new java.awt.Color(204, 204, 204));
        txt_apellidos.setForeground(new java.awt.Color(0, 0, 0));
        txt_apellidos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosActionPerformed(evt);
            }
        });
        txt_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidosKeyTyped(evt);
            }
        });

        txt_horasT.setBackground(new java.awt.Color(204, 204, 204));
        txt_horasT.setForeground(new java.awt.Color(0, 0, 0));
        txt_horasT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_horasT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_horasTActionPerformed(evt);
            }
        });
        txt_horasT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_horasTKeyTyped(evt);
            }
        });

        btn_registrar.setBackground(new java.awt.Color(102, 102, 102));
        btn_registrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Molinos COMOLSA");

        btn_nuevo.setBackground(new java.awt.Color(102, 102, 102));
        btn_nuevo.setForeground(new java.awt.Color(0, 0, 0));
        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        txt_valorporHora.setBackground(new java.awt.Color(204, 204, 204));
        txt_valorporHora.setForeground(new java.awt.Color(0, 0, 0));
        txt_valorporHora.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_valorporHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valorporHoraActionPerformed(evt);
            }
        });
        txt_valorporHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_valorporHoraKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Valor por hora:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de resgistro:");

        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apellidos:");

        txt_nombres.setBackground(new java.awt.Color(204, 204, 204));
        txt_nombres.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombres.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_nombres.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombresKeyTyped(evt);
            }
        });

        bg_estadocivil.add(rb_soltero);
        rb_soltero.setText("Soltero");

        bg_estadocivil.add(rb_casado);
        rb_casado.setSelected(true);
        rb_casado.setText("Casado");

        escritorio1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(txt_apellidos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(txt_horasT, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(btn_registrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(btn_nuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(txt_valorporHora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(txt_nombres, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(dcFechaRegistro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(rb_soltero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(rb_casado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorio1Layout = new javax.swing.GroupLayout(escritorio1);
        escritorio1.setLayout(escritorio1Layout);
        escritorio1Layout.setHorizontalGroup(
            escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorio1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(escritorio1Layout.createSequentialGroup()
                        .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(273, 273, 273))
            .addGroup(escritorio1Layout.createSequentialGroup()
                .addGroup(escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(escritorio1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorio1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(escritorio1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rb_soltero)
                                .addGap(18, 18, 18)
                                .addComponent(rb_casado)))
                        .addGap(97, 97, 97)
                        .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorio1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)
                        .addGap(305, 305, 305)
                        .addGroup(escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorio1Layout.createSequentialGroup()
                                .addGroup(escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(escritorio1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(36, 36, 36)
                                        .addComponent(txt_horasT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(escritorio1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(49, 49, 49)
                                .addComponent(txt_valorporHora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        escritorio1Layout.setVerticalGroup(
            escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorio1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorio1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorio1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6))
                            .addGroup(escritorio1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel5))
                            .addGroup(escritorio1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(escritorio1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorio1Layout.createSequentialGroup()
                                        .addGroup(escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rb_soltero)
                                            .addComponent(rb_casado))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dcFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(escritorio1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(txt_valorporHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txt_horasT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        getContentPane().add(escritorio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 360));

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ver ");

        jmi_verRegistro.setText("Ver Registros");
        jmi_verRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_verRegistroActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_verRegistro);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void limpiarDatos() {
     
        txt_apellidos.setText(" ");
        txt_nombres.setText(" ");
        txt_valorporHora.setText(" ");
        txt_horasT.setText(" ");
        bg_estadocivil.clearSelection();
        dcFechaRegistro.setCalendar(null);
    }
 
    private void txt_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidosActionPerformed

    private void txt_valorporHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valorporHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valorporHoraActionPerformed

    private void txt_horasTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_horasTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_horasTActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code here:
            limpiarDatos();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void txt_apellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidosKeyTyped
        char c = evt.getKeyChar();
        if((c<'a'|| c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txt_apellidosKeyTyped

    private void txt_nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombresKeyTyped
        char c = evt.getKeyChar();
        if((c<'a'|| c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txt_nombresKeyTyped

    private void txt_valorporHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_valorporHoraKeyTyped
        char c=evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txt_valorporHoraKeyTyped

    private void txt_horasTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_horasTKeyTyped
        char c=evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txt_horasTKeyTyped

   /** public Connection getConnection(){
        return con;
    }
    public void desconectar(){
        try{
            con.close();
        }catch(Exception ex){
            
        }
    }*/
    
    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String estado_civil="";

       
         
        String year = Integer.toString( dcFechaRegistro.getCalendar().get(Calendar.YEAR));
        String month = Integer.toString( dcFechaRegistro.getCalendar().get(Calendar.MONTH));
        String day = Integer.toString( dcFechaRegistro.getCalendar().get(Calendar.DAY_OF_MONTH));
     
        String fecha_registro = ""+year+"-"+month+"-"+day;
        
        
        if(rb_soltero.isSelected()){
            estado_civil="S";
        }if(rb_casado.isSelected()){
            estado_civil="C";
        }

        
        if (txt_apellidos.getText().equals("") || (txt_nombres.getText().equals("")) || (txt_valorporHora.getText().equals("")) || (txt_horasT.getText().equals(""))
             ) {
            
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_apellidos.requestFocus();
        
        }else{
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/sistemausuarios","root","");
                Statement stmt =con.createStatement();
                stmt.executeUpdate("INSERT INTO user_master  VALUES(NULL,'"+txt_apellidos.getText()+"','"+txt_nombres.getText()+"','"+txt_valorporHora.getText()+"','"+txt_horasT.getText()+"','"+estado_civil+"','"+fecha_registro+"',NULL,NULL,NULL)");
            } catch (SQLException ex) {
                Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "no se puede conectar a la base de datos");
            }
            JOptionPane.showMessageDialog(null, "Se ha registrado de manera exitosa!!");
        
        }
        
        /**String cadena2,cadena3,cadena4,cadena5,cadena6;

        cadena2 = txt_apellidos.getText();
        cadena3 = txt_nombres.getText();
        cadena4 = txt_valorporHora.getText();
        cadena5 = txt_horasT.getText();
        cadena6 = cmb_EstadoC.getSelectedItem().toString();
        
        if (txt_apellidos.getText().equals("") || (txt_nombres.getText().equals("")) || (txt_valorporHora.getText().equals("")) || (txt_horasT.getText().equals(""))
            || (cmb_EstadoC.getSelectedItem().equals(null))) {
            
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_apellidos.requestFocus();
        }*/
      


    }//GEN-LAST:event_btn_registrarActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyTyped

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmi_verRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_verRegistroActionPerformed
        ver_Registros vr=new ver_Registros();
        escritorio1.add(vr);
        vr.show();
        
    }//GEN-LAST:event_jmi_verRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_estadocivil;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_registrar;
    private com.toedter.calendar.JDateChooser dcFechaRegistro;
    private javax.swing.JDesktopPane escritorio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jmi_verRegistro;
    private javax.swing.JRadioButton rb_casado;
    private javax.swing.JRadioButton rb_soltero;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_horasT;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_valorporHora;
    // End of variables declaration//GEN-END:variables
}
