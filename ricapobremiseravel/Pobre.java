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
class Pobre extends Pessoa{
    public String trabalha;
    
        public Pobre (String n, int i){
            super(n,i);
        }
    public void retornaTrabalha(String trabalha){
            System.out.println(this.trabalha=trabalha);
         
}
}