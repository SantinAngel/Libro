
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
    private int vecesPrestado;
    private boolean esLibroDeTexto;
    
    /**
     * Fija el autor y el titulo del libro y las paginas a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, boolean libroDeTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto= libroDeTexto;
    }
    
    public boolean getesLibroDeTexto(){
        return esLibroDeTexto;
    }
    
    /**
     * Incrementa las veces prestadas en 1
     */
    public void prestar(){
        vecesPrestado=vecesPrestado + 1;    
    }
    
    /**
     * Devuelve las veces prestadas
     */
    public int getvecesPrestado(){
        return vecesPrestado;
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
        String detalles = "Titulo:"+ titulo + "|Autor:" + autor + "|Páginas:" + numeroPaginas + "|Veces prestados:" + vecesPrestado;
        if(numeroReferencia!=""){
            detalles = detalles +"Numero de referencia:" + numeroReferencia;
        }
        else{
            detalles = detalles + "|Numero de referencia:ZZZ";
        }
        if (esLibroDeTexto == true){
            detalles = detalles + "|Libro de texto";
        }
        else{
            detalles = detalles + "|No Libro de texto";
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
            System.out.println("Titulo:"+ titulo + ", Autor:" + autor + ", Páginas:" + numeroPaginas + "Numero de referencia:" + numeroReferencia + "Veces prestados:" + vecesPrestado);
        }
        else{
            System.out.println("Titulo:"+ titulo + ", Autor:" + autor + ", Páginas:" + numeroPaginas + "Numero de referencia:ZZZ" + "Veces prestados:" + vecesPrestado);    
        }
    }
}
