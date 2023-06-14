/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Italo
 */
public class DocenteFactura {

    private Docente docente;
    private double valorFactura;
    private double valorIvaDescuento;
    private double valorCancelar;

    public DocenteFactura(String nombres, String cedula, double valorFactur, double valorIvaDescuent) {
        docente = new Docente(nombres, cedula);
        valorFactura = valorFactur;
        valorIvaDescuento = valorIvaDescuent;
        valorCancelar = calcularValorCancelar();
    }

    private double calcularValorCancelar() {
        return valorFactura + (valorFactura * valorIvaDescuento);
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

    public void establecerValorFactura(double valorFactur) {
        valorFactura = valorFactur;
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public void establecerValorIvaDescuento(double valorIvaDescuent) {
        valorIvaDescuento = valorIvaDescuent;
    }

    public double obtenerValorIvaDescuento() {
        return valorIvaDescuento;
    }

    public void establecerValorCancelar(double valorCancela) {
        valorCancelar = valorCancela;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

}
