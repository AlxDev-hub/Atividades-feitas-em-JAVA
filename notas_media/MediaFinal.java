/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas_media;
import java.util.Scanner;
/** Programação Orientada a Objetos
 * Lista de Exercício 1
 * Alunos: Alexsander, Beatriz, Matheus Fernando, Pedro Henrique, Victor
 *Professora: Liliane do Nascimento Vale
 *Exercício 2
 */
public class MediaFinal {
    double nota1, nota2, nota3; 
public double calcularMedia(){
        double media;
        Scanner dado= new Scanner(System.in);
        System.out.println("Escreva a primeira nota: ");
        nota1 = dado.nextDouble();
        System.out.println("Escreva a segunda nota: ");
        nota2 = dado.nextDouble();
        System.out.println("Escreva a terceira nota: ");
        nota3= dado.nextDouble();
        media = ((nota1*2) + (nota2*3) + (nota3*5))/10;
        System.out.println("Sua média ponderada das três notas digitadas é " + media);
        return media;
}
}