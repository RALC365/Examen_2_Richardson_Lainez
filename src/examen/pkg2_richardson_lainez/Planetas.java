/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_richardson_lainez;

import java.io.Serializable;

/**
 *
 * @author RALC
 */
public class Planetas implements Serializable {
     String nombre; 
     int tem_media;
     boolean anillos;
     String tipo_superficie;
    int distancia_tierra;
    private static final long SerialVersionUID = 777L;  

    public Planetas() {
    }

    public Planetas(String nombre, int tem_media, boolean anillos, String tipo_superficie, int distancia_tierra) {
        this.nombre = nombre;
        this.tem_media = tem_media;
        this.anillos = anillos;
        this.tipo_superficie = tipo_superficie;
        this.distancia_tierra = distancia_tierra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTem_media() {
        return tem_media;
    }

    public void setTem_media(int tem_media) {
        this.tem_media = tem_media;
    }

    public boolean isAnillos() {
        return anillos;
    }

    public void setAnillos(boolean anillos) {
        this.anillos = anillos;
    }

    public String getTipo_superficie() {
        return tipo_superficie;
    }

    public void setTipo_superficie(String tipo_superficie) {
        this.tipo_superficie = tipo_superficie;
    }

    public int getDistancia_tierra() {
        return distancia_tierra;
    }

    public void setDistancia_tierra(int distancia_tierra) {
        this.distancia_tierra = distancia_tierra;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
