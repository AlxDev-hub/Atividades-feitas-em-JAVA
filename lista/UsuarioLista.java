/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;

/**
 *
 * @author alx_l
 */
public class UsuarioLista {
    public void ListaNumero(){
        int posicao=0;
        int elemento;
        int valor;
        int pesquisa;
List<Integer> outraLista = new ArrayList();
List<Integer> lista = new ArrayList();
        Scanner dado = new Scanner (System.in);
        for(int i=0; i<10; i++){
            System.out.println("Informe o valor: ");
             lista.add(dado.nextInt());       
    }
lista.add(3,1000);
            System.out.println("Informe a posiçao: ");
                posicao=dado.nextInt();
                elemento=lista.get(posicao);
            System.out.println("Mostra o numero que esta na posição "+ posicao+"; " +elemento);
lista.remove(4);
            System.out.println("Informe um valor: ");
                valor=dado.nextInt();
lista.remove(1);
lista.add(1,valor);
System.out.println ("Informe o numero: ");
    pesquisa=dado.nextInt();
    if (lista.contains(pesquisa)){
        System.out.println("Achou!");
        
    }else{
        System.out.println("Não achou!");
    }
    System.out.println("Ordem Crescente!");
        Collections.sort(lista);
        for (int i = 0; i<lista.size(); i++){
            System.out.println("Numero: "+ lista.get(i));
            
        }
        System.out.println("_____________________________");
        System.out.println("Ordem Decrescente!");
        Collections.reverse(lista);
        for (int i = 0; i<lista.size(); i++){
            System.out.println("Numero: "+ lista.get(i));
}
        System.out.println("Outra Lista");
        for (int i = 0; i<lista.size(); i++){
            outraLista.add(lista.get(i));
            System.out.println("Numero: "+ outraLista.get(i));
        }
        System.out.println("Removendo todos os elementos da lista");
        
        lista.removeAll(lista);
        lista.size();
        System.out.println("Elementos da lista: "+ lista.size());
        }
}
