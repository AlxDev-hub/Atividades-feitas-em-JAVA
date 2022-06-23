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
class Caminhao implements Motor , Veiculo{
        int NumCilindro1;
        int Potenci1;
        int PesoQuilos1;
        int VelocMax1;
        float Preco1;
        float CargaMax1;
        int AlturaMax1;
        int Comprimento1;
    
    public int getNumCilindro(int c){
        this.NumCilindro1 = c;
        return NumCilindro1;
    }    
    @Override
    public int NumCilindro() {
        this.NumCilindro1 = NumCilindro1;
            System.out.println("O NumCilindro do Caminhão é: "+NumCilindro1);
        return NumCilindro1;
    }
    public int getPotenci(int p){
        this.Potenci1 = p;
        return Potenci1;
    }
    @Override
    public int Potenci() {
        this.Potenci1 = Potenci1;
            System.out.println("A Potenci do Caminhão é: "+Potenci1);
        return Potenci1;
    }
    public int getPesoQuilos(int PQ){
        this.PesoQuilos1 = PQ;
        return PesoQuilos1;
    }
    @Override
    public int PesoQuilos() {
        this.PesoQuilos1 = PesoQuilos1;
            System.out.println("O Peso do Caminhão é: "+ PesoQuilos1+ " Quilos");
        return PesoQuilos1;      
    }
    public int getVelocMax(int v){
        this.VelocMax1 = v;
        return VelocMax1;
    }
    @Override
    public int VelocMax() {
        this.VelocMax1 = VelocMax1;
            System.out.println("A VelocMax do Caminhçao é: "+ VelocMax1 +" Km/h");
        return VelocMax1;
        
    }
    public float getPreco(float Pr){
        this.Preco1 = Pr;
        return Preco1;
    }
    @Override
    public float Preco() {
        this.Preco1 = Preco1;
            System.out.println("O Preço do Caminhão é: "+ Preco1+ " R$");
        return Preco1;  
    }
    public float getCargaMax(float CM){
        this.CargaMax1 = CM;
        return CargaMax1;
    }
    public float CargaMax(){
        this.CargaMax1 = CargaMax1;
            System.out.println("A CargaMax do Caminhão é: "+CargaMax1);
        return CargaMax1;
    }
    public int getAlturaMax(int AM){
        this.AlturaMax1 = AM;
        return AlturaMax1;
    }
    public int AlturaMax(){
        this.AlturaMax1 = AlturaMax1;
            System.out.println("A AlturaMax do Caminhão é: "+AlturaMax1);
        return AlturaMax1;
    }
    public int getComprimento(int COM){
        this.Comprimento1 = COM;
        return Comprimento1;
    }
    public int Comprimento(){
        this.Comprimento1 = Comprimento1;
            System.out.println("O Comprimento do Caminhão é: "+Comprimento1);
        return Comprimento1;
}
}