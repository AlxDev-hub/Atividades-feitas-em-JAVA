/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc_media;

import java.util.Scanner;

/**
 *
 * @author alx_l
 */
public class CalculaMedia {
    
    double nota;
    double media;
    double soma=0.0;
    
    public void CalculaMedia(){
        
    }
    
    public double calcularmedia(){
        
        Scanner dados=new Scanner(System.in);
        
        for(int i=0;i<5;i++){
       System.out.println("Digite uma nota");
        this.nota=dados.nextDouble();
        if(this.nota>=6.0){
            System.out.println("aluno aprovado");
        }
        else {
            System.out.println("aluno reprovado");
        }
        this.soma=this.soma+this.nota;
        }
        this.media=soma/5;
        
            System.out.println("media da turma:"+this.media);
        
        return this.media;

    }
}