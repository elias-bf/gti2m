package exercicio1;

/*@author Guilherme*/

public class PutinEsfera {
    
    private double raio;
    
    public PutinEsfera(){}
    
    public PutinEsfera(double raio){
        this.raio = raio;
    } 
    
    public double getRaio(){
        return raio;
    }
    
    public void setRaio (double raio){
        this.raio = raio;
    }
    
    public double calcArea(){
        return (Math.pow(raio,2)) *(Math.PI * 4);
    }
    
    public double calcVolume() {
        return (4.0f / 3.0f) * Math.PI * Math.pow(raio, 3);
    }
    
    @Override
    public String toString(){
        return "[putinEsfera] raio: " + raio + "/n Calculo da Área do raio: " + calcArea() + "/nCalculo do volume do raio: " + calcVolume();
    }
    
}
