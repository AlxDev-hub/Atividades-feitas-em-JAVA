/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alx_l
 */
public class Teste1 {
    public void Testar(){
    List<Integer> lista = new ArrayList();
        Scanner dado = new Scanner (System.in);
        for(int i=0; i<10; i++){
            System.out.println("Informe o valor: ");
             lista.add(dado.nextInt());       
    }
        lista.removeAll(lista);
        lista.size();
        System.out.println("Numeros removidos: "+ lista.size());
}
}