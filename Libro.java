
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
    private String numeroReferencia;
    
    /**
     * Fija el autor y el titulo del libro y las paginas a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
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
        String detalles;
        if(numeroReferencia!=""){
        detalles="Titulo:"+ titulo + "|Autor:" + autor + "|Páginas:" + numeroPaginas + "Numero de referencia:" + numeroReferencia;
        }
        else{
        detalles= "ZZZ";
        }
        return detalles;
    }
    
    /**
     * Devolver el numero de referencia
     */
    public String getnumeroReferencia(){ 
        return numeroReferencia;
    }
    
    /**
     * Añadir numero de referencia
     */
    public void setnumeroReferencia(String numeroDeReferencia){
        if(numeroReferencia.length()<3){
            System.out.println ("Error:Numero de referencia menor a tres caracteres");
        }
        else{
            numeroDeReferencia=numeroReferencia.substring(0,3);
        }
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
        if(numeroReferencia!=""){
            System.out.println("Titulo:"+ titulo + ", Autor:" + autor + ", Páginas:" + numeroPaginas + "Numero de referencia:" + numeroReferencia);
        }
        else{
            System.out.println("ZZZ");    
        }
    }
}
