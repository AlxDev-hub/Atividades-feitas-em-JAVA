/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;
import java.util.Scanner;
/**
 *
 * @author alx_l
 */
public class MostrarVetor {
    int numero;
    int posicao;
    public void Vetor(){
        int[] vetor;
    vetor = new int[10];
    for (int i=0; i<10; i++){
        System.out.println("Informe o número " + i);
        Scanner dados = new Scanner (System.in);
        numero=dados.nextInt();
        vetor [i] = numero;
        
    }
        vetor[3]=1000;
        System.out.println("_____________________________________");
        System.out.println("Digite a posição do vetor que você quer saber o valor:" );
        Scanner dados = new Scanner (System.in);
        posicao = dados.nextInt();
        System.out.println("O valor é: "+vetor[posicao]); 
    }   
}