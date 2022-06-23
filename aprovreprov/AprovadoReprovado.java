/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprovreprov;
import java.util.Scanner;

/**
 *
 * @author alx_l
 */
public class AprovadoReprovado {
    double nota1;
    double nota2;
    double nota3;
    double media;
    double media1;
    double media2;
    double media3;
    double media4;
    double media5;
    double media6;
    double media7;
    String nome;
        public void mediaAprovReprov(){
            Scanner dado = new Scanner (System.in);
                System.out.println("Informe o nome do aluno:");
                    this.nome = dado.next();
                System.out.println("Informe o valor da nota1: ");
                    this.nota1 = dado.nextDouble();
                System.out.println("Informe o valor da nota2: ");
                    this.nota2 = dado.nextDouble();
                System.out.println("Informe o valor da nota3: ");
                    this.nota3 = dado.nextDouble();
        if (nota1>nota2 && nota1>nota3){
            media1 = ((nota1*4.0)+(nota2*3.0)+(nota3*3.0))/10;
                if (media1>=5) {
                    System.out.println("O aluno "+ nome +" que possui as notas "+ nota1 +" ; "+ nota2 +" ; "+ nota3 +" possui a media ponderada: "+ media1 +" \n Status: APROVADO.");
                }else{
                    System.out.println("O aluno "+ nome +" que possui as notas "+ nota1 +" ; "+ nota2 +";"+ nota3 +" possui a media ponderada: "+ media1 +"\n Status: REPROVADO.");
                }
        }
        if (nota2>nota1 && nota2>nota3){
            media2 = ((nota1*3.0)+(nota2*4.0)+(nota3*3.0))/10;
                if (media2>=5){
                    System.out.println("O aluno "+ nome +" que possui as notas "+ nota1 +" ; "+ nota2 +" ; "+ nota3 +" possui a media ponderada: "+ media2 +"\n Status: APROVADO.");
                }else{
                    System.out.println("O aluno "+ nome +" que possui as notas "+ nota1 +" ; "+ nota2 +" ; "+ nota3 +" possui a media ponderada: "+ media2 +"\n Status: REPROVADO.");
                }
        }
        if (nota3>nota1 && nota3>nota2){
            media3 = ((nota1*3.0)+(nota2*3.0)+(nota3*4.0))/10;
                if (media3>=5){
                    System.out.println("O aluno "+ nome +" que possui as notas "+ nota1 +" ; "+ nota2 +" ; "+ nota3 +" possui a media ponderada: "+ media3 +"\n Status: APROVADO.");
                }else{
                     System.out.println("O aluno "+ nome +" que possui as notas "+ nota1 +" ; "+ nota2 +" ; "+ nota3 +" possui a media ponderada: "+ media3 +"\n Status: REPROVADO.");
                }
        }
        if (nota1==nota2 && nota1==nota3){
            media4 = ((nota1*3.0)+(nota2*3.0)+(nota3*3.0))/9;
                if (media4>=5){
                    System.out.println("O aluno "+ nome +" que possui as notas "+ nota1 +" ; "+ nota2 +" ; "+ nota3 +" possui a media ponderada: "+ media4 +"\n Status: APROVADO.");
                }else{
                    System.out.println("O aluno "+ nome +" que possui as notas "+ nota1 +" ; "+ nota2 +" ; "+ nota3 +" possui a media ponderada: "+ media4 +"\n Status: REPROVADO.");
                }
        }
        if (nota1==nota2 && nota1>nota3){
            media5 = ((nota1*4.0)+(nota2*4.0)+(nota3*3.0))/11;
                if (media5>=5){
                   System.out.println("O aluno "+ nome +" que possui as notas "+ nota1 +" ; "+ nota2 +" ; "+ nota3 +" possui a media ponderada: "+ media5 +"\n Status: APROVADO."); 
                }else{
                    System.out.println("O aluno "+ nome +" que possui as notas "+ nota1 +" ; "+ nota2 +" ; "+ nota3 +" possui a media ponderada: "+ media5 +"\n Status: REPROVADO.");
                }
        }
        if (nota1==nota3 && nota1>nota2){
            media6 = ((nota1*4.0)+(nota2*3.0)+(nota3*4.0))/11;
                if (media6>=5){
                    System.out.println("O aluno "+ nome +" que possui as notas "+ nota1 +" ; "+ nota2 +" ; "+ nota3 +" possui a media ponderada: "+ media6 +"\n Status: APROVADO.");
                }else{
                    System.out.println("O aluno "+ nome +" que possui as notas "+ nota1 +" ; "+ nota2 +" ; "+ nota3 +" possui a media ponderada: "+ media6 +"\n Status: REPROVADO.");
                }
        }
        if (nota2==nota3 && nota2>nota1){
            media7 = ((nota1*3.0)+(nota2*4.0)+(nota3*4.0))/11;
                if (media7>=5){
                    System.out.println("O aluno "+ nome +" que possui as notas "+ nota1 +" ; "+ nota2 +" ; "+ nota3 +" possui a media ponderada: "+ media7 +"\n Status: APROVADO.");
                }else{
                    System.out.println("O aluno "+ nome +" que possui as notas "+ nota1 +" ; "+ nota2 +" ; "+ nota3 +" possui a media ponderada: "+ media7 +"\n Status: REPROVADO.");
                }
        }
    }
}
