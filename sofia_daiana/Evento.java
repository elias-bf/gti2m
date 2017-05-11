
package projetoevento;
/**
 *
 * @author Sofia
 */
    public abstract class Evento {
        
    protected String data;
    protected String descricao;
    
    public Evento() {
    }

    public Evento(String data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Evento{" + "data=" + data + ", descricao=" + descricao + '}';
    }
    
    public abstract double ValorDoIngresso(double vm);
   
}
