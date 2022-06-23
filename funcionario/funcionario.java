/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

import java.util.Scanner;

/**
 *
 * @author alx_l
 */
public class funcionario {
    private String nome;
    private double salario;
    private double salarioFinal;
    private double bonificacao;
    
        public funcionario(String n, double s, double sF, double b){
            nome = n;
            salario = s;
            salarioFinal = sF;
            bonificacao = b;
        }
         public String retornaNome(){
             Scanner dado = new Scanner (System.in);
         System.out.println("Digite seu nome: ");
         this.nome = dado.next();
         return nome;
        }
         public double retornaSalario(){
             Scanner dado = new Scanner (System.in);
         System.out.println("Digite o valor do salario: ");
         this.salario =dado.nextDouble();
         return salario;
         }
         public double calculaBonificacao(){
             Scanner dado = new Scanner (System.in);
             bonificacao = (salario*10)/100;
             salarioFinal = salario+bonificacao;
             System.out.println("Valor do salario: "+salario+"\n Bonificação de 10%: "+ bonificacao);
             System.out.println("O Salario Final sera: "+salarioFinal);
             return salarioFinal;
         }
}
