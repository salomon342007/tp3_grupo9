package ar.edu.escmi.tp3.ejercicio3;

public class Empleado {
    private String nombre;
    private int legajo;
    private double salario;

    public static final double SALARIO_MINIMO = 600000.00;
    public static final double AUMENTO_MERITOS = 90000.00;

    public Empleado(String nombre, int legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;
        if (salario >= SALARIO_MINIMO) {
            this.salario = salario;
        } else {
            this.salario = SALARIO_MINIMO;
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.printf("Salario $: %.2f\n", salario);
    }

    public void aumentarSalario() {
        this.salario += AUMENTO_MERITOS;
    }

    public int getLegajo() {
        return legajo;
    }
}