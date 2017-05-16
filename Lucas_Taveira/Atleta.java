
package prjtime;

/**
 *
 * @author LucasTaveira
 */
public class Atleta {
    String nome;
    int idade;
    String posi;

    public Atleta() {
    }

    public Atleta(String nome, int idade, String posi) {
        this.nome = nome;
        this.idade = idade;
        this.posi = posi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPosi() {
        return posi;
    }

    public void setPosi(String posi) {
        this.posi = posi;
    }

    @Override
    public String toString() {
        return "Atleta{" + "nome=" + nome + ", idade=" + idade + ", posi=" + posi + "}\n";
    }
    
}
