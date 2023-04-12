package Entidades;

import java.util.Scanner;

public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar Radio");
        radio = leer.nextDouble();

    }

    public double area(double radio) {
        double auxCircun = Math.PI*Math.pow(radio, 2);
        return auxCircun;
    }
    
    public double perimetro() {
        return 2*Math.PI*radio;
    }
}
