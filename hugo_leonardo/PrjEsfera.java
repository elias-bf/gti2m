
package prjesfera;


public class PrjEsfera {
  
    public static void main(String[] args) {
        Esfera x = new Esfera();
        x.setRaio(3);
        
        System.out.println("Dados da Esfera");
        System.out.println("Raio : " + x.getRaio());
        System.out.println("Área : " + x.calcArea());
        System.out.println("Volume : " + x.calcVolume());
        
        Esfera y = new Esfera(6.0);
                
        System.out.println("\nDados da Esfera Y");
        System.out.println("Raio : " + y.getRaio());
        System.out.println("Área : " + y.calcArea());
        System.out.println("Volume : " + y.calcVolume());
    }
    
}
