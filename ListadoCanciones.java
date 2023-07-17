import java.util.HashMap;

public class ListadoCanciones {
    public HashMap<String, String> tracklist(){ //declaro HashMap

        HashMap<String, String> listaHash = new HashMap<String, String>(); //nombro mi hashmap 

        listaHash.put("inocente", "inocente, me has contado, como te gusta vivir y no sabes que conozco tu manera de vivir");
        listaHash.put("la cancioncita", "una cancioncita mas no me vas a decir que no, una cervecita mas no me vas a decir que no");
        listaHash.put("pedazo de papel", "en algun lugar quedo un pedazo de papel, donde te estaba escribiendo una cancion");
        listaHash.put("amargo y dulce", "estas en el recuerdo y entre las cosas mas hermosas que yo vivi, amargo y dulce como el lamento de esta cumbia que te escribi");

        return listaHash;
    }

}
