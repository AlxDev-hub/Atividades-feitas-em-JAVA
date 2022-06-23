/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

/**
 *
 * @author alx
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            Retangulo obj1 = new Retangulo();
 
            Circulo obj2 = new Circulo();

            Quadrado obj3 = new Quadrado();
        
obj1.getAltura(5);
obj1.getLado(3);
obj1.calcularArea();
obj1.calcularPerimetro();

obj2.getRaio(4);
obj2.calcularArea();
obj2.calcularPerimetro();

obj3.getLadoAltura(9);
obj3.calcularArea();
obj3.calcularPerimetro();
    }
    
}
