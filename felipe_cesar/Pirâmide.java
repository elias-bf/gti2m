package piramide;
 
public class Pirâmide {
    public double base;
    public double altura;
    
    public Pirâmide(){
    }
    public Pirâmide(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }

    public double calcVolume(){
        return (3*base*altura)/1;
    }
   
}
