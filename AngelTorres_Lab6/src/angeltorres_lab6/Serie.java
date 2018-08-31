

package angeltorres_lab6;


public class Serie extends Produccion{

    int nTemporadas;

    public Serie() {
        super();
    }

    public Serie(int nTemporadas, String nombre, String categoria, String actor, String productora, String idioma, String doblaje, String subtitulos, int duracion) {
        super(nombre, categoria, actor, productora, idioma, doblaje, subtitulos, duracion);
        this.nTemporadas = nTemporadas;
    }

    public int getnTemporadas() {
        return nTemporadas;
    }

    public void setnTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
    }

    @Override
    public String toString() {
        return "Serie{" + "nTemporadas=" + nTemporadas + '}';
    }
    
    
    
}
