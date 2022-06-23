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
public class Circulo extends formas{
    float raio;
    float area;
    float perimetro;
    
 public float getRaio(float r){
        this.raio = r;
        return raio;
    }
    @Override
    float calcularArea(){
        this.area=(float) ((this.raio)*(Math.PI));
            System.out.println("A area do circulo e: "+area);
        return this.area;
    }

    @Override
    float calcularPerimetro(){
        this.perimetro=(float) ((2*(Math.PI))*(this.raio));
            System.out.println("O perimetro do circulo e: "+perimetro);
        return this.perimetro;
    }
}