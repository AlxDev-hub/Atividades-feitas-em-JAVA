/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadenadador;
import java.util.Scanner;

/**
 *
 * @author alx_l
 */
public class IdadeNadador {
    int idade;
        public void idadeCategoria () {
            Scanner dado = new Scanner (System.in);
               System.out.println("Informe a idade do nadador: ");
                    idade = dado.nextInt();
            if (idade>=5 && idade<=7) {
                System.out.println("Categoria: Infantil A");
            }
            if (idade>=8 && idade<=10){
                System.out.println("Categoria: Infantil B");
            }
            if (idade>=11 && idade<=13){
                System.out.println("Categoria: Juvenil A");
            }
            if (idade>=14 && idade<=17){
                System.out.println("Categoria: Juvenil B");
            }
            if (idade>=18){
                System.out.println("Categoria: Adulto");
            }
        }
}
