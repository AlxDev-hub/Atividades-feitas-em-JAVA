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
public class Pessoa {
    
    protected String nome;
    protected int idade;
    protected String sexo;
    
    public Pessoa(String n, int i, String s){
            nome = n;
            idade = i;
            sexo = s;
        }
        public String retornaNome(){
             Scanner dado = new Scanner (System.in);
         System.out.println("Digite seu nome: ");
         this.nome = dado.next();
         return nome;
        }
        public int retornaIdade(){
             Scanner dado = new Scanner (System.in);
         System.out.println("Digite sua idade: ");
         this.idade = dado.nextInt();
         return idade;
        }
        public String retornaSexo(){
             Scanner dado = new Scanner (System.in);
         System.out.println("Digite seu sexo: ");
         this.sexo = dado.next();
         return sexo;
}
}