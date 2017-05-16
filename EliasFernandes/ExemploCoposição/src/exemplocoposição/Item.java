
package exemplocoposição;

public class Item {
    private int idItem;
    private String descricao;
    private int quantidade;
    private double valorUnitario;   

    public Item() {
    }

    public Item(int idItem, String descricao, int quantidade, double valorUnitario) {
        this.idItem = idItem;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public int getIdItem() {
        return idItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
       
    }

    @Override
    public String toString() {
        
        return "Item{" + "idItem=" + idItem + ", descricao=" + descricao + ", quantidade=" + quantidade + ", valorUnitario=" + valorUnitario + '}';
    }
    
    
}
