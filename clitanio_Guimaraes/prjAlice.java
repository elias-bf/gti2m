
package ProjetoEscola;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        Aluno novo;
        
      int opcao;
       
       do{
           opcao = menu();
           switch(opcao){
                case 1:
                    novo = cadastro();
                    listaAluno.add(novo);//para adicionar ele dentro do vetor
                    System.out.println("Aluno cadastrado sucesso.");
                    break;
                case 2:
                    imprimir(listaAluno);
                    break;
                case 3:
                    categoria(listaAluno);
                    break;
                    
            }
       }while(opcao != 0);
           
    
    }

    private static int menu() {
        int op;
        Scanner leia = new Scanner(System.in);
        do{
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir");
            System.out.println("2 - Imprimir");
            System.out.println("3 – Pesquisar categoria");
            System.out.println("4 – Qtde de alunos de cada categoria");
            op = leia.nextInt();
        }while(op<0 || op>4);
        return op;
    }

    private static Aluno cadastro() {
        Aluno x = new Aluno();
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        x.setNome(leia.next());
        System.out.println("Digite a idade do aluno:");
        x.setIdade(leia.nextInt());
        System.out.println("Digite o numero da matricula do aluno: ");
        x.setNumMatri(leia.nextInt());
        
        return x;
    }

    private static void imprimir(ArrayList<Aluno> listaAluno) {
        if(listaAluno.isEmpty()){
            System.out.println("Lista vazia");
        }
        else{
            System.out.println("A lista de Alunos:");
            for (int i = 0; i < listaAluno.size(); i++) {
                Aluno get = listaAluno.get(i);
                System.out.println(listaAluno.get(i).toString());                
            }
                
        }
    }

    private static void categoria(ArrayList<Aluno> listaAluno) {
        String nomeAl;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        nomeAl = leia.next();
        for (int i = 0; i < listaAluno.size(); i++) {
            if(nomeAl==listaAluno.get(i).getNome()){
                System.out.println(listaAluno.get(i).categoriaOlimpiadas());
            }
            else{
                System.out.println("Não exsite esse aluno");
            }
        }
    }
}
