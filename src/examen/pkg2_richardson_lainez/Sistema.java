/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_richardson_lainez;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author RALC
 */
public class Sistema implements Serializable {
     public ArrayList<Planetas> planetas = new ArrayList();
    public ArrayList<Astronautas> astronautas = new ArrayList();
    public ArrayList<Nave_Tripulada> naves_tripuladas = new ArrayList();
    public ArrayList<Sonda_Espacial> sondas_espaciales = new ArrayList();
    public ArrayList<Expedicion> expediciones = new ArrayList();
    private static final long SerialVersionUID = 777L;

    public Sistema(ArrayList<Planetas> planetas, ArrayList<Astronautas> astronautas, ArrayList<Nave_Tripulada> naves_tripuladas,
     ArrayList<Sonda_Espacial> sondas_espaciales, ArrayList<Expedicion> expediciones) {
        this.planetas = planetas;
        this.astronautas = astronautas;
        this.naves_tripuladas = naves_tripuladas;
        this.sondas_espaciales = sondas_espaciales;
        this.expediciones = expediciones;
    }

    public ArrayList<Planetas> getPlanetas() {
        return planetas;
    }

    public void setPlanetas(ArrayList<Planetas> planetas) {
        this.planetas = planetas;
    }

    public ArrayList<Astronautas> getAstronautas() {
        return astronautas;
    }

    public void setAstronautas(ArrayList<Astronautas> astronautas) {
        this.astronautas = astronautas;
    }

    public ArrayList<Nave_Tripulada> getNaves_tripuladas() {
        return naves_tripuladas;
    }

    public void setNaves_tripuladas(ArrayList<Nave_Tripulada> naves_tripuladas) {
        this.naves_tripuladas = naves_tripuladas;
    }

    public ArrayList<Sonda_Espacial> getSondas_espaciales() {
        return sondas_espaciales;
    }

    public void setSondas_espaciales(ArrayList<Sonda_Espacial> sondas_espaciales) {
        this.sondas_espaciales = sondas_espaciales;
    }

    public ArrayList<Expedicion> getExpediciones() {
        return expediciones;
    }

    public void setExpediciones(ArrayList<Expedicion> expediciones) {
        this.expediciones = expediciones;
    }
    
    
    
    
}
