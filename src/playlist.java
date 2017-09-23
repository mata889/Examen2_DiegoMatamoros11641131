
import java.io.Serializable;
import java.util.ArrayList;


public class playlist implements Serializable{
    String nombre;
    ArrayList<Cancion> listaCancion=new ArrayList();
    private static final long SerialVersionUID = 777L;

    public playlist(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public ArrayList<Cancion> getListaCancion() {
        return listaCancion;
    }

    public void setListaCancion(ArrayList<Cancion> listaCancion) {
        this.listaCancion = listaCancion;
    }
    
}
