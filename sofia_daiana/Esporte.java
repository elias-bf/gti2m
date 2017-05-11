
package projetoevento;
/**
 *
 * @author Sofia
 */
    public class Esporte extends Evento{
        
    private String nome;
    private String equipe;

    public Esporte() {
        super();
    }

    public Esporte(String nome, String equipe, String data, String descricao) {
        super (data,descricao);
        this.nome = nome;
        this.equipe = equipe;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Esporte{" + "nome=" + nome + ", equipe=" + equipe + '}';
    }

    @Override
    public double ValorDoIngresso(double vm) {
        return vm+vm*0.2;
    }

 
}
