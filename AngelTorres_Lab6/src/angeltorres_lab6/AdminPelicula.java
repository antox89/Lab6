package angeltorres_lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminPelicula {

    private ArrayList<Pelicula> listaPeliculas = new ArrayList();
    private File archivo = null;

    public AdminPelicula(String path) {
        archivo = new File(path);
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

    public void agregarPelicula(Pelicula p) {
        this.listaPeliculas.add(p);
    }

    public void escribirArchivo() throws IOException {

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);

            for (Pelicula peli : listaPeliculas) {
                bw.write(peli.getDirector() + ";");
                bw.write(peli.getNombre() + ";");
                bw.write(peli.getActor() + ";");
                bw.write(peli.getProductora() + ";");
                bw.write(peli.getIdioma() + ";");
                
                bw.write(peli.getCategoria() + ";");
                bw.write(peli.getDoblaje() + ";");
                bw.write(peli.getSubtitulos() + ";");
                bw.write(peli.getDuracion() + ";");
            }
            bw.flush();

        } catch (FileNotFoundException e) {

        }
        fw.close();
        bw.close();

    }

    public void modificarArchivo() throws IOException {

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            //String director, String nombre, String categoria, String actor, String productora, String idioma, String doblaje, String subtitulos, int duracion
            for (Pelicula peli : listaPeliculas) {
                bw.write(peli.getDirector() + ";");
                bw.write(peli.getNombre() + ";");
                bw.write(peli.getActor() + ";");
                bw.write(peli.getProductora() + ";");
                bw.write(peli.getIdioma() + ";");
                
                bw.write(peli.getCategoria() + ";");
                bw.write(peli.getDoblaje() + ";");
                bw.write(peli.getSubtitulos() + ";");
                bw.write(peli.getDuracion() + ";");
                
            }
            bw.flush();

        } catch (FileNotFoundException e) {

        }
        fw.close();
        bw.close();

    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaPeliculas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while(sc.hasNext()){
                    int duracion;
                    String director, nombre, categoria, actor, productora, idioma, dubs, subs;
                    
                    director = sc.next();
                    nombre = sc.next();
                    categoria = sc.next();
                    actor = sc.next();
                    productora = sc.next();
                    idioma = sc.next();
                    dubs = sc.next();
                    subs = sc.next();
                    duracion = sc.nextInt();
                    
                    listaPeliculas.add(new Pelicula(director, nombre, categoria, actor, productora, idioma, dubs, subs, duracion));
                }

            } catch (Exception e) {

            }
            sc.close();
        }

    }

}
