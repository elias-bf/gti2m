package attalice;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main 
{
    
    public static void main(String[] args) 
    {
        List<Produto> listaProduto = new ArrayList();
        int option; //opção do menu na Static main.
        option = menu();
        Produto novo;
        
        do
        {
            option = menu();
            switch(option)
            {
                case 1:
                    novo = cadastro();
                    listaProduto.add(novo);
                    break;
                case 2:
                    if (listaProduto.size()==0)
                        System.out.println("Nenhum produto cadastrado.");
                    else
                    {
                        listaProduto.remove(listaProduto.size()-1);
                        System.out.println("Ultimo produto cadastrado Removido.");
                    }
                    break;
                case 3:    
                    print(listaProduto);
                    break;
            }
        
        }while(option!=0);
        
        
    }
    
    private static int menu()
    {
        int option2; // opção do menu2
        Scanner leia = new Scanner(System.in);
        
        do
        {
            System.out.println("Menu de opções:");
            System.out.println("1-inserir:");
            System.out.println("2-remover");
            System.out.println("3-imprimir");
            System.out.println("0-sair.");
            option2 = leia.nextInt();
        }while(option2<0 || option2>3);
        return option2;
    }
    
    private static Produto cadastro()
    {
        Scanner leia2 = new Scanner(System.in);
        Produto x = new Produto();
        System.out.println("Digite o código do produto:");
        x.setCode(leia2.nextInt());
        System.out.println("Digite a Descrição do produto:");
        x.setDesc(leia2.nextLine());
        x.setDesc(leia2.nextLine());
        System.out.println("Digite o Valor do produto:");
        x.setValor(leia2.nextDouble());
        return x;
    }
    
    private static void print(List<Produto> listaProduto)
    {
        if(listaProduto.size()==0)
        {
            System.out.println("Nenhum produto Cadastrado.");
        }
        else
        {
            System.out.println("Relação de produtos:");
            for(int i=0; i<listaProduto.size(); i++)
            {
                System.out.println((listaProduto.get(i)).toString());
            }
        }
    }
    
}
