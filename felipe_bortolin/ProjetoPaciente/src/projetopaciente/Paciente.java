
package projetopaciente;

public class Paciente {
    private double altura;
    private double peso;
    private String nome;
    public Paciente(){
    }
    public Paciente(double altura, double peso, String nome){
        this.altura = altura;
        this.nome = nome;
        this.peso = peso;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public double calcIMC(){
        return peso/(altura*altura);
    }
    public String calcFaixaPeso(){
        if(calcIMC()<20){
            return "Abaixo do peso ideal";
        }
        else if(calcIMC()>=20&&calcIMC()<25){
            return "Peso normal";
        }   
        else if(calcIMC()>=25&&calcIMC()<30){
            return "Excesso de peso";
        }
        else if(calcIMC()>=30&&calcIMC()<35){
            return "Obesidade";
        }    
        else{
            return "Obesidade mórbida";  
        }    
    }
}
