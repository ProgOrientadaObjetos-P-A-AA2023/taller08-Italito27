/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Docente {
    protected String nombres;
    protected String cedula;

    public Docente(String nombres, String cedula) {
        this.nombres = nombres;
        this.cedula = cedula;
    }
    
    public String obtenerNombres() {
        return nombres;
    }
    
    public void establecerNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public String obtenerCedula() {
        return cedula;
    }
    
    public void establecerCedula(String cedula) {
        this.cedula = cedula;
    }
}