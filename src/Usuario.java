
import java.io.Serializable;
import java.util.ArrayList;


public class Usuario implements Serializable {
   String nombre, edad, username, password;
    ArrayList<playlist> playlists = new ArrayList();
    ArrayList<Cancion> favoritos = new ArrayList();
    private static final long SerialVersionUID = 666L;

    public Usuario(String nombre, String edad, String username, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.username = username;
        this.password = password;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<playlist> playlists) {
        this.playlists = playlists;
    }

    public ArrayList<Cancion> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<Cancion> favoritos) {
        this.favoritos = favoritos;
    }



    @Override
    public String toString() {
        return nombre;
    }
}
