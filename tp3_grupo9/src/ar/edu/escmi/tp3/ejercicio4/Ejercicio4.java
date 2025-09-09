package ar.edu.escmi.tp3.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente[] clientes = new Cliente[4];
        int cantidadClientes = 0;
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1 – Crear cliente");
            System.out.println("2 – Mostrar los datos de un cliente");
            System.out.println("3 – Mostrar todos los clientes");
            System.out.println("4 – Mostrar todos los clientes por categoría");
            System.out.println("5 – Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    if (cantidadClientes < clientes.length) {
                        System.out.print("Ingrese DNI: ");
                        String dni = sc.nextLine();
                        System.out.print("Ingrese nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese categoría (char): ");
                        char categoria = sc.nextLine().charAt(0);
                        clientes[cantidadClientes++] = new Cliente(dni, nombre, categoria);
                        System.out.println("Cliente creado exitosamente.");
                    } else {
                        System.out.println("No hay más espacio para nuevos clientes.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el DNI a buscar: ");
                    String dniBuscar = sc.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < cantidadClientes; i++) {
                        if (clientes[i].getDni().equals(dniBuscar)) {
                            System.out.println(clientes[i]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró el dni.");
                    }
                    break;
                case 3:
                    if (cantidadClientes == 0) {
                        System.out.println("No hay clientes cargados.");
                    } else {
                        for (int i = 0; i < cantidadClientes; i++) {
                            System.out.println(clientes[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Ingrese la categoría a buscar: ");
                    char catBuscar = sc.nextLine().charAt(0);
                    boolean hayCategoria = false;
                    for (int i = 0; i < cantidadClientes; i++) {
                        if (clientes[i].getCategoria() == catBuscar) {
                            System.out.println(clientes[i]);
                            hayCategoria = true;
                        }
                    }
                    if (!hayCategoria) {
                        System.out.println("No hay clientes con esa categoría.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
