package Frames;

import static Frames.PantallaPrincipal.txtapellido;
import static Frames.PantallaPrincipal.txtcorreo;
import static Frames.PantallaPrincipal.txtdanos;
import static Frames.PantallaPrincipal.txtdomicilio;
import static Frames.PantallaPrincipal.txtedad;
import static Frames.PantallaPrincipal.txtfechaAlta;
import static Frames.PantallaPrincipal.txtlocalidad;
import static Frames.PantallaPrincipal.txtmarca;
import static Frames.PantallaPrincipal.txtmodelo;
import static Frames.PantallaPrincipal.txtnombre;
import static Frames.PantallaPrincipal.txtpatente;
import static Frames.PantallaPrincipal.txttelefono;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
 * @author Axel
 */
public class AgregarCliente {
    public void agregar(){
    ConexionBD con=new ConexionBD();
    Connection cn=con.conexion();
         /*
        try {
           
          /*La interfaz PreparedStatement hereda de Statement y difiere de 
            esta en dos maneras. Las instancias de PreparedStatement contienen
            una sentencia SQL que ya ha sido compilada. Esto es lo que hace que
            se le llame 'preparada'. La sentencia SQL contenida en un objeto 
            PreparedStatement pueden tener uno o más parámetros IN.*/
        
        
        if(txtnombre.getText().length() != 0){
            try{
            PreparedStatement pps= cn.prepareStatement("INSERT INTO usuario(Nombre, Apellido, Edad, Correo, Domicilio, Localidad, Telefono, FechaAlta, Marca, Modelo, Patente, Daños) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            pps.setString(1, txtnombre.getText());
            pps.setString(2, txtapellido.getText());
            pps.setString(3, txtedad.getText());
            pps.setString(4, txtcorreo.getText());
            pps.setString(5, txtdomicilio.getText());
            pps.setString(6, txtlocalidad.getText());
            pps.setString(7, txttelefono.getText());
            pps.setString(8, txtfechaAlta.getText());
            pps.setString(9, txtmarca.getText());
            pps.setString(10, txtmodelo.getText());
            pps.setString(11, txtpatente.getText());
            pps.setString(12, txtdanos.getText());

            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }  
                 // JOptionPane.showMessageDialog(null, "Datos guardados");

            }else{
                  JOptionPane.showMessageDialog(null, "Campos vacios\n Favor de completar campos");
        }
             
        
    }
}
