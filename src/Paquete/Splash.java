package Paquete;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Fabian_Montoya
 */
public class Splash extends JFrame {

    JLabel LImagen;
    JProgressBar Barra;

    HiloProgreso hilo;
    GridBagLayout GRID = new GridBagLayout();

    public Splash() {
        setLayout(GRID);
        setUndecorated(true); //Eliminar toda la ventana en la que es contenida
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        Imagen();
        Barra();

        hilo = new HiloProgreso(Barra);
        //Iniciamos el Hilo
        hilo.start();
        hilo = null;
    }

    public javax.swing.JProgressBar getjProgressBar1() {
        return Barra;
    }

    public void iniciarSplash() {
        this.getjProgressBar1().setBorderPainted(true);
        this.getjProgressBar1().setForeground(new Color(50, 50, 153, 100));
        this.getjProgressBar1().setStringPainted(true);
    }

    public void Imagen() {

        LImagen = new JLabel();
        ImageIcon fot = new ImageIcon(getClass().getResource("712.gif"));
        //Icon icono = new ImageIcon(fot.getImage().getScaledInstance(LImagen.getWidth(), LImagen.getHeight(), Image.SCALE_DEFAULT));
        LImagen.setIcon(fot);

        GridBagConstraints constraintsImagen = new GridBagConstraints();

        constraintsImagen.fill = GridBagConstraints.BOTH;// El area de texto debe estirarse en ambos sentidos. Ponemos el campo fill.
        constraintsImagen.anchor = GridBagConstraints.FIRST_LINE_START;
        constraintsImagen.gridx = 0; // El área de texto empieza en la columna cero.
        constraintsImagen.gridy = 0; // El área de texto empieza en la fila uno
        constraintsImagen.gridwidth = 1; // El área de texto ocupa dos columnas.
        constraintsImagen.gridheight = 1; // El área de texto ocupa 3 filas.
        constraintsImagen.weighty = 2; //Se estira en Y       
        constraintsImagen.weightx = 2; //Se estira en X
        add(LImagen, constraintsImagen);
    }

    public void Barra() {
        Barra = new JProgressBar(0, 100);
        Barra.setValue(0);
        Barra.setStringPainted(true);

        GridBagConstraints constraintsBarra = new GridBagConstraints();

        constraintsBarra.fill = GridBagConstraints.HORIZONTAL;// El area de texto debe estirarse en ambos sentidos. Ponemos el campo fill.
        constraintsBarra.anchor = GridBagConstraints.SOUTH;
        constraintsBarra.gridx = 0; // El área de texto empieza en la columna cero.
        constraintsBarra.gridy = 1; // El área de texto empieza en la fila uno
        constraintsBarra.gridwidth = 1; // El área de texto ocupa 1 columnas.
        constraintsBarra.gridheight = 1; // El área de texto ocupa 1 filas.
        constraintsBarra.weighty = 0.0; //Se estira en Y       
        constraintsBarra.weightx = 1; //Se estira en X
        add(Barra, constraintsBarra);
    }

    public static void main(String args[]) {
        JFrame ap = new Splash();
        ap.setSize(450, 250);
        ap.setResizable(false);
        ap.setLocationRelativeTo(null);
        ap.setVisible(true);

    }
}
