/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_richardson_lainez;

/**
 *
 * @author RALC
 */
public abstract class Naves_Espaciales {
    int serie;
    Planetas planeta;
    double velocidad;

    public Naves_Espaciales() {
    }

    public Naves_Espaciales(int serie, Planetas planeta, double velocidad) {
        this.serie = serie;
        this.planeta = planeta;
        this.velocidad = velocidad;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Planetas getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planetas planeta) {
        this.planeta = planeta;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return serie+"";
    }
    public abstract double [] calcularTiempo();
    
    
    
}
