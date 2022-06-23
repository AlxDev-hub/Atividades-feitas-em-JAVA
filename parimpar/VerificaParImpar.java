/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimpar;

import java.util.Scanner;

/**
 *
 * @author alx_l
 */
public class VerificaParImpar {
    int numero;
    public void calculaparimpar(){
    Scanner dados = new Scanner (System.in);
    System.out.println("Digite o numero:");
    this.numero = dados.nextInt();
    if(numero%2==0){
        System.out.println("O numero é par.");
    }else{
        System.out.println("O numero é impar.");
    }
    if(numero==0){
        System.out.println("O numero é zero.");
    }else{
        if(numero<0){
            System.out.println("O numero é negativo.");
        }else{System.out.println("O numero é positivo.");
    }
    }
    
}
}