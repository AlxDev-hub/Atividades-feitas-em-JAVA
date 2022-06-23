/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novalista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alx_l
 */
public class Crescente {
    public void MostrarCrescente(){
                List<Integer> lista = new ArrayList();
 
        Scanner dado = new Scanner (System.in);
        for(int i=0; i<10; i++){
            System.out.println("Informe o valor: ");
             lista.add(dado.nextInt());
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
}
}