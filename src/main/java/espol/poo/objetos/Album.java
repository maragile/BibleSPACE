
package espol.poo.objetos;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Album {
    private String nombre;
    private String descripcion;
    private ArrayList<Fotografia> fotos;
    
    public Album(String nombre, String descripcion, ArrayList<Fotografia> fotos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fotos = fotos;
    }
    
    public static ArrayList<Album> cargarAlbumes(String archivo) {
        ArrayList<Album> albumes = new ArrayList<>();
        
        try(ObjectInputStream oit = new ObjectInputStream(new FileInputStream("galeria.ser"))){
            albumes = (ArrayList<Album>) oit.readObject();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        // por hacer
        return albumes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Fotografia> getFotos() {
        return fotos;
    }

    public void setFotos(ArrayList<Fotografia> fotos) {
        this.fotos = fotos;
    }
    
    
}
