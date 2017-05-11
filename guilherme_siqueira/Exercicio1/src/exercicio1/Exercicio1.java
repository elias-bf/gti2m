package exercicio1;

/* @author Guilherme*/

public class Exercicio1 {
    
    public static void main(String[] args) {
        
        PutinEsfera obj1 = new PutinEsfera();
        PutinEsfera obj2 = new PutinEsfera();
                
        obj1.setRaio(3.0);
        obj2.setRaio(9.0);
        
        System.out.println("Dados da primeira Esfera: ");
        System.out.println("Raio: " + obj1.getRaio());
        System.out.printf("Área: %.6f\n", obj1.calcArea());
        System.out.printf("Volume: %.6f\n\n", obj1.calcVolume());
        
        
        System.out.println("Dados da segunda Esfera: ");
        System.out.println("Raio: " + obj2.getRaio());
        System.out.printf("Área: %.6f\n", obj2.calcArea());
        System.out.printf("Volume: %.6f\n", obj2.calcVolume());
        
    }
    
}
