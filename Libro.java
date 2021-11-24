
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    
    /**
     * Fija el autor y el titulo del libro y las paginas a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
    }
    
    /**
     * Devuelve el autor
     */
    public String getautor (){
        return autor;
    }
    
    /**
     * Devuelve el titulo
     */
    public String gettitulo (){
        return titulo;
    }
    
    /**
     * Devuelve el numero de paginas
     */
    public int getnumeroPaginas(){
        return numeroPaginas;
    }
    
    /**
     * Devuelve los detalles 
     */
    public String getDetalles(){
        return "Titulo:"+ titulo + "|Autor:" + autor + "|Páginas:" + numeroPaginas;
    }
    
    /**
     * Imprimir autor
     */
    public void imprimirAutor(){
        System.out.println(autor);
    }
    
    /**
     * Imprimir titulo
     */ 
    public void imprimirTitulo(){
        System.out.println(titulo);
    }
    
    /**
     * Imprimir detalles
     */
    public void imprimirDetalles(){
        System.out.println("Titulo:"+ titulo + ", Autor:" + autor + ", Páginas:" + numeroPaginas);
    
    }
}
