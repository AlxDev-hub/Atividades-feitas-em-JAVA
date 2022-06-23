/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custo_consumidor;
import java.util.Scanner;
        
 /**Programção orientada a objetos
  * Lista de exercícios 1
  * Autores: Alexander Lindolfo, Pedro Henrique, Beatriz Gonçalves, Victor Birolli, Matheus Fernando
  * Professora Liliane do Nascimento Vale
  * Exercício 3
  */
 
 
public class Carro {
    double custo_fabrica, custo_consumidor;
    public void calculaCustoconsumidor ()  {
       Scanner dado = new Scanner(System.in); 
       System.out.println("Informe o custo da fábrica de carros:");
       custo_fabrica = dado.nextDouble();
       custo_consumidor = custo_fabrica + (0.28*custo_fabrica) + (0.45*custo_fabrica);
       System.out.println("O custo do novo carro do consumidor é:" + custo_consumidor );
}
}
    
