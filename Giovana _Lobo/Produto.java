
package projetoprodutos;


public class Produto {
    
    private float codigo;
    private float valor;
    private String descricao;

    public Produto() {
    }

    public Produto(float codigo, float valor, String descricao) {
        this.codigo = codigo;
        this.valor = valor;
        this.descricao = descricao;
    }

    public float getCodigo() {
        return codigo;
    }

    public void setCodigo(float codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", valor=" + valor + ", descricao=" + descricao + '}';
    }
    
}
