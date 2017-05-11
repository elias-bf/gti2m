
package projetoescola;

public class Aluno {
    private String aluno;
    private int idade;
    private double numMatricula;
    private String categoria;
    
    public Aluno() {
    }

    public Aluno(String aluno, int idade, double numMatricula, String categoria) {
        this.aluno = aluno;
        this.idade = idade;
        this.numMatricula = numMatricula;
        this.categoria = categoria;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(double numMatricula) {
        this.numMatricula = numMatricula;
    }

    @Override
    public String toString() {
        return "Aluno{" + "aluno=" + aluno + ", idade=" + idade + ", numMatricula=" + numMatricula + '}';
    }

   public void categoriaOlimpiadas(){
       if (idade>=5&&idade<=7){
            System.out.println("Categoria Infantil A");
       }
       if (idade>=8&&idade<=10){
            System.out.println("Categoria Infantil B");
       }
       if (idade>=11&&idade<=13){
            System.out.println("Categoria Juvenil A");
       }
       if (idade>=14&&idade<=17){
            System.out.println("Categoria Juvenil B");
       }
       if (idade>18){
            System.out.println("Categoria Sênior");
       }
   }
}
