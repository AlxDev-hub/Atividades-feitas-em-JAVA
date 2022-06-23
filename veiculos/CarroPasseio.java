/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;

/**
 *
 * @author alx
 */
class CarroPasseio implements Motor , Veiculo{

    int NumCilindro;
    int Potenci;
    int PesoQuilos;
    int VelocMax;
    float Preco;
    String Cor;
    String Modelo;

    public int getNumCilindro(int c){
        this.NumCilindro = c;
        return NumCilindro;
    }    
    @Override
    public int NumCilindro() {
        this.NumCilindro = NumCilindro;
            System.out.println("O NumCilindro do CarroPasseio é: "+NumCilindro);
        return NumCilindro;
    }
    public int getPotenci(int p){
        this.Potenci = p;
        return Potenci;
    }
    @Override
    public int Potenci() {
        this.Potenci = Potenci;
            System.out.println("A Potenci do CarroPasseio é: "+Potenci);
        return Potenci;
    }
    public int getPesoQuilos(int PQ){
        this.PesoQuilos = PQ;
        return PesoQuilos;
    }
    @Override
    public int PesoQuilos() {
        this.PesoQuilos = PesoQuilos;
            System.out.println("O Peso do CarroPasseio é: "+ PesoQuilos+ " Quilos");
        return PesoQuilos;      
    }
    public int getVelocMax(int v){
        this.VelocMax = v;
        return VelocMax;
    }
    @Override
    public int VelocMax() {
        this.VelocMax = VelocMax;
            System.out.println("A VelocMax do CarroPasseio é: "+ VelocMax +" Km/h");
        return VelocMax;
        
    }
    public float getPreco(float Pr){
        this.Preco = Pr;
        return Preco;
    }
    @Override
    public float Preco() {
        this.Preco = Preco;
            System.out.println("O Preço do CarroPasseio é: "+ Preco+ " R$");
        return Preco;  
    }
    public String getCor(String Co){
        this.Cor = Co;
        return Cor;
    }
    public String Cor(){
        this.Cor = Cor;
            System.out.println("A Cor do CarroPasseio é: "+ Cor);
        return Cor;   
    }
    public String getModelo(String Mo){
        this.Modelo = Mo;
        return Modelo;
    }
    public String Modelo(){
        this.Modelo = Modelo;
            System.out.println("O Modelo do CarroPasseio é: "+Modelo);
        return Modelo;
    }
}