/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteiromaior;

import java.util.Scanner;

/**
 *
 * @author alx_l
 */
public class NumeroInteiroMaior {
    int x;
    int y;
    int z;
        public void NumeroMaior(){
            Scanner dado = new Scanner (System.in);
                System.out.println("Informe o valor de x:");
                    x = dado.nextInt();
                System.out.println("Informe o valor de y:");
                    y = dado.nextInt();
                System.out.println("Informe o valor de z:");
                    z = dado.nextInt();
            if (x>y && x>z){
                System.out.println("O numero "+ x +" e maior");
            }
            if (y>x && y>z){
                System.out.println("O numero "+ y +" e maior");
            }
            if (z>x && z>y){
                System.out.println("O numero "+ z +" e maior");
            }
        }
}
