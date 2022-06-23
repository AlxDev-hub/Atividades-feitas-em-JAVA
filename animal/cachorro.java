/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author alx_l
 */
class cachorro extends Animal{
    String late; 

    public cachorro(String n, String r, String c) {
        super(n, r, c);
    }
        public String retornaLate(String late){
            System.out.println(this.late=late);
            return late=late;
        }
}

