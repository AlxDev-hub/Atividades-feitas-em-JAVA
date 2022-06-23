/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplos;
import java.util.Scanner;
/**
 *
 * @author alx_l
 */
public class Multiplos {
    int A;
    int B;
        public void multiplosEntreSe () {
            Scanner dado = new Scanner (System.in);
                System.out.println("Informe o valor de A: ");
                   A =  dado.nextInt();
                System.out.println("Informe o valor de B: ");
                   B = dado.nextInt();
            if ((A % B == 0) | (B % A == 0)) {
                System.out.println("Sao Multiplos");
            }
            else {
                System.out.println("Nao sao Multiplos");
            }
        }
}
