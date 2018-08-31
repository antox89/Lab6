

package angeltorres_lab6;


public class Pelicula extends Produccion{
    
    String director;

    public Pelicula() {
        super();
    }

    public Pelicula(String director, String nombre, String categoria, String actor, String productora, String idioma, String doblaje, String subtitulos, int duracion) {
        super(nombre, categoria, actor, productora, idioma, doblaje, subtitulos, duracion);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    

}
