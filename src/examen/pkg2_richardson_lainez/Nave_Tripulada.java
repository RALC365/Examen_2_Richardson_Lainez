/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_richardson_lainez;

import java.util.ArrayList;

/**
 *
 * @author RALC
 */
public class Nave_Tripulada extends Naves_Espaciales {

    private Planetas lugar_despeje;
    private ArrayList<Astronautas> astronautas;

    public Nave_Tripulada() {
    }

    public Nave_Tripulada(Planetas lugar_despeje) {
        this.lugar_despeje = lugar_despeje;
    }

    public Nave_Tripulada(Planetas lugar_despeje, int serie, Planetas planeta, double velocidad) {
        super(serie, planeta, velocidad);
        this.lugar_despeje = lugar_despeje;
    }

    public Planetas getLugar_despeje() {
        return lugar_despeje;
    }

    public void setLugar_despeje(Planetas lugar_despeje) {
        this.lugar_despeje = lugar_despeje;
    }

    public ArrayList<Astronautas> getAstronautas() {
        return astronautas;
    }

    public void setAstronautas(ArrayList<Astronautas> astronautas) {
        this.astronautas = astronautas;
    }

    //mutador extra
    public void setAstronauta(Astronautas a) {
        this.astronautas.add(a);
    }

    public Astronautas getAstronauta(int a) {
        return this.astronautas.get(a);
    }

    @Override
    public double[] calcularTiempo() {
        //0-ida;; 1-regreso
        double pesos = 0;
        if (!this.astronautas.isEmpty()) {
            for (Astronautas t : this.astronautas) {
                pesos += t.getPeso();
            }
        }else{
            System.out.println("no hay astronautas");
        }

        double ida = super.getPlaneta().getDistancia_tierra() / (this.velocidad * ((pesos * pesos) / 100));
        double regreso = super.getPlaneta().getDistancia_tierra() / (this.velocidad * ((pesos) / 100));

        double[] tiempo = new double[2];
        tiempo[0] = ida;
        tiempo[1] = regreso;
        return tiempo;
    }

}
