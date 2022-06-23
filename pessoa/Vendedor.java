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
class Vendedor extends Empregado{

    protected double vendas;
    protected int qtdVendas;
    protected double comissao1;
    
    public Vendedor(String n, int i, String s) {
        super(n, i, s);
    }
    public double retornaVendas(double vendas){
             Scanner dado = new Scanner (System.in);
         System.out.println("Digite o valor de venda: ");
         this.vendas = dado.nextDouble();
         return vendas;
    }
    public int retornaQtdVendas(int qtdVendas){
             Scanner dado = new Scanner (System.in);
         System.out.println("Digite a quantidade de vendas: ");
         this.qtdVendas = dado.nextInt();
         return qtdVendas;
    }
    public double valorComissao(double comissao){
         Scanner dado = new Scanner (System.in);
         System.out.println("Digite o valor da comissao: ");
         this.comissao1 = dado.nextDouble();
         return comissao;
}
     public double salarioFinal2(double salariofinal2){
        salariofinal2 = salario+comissao1;
        System.out.println("Valor do salario final: "+ salariofinal2);
            return salariofinal2;
}
}