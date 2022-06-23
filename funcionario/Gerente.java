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
class Gerente extends funcionario{

    private int senha;

    public Gerente(String n, double s, double sF, double b) {
        super(n, s, sF, b);
    }
    
    public int retornaSenha(int senha){
        Scanner dado = new Scanner (System.in);
            System.out.println("Senha: ");
            this.senha = dado.nextInt();
            return senha=senha;
}
}