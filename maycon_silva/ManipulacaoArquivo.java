package exemplogravararquivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ManipulacaoArquivo {
    
    public static void gravaArquivo(ArrayList<Pessoa> lista){
        File dadosArquivo = new File("arquivo.txt");
        FileWriter fw;
        
        try{
            fw = new FileWriter(dadosArquivo);
            for(Pessoa item:lista){
                String linha;
                linha =  String.format("%s;%s;%d;%s\n", item.getNome(), item.getSexo(), item.getIdade(), String.valueOf(item.getAltura()).replace(",", "."));
                
                fw.write(linha);
                
            }
            fw.flush();
            
        }catch(IOException e){
            System.out.println("Não foi possivel gravar arquivo");
            
        } 
        
    }
    
}
