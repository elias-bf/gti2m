
package PrjProdutos;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;



public class Principal {

    
    public static void main(String[] args) {
       ArrayList<Produto> ListaProd = new ArrayList<Produto>();
       Produto novo;
       int opcao;
       
       do{
           opcao = menu();
           switch(opcao){
               case 1:
                   novo = cadastro();
                   ListaProd.add(novo);
                   System.out.println("Produto cadrastrado com sucesso");
                   break;
               case 2:
                   if(ListaProd.size()==0){
                       System.out.println("A lista está vazia");
                   }
                   else{
                       ListaProd.remove(ListaProd.size()-1);
                       System.out.println("Removido o ultimo.");
                   }
                   break;
               case 3:
                   imprimir(ListaProd);
                   
           }
           
       }while(opcao != 0);
    }

    private static int menu() {
        int op;
        Scanner leia = new Scanner(System.in);
        do{
            System.out.println("0-Sair");
            System.out.println("1-Inserir");
            System.out.println("2-Remover o elemento da última posição da lista");
            System.out.println("3-Imprimir os dados de cada objeto");
            op = leia.nextInt();
        }while(op<0 || op>4);
        return op;
    }

    private static Produto cadastro() {
        Produto x = new Produto();
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o codigo do produto:");
        x.setCodigo(leia.nextInt());
        System.out.println("Digite a descrição do produto:");
        x.setDescricao(leia.next());
        System.out.println("Digite o valor do produto:");
        x.setValor(leia.nextFloat());
        return x;
    }

    private static void imprimir(ArrayList<Produto> ListaProd) {
         if(ListaProd.size() == 0){
             System.out.println("Lista vazia");
         }
         else{
             for (int i = 0; i < ListaProd.size(); i++) {
                 System.out.println(ListaProd.get(i).toString());
                 
             }
         }
    }
    
}
