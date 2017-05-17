
package exemplocoposição;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Principal {

    public static void main(String[] args) {
        ArrayList<Pedido> pedidos;
        pedidos = new ArrayList<Pedido>();
        Pedido novo;
        int opcao;
        
        do{
            opcao = menu();
            switch (opcao){
                case 1:
                    novo = cadastro();
                    pedidos.add(novo);
                    break;
                case 2:
                    imprimir(pedidos);  // pedidos= é o arreylist dos pedidos digitados que contem os dados do pedido e dos itens(arralist de itens)
                    break;
                case 3:
                    excluir(pedidos);
                    break;
                case 4:
                    qtdeItensPedido(pedidos);
                    break;
            }
        }while (opcao !=0);
        
    
    }

    private static int menu() {
       int op;
       
       do{
           op = Integer.parseInt(JOptionPane.showInputDialog("" 
           + " Menu de Opções \n"
           + " 0 - Sair\n"
           + " 1 - Cadastrar\n"
           + " 2 - Imprimir\n"
           + " 3 - Excluir\n "
           + " 4 - Qtd de Itens por Pedido"));
       }while(op<0 || op> 4);
       
      return op;         
    }

    private static Pedido cadastro() {
        Pedido x = new Pedido();
        x.setIdIPedido(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do pedido:")));
        x.setData(JOptionPane.showInputDialog("Digite a data do pedido:"));
        x.setValorDesconto(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Desconto: ")));
        
        ArrayList<Item> itens;
        itens = new ArrayList<Item>();
        Item novo;
        int opcao;
        do{
            opcao = menuCadastroItem();
            switch(opcao){
                case 1:
                    novo = cadastroItem();
                    itens.add(novo);
                    break;
                case 2:
                   excluirItens(itens);
                   break;
                    
            }
        }while(opcao !=0);
        x.setItensPedido(itens);
        return x ;
    }

    private static int menuCadastroItem() {
       int op;
       
       do{
           op = Integer.parseInt(JOptionPane.showInputDialog("" 
           + " Menu de Item \n"
           + " 0 - Sair\n"
           + " 1 - Cadastrar\n"
           + " 2 - Excluir\n "));
       }while(op<0 || op> 2);
       
      return op;          
    }

    private static Item cadastroItem() {
        Item x = new Item();
        x.setIdItem(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Item:")));
        x.setDescricao(JOptionPane.showInputDialog("Digite a descrição do item:"));
        x.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:")));
        x.setValorUnitario(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor Unitario")));
        return x;
    }

    private static void imprimir(ArrayList<Pedido> pedidos) {
         if (pedidos.isEmpty())
            JOptionPane.showMessageDialog(null, "Não existe pedidos cadastrados!");
        else{
            String x=null;
            for (int i=0; i<pedidos.size(); i++) {
                x = x + pedidos.get(i).toString()+"\n\n";
            }
            JOptionPane.showMessageDialog(null, x);
        }
    
    }   

    private static void excluir(ArrayList<Pedido> pedidos) {
        
        if (pedidos.isEmpty())
            JOptionPane.showInputDialog(null, "Não existem pedidos cadastrados");
        else{
            int id;
            boolean achei;
            id = Integer.parseInt( JOptionPane.showInputDialog("Digite o ID do pedido a excluir"));
            achei = false;
            for( int i = 0; i <pedidos.size(); i++ ){
                if (id == pedidos.get(i).getIdIPedido()){
                    achei = true;
                    pedidos.remove(i);
                }
            }
            if(!achei)
                JOptionPane.showMessageDialog(null, "Pedido não encontrado");
            else
                JOptionPane.showMessageDialog(null, "Pedido removido com sucesso");
                   
        }
        
    }

    private static void qtdeItensPedido(ArrayList<Pedido> pedidos) {
        if(pedidos.isEmpty())
            JOptionPane.showMessageDialog(null,"Não ha pedidos cadastrados");
        else{
            int qtde;
            String resp = "";
            for (int i = 0; i<pedidos.size(); i++){
               qtde = pedidos.get(i).getItensPedido().size();
               resp = resp + "idPedido:" + pedidos.get(i).getItensPedido()+ "" +"qtde de itens: " + qtde + "\n";
            }
            JOptionPane.showMessageDialog(null, resp);
        }
    }

    private static void excluirItens(ArrayList<Item> itens) {
        if (itens.isEmpty())
            JOptionPane.showMessageDialog(null, "Não existem itens cadastrados");
        else{
            int id;
            boolean achei;
            id = Integer.parseInt( JOptionPane.showInputDialog("Digite o ID do item a excluir"));
            achei = false;
            for( int i = 0; i <itens.size(); i++ ){
                if (id == itens.get(i).getIdItem()){
                    achei = true;
                    itens.remove(i);
                }
            }
            if(!achei)
                JOptionPane.showMessageDialog(null, "Item não encontrado");
            else
                JOptionPane.showMessageDialog(null, "Item removido com sucesso");
                   
        }
        
    }
}