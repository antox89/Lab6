

package angeltorres_lab6;


public class Produccion {

    String nombre, categoria, actor, productora, idioma, doblaje, subtitulos;
    int duracion;

    public Produccion() {
    }

    public Produccion(String nombre, String categoria, String actor, String productora, String idioma, String doblaje, String subtitulos, int duracion) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.actor = actor;
        this.productora = productora;
        this.idioma = idioma;
        this.doblaje = doblaje;
        this.subtitulos = subtitulos;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDoblaje() {
        return doblaje;
    }

    public void setDoblaje(String doblaje) {
        this.doblaje = doblaje;
    }

    public String getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(String subtitulos) {
        this.subtitulos = subtitulos;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
    
}
