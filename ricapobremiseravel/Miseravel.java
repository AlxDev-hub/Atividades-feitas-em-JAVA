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
class Miseravel extends Pessoa{
    public String mendiga;
    
    public Miseravel(String n, int i) {
        super(n, i);
    }
     public void retornaMendiga(String mendiga){
            System.out.println(this.mendiga=mendiga);
}
}