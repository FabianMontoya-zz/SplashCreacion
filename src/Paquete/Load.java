/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import java.awt.Cursor;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabian
 */
public class Load extends JFrame {

    JLabel LImagen, LTexto2, LTexto;

    public Load() {

        super("Por favor espere...");

        try {
            setUndecorated(true); //Eliminar toda la ventana en la que es contenida
            Imagen();
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            setSize(380, 100);
            setResizable(false);
            setLayout(null);
            setLocationRelativeTo(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error al iniciar la aplicación.\n\nPor favor consulte con su desarrollador.\n\n Pulse ACEPTAR para ver el error.", "¡ERROR! - Splash.java", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Error:  " + ex + "\n\nPulse ACEPTAR, la aplicación se cerrará.", "¡ERROR! - Splash.java", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    private void Imagen() {
        LImagen = new JLabel();
        LTexto = new JLabel("Estamos preparando tu archivo, por favor espera...");
        LTexto2 = new JLabel("Al finalizar el archivo se abrirá automáticamente.");
        ImageIcon fot = new ImageIcon(getClass().getResource("load.gif"));
        LImagen.setIcon(fot);
        
        LTexto.setBounds(90, 30, 300, 20);
        LTexto2.setBounds(90, 50, 300, 20);
        LImagen.setBounds(2, 2, 10, 5);
        add(LTexto);
        add(LTexto2);
        add(LImagen);
    }
    
    public static void main(String args[]) {
        JFrame ap = new Load();
        ap.setVisible(true);
    }

}
