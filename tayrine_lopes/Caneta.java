
package prjcaneta;

public class Caneta 
{
    public String Modelo;
    public String Cor;
    public float Ponta;
    public int Carga;
    public boolean Tampada;
    
    public void Rabiscar()
    {
        if(this.Tampada==true)
        {
            System.out.println("Não posso ser usada!!!");  
        }
        else
        {
            System.out.println("Estou escrevendo....");
        }
        
    }
    public void Tampar()
    {
        this.Tampada=true;
    }
    public void Destampar()
    {
        this.Tampada=false;
    }
    @Override
    public String toString()
    {
        return "Modelo: "+this.Modelo+"\nCor: "+this.Cor+"\nPonta: "+this.Ponta+"\nCarga: "+this.Carga+"\nTampa: "+this.Tampada;
    }
}
