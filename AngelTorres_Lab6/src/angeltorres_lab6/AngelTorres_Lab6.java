
package angeltorres_lab6;

public class AngelTorres_Lab6 {

    public static void main(String[] args) {
        
        AdminPelicula apeli= new AdminPelicula("./peliculas.txt");
        apeli.cargarArchivo();
        
        for (Pelicula pel : apeli.getListaPeliculas()) {
            System.out.println(pel.getNombre());
        }
        
        
    }

}
