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
class Gerente extends Empregado{

    public String nomeGerente;
    
    public Gerente(String n, int i, String s) {
        super(n, i, s);
    }
    
    public String retornaNomeGerente(String nomeGerente){
             Scanner dado = new Scanner (System.in);
         System.out.println("Digite o nome do gerente: ");
         this.nomeGerente = dado.next();
         return nomeGerente;
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
    public String retornaMatricula(){
        this.matricula = retornaMatricula(matricula);
        return matricula;
    }
}