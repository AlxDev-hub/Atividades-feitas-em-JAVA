/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc_fatorial;

import java.util.Scanner;

/**
 *
 * @author alx_l
 */
public class Fatorial {
    
    int valor;
    int resultado=1;
    
    public int calcular_fatorial(){
        
        Scanner dado=new Scanner(System.in);
        int auxvalor;
        System.out.println("Informe o valor para calcular o fatorial:");
        this.valor=dado.nextInt();
        
        auxvalor=this.valor;
        if(this.valor==1||this.valor==0){
            System.out.println("Resultado = 1");
        }
        if(this.valor>1){
        for(int i=0;i<auxvalor;i++){
            this.resultado=this.resultado*this.valor;
            this.valor=this.valor-1;
        }}
        
        System.out.println(this.resultado);
        return this.resultado;
    
}
}
