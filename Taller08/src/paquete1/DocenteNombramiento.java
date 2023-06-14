
package paquete1;

/**
 *
 * @author Italo
 */
public class DocenteNombramiento {
    private Docente docente;
    private double valorSueldo;
    private double valorHoraExtra;
    private int numeroHorasExtra;
    private double sueldo;

    public DocenteNombramiento(String nombres, String cedula, double valorSueld, double valorHoraExtr, int numeroHorasExtr) {
        docente = new Docente(nombres, cedula);
        valorSueldo = valorSueld;
        valorHoraExtra = valorHoraExtr;
        numeroHorasExtra = numeroHorasExtr;
        sueldo = calcularSueldo();
    }

    private double calcularSueldo() {
        return valorSueldo + (valorHoraExtra * numeroHorasExtra);
    }

    public void establecerNombres(String nombres) {
        docente.establecerNombres(nombres);
    }
    
    public String obtenerNombres() {
        return docente.obtenerNombres();
    }

    public void establecerCedula(String cedula) {
        docente.establecerCedula(cedula);
    }
    
    public String obtenerCedula() {
        return docente.obtenerCedula();
    }

    public void establecerValorSueldo(double valorSueld) {
        valorSueldo = valorSueld;
    }
    public double obtenerValorSueldo() {
        return valorSueldo;
    }
    
    public void establecerValorHoraExtra(double valorHoraExtr) {
        valorHoraExtra = valorHoraExtr;
    }

    public double obtenerValorHoraExtra() {
        return valorHoraExtra;
    }

    public void establecerNumeroHorasExtra(int numeroHorasExtr) {
        numeroHorasExtra = numeroHorasExtr;
    }

    public int obtenerNumeroHorasExtra() {
        return numeroHorasExtra;
    }

    public void establecerSueldo(double sueld) {
        sueldo = sueld;
    }
    public double obtenerSueldo() {
        return sueldo;
    }

}