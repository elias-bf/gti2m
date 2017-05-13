
package esfera;

public class Esfera {
    public double raio;
    public Esfera(){
    }
    public Esfera(double raio){
        this.raio = raio;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    public double getRaio(){
        return raio; 
    }
    @Override
    public String toString(){
        return "[Esfera]\nRaio: "+raio+"\nÁrea: "+calcArea()+"\nVolume: "+calcVolume();
    }
    public double calcArea(){
        return (4*Math.PI*Math.pow(raio, 2)); //4*3.14*raio*raio
    }
    public double calcVolume(){
        return ((4.0/3)*Math.PI*Math.pow(raio, 3)); //(4.0/3)*3.14*raio*raio*raio
    }
    
    
}
