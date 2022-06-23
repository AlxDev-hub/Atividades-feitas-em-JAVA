/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

import java.util.Scanner;

/**
 *
 * @author alx_l
 */
class Administrador extends Empregado{
    public double ajuda;
    public double salario1;
    
    public Administrador(String n, int i, String s) {
        super(n, i, s);
    }
    public double retornaSalario(double salario){
        Scanner dado = new Scanner (System.in);   
        System.out.println("Salario: ");
            this.salario = dado.nextDouble(); 
            return salario;
    }
     public double valorINSS(double INSS){
        INSS = salario*0.11;
        System.out.println("Valor do inss: "+ INSS);
            return INSS;
     }
     public String retornaMatricula(String matricula){
             Scanner dado = new Scanner (System.in);
         System.out.println("Digite sua matricula: ");
         this.matricula = dado.next();
         return matricula;
    }
     public double ajudadeCusto(double ajuda){
         Scanner dado = new Scanner (System.in);
         System.out.println("Digite a ajuda de custo: ");
         this.ajuda=dado.nextDouble();
         return ajuda;
     }
     public double calcularSalario(double salario1){
         salario1 = salario*ajuda;
        System.out.println("Valor do salario: "+salario1);
            return salario;
     }
}
