
package projetopaciente;

public class MainPaciente {

    public static void main(String[] args) {
        Paciente obj1 = new Paciente();
        obj1.setAltura(1.77);
        obj1.setPeso(60.0);
        obj1.setNome("Eu");
        System.out.println(obj1.getNome());
        System.out.println(obj1.getAltura());
        System.out.println(obj1.getPeso());
        System.out.println(obj1.calcIMC());
        System.out.println(obj1.calcFaixaPeso());

    }
    
}
