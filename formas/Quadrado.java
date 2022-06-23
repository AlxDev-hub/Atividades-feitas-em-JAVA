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
public class Quadrado extends Retangulo{
    float ladoAltura;
    float area;
    float perimetro;
 
public float getLadoAltura(float la){
        this.ladoAltura = la;
        return ladoAltura;
    }  
    @Override    
    float calcularArea(){
        this.area=this.ladoAltura*this.ladoAltura;
            System.out.println("A area do quadrado e: "+area);
        return this.area;
    }
    
    @Override
    float calcularPerimetro(){
        this.perimetro=(this.ladoAltura*2)+(this.ladoAltura*2);
            System.out.println("O perimetro do quadrado e: "+perimetro);
        return this.perimetro;
    }
 
}
