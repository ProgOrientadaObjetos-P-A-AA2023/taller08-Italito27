package paquete1;

/**
 *
 * @author Italo
 */
public class DocenteNombramiento extends Docente{

    private double valorSueldo;
    private double valorHoraExtra;
    private int numeroHorasExtra;
    private double salario;

    public void calcularSalario() {
        salario = (valorHoraExtra * numeroHorasExtra) + valorSueldo;
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

    public double obtenerSalario() {
        return salario;
    }

    @Override
    public String toString() {
        String reporte = String.format("\nDocente Nombramiento: \nNombre: %s"
                + "\nCedula %s"
                + "\nValor del sueldo: %.2f"
                + "\nValor hora extra: %.2f"
                + "\nNumero de horas extra: %d"
                + "\nSalario: %.2f\n", obtenerNombres(), obtenerCedula(), obtenerValorSueldo(),
                obtenerValorHoraExtra(),
                obtenerNumeroHorasExtra(),
                obtenerSalario());

        return reporte;
    }
}
