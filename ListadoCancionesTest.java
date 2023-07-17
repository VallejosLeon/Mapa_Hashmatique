import java.util.HashMap;
import java.util.Set;

public class ListadoCancionesTest {
    public static void main(String[] args) {
        ListadoCanciones manipulator = new ListadoCanciones(); //"linkeo" ListadoCanciones con ListadoCancionesTest
        HashMap<String, String> listado = manipulator.tracklist(); //llamo al HashMap y lo nombro "listado"

        Set<String> keys = listado.keySet();//set para llamar a una clase y keySet evuelve a todas las claves del Map
        for(String key : keys) {
            System.out.println("nombre de cancion: "+key);
            System.out.println("letra de cancion: "+listado.get(key));
        }
    }
}
