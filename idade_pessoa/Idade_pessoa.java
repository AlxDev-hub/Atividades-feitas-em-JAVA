/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idade_pessoa;
import java.util.Scanner;
/**
 * Programação Orientada a Objetos
 * Lista de Exercícios 1
 * Autores: Alexsander Lindolfo de Lima / Beatriz / Victor / Matheus / Pedro
 * Professora: Liliane do Nascimento Vale
 */
public class Idade_pessoa {
    
    int ano;
    int mes;
    int dia;
    int diasTotais;
    public int converterDias() {
        Scanner dado = new Scanner (System.in);
        System.out.println("Informe sua idade em anos: ");
        ano = dado.nextInt();
        System.out.println("Informe sua idade em meses (anos não-completos): ");
        mes = dado.nextInt();
        System.out.println("Informe sua idade em dias (meses não-completos): ");
        dia = dado.nextInt();
        
        diasTotais = (ano*365)+(mes*30)+dia;
        
        System.out.println("Voce tem " + diasTotais + " dias de vida!");
        
        return diasTotais;
        
    }
    
}
