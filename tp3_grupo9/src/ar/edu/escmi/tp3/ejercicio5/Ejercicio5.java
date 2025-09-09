package ar.edu.escmi.tp3.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto[] productos = new Producto[3];
        int cantidadProductos = 0;
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1 – Crear producto");
            System.out.println("2 – Mostrar productos");
            System.out.println("3 – Modificar precio de producto");
            System.out.println("4 – Mostrar los productos que superen un precio");
            System.out.println("5 – Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    if (cantidadProductos < productos.length) {
                        Producto p = new Producto();
                        System.out.print("Ingrese código: ");
                        p.setCodigo(sc.nextLine());
                        System.out.print("Ingrese descripción: ");
                        p.setDescripcion(sc.nextLine());
                        System.out.print("Ingrese precio: ");
                        p.setPrecio(sc.nextDouble());
                        sc.nextLine(); // Limpiar buffer
                        productos[cantidadProductos++] = p;
                        System.out.println("Producto creado exitosamente.");
                    } else {
                        System.out.println("No hay más espacio para nuevos productos.");
                    }
                    break;
                case 2:
                    if (cantidadProductos == 0) {
                        System.out.println("No hay productos cargados.");
                    } else {
                        for (int i = 0; i < cantidadProductos; i++) {
                            System.out.println(productos[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el código del producto a modificar: ");
                    String codigoBuscar = sc.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < cantidadProductos; i++) {
                        if (productos[i].getCodigo().equals(codigoBuscar)) {
                            System.out.print("Ingrese el nuevo precio: ");
                            productos[i].setPrecio(sc.nextDouble());
                            sc.nextLine(); // Limpiar buffer
                            System.out.println("Precio actualizado.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró el producto con ese código.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el precio mínimo: ");
                    double precioMin = sc.nextDouble();
                    sc.nextLine(); // Limpiar buffer
                    boolean haySuperiores = false;
                    for (int i = 0; i < cantidadProductos; i++) {
                        if (productos[i].getPrecio() > precioMin) {
                            System.out.println(productos[i]);
                            haySuperiores = true;
                        }
                    }
                    if (!haySuperiores) {
                        System.out.println("No hay productos que superen ese precio.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
}
