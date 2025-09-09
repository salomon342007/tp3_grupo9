package ar.edu.escmi.tp3.ejercicio4;

public class Cliente {
    private String dni;
    private String nombre;
    private char categoria;

    public Cliente(String dni, String nombre, char categoria) {
        this.dni = dni;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getDni() {
        return dni;
    }

    public char getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}