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
class Fornecedor extends Pessoa{
    public double credito;
    public double divida;
    public double saldo;
    
    public Fornecedor(String n, int i, String s) {
        super(n, i, s);
    }
     public double valorCredito(double credito){
         Scanner dado = new Scanner (System.in);
         System.out.println("Digite o valor do credito: ");
         this.credito = dado.nextDouble();
         return credito;
}
     public double valorDivida(double divida){
         Scanner dado = new Scanner (System.in);
         System.out.println("Digite o valor da divida: ");
         this.divida = dado.nextDouble();
         return divida;
}
     public double obterSaldo(double saldo){
         Scanner dado = new Scanner (System.in);
         saldo=credito-divida;
         System.out.println("O valor do saldo e: "+saldo);
         this.saldo = dado.nextDouble();
         return saldo;
}
}