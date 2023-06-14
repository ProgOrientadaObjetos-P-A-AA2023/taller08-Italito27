package paquete2;

import paquete1.Docente;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("SISTEMA DOCENTES");
        System.out.println("----------------------------");
        boolean lim = true;
        do {
            System.out.println("Ingrese los nombres del docente:");
            String nombres = entrada.nextLine();

            System.out.println("Ingrese la cédula del docente:");
            String cedula = entrada.nextLine();

            System.out.println("Ingrese 1 para crear un Docente con nombramiento");
            System.out.println("Ingrese 2 para crear un Docente con factura:");
            System.out.println("Ingrese 3 para salir del sistema");
            int opcion = entrada.nextInt();
            entrada.nextLine();

            if (opcion == 1) {
                System.out.println("Ingrese el valor del sueldo:");
                double valorSueldo = entrada.nextDouble();

                System.out.println("Ingrese el valor de la hora extra:");
                double valorHoraExtra = entrada.nextDouble();

                System.out.println("Ingrese el número de horas extra:");
                int numeroHorasExtra = entrada.nextInt();

                DocenteNombramiento docente = new DocenteNombramiento();
                docente.establecerValorSueldo(valorSueldo);
                docente.establecerValorHoraExtra(valorHoraExtra);
                docente.establecerNumeroHorasExtra(numeroHorasExtra);     
                docente.establecerNombres(nombres);
                docente.establecerCedula(cedula);
                docente.calcularSalario();
                System.out.printf("%s\n", docente);
                
            } else if (opcion == 2) {
                System.out.println("Ingrese el valor de la factura:");
                double valorFactura = entrada.nextDouble();

                System.out.println("Ingrese el valor del IVA o descuento:");
                double valorIvaDescuento = entrada.nextDouble();

                DocenteFactura docenteF = new DocenteFactura();
                docenteF.establecerValorFactura(valorFactura);
                docenteF.establecerValorIvaDescuento(valorIvaDescuento);
                docenteF.establecerNombres(nombres);
                docenteF.establecerCedula(cedula);
                docenteF.calcularValorCancelar();
                System.out.printf("%s\n", docenteF);
            } else if (opcion == 3) {
                lim = false;
                System.out.println("Saliendo del sistema...");
                break;
            } else {
                System.out.println("Error, opción no válida.");
            }
            
            System.out.println("¿Desea agregar otro docente? S/N:");
            String respuesta = entrada.nextLine();
            entrada.nextLine();
            if (respuesta.equals("s") ) {
                lim = false;
            }    
        } while (lim);
    }
}
