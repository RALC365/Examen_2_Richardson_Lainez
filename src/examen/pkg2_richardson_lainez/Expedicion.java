/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_richardson_lainez;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author RALC
 */
public class Expedicion extends Thread implements Serializable {
    Naves_Espaciales nave;
    Planetas planeta_destino;
    int tiempo_ida;
    int tiempo_regreso;
    boolean vive;
    boolean avanzar;
    private static final long SerialVersionUID = 777L;
    

    public Expedicion(Naves_Espaciales nave, Planetas planeta_destino) {
        this.nave = nave;
        this.planeta_destino = planeta_destino;
        vive = true;
        avanzar = true;
        double [] tiempo = nave.calcularTiempo();
        this.tiempo_ida = (int)(tiempo[0] * 1000);
        this.tiempo_regreso = (int)(tiempo[1] * 1000);
    }

    public Naves_Espaciales getNave() {
        return nave;
    }

    public void setNave(Naves_Espaciales nave) {
        this.nave = nave;
    }

    public Planetas getPlaneta_destino() {
        return planeta_destino;
    }

    public void setPlaneta_destino(Planetas planeta_destino) {
        this.planeta_destino = planeta_destino;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
    
      @Override
    public void run(){
        while(vive){
            if(avanzar){
                if (this.tiempo_ida>0) {
                    tiempo_ida += -1;
                }else{
                    tiempo_regreso += -1;
                }
                if (tiempo_ida ==0) {
                    JOptionPane.showConfirmDialog(null, "La nave ha llegado a su destino");
                }
                if (tiempo_regreso ==0) {
                    JOptionPane.showConfirmDialog(null, "La nave ha regresado a casa");
                    try {
                        Thread.sleep(1000000000);
                    } catch (Exception e) {
                    }
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
                System.out.println("durmió");Logger.getLogger(Expedicion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
