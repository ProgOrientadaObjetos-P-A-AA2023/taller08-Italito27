package paquete2;

import paquete1.Docente;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;
import java.util.Scanner;

/**
 *
 * @author Italo
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese 1 para crear un Docente con nombramiento");
        System.out.println("Ingrese 2 para crear un Docente con factura:");
        int opcion = entrada.nextInt();
        entrada.nextLine();

        if (opcion == 1) {
            System.out.println("Ingrese los nombres del docente:");
            String nombres = entrada.nextLine();

            System.out.println("Ingrese la cédula del docente:");
            String cedula = entrada.nextLine();

            System.out.println("Ingrese el valor del sueldo:");
            double valorSueldo = entrada.nextDouble();

            System.out.println("Ingrese el valor de la hora extra:");
            double valorHoraExtra = entrada.nextDouble();

            System.out.println("Ingrese el número de horas extra:");
            int numeroHorasExtra = entrada.nextInt();

            DocenteNombramiento docente = new DocenteNombramiento(nombres, cedula, valorSueldo, valorHoraExtra, numeroHorasExtra);

            System.out.println("Nombre del docente: " + docente.obtenerNombres());
            System.out.println("Cédula del docente: " + docente.obtenerCedula());
            System.out.println("Valor del sueldo: " + docente.obtenerValorSueldo());
            System.out.println("Valor de la hora extra: " + docente.obtenerValorHoraExtra());
            System.out.println("Número de horas extra: " + docente.obtenerNumeroHorasExtra());
            System.out.println("Sueldo: " + docente.obtenerSueldo());

        } else if (opcion == 2) {
            System.out.println("Ingrese los nombres del docente:");
            String nombres = entrada.nextLine();

            System.out.println("Ingrese la cédula del docente:");
            String cedula = entrada.nextLine();

            System.out.println("Ingrese el valor de la factura:");
            double valorFactura = entrada.nextDouble();

            System.out.println("Ingrese el valor del IVA o descuento:");
            double valorIvaDescuento = entrada.nextDouble();

            DocenteFactura docente = new DocenteFactura(nombres, cedula, valorFactura, valorIvaDescuento);

            System.out.println("Nombre del docente: " + docente.obtenerNombres());
            System.out.println("Cédula del docente: " + docente.obtenerCedula());
            System.out.println("Valor de la factura: " + docente.obtenerValorFactura());
            System.out.println("Valor del IVA o descuento: " + docente.obtenerValorIvaDescuento());
            System.out.println("Valor a cancelar: " + docente.obtenerValorCancelar());

        } else {
            System.out.println("Error, opción no válida.");
        }
    }
}
