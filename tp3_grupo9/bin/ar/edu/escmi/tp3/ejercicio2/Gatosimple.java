package ar.edu.unju.escmi.tp3.ejercicio2;

public class GatoSimple {
    private String nombre;
    private String color;
    private String raza;
    private int edad;
    private double peso;
    private String sexo;

    public GatoSimple(String nombre, String color, String raza, int edad, double peso, String sexo) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo.toLowerCase();
    }

    public void maullar() {
        System.out.println(nombre + ": Miauu");
    }

    public void ronronear() {
        System.out.println(nombre + ": prrrr");
    }

    public void comer(String comida) {
        if (comida.equalsIgnoreCase("pescado")) {
            System.out.println(nombre + ": ¡Qué rico! ¡Gracias!");
        } else {
            System.out.println(nombre + ": Lo siento, yo solo como pescado.");
        }
    }

    public void pelear(GatoSimple gatoContrincante) {
        if (this.sexo.equals("hembra")) {
            System.out.println(nombre + ": No me gusta pelear.");
        } else { 
            if (gatoContrincante.sexo.equals("hembra")) {
                System.out.println(nombre + ": No peleo contra gatitas.");
            } else {
                System.out.println(nombre + ": ¡Ven aquí que te vas a enterar, " + gatoContrincante.nombre + "!");
            }
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Color: " + color + ", Raza: " + raza +
               ", Edad: " + edad + ", Peso: " + peso + "kg, Sexo: " + sexo;
    }
}
