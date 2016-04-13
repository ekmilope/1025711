package senatest.sena11.entidad;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ekmil on 9/4/2016.
 */
public class Anime {

    private String nombre, autor,anio,url;

    public Anime(String nombre, String autor, String anio, String url) {
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static List<Anime> crearListaAnime(){

        ArrayList<Anime> listaAnime = new ArrayList<Anime>();
        Anime anime1=new Anime("One Piece","kiraya","1990","http://3.bp.blogspot.com/-IO3PTvRqs_g/Vfi_LLR3H5I/AAAAAAAAAGY/oY842Xnq_bg/s1600/OnePiece.png");
        Anime anime2=new Anime("Dragon ball","kirayaq","1991","http://photoservice.gamesao.vn/Resources/Upload/Images/News/266f27b1-06f9-4cd2-a6a7-4cc57fb1fb8f.jpg");
        Anime anime3=new Anime("Naruto","kirayasdfsd","1992","http://3.bp.blogspot.com/-IO3PTvRqs_g/Vfi_LLR3H5I/AAAAAAAAAGY/oY842Xnq_bg/s1600/OnePiece.png");
        Anime anime4=new Anime("Death Note","kiraya 3","1993","http://photoservice.gamesao.vn/Resources/Upload/Images/News/266f27b1-06f9-4cd2-a6a7-4cc57fb1fb8f.jpg");

        listaAnime.add(anime1);
        listaAnime.add(anime2);
        listaAnime.add(anime3);
        listaAnime.add(anime4);
        return listaAnime;
    }


}
