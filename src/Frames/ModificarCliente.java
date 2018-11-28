/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import static Frames.PantallaPrincipal.buscartxt;
import static Frames.PantallaPrincipal.tabladatos;
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
import javax.swing.JOptionPane;

/**
 *
 * @author Axel
 */
public class ModificarCliente {
    public void modificar(){
        int fila=tabladatos.getSelectedRow();
        if(fila>=0){
            buscartxt.setText(tabladatos.getValueAt(fila, 0).toString());
            txtnombre.setText(tabladatos.getValueAt(fila, 1).toString());
            txtapellido.setText(tabladatos.getValueAt(fila, 2).toString());
            txtedad.setText(tabladatos.getValueAt(fila, 3).toString());
            txtcorreo.setText(tabladatos.getValueAt(fila, 4).toString());
            txtdomicilio.setText(tabladatos.getValueAt(fila, 5).toString());
            txtlocalidad.setText(tabladatos.getValueAt(fila, 6).toString());
            txttelefono.setText(tabladatos.getValueAt(fila, 7).toString());
            txtfechaAlta.setText(tabladatos.getValueAt(fila, 8).toString());
            txtmarca.setText(tabladatos.getValueAt(fila, 9).toString());
            txtmodelo.setText(tabladatos.getValueAt(fila, 10).toString());
            txtpatente.setText(tabladatos.getValueAt(fila, 11).toString());
            txtdanos.setText(tabladatos.getValueAt(fila, 12).toString());
        }
        else{
           JOptionPane.showMessageDialog(null, "fila no seleccionada");
        }
    }
}
