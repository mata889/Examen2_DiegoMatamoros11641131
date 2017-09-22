
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class administrarAlbum {
    ArrayList<Album> listaalbum = new ArrayList();
    File archivo = null;
    
    
    public administrarAlbum(String path) {
        archivo = new File(path);
    }
    
    public ArrayList<Album> getListaAlbum() {
        return listaalbum;
    }
    
    public void setListaAlbum(ArrayList<Album> listaalbum) {
        this.listaalbum = listaalbum;
    }
    
    public File getArchivo() {
        return archivo;
    }
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
   

    //extra mutador
    public void setAlbum(Album p) {
        this.listaalbum.add(p);
    }
    
    public void cargarArchivo() {
        try {
            listaalbum = new ArrayList();
            Album temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Album) objeto.readObject()) != null) {
                        listaalbum.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }//fin if
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Album t : listaalbum) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
