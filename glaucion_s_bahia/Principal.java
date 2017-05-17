package exemplogravararquivo;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        // Criando uma arraylist com as informações da classse "pessoa" <Pessoa>
        ArrayList<Pessoa> lista = new ArrayList<>();
        // Atribuindo no x, y e z 
        Pessoa x = new Pessoa("Maria",'F',34,1.75);
        Pessoa y = new Pessoa("Jose",'M',45,1.82);
        Pessoa z = new Pessoa("Joao Charles",'M',17,1.91);
        lista.add(x);
        lista.add(y);
        lista.add(z);
        //chamar o agravarArquivo colocando o nome da classe e nome do metodo
        ManipulacaoArquivo.gravaArquivo(lista);

    }
    
}
