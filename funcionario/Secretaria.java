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
class Secretaria extends funcionario{

    private int ramal;

    public Secretaria(String n, double s, double sF, double b) {
        super(n, s, sF, b);
    }
    
    public int retornaRamal(int ramal){
        Scanner dado = new Scanner (System.in);
            System.out.println("Ramal: ");
            ramal = dado.nextInt();
            return ramal=ramal;
}
}