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
class Operario extends Empregado{
    public double valorP;
    public double comissao;
    public double salariofinal1;
    
    public Operario(String n, int i, String s) {
        super(n, i, s);
    }
    public double retornaSalario(double salario){
        Scanner dado = new Scanner (System.in);   
        System.out.println("Salario: ");
            this.salario = dado.nextDouble(); 
            return salario;
    }
     public double salarioFinal1(double salariofinal1){
        salariofinal1 = salario+comissao;
        System.out.println("Valor do salario final: "+ salariofinal1);
            return salariofinal1;
     }
     public String retornaMatricula(String matricula){
             Scanner dado = new Scanner (System.in);
         System.out.println("Digite sua matricula: ");
         this.matricula = dado.next();
         return matricula;
    }
     public double valorProducao(double valorP){
         Scanner dado = new Scanner (System.in);
         System.out.println("Digite o valor da producao: ");
         this.valorP = dado.nextDouble();
         return valorP;
     }
     public double valorComissao(double comissao){
         Scanner dado = new Scanner (System.in);
         System.out.println("Digite o valor da comissao: ");
         this.comissao = dado.nextDouble();
         return comissao;
}
}
