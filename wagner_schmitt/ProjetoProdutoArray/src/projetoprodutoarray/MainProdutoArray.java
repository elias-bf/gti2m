package projetoprodutoarray;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MainProdutoArray {

    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList<Produto>();
        Produto novo;
        int opcao;
        do{
            opcao=menu();
            switch(opcao){
                case 1:
                    novo = cadastro();
                    listaProdutos.add(novo);
                    break;
                case 2:
                    if(listaProdutos.size()==0)
                        System.out.println("Lita Vazia");
                    else{
                        listaProdutos.remove(listaProdutos.size()-1);
                        System.out.println("Removido o último.");
                    }
                case 3:
                    imprimir(listaProdutos);
                    break;
            }           
        }while(opcao!=0);    
    }
    
    private static int menu(){
        int op;
        Scanner leia = new Scanner(System.in);
        do{
            System.out.println("\nMenu");
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Imprimir");
            op = leia.nextInt();
        }while(op<0 || op>3);
        return op;
    }
    
    private static Produto cadastro(){
        Scanner leia = new Scanner(System.in);
        Produto x = new Produto();
        System.out.println("Digite a descricção: ");
        x.setDescricao(leia.nextLine());        
        System.out.println("Digite o código: ");
        x.setCodigo(leia.nextFloat());
        System.out.println("Digite o valor: ");
        x.setValor(leia.nextFloat());        

        return x;
    }
    
    private static void imprimir(List<Produto> listaProdutos){
        if(listaProdutos.size()==0)
            System.out.println("\nLista Vazia");
        else{
            System.out.println("\nRelação de produtos");
            for(int i=0; i<listaProdutos.size(); i++){
                System.out.println(listaProdutos.get(i).toString());
            }
        }
    }  
}
