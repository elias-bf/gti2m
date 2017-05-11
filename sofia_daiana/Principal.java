
package projetoevento;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       Scanner leia = new Scanner (System.in);
       ArrayList<Evento> eventos = new ArrayList<Evento>();
       int op, op1;
       Evento novo;
       do{
           op=menu();
           switch(op){
                case 1:
                    do{
                       op1 = menuInserir();
                       if (op1!=0){
                            novo = cadastro(op1);
                            eventos.add(novo);
                       }
                    }while(op1!=0);
                    break;
                case 2:
                   imprimir(eventos);
                   break;
                case 3:
                    calcQtdeEventosEsporte(eventos);
                    break;
                case 4:
                    calcPercShows(eventos);
                    break;
           }
       }while(op!=0);
    }

    private static int menu() {
        int opcao;
        Scanner leia = new Scanner (System.in);
        do{
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir");
            System.out.println("2 - Imprimir");
            System.out.println("3 - Quantidade de Eventos Esportivos");
            System.out.println("4 - Percentual de Shows");
            opcao =leia.nextInt();
        }while (opcao <0||opcao>4);
        return opcao;
    }

    private static int menuInserir() {
        int opcao;
        Scanner leia = new Scanner (System.in);
        do{
            System.out.println("0 - Sair/voltar menu anterior");
            System.out.println("1 - Evento Esportivo");
            System.out.println("2 - Evento com Show");
            opcao =leia.nextInt();
        }while (opcao <0||opcao>2);
        return opcao;
    }

    private static Evento cadastro(int op1) {
        Evento x;
        Scanner leia = new Scanner(System.in);
        switch(op1){
            case 1:
                x= new Esporte();
                System.out.println("Digite a data do evento esportivo: ");
                x.setData(leia.next());
                System.out.println ("Digite a descrição do evento: ");
                x.setDescricao(leia.next());
                System.out.println("Digite o nome do evento: ");
                  if(x instanceof Esporte){
                    ((Esporte)x).setNome(leia.next());
                }
                System.out.println("Digite o nome da equipe: ");
                 if(x instanceof Esporte){
                    ((Esporte)x).setEquipe(leia.next());
                }
                return x;
            default:
                x= new Show();
                System.out.println("Digite a data do show: ");
                x.setData(leia.next());
                System.out.println("Digite a descrição do show");
                x.setDescricao(leia.next());
                System.out.println("Digite o nome do artista: ");
                if(x instanceof Show){
                    ((Show)x).setArtista(leia.next());
                }
                System.out.println("Digite o estilo: ");
                 if(x instanceof Show){
                    ((Show)x).setEstilo(leia.next());
                }
                return x;
        }
       
    }
    
    private static void imprimir(ArrayList<Evento> eventos) {
         for (Evento item: eventos){
            System.out.println(item.toString());
        }
    }

    private static void calcQtdeEventosEsporte(ArrayList<Evento> eventos) {
        int qtde =0;
        for (Evento item: eventos){
            if(item instanceof Esporte){
                qtde = qtde +1;
            }
        }
        System.out.println("A quantidade de eventos esportivos é: "+qtde);
    }

    private static void calcPercShows(ArrayList<Evento> eventos) {
        int qtde =0;
        for (Evento item: eventos){
            if(item instanceof Show){
                qtde = qtde +1;
            }
        }
        System.out.println("O Percetual de funcionarios é: ");
        System.out.println((double)qtde/eventos.size()*100+ "\'%");
    }
}
