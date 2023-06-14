/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Italo
 */
public class DocenteFactura extends Docente {

    private double valorFactura;
    private double valorIvaDescuento;
    private double valorCancelar;

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

    public void calcularValorCancelar() {
        valorCancelar = valorFactura - ((valorIvaDescuento / 100) * valorFactura);
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String reporte = String.format("\nDocente Factura: "
                + "\nNombre: %s"
                + "\nCedula: %s"
                + "\nValor factura: %.2f"
                + "\nValor Iva con descuento: %.2f"
                + "\nValor a cancelar : %.2f",
                obtenerNombres(),
                obtenerCedula(),
                obtenerValorFactura(),
                obtenerValorIvaDescuento(),
                obtenerValorCancelar());

        return reporte;
    }
}
