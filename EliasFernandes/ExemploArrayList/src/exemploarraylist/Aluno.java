
package exemploarraylist;

public class Aluno {
    private String nome;
    private char sexo;
    private float media;

    public Aluno() {
    }

    public Aluno(String nome, char sexo, float media) {
        this.nome = nome;
        this.sexo = sexo;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", sexo=" + sexo + ", media=" + media + '}';
    }
    
    
}
