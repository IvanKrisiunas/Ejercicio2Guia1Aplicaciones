package ejercicio2guia1aplicaciones;

import java.util.Scanner;

public class Perro {
    private String nombre;
    private int edad;
    private String raza;
    private double altura;

    public Perro(String nombre, int edad, String raza, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public void accion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Si quieres que el perro ladre tienes que decir habla");
        String resp = leer.nextLine();
        if (resp.contentEquals("habla")) {
            System.out.println("*" + nombre + "*" + " wau");
            System.out.println("Aguante boca");
        }
    }
}
