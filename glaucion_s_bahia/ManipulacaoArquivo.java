package exemplogravararquivo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ManipulacaoArquivo {
    // Criando um método para gravar um arquivo texto
    public static void gravaArquivo(ArrayList<Pessoa> lista){
        File dadosArquivo = new File("arquivo.txt"); // Declarando um atributo/variavel tipo "File" com nome de dadosArquivos
                                                     // e ja recebendo o arquivo "fisico" a ser gravado 
        FileWriter fw; // Declarando um atributo/variavel tipo "FileWriter" com nome de fw
                       // onde receberá as informações
        try{
            fw = new FileWriter(dadosArquivo); // Atribuindo/recebendo no fw os dados de dadosArquivo que já é o arquivo físico (Arquivo.txt)
            for(Pessoa item:lista){
                String linha;
                linha = String.format("%s;%s;%d;%s\n",
                                     item.getNome(),
                                     item.getSexo(),
                                     item.getIdade(),
                                     String.valueOf(item.getAltura()).replace(",","."));
               fw.write(linha);
            }
            fw.flush();
        }
        catch(IOException e){
            System.out.println("Não foi possivel gravar arquivo");
        }
    }    
}
