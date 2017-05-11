/*
 * PROFESSORA: Alice Faleiro
 * CURSO: Gestão da Tecnologia da Informação
 * ALUNO: Tayrine Lopes Guimarães
 */

package prjcilindro;

/**
 * @author: Tayrine Lopes // tayrinelguimaraes@gmail.com
 * @project: Cilindro 
 * @package: prjcilindro
 * @date: 14/03/2017
 */
public class Cilindro {
    
    public double raio;
    public double altura;
    
    public Cilindro(){
    }
    public Cilindro(double raio,double altura){
        
    }
    public void setRaio(double raio){
        this.raio=raio;
    }
    public double getRaio(){
        return this.raio;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public double getAltura(){
        return this.altura;
    }
    public double calcAreaL(){
        return 2*Math.PI*raio*altura;
    }
    public double calcAreaT(){
        return 2*3.14*raio*(altura+raio);
    }
    public double calcVolume(){
        return 3.14*raio*raio*altura;
    }
    @Override
    public String toString(){
        return "\n[Cilindro]\nRaio: "+this.getRaio()+"\nAltura: "+this.getAltura()+"\nArea Lateral: "+this.calcAreaL()+"\nArea Total: "+this.calcAreaT()+"\nVolume: "+this.calcVolume();
    }
}
