package animal;

class Animal {
    protected String nome;
    protected String raca;
    public String caminha;

public Animal(String n, String r, String c) {
    nome = n;
    raca = r;
    caminha = c;
 }
public String retornaNome(){
                System.out.println(this.nome);

    return nome;
}
public String retornaRaca(){
                System.out.println(this.raca);

    return raca;
}
public String retornaCaminha(){
                System.out.println(this.caminha);

    return caminha;
}
}
