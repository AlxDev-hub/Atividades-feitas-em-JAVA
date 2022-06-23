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
class Rico extends Pessoa {
    protected Double dinheiro;
    public String compras;    
        
        public Rico (String n, int i){
            super(n, i);
        }
        public String retornaCompras(String compras){
            System.out.println(this.compras=compras);
            return compras=compras;
}
}
