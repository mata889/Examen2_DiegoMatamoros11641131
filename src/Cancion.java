
import java.io.Serializable;


public class Cancion implements Serializable {
    String  nombre, artista, genero;
    int duración;
     private static final long SerialVersionUID = 777L;

   

    public Cancion(String nombre, String artista, String genero, int duración) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.duración = duración;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
