/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

import java.util.Scanner;

/**
 *
 * @author alx_l
 */
class Telefonista extends funcionario{

    private int codigo;

    public Telefonista(String n, double s, double sF, double b) {
        super(n, s, sF, b);
    }
    
     public int retornaCodigo(int codigo){
         Scanner dado = new Scanner (System.in);
            System.out.println("Codigo de estacao de trabalho: ");
            codigo = dado.nextInt();
            return codigo=codigo;
}
}