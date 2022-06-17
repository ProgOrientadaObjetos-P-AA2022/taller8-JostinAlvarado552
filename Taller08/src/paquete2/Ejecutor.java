/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese:\n1 para ingresar DocenteNombramiento\n"
                + "2 para ingresar DocenteFactura ");
        int opcion = entrada.nextInt();
        entrada.nextLine();

        if ((opcion == 1) || (opcion == 2)) {
            Docente docente = new Docente();
            System.out.println("Ingrese el nombre del docente");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese cedula del docente");
            String cedula = entrada.nextLine();
            docente.establecerNombreDocente(nombre);
            docente.establecerCedulaDocente(cedula);
            if (opcion == 1) {
                DocenteNombramiento docenteN = new DocenteNombramiento();
                System.out.println("Ingrese el valor del sueldo");
                double valorSueldo = entrada.nextDouble();
                System.out.println("Ingrese el valor de las horas extra");
                double valorHorasExtra = entrada.nextDouble();
                System.out.println("Ingrese el numero de horas extra");
                int numeroHoras = entrada.nextInt();
                docenteN.establecerNombreDocente(nombre);
                docenteN.establecerCedulaDocente(cedula);
                docenteN.establecerValorSueldo(valorSueldo);
                docenteN.establecerValorHorasExtras(valorHorasExtra);
                docenteN.establecerNumeroHorasExtra(numeroHoras);
                docenteN.calcularSueldoTotal();
                System.out.println(docenteN);
            } else {
                if (opcion == 2) {
                    DocenteFactura docenteF = new DocenteFactura();

                    System.out.println("Ingrese el Valor de la Factura");
                    double valorFactura = entrada.nextDouble();
                    System.out.println("Ingrese el Valor del Iva");
                    double valorIva = entrada.nextDouble();
                    docenteF.establecerNombreDocente(nombre);
                    docenteF.establecerCedulaDocente(cedula);
                    docenteF.establecerValorFactura(valorFactura);
                    docenteF.establecerValorIVA(valorIva);
                    docenteF.calcularValorCancelar();
                    System.out.println(docenteF);
                }
            }
        } else {
            System.out.println("Error, opción no válida.");
        }
    }
}
