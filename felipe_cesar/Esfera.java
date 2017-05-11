package esfera;

public class Esfera {
   
    private double raio;
   
    public Esfera() {
    }

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double Area(){
        double potencia;
        potencia = Math.pow(raio, 2);
        return (4*3.14*potencia);
    }
   public double Volume(){
       return ((4/3)*3.14*raio*raio*raio) ;
   }       
}
