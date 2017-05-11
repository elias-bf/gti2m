package attalice;


public class Produto 
{
    
    private int code;
    private String desc;
    private Double valor;

    
    //Construtor Default
    public Produto()
    {
        
    }
    
    //Construtor
    public Produto(int code, String desc, Double valor) {
        this.code = code;
        this.desc = desc;
        this.valor = valor;
    }
    
    public int getCode() 
    {
        return code;
    }

    public void setCode(int code) 
    {
        this.code = code;
    }

    public String getDesc() 
    {
        return desc;
    }

    public void setDesc(String desc) 
    {
        this.desc = desc;
    }

    public Double getValor() 
    {
        return valor;
    }

    public void setValor(Double valor) 
    {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + code + ", descrição=" + desc + ", valor=" + valor + '}';
    }
    
    
    
    
    
}
