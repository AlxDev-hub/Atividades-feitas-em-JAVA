/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author alx_l
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Pessoa obj = new Pessoa("NomePessoa", 00, "SexoPessoa");
           Empregado obj1 = new Empregado("NomePessoa", 00, "SexoPessoa");
           Cliente obj2 = new Cliente("NomePessoa", 00, "SexoPessoa");
           Gerente obj3 = new Gerente("NomePessoa", 00, "SexoPessoa");
           Vendedor obj4 = new Vendedor("NomePessoa", 00, "SexoPessoa");
           Administrador obj5 = new Administrador("NomePessoa", 00, "SexoPessoa");
           Operario obj6 = new Operario("NomePessoa", 00, "SexoPessoa");
           Fornecedor obj7 = new Fornecedor("NomePessoa", 00, "SexoPessoa");
           
           obj.retornaNome();
           obj.retornaIdade();
           obj.retornaSexo();
           
           obj1.retornaNome();
           obj1.retornaIdade();
           obj1.retornaSexo();
           obj1.retornaSalario(0);
           obj1.valorINSS(0);
        String matricula = null;
           obj1.retornaMatricula(matricula);
           
           obj2.retornaNome();
           obj2.retornaIdade();
           obj2.retornaSexo();
           obj2.retornaDivida(0);
           obj2.retornaNascimento(0);
           
           obj3.retornaNome();
           obj3.retornaIdade();
            String nomeGerente = null;
           obj3.retornaNomeGerente(nomeGerente);
           obj3.retornaSalario(0);
           obj3.valorINSS(0);
           obj3.retornaMatricula();
           
           obj4.retornaNome();
           obj4.retornaSalario(0);
           obj4.retornaVendas(0);
           obj4.retornaQtdVendas(0);
           obj4.valorComissao(0);
           obj4.salarioFinal2(0);
           
            obj5.retornaNome();
           obj5.retornaIdade();
           obj5.retornaSexo();
           obj5.ajudadeCusto(0);
           obj5.calcularSalario(0);
           
            obj6.retornaNome();
           obj6.retornaIdade();
           obj6.retornaSexo();
           obj6.valorProducao(0);
           obj6.valorComissao(0);
           
            obj7.retornaNome();
           obj7.retornaIdade();
           obj7.retornaSexo();
           obj7.valorCredito(0);
           obj7.obterSaldo(0);
           obj7.valorDivida(0);
    }
    
}
