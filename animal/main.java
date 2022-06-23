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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal obj = new cachorro("nomeCachorro","nomeRaca","Sim");
        cachorro obj1=new cachorro("nomeCachorro","nomeRaca","Sim");
                gato obj2=new gato("nomeGato","nomeRaca","Sim");
        Animal obj3 = new gato("nomeGato","nomeRaca","Sim");

        obj.retornaNome();
        obj.retornaCaminha();
        obj.retornaRaca();
        obj1.retornaLate("auauau");
        obj2.retornaMiau("miau");
        obj3.retornaNome();
        obj3.retornaCaminha();
        obj3.retornaRaca();
        
    }
    
}
