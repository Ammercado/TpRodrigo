
package Frames;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        
        this.setLocationRelativeTo(null); // ubico el frame en el centro de la pantalla. 
        
         ImageIcon imagen1=new ImageIcon("src/imagenes/icon-login.png");
     Icon icono2=new ImageIcon(imagen1.getImage().getScaledInstance(150,150,150));
     logo.setIcon(icono2);
     
     ImageIcon imagen2=new ImageIcon("src/imagenes/puerta.png");
     Icon icono=new ImageIcon(imagen2.getImage().getScaledInstance(30,30,30));
     puerta.setIcon(icono);
     
     ImageIcon imagen3=new ImageIcon("src/imagenes/candado.png");
     Icon icono3=new ImageIcon(imagen3.getImage().getScaledInstance(30,30,30));
     candado.setIcon(icono3);
      
     txtusuario.requestFocusInWindow();  //agregado 22:52 focus user
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        usuariolabel = new javax.swing.JLabel();
        contraseñalabel = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        candado = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        puerta = new javax.swing.JLabel();
        frase = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        BtnAyuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(21, 68, 118));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 90, -1));

        usuariolabel.setText("Usuario");
        getContentPane().add(usuariolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        contraseñalabel.setText("Password");
        getContentPane().add(contraseñalabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 170, 30));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 170, 30));

        jButton2.setBackground(new java.awt.Color(112, 205, 104));
        jButton2.setText("Iniciar Sesión");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 140, -1));

        candado.setText(" ");
        getContentPane().add(candado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 40, 40));
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 230, 160));

        puerta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/puerta.png"))); // NOI18N
        getContentPane().add(puerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 50, 40));

        frase.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        frase.setForeground(new java.awt.Color(232, 233, 239));
        frase.setText("Iniciar Sesion");
        getContentPane().add(frase, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 330, 100));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo azul.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 530, 350));

        BtnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_Help_book_132704.png"))); // NOI18N
        BtnAyuda.setText("Ayuda");
        BtnAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAyudaMouseClicked(evt);
            }
        });
        getContentPane().add(BtnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /* boton salir
           java vm termina por completo. 
           a diferencia de Jframe.dispose() 
        hace que destruye la ventana y el sistema operativo lo limpie.
        */
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//Verificamos que los campos se encuentren completos 
 if(txtusuario.getText().length()==0)  
      JOptionPane.showMessageDialog(null, "Por favor ingrese complete los campos");
   else if(password.getText().length()==0)  
      JOptionPane.showMessageDialog(null, "Por favor ingrese complete los campos");
   else{
       String user = txtusuario.getText();
        String pass = password.getText();
//Validamos los datos y se ingresa al sistema.
       if(validate_login(user,pass)){
            JOptionPane.showMessageDialog(null, "Bienvenido/a"+" "+user+" "+"al sistema");
            PantallaPrincipal pl= new PantallaPrincipal();
            pl.setVisible(true);
            dispose();
       }else
          JOptionPane.showMessageDialog(null, "Datos Incorrectos!");
   }        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BtnAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAyudaMouseClicked
        JOptionPane.showMessageDialog(null, "Para Iniciar Sesion: Coloque su Nombre y contraseña. Si no conecta comuniquese con el administrador");
    }//GEN-LAST:event_BtnAyudaMouseClicked
       //Verificamos los datos en la base de datos para poder ingresar
    private boolean validate_login(String nombreUsuario, String contraseña) {
        ConexionBD con=new ConexionBD();
        Connection cn=con.conexion();
      try{          
       PreparedStatement pst = cn.prepareStatement("Select * from cuenta where USU_NOMBRE=? and USU_CONTRASEÑA=?");
       pst.setString(1, nombreUsuario);
       pst.setString(2, contraseña);
       ResultSet rs = pst.executeQuery();                        
       if(rs.next())            
           return true;    
       else
           return false;            
   }
   catch(Exception e){
       e.printStackTrace();
       return false;
   }         
        
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAyuda;
    private javax.swing.JLabel candado;
    private javax.swing.JLabel contraseñalabel;
    private javax.swing.JLabel frase;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel puerta;
    private javax.swing.JTextField txtusuario;
    private javax.swing.JLabel usuariolabel;
    // End of variables declaration//GEN-END:variables
}
