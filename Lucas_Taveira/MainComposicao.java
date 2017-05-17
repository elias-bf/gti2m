package excomposicao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MainComposicao {

    public static void main(String[] args) {
        ArrayList<Pedido> pedidos;
        pedidos = new ArrayList<Pedido>();
        Pedido novo;
        int opcao;
        
        do{
            opcao = menu();
            switch(opcao){
                case 1:
                    novo = cadastro();
                    pedidos.add(novo);
                    break;
                case 2:
                    imprimir(pedidos);
                    break;
                case 3:
                    excluir(pedidos);
                   /* if(pedidos.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Não existem pedidos cadastrados");
                    }
                    else{
                        pedidos.remove(pedidos.size()-1);
                        JOptionPane.showMessageDialog(null, "Último pedido removido");
                    }*/
            }
        }while(opcao!=0);
        
    }
    private static int menu(){
         int op;
         do{
             op = Integer.parseInt(JOptionPane.showInputDialog(""
                     + "Menu de Opções \n"
                     + "0 - Sair \n"
                     + "1 - Cadastrar \n"
                     + "2 - Imprimir \n"
                     + "3 - Excluir \n"
                     + "4 - Quantidade de itens por Pedido"));
         }while(op<0 || op>4);
         return op;
    }
     
    private static Pedido cadastro(){
        Pedido x = new Pedido();
        x.setIdPedido(Integer.parseInt(JOptionPane.showInputDialog("Id do Pedido: ")));
        x.setData(JOptionPane.showInputDialog("Digite a data: "));
        x.setValorDesconto(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do desconto:")));
        ArrayList<Item> itens;
        itens = new ArrayList<Item>();
        Item novo;
        int opcao;
        do{
            opcao = menuItem();
            switch(opcao){
                case 1:
                    novo = cadastroItem();
                    itens.add(novo);
                    break;
                case 2:
                    if(itens.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Lista de itens vazia");
                    }
                    else{
                        itens.remove(itens.size()-1);
                        JOptionPane.showMessageDialog(null, "Último item removido");
                    }
                    break;
            }
        }while(opcao!=0);
        x.setItensPedido(itens);
        return x;
    }
    
    private static int menuItem(){
        int op;
         do{
             op = Integer.parseInt(JOptionPane.showInputDialog(""
                     + "Menu de Opções dos Itens \n"
                     + "0 - Sair \n"
                     + "1 - Cadastrar \n"
                     + "2 - Excluir"));
         }while(op<0 || op>2);
         return op;
    }
    
    private static Item cadastroItem(){
        Item x = new Item();
        x.setIdItem(Integer.parseInt(JOptionPane.showInputDialog("Digite o id do Item: ")));
        x.setDescricao(JOptionPane.showInputDialog("Digite a descrição: "));
        x.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:")));
        x.setValorUnitario(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário: ")));
        return x;
    }
    
    private static void imprimir(List<Pedido> pedidos){
        if(pedidos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existem pedidos cadastrados");
        }
        else{
            String x="";
            for(int i=0; i<pedidos.size(); i++){
                x = x + pedidos.get(i).toString()+ "\n";
            }
            JOptionPane.showMessageDialog(null, x);
        }
        
    }

    private static void excluir(ArrayList<Pedido> pedidos) {
        int id;
        boolean find;
        if(pedidos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existem pedidos cadastrados");
        }
        else{
            id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Id do pedido à excluir"));
            find = false;
            for(int i=0; i<pedidos.size(); i++){
                if(id==pedidos.get(i).getIdPedido()){
                    find = true;
                    pedidos.remove(i);
                }
            }
            if(!find)
                JOptionPane.showMessageDialog(null, "Pedido não encontrado");
            else
                JOptionPane.showMessageDialog(null, "Pedido removido com sucesso");
        }
        
    }
    
}
