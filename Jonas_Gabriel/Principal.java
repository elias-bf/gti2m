
package projetoescola;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Aluno>listaAluno;
        listaAluno= new ArrayList<>();
        Aluno novo;
        int opcao; //0 - Sair 1 - Inserir 2 - Imprimir 3 - Pesquisar categoria 4 - Qtde de alunos de cada categoria
    
    do{
            opcao=menu();
            switch (opcao){
                case 1:
                    novo= cadastro();
                    listaAluno.add(novo);
                    System.out.println("Cadastrado com sucesso.");
                break;
                case 2:
                   imprimir(listaAluno);
                break;       
                case 3:
                   pesquisar(listaAluno);
                break;
            }
        }while (opcao!=0);
    }

    private static int menu() {
        int op;
        Scanner leia= new Scanner(System.in);
        do{
            System.out.println("Menu");
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir");
            System.out.println("2 - Imprimi");
            System.out.println("3 - Pesquisar categoria");
            System.out.println("4 - Qtde de alunos de cada categoria");
            op=leia.nextInt();
        }while(op<0 || op>4);
        return op;
    }  

    private static Aluno cadastro() {
        Scanner leia = new Scanner (System.in);
        Aluno x = new Aluno();
        System.out.println("Digite o nome do aluno........:");
        x.setAluno(leia.nextLine());
        System.out.println("Digite a idade do aluno.......:");
        x.setIdade(leia.nextInt());
        System.out.println("Digite o numero da matricula..:");
        x.setNumMatricula(leia.nextDouble());
        return x;
    }

    private static void imprimir(ArrayList<Aluno> listaAluno) {
        if(listaAluno.isEmpty()){
            System.out.println("Lista Vazia");
        }
        else{
            System.out.println("Relação de aluno");
            for(int i=0;i<listaAluno.size();i++){
                System.out.println(listaAluno.get(i).toString());
            }
        }
    }  
//pesquisar os modelos de for ctrl ||
    private static void pesquisar(ArrayList<Aluno> listaAluno) {
        if(listaAluno.isEmpty()){
            System.out.println("Lista Vazia");
        }
        else{
             Scanner leia= new Scanner (System.in);
             System.out.println("Digite o nome para pesquisa:");
             String nome;
             nome=leia.nextLine();
             int qt=0;// para verificar se existi o nome
             
             for(int i=0;i<listaAluno.size();i++){
                if (listaAluno.get(i).getAluno().equalsIgnoreCase(nome)){
                    System.out.println("A categoria do aluno é: ");
                    listaAluno.get(i).categoriaOlimpiadas();
                    qt++;
                }     
            }
                if (qt==0)
                 System.out.println("O aluno não existi");
        }
    }   
}