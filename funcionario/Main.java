/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

/**
 *
 * @author alx_l
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        funcionario obj = new funcionario("NomeFuncionario", 0.0, 0.0, 0.0);
        Gerente obj1 = new Gerente("NomeGerente", 0.0, 0.0, 0.0);
        Telefonista obj2 = new Telefonista("NomeTelefonista", 0.0, 0.0, 0.0);
        Secretaria obj3 = new Secretaria("NomeSecretaria", 0.0, 0.0, 0.0);
        
        obj.retornaNome();
        obj.retornaSalario();
        obj.calculaBonificacao();
        
        obj1.retornaNome();
        obj1.retornaSalario();
        obj1.calculaBonificacao();
        obj1.retornaSenha(0);
        
        obj2.retornaNome();
        obj2.retornaSalario();
        obj2.calculaBonificacao();
        obj2.retornaCodigo(0);
        
        obj3.retornaNome();
        obj3.retornaSalario();
        obj3.calculaBonificacao();
        obj3.retornaRamal(0);
    }
    
}
