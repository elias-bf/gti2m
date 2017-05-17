
package prjtime;

import java.util.ArrayList;
/**
 *
 * @author LucasTaveira
 */
public class Time {
    String nomeTime;
    String tecnico;
    ArrayList<Atleta> atleta;

    public Time() {
    }

    public Time(String nomeTime, String tecnico, ArrayList<Atleta> atleta) {
        this.nomeTime = nomeTime;
        this.tecnico = tecnico;
        this.atleta = atleta;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public ArrayList<Atleta> getAtleta() {
        return atleta;
    }

    public void setAtleta(ArrayList<Atleta> atleta) {
        this.atleta = atleta;
    }

    @Override
    public String toString() {
        String resultAtletas=null;
        for (int i = 0; i < atleta.size(); i++) {
            resultAtletas = resultAtletas + 
                    atleta.get(i).toString()+"\n ";
        }
        return "Time{" + "nomeTime=" + nomeTime + ", tecnico=" + tecnico + ", atleta=" + resultAtletas+ '}';
    }
    
    
}
