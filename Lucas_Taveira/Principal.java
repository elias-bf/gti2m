
package prjtime;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author LucasTaveira
 */
public class Principal {

    
    public static void main(String[] args) {
        ArrayList<Time> time = new ArrayList<Time>();
        Time novo;
        int opcao;
        do { 
            opcao = menu();
            switch (opcao) {
                case 1:
                   novo = cadastro();
                   time.add(novo);
                   break;
                case 2:
                    excluirTime(time);
                    break;
                case 3:
                    pesquisarTime(time);
                    break;
                case 4:
                   alterarTime(time);
                   break;
                case 5:
                    imprimirTime(time);
                    break;
            }
            
        } while (opcao!=0);
    }

        private static int menu() {
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Menu Time\n"
                    + "0 - Sair\n"
                    + "1 - Cadastrar\n"
                    + "2 - Excluir\n"
                    + "3 - Pesquisar\n"
                    + "4 - Alterar\n"
                    + "5 - Imprimir"));
        }while(op<0||op>5);
        return op;
        }

    private static Time cadastro() {
        Time x = new Time();
        x.setNomeTime(JOptionPane.showInputDialog("Digite o nome do Time: "));
        x.setTecnico(JOptionPane.showInputDialog("Digite o nome do Tecnico"));
        ArrayList<Atleta> atleta;
        atleta = new ArrayList<Atleta>();
        Atleta atletas;
        int opcao;
        do {            
            opcao = menuCadastroAtleta();
            switch (opcao) {
                case 1:
                    atletas = cadastroAtleta();
                    atleta.add(atletas);
                    break;
                case 2:
                    alterarAtleta(atleta);
                break;
                case 3:
                    excluirAtleta(atleta);
                    break;
            }
        } while (opcao!=0);
        
        return x;
    }

    private static int menuCadastroAtleta() {
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Menu Atleta\n"
                    + "0 - Sair\n"
                    + "1 - Cadastrar\n"
                    + "2 - Alterar\n"
                    + "3 - Excluir"));
        }while(opcao<0||opcao>3);
        return opcao;   
    }

    private static Atleta cadastroAtleta() {
        Atleta atleta = new Atleta();
        atleta.setNome(JOptionPane.showInputDialog("Digite o Nome do Atleta: "));
        atleta.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Atleta")));
        atleta.setPosi(JOptionPane.showInputDialog("Digite a posição do Atleta"));
        return atleta;
    }

    private static void alterarAtleta(ArrayList<Atleta> atleta) {
        if(atleta.isEmpty())
            JOptionPane.showMessageDialog(null, "Não existem "
                    + "atleta cadastrados");
        else{
           String nome;
           boolean achei;
           nome = (JOptionPane.showInputDialog(
                   "Digite o nome do atleta a alterar:"));
            achei = false;
            for (int i = 0; i < atleta.size(); i++) {
                if(nome.equalsIgnoreCase(atleta.get(i).getNome())){
                    achei = true;
                   atleta.get(i).setNome(JOptionPane.showInputDialog("Digite o novo nome: "));
                   atleta.get(i).setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a nova Idade: ")));
                   atleta.get(i).setPosi(JOptionPane.showInputDialog("Digite a nova posição: "));
                }     
            }
            if(!achei)
                JOptionPane.showMessageDialog(null, "Atleta não encontrado");
            else
                JOptionPane.showMessageDialog(null, "Atleta Alterado com sucesso.");
        }
    }
    
    private static void excluirAtleta(ArrayList<Atleta> atleta) {
        if(atleta.isEmpty())
            JOptionPane.showMessageDialog(null, "Não existem Times cadastrados ");
        else{
          String nomeTime;
           boolean achei;
           nomeTime = (JOptionPane.showInputDialog(
                   "Digite o id do pedido a excluir:"));
            achei = false;
            for (int i = 0; i < atleta.size(); i++) {
                if(nomeTime.equalsIgnoreCase(atleta.get(i).getNome())){
                    achei = true;
                    atleta.remove(i);
                }     
            }
            if(!achei)
                JOptionPane.showMessageDialog(null, "Time não encontrado");
            else
                JOptionPane.showMessageDialog(null, "Time removido com sucesso.");
        }
    }

    private static void excluirTime(ArrayList<Time> time) {
        if(time.isEmpty())
            JOptionPane.showMessageDialog(null, "Não existem Times cadastrados ");
        else{
          String nomeTime;
           boolean achei;
           nomeTime = (JOptionPane.showInputDialog(
                   "Digite o id do pedido a excluir:"));
            achei = false;
            for (int i = 0; i < time.size(); i++) {
                if(nomeTime.equalsIgnoreCase(time.get(i).getNomeTime())){
                    achei = true;
                    time.remove(i);
                }     
            }
            if(!achei)
                JOptionPane.showMessageDialog(null, "Time não encontrado");
            else
                JOptionPane.showMessageDialog(null, "Time removido com sucesso.");
        }
    
    }

    private static void pesquisarTime(ArrayList<Time> time) {
        if(time.isEmpty())
            JOptionPane.showMessageDialog(null, "Não existem times cadastrados");
        else{
           String nomeTime;
           boolean achei;
           nomeTime = (JOptionPane.showInputDialog(
                   "Digite o nome do time para pesquisar:"));
            achei = false;
            for (int i = 0; i < time.size(); i++) {
                if(nomeTime.equalsIgnoreCase(time.get(i).getNomeTime())){
                    achei = true;
                    time.get(i).toString();
                }     
            }
            if(!achei)
                JOptionPane.showMessageDialog(null, "Time não encontrado");
            
        }
    }

    private static void alterarTime(ArrayList<Time> time) {
        if(time.isEmpty())
            JOptionPane.showMessageDialog(null, "Não existem times cadastrados");
        else{
           String nome;
           boolean achei;
           nome = (JOptionPane.showInputDialog(
                   "Digite o nome do Time para alterar:"));
            achei = false;
            for (int i = 0; i < time.size(); i++) {
                if(nome.equalsIgnoreCase(time.get(i).getNomeTime())){
                    achei = true;
                   time.get(i).setNomeTime(JOptionPane.showInputDialog("Digite o novo nome do Time: "));
                   time.get(i).setTecnico(JOptionPane.showInputDialog("Digite o novo nome do Tecnico: "));
                   JOptionPane.showInputDialog("Para alterar os atletas do time exclua e cadastre novamente");
                   
                   
                }     
            }
            if(!achei)
                JOptionPane.showMessageDialog(null, "Time não encontrado");
            else
                JOptionPane.showMessageDialog(null, "Time Alterado com sucesso.");
        }    }

    private static void imprimirTime(ArrayList<Time> time) {
    
       if(time.isEmpty())
           JOptionPane.showMessageDialog(null, "Não existem "
                   + "times cadastrados.");
       else{
           String x="";
           for (int i = 0; i < time.size(); i++) {
                x = x + time.get(i).toString()+ "\n";     
           }
           JOptionPane.showMessageDialog(null, x);
       }
    }

}