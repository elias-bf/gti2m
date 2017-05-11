
package projetoprodutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

  
    public static void main(String[] args) {
       
        List<Produto> listaProduto= new ArrayList<Produto>();
        Produto novo;
        int opcao; //1 - Inserir 2 - Remover 3 - Imprimir 4 - Sair
        
           do{
            opcao=menu();
            switch (opcao){
                case 1:
                    novo= cadastro();
                    listaProduto.add(novo);
                break;
                case 2:
                    if (listaProduto.size()==0)
                        System.out.println("Lista Vazia");
                    else{
                        listaProduto.remove(listaProduto.size()-1);
                        System.out.println("Ultimo produto removido com SUCESSO!!!");
                    }
                break;       
                case 3:
                    imprimir(listaProduto);
                break;
            }
        }while (opcao!=4);
    }
        
    private static int menu() {
       int op;
       Scanner leia= new Scanner(System.in);
       
       do{
           System.out.println("Menu de opções");
           System.out.println("1 - Inserir");
           System.out.println("2 - Remover");
           System.out.println("3 - Imprimir");
           System.out.println("4 - Sair");
           op=leia.nextInt();
       }while(op<1 || op>4);
       return op;
    }
    
     private static Produto cadastro() {
      
        Scanner leia = new Scanner (System.in);
        Produto x = new Produto();
        System.out.println("Digite a descrição do produto.:");
        x.setDescricao(leia.nextLine());
        System.out.println("Digite o codigo do produto....:");
        x.setCodigo(leia.nextFloat());
        System.out.println("Digite o valor do produto.....:");
        x.setValor(leia.nextFloat());
       
        return x;
    }
    
     private static void imprimir(List<Produto> listaProduto) {
        if(listaProduto.size ()== 0)
            System.out.println("Lista Vazia");
        else{
            System.out.println("Relação de Produtos");
            for(int i=0;i<listaProduto.size();i++){
                System.out.println(listaProduto.get(i).toString());
            }
        }
    }
}
