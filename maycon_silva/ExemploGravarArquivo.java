package exemplogravararquivo;

import java.util.ArrayList;

public class ExemploGravarArquivo {

    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        Pessoa x = new Pessoa("Maria", 'F', 34,1.75);
        Pessoa y = new Pessoa("Jose", 'M', 45,1.82);
        Pessoa z = new Pessoa("Joao", 'M', 17,1.91);
        
        lista.add(x);
        lista.add(y);
        lista.add(z);
        
        ManipulacaoArquivo.gravaArquivo(lista);
    }
    
}
