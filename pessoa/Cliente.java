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
class Cliente extends Pessoa{

    protected double divida;
    protected int nascimento;
    
    public Cliente(String n, int i, String s) {
        super(n, i, s);
    }
    public double retornaDivida(double divida){
             Scanner dado = new Scanner (System.in);
         System.out.println("Digite o valor da divida: ");
         this.divida = dado.nextDouble();
         return divida;
    }
    public int retornaNascimento(int nascimento){
             Scanner dado = new Scanner (System.in);
         System.out.println("Digite seu ano de nascimento: ");
         this.nascimento = dado.nextInt();
         return nascimento;
    }
}