
package projetoevento;

/**
 *
 * @author Sofia
 */
    public class Show extends Evento{
        
    private String artista;
    private String estilo;

    public Show() {
        super();
    }

    public Show(String artista, String estilo, String data, String descricao) {
        super (data,descricao);
        this.artista = artista;
        this.estilo = estilo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return super.toString()+ "Show{" + "artista=" + artista + ", estilo=" + estilo + '}';
    }

    @Override
    public double ValorDoIngresso(double vm) {
        return vm+vm*0.40;
    }

   
    
}
