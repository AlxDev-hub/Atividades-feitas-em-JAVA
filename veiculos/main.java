/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;

import java.io.PrintStream;

/**
 *
 * @author alx
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarroPasseio obj = new CarroPasseio();
        Caminhao obj1 = new Caminhao();
        
obj.getNumCilindro(25);
obj.NumCilindro();
obj.getPotenci(200);
obj.Potenci();
obj.getPesoQuilos(25000);
obj.PesoQuilos();
obj.getVelocMax(150);
obj.VelocMax();
obj.getPreco(50000);
obj.Preco();
obj.getCor("Preto");
obj.Cor();
obj.getModelo("Gol");
obj.Modelo();
System.out.println("\n");
obj1.getNumCilindro(30);
obj1.NumCilindro();
obj1.getPotenci(250);
obj1.Potenci();
obj1.getPesoQuilos(2500000);
obj1.PesoQuilos();
obj1.getVelocMax(100);
obj1.VelocMax();
obj1.getPreco(100000);
obj1.Preco();
obj1.getCargaMax(70);
obj1.CargaMax();
obj1.getAlturaMax(2);
obj1.AlturaMax();
obj1.getComprimento(4);
obj1.Comprimento();
    }
    
}
