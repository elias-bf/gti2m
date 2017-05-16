
package exemploarraylist;
import java.util.List;
import java .util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        List<Aluno> listaAlunos = new ArrayList<Aluno>();
        Aluno novo;
        int opcao; // 0 para sair, 1 para inserir, 2 remover e 3 para imprimir.
        do{
        opcao =  menu ();
        switch (opcao){
            case 1:
                novo = cadastro();
                listaAlunos.add(novo);
                break;
            case 2:
                if(listaAlunos.size() == 0 )
                    System.out.println("Lista vazia");
                else
                    listaAlunos.remove(listaAlunos.size() - 1);
                break;
            case 3:
                imprimir(listaAlunos);
                break;
                
        }
    }while (opcao!=0);
    }        

    private static int menu() {
        int op;
        Scanner leia = new Scanner(System.in);
        
        do{
        
            System.out.println("Menu de opções");
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir ");
            System.out.println("2 - Remover");
            System.out.println("3 - Imprimir");
            
            op = leia.nextInt();
            
        }while (op > 3);
        return op;
        
        
    }

    private static Aluno cadastro() {
       
            Scanner leia = new Scanner (System.in);
            Aluno x = new Aluno();
            System.out.println("Digite o nome: ");
            x.setNome(leia.nextLine());
            System.out.println("Digite o sexo");
            x.setSexo(leia.next().charAt(0));
            System.out.println("Digite a media");
            x.setMedia(leia.nextFloat());
            return x ;
        }

    private static void imprimir(List<Aluno> listaAlunos) {
        
        if (listaAlunos.size()== 0 )
            System.out.println("LIsta vazia");
        else
            System.out.println("Relação de alunos");
        for(int i=0; i < listaAlunos.size(); i++){
            System.out.println(listaAlunos.get(i).toString());
        }
    }
    
}
    

