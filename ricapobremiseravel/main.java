/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricapobremiseravel;

/**
 *
 * @author alx_l
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pessoa rico = new Rico("nomeRico",60);
        Rico obj1 = new Rico("nomeRico",60);
       Pessoa pobre = new Pobre("nomePobre",40);
        Pobre obj2 = new Pobre("nomePobre",40);
       Pessoa miseravel = new Miseravel("nomeMiseravel",18);
        Miseravel obj3 = new Miseravel("nomeMiseravel",18);
      
       obj1.retornaNome();
       obj1.retornaIdade();
       obj1.retornaCompras("compras");
       obj2.retornaNome();
       obj2.retornaIdade();
       obj2.retornaTrabalha("Trabalha");
       obj3.retornaNome();
       obj3.retornaIdade();
       obj3.retornaMendiga("Mendiga");
    }
    
}
