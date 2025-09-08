package ar.edu.escmi.tp3.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();
        int opcion;

        do {
            System.out.println("----- MENÚ -----");
            System.out.println("1 – Crear objeto con Constructor por defecto");
            System.out.println("2 – Crear objeto con Constructor parametrizado");
            System.out.println("3 – Crear objeto con Constructor (dni, nombre, fecha de nacimiento)");
            System.out.println("4 – Mostrar personas");
            System.out.println("5 – Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    Persona p1 = new Persona();
                    System.out.print("Ingrese DNI: ");
                    p1.setDni(sc.nextLine());
                    System.out.print("Ingrese Nombre: ");
                    p1.setNombre(sc.nextLine());
                    System.out.print("Ingrese Fecha de nacimiento (YYYY-MM-DD): ");
                    p1.setFechaNacimiento(LocalDate.parse(sc.nextLine()));
                    System.out.print("Ingrese Domicilio: ");
                    p1.setDomicilio(sc.nextLine());
                    System.out.print("Ingrese Provincia: ");
                    p1.setProvincia(sc.nextLine());
                    personas.add(p1);
                    break;
                case 2:
                    System.out.print("Ingrese DNI: ");
                    String dni2 = sc.nextLine();
                    System.out.print("Ingrese Nombre: ");
                    String nombre2 = sc.nextLine();
                    System.out.print("Ingrese Fecha de nacimiento (YYYY-MM-DD): ");
                    LocalDate fecha2 = LocalDate.parse(sc.nextLine());
                    System.out.print("Ingrese Domicilio: ");
                    String domicilio2 = sc.nextLine();
                    System.out.print("Ingrese Provincia: ");
                    String provincia2 = sc.nextLine();
                    Persona p2 = new Persona(dni2, nombre2, fecha2, domicilio2, provincia2);
                    personas.add(p2);
                    break;
                case 3:
                    System.out.print("Ingrese DNI: ");
                    String dni3 = sc.nextLine();
                    System.out.print("Ingrese Nombre: ");
                    String nombre3 = sc.nextLine();
                    System.out.print("Ingrese Fecha de nacimiento (YYYY-MM-DD): ");
                    LocalDate fecha3 = LocalDate.parse(sc.nextLine());
                    Persona p3 = new Persona(dni3, nombre3, fecha3);
                    personas.add(p3);
                    break;
                case 4:
                    if (personas.isEmpty()) {
                        System.out.println("No hay personas registradas.");
                    } else {
                        for (Persona persona : personas) {
                            persona.mostrarDatos();
                        }
                    }
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
