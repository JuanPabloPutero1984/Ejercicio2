
package programacionoo2;

import Entidades.Circunferencia;


public class ProgramacionOO2 {

   
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia();
        c1.crearCircunferencia();
        System.out.println("El radio es " +c1.getRadio());
        
        System.out.println("El area es " + c1.area(c1.getRadio()));
        
        System.out.println("El perimetro es " +c1.perimetro());
    }

}
