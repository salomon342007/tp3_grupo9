package ar.edu.escmi.tp3.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado empleado = null;
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1- Crear empleado");
            System.out.println("2- Aumentar Salario");
            System.out.println("3- Mostrar los datos del empleado");
            System.out.println("4- Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese legajo: ");
                    int legajo = sc.nextInt();
                    System.out.print("Ingrese salario: ");
                    double salario = sc.nextDouble();
                    empleado = new Empleado(nombre, legajo, salario);
                    System.out.println("Empleado creado correctamente.");
                    break;
                case 2:
                    if (empleado == null) {
                        System.out.println("Primero debe crear un empleado.");
                        break;
                    }
                    System.out.print("Ingrese el número de legajo: ");
                    int legajoBuscado = sc.nextInt();
                    if (empleado.getLegajo() == legajoBuscado) {
                        empleado.aumentarSalario();
                        System.out.println("Salario aumentado correctamente.");
                    } else {
                        System.out.println("Legajo incorrecto.");
                    }
                    break;
                case 3:
                    if (empleado == null) {
                        System.out.println("Primero debe crear un empleado.");
                    } else {
                        empleado.mostrarDatos();
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
