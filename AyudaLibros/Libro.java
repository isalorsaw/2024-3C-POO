public class Libro
{
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    
    public Libro()
    {
        titulo=BancoFM.pedirCadena("Titulo del Libro");
        autor=BancoFM.pedirCadena("Autor del Libro");
        ejemplares=BancoFM.pedirNumero("Ejemplares");
        prestados=0;
    }
    public Libro(String t, String a, int e, int p)
    {
        titulo=t;
        autor=a;
        ejemplares=e;
        prestados=prestados;
    }
    public Libro(String titulo, String autor)
    {
        this.titulo=titulo;
        this.autor=autor;
        ejemplares=0;
        prestados=0;
    }
    public boolean devolucion()
    {
        return false;
    }
    public void agregarEjemplares()
    {
        ejemplares++;
    }
    public boolean prestamo()
    {
        if(ejemplares>0)
        {
            prestados++;
            ejemplares--;
            return true;
        }
        else return false;
    }
    public String toString()
    {
        return "Titulo: "+titulo+"\nAutor: "+autor+"\nInventario:"+ejemplares+"\nPrestamos:"+prestados;
    }
    public static void main(String args[])
    {
        
    }
    public void setEjemplares(int ejemplares)
    {
        this.ejemplares=ejemplares;
    }
    public int getEjemplares()
    {
        return ejemplares;
    }
}