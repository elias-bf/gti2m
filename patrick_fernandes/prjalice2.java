
package PrjPiramide2;


public class Principal {

    
    public static void main(String[] args) {
        Piramide pir = new Piramide();
        pir.setBase(5);
        pir.setAltura(9);
        
        System.out.println("Piramide 1:");
        System.out.println(pir.toString());
        System.out.println("Calculo do volume: " + pir.calcVolume());  
    }
    
}
