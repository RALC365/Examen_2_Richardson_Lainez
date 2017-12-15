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
public class Astronautas {
    private String nombre, nacionalidad, experiencia, sexo;
    private double sueldo, peso;

    public Astronautas() {
    }

    public Astronautas(String nombre, String nacionalidad, String experiencia, String sexo, double sueldo, double peso) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.experiencia = experiencia;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Astronautas{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", experiencia=" + experiencia + ", sexo=" + sexo + ", sueldo=" + sueldo + ", peso=" + peso + '}';
    }
    
    
}
