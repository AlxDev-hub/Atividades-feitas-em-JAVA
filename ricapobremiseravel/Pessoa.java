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
class Pessoa {
    protected String nome;
    protected int idade;
    
    public Pessoa(String n, int i){
        nome = n;
        idade = i;
    }
        public String retornaNome(){
            System.out.println(this.nome);
            return nome;
        }
        public int retornaIdade(){
            System.out.println(this.idade);
            return idade;
        }
}
