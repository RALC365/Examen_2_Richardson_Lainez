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
public class Sonda_Espacial extends Naves_Espaciales{
    String material;
    double peso;

    public Sonda_Espacial() {
    }

    public Sonda_Espacial(String material, double peso) {
        super();
        this.material = material;
        this.peso = peso;
    }

    public Sonda_Espacial(String material, double peso, int serie, Planetas planeta, double velocidad) {
        super(serie, planeta, velocidad);
        this.material = material;
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    

    @Override
    public double[] calcularTiempo() {
        //0-ida;; 1-regreso
        double ida = super.getPlaneta().getDistancia_tierra()/ this.velocidad;
        double regreso = 9.8 * super.getVelocidad();
        double [] tiempo = new double[2];
        tiempo[0] =ida;
        tiempo[1] = regreso;
        return tiempo;
    }
    
    
    
}
