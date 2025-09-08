package ar.edu.escmi.tp3.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GatoSimple> gatos = new ArrayList<>();
        GatoSimple gatoPrincipal = null;

        int opcion;
        do {
            System.out.println("\n MENÚ EJERCICIO 2 ");
            System.out.println("1 – Crear gato simple");
            System.out.println("2 – Dar de comer al gato simple");
            System.out.println("3 – Mostrar todos los gatos");
            System.out.println("4 – Crear gato contrincante y pelear");
            System.out.println("5 – Salir");
            System.out.print("Opcion: ");
            while (!sc.hasNextInt()) { sc.next(); System.out.print("Ingrese un número: "); }
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Color: ");
                    String color = sc.nextLine();
                    System.out.print("Raza: ");
                    String raza = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = Integer.parseInt(sc.nextLine());
                    System.out.print("Peso (kg): ");
                    double peso = Double.parseDouble(sc.nextLine());
                    System.out.print("Sexo (macho/hembra): ");
                    String sexo = sc.nextLine();

                    gatoPrincipal = new GatoSimple(nombre, color, raza, edad, peso, sexo);
                    gatos.add(gatoPrincipal);
                    System.out.println(" Gato creado.");
                    break;

                case 2:
                    if (gatoPrincipal != null) {
                        System.out.print("Ingrese comida: ");
                        String comida = sc.nextLine();
                        gatoPrincipal.comer(comida);
                    } else {
                        System.out.println("Primero debe crear un gato.");
                    }
                    break;

                case 3:
                    if (gatos.isEmpty()) {
                        System.out.println("No hay gatos registrados.");
                    } else {
                        for (GatoSimple g : gatos) {
                            System.out.println(g);
                            g.maullar();
                            g.ronronear();
                        }
                    }
                    break;

                case 4:
                    if (gatoPrincipal != null) {
                        System.out.println("Creando gato contrincante...");
                        System.out.print("Nombre: ");
                        String n2 = sc.nextLine();
                        System.out.print("Color: ");
                        String c2 = sc.nextLine();
                        System.out.print("Raza: ");
                        String r2 = sc.nextLine();
                        System.out.print("Edad: ");
                        int e2 = Integer.parseInt(sc.nextLine());
                        System.out.print("Peso (kg): ");
                        double p2 = Double.parseDouble(sc.nextLine());
                        System.out.print("Sexo (macho/hembra): ");
                        String s2 = sc.nextLine();

                        GatoSimple contrincante = new GatoSimple(n2, c2, r2, e2, p2, s2);
                        gatos.add(contrincante);
                        gatoPrincipal.pelear(contrincante);
                    } else {
                        System.out.println(" Primero debe crear un gato principal.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
