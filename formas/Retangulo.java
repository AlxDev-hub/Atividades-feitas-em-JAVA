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
public class Retangulo extends formas{
        float lado;
        float Altura;
        float area;
        float perimetro;
    
    @Override    
    float calcularArea(){
        this.area=this.lado*this.Altura;
            System.out.println("A area do retangulo e: "+area);
        return this.area;
    }
public float getLado(float l){
        this.lado = l;
        return lado;
    }
public float getAltura(float a){
        this.Altura = a;
        return Altura;
    }
  
    @Override
    float calcularPerimetro(){
        this.perimetro=(this.lado*2)+(this.Altura*2);
            System.out.println("O perimetro do retangulo e: "+perimetro);
        return this.perimetro;
    }
}