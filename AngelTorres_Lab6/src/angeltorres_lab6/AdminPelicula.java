

package angeltorres_lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class AdminPelicula {
    
    private ArrayList<Pelicula> listaPeliculas = new ArrayList();
    private File archivo=null;
    
    public AdminPelicula(String path){
        archivo=new File(path);
    }

    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void agregarPelicula(Pelicula p){
        this.listaPeliculas.add(p);
    }
    
    public void escribirArchivo() throws IOException{
        
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try{
            fw=new FileWriter(archivo,true);
            bw= new BufferedWriter(fw);
            
            for (Pelicula peli : listaPeliculas) {
                bw.write(peli.getNombre()+";");
                bw.write(peli.getDuracion()+";");
                bw.write(peli.getCategoria()+";");
                bw.write(peli.getActor()+";");
                bw.write(peli.getDirector()+";");
                bw.write(peli.getProductora()+";");
                bw.write(peli.getIdioma()+";");
                bw.write(peli.getSubtitulos()+";");
                bw.write(peli.getDoblaje()+";");
            }
            bw.flush();
            
        }catch(FileNotFoundException e){
            
        }
        fw.close();
        bw.close();
        
    }
    

}
