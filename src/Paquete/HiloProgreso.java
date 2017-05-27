package Paquete;

import javax.swing.JProgressBar;

/**
 *
 * @author Fabian_Montoya
 */
public class HiloProgreso extends Thread {

    JProgressBar progreso;

    public HiloProgreso(JProgressBar progreso1) {
        super();
        progreso = progreso1;
    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            progreso.setValue(i);
            pausa(50);
        }
    }

    public void pausa(int mlSeg) {
        try {
            // pausa para el splash
            Thread.sleep(mlSeg);
        } catch (Exception e) {
        }
    }

}
