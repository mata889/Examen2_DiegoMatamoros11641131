
import java.io.Serializable;
import java.util.ArrayList;


public class Album implements Serializable{
    String nombre, artista;
    ArrayList<Cancion> canciones = new ArrayList();
     private static final long SerialVersionUID = 666L;

    

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
