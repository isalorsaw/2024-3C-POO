public class Cuadrado extends Figura
{
    int lado;
    
    //Constructor Vacio
    public Cuadrado()
    {
        super();
        this.lado=0;
        
        this.lado=BancoFM.pedirNumero("Ingrese el Lado del Cuadrado");
    }
    public Cuadrado(int x, int y, int lado, String nombre)
    {
        super(x,y,nombre);
        this.lado=lado;
    }
    public Cuadrado(int lado)
    {
        super();
        this.lado=lado;
    }
    public void modificar()
    {
        this.lado=BancoFM.pedirNumero("Ingrese el Lado ("+this.lado+")");
    }
    public int area()
    {
        return lado*lado;
    }
    public String toString()
    {
        return super.toString()+" Lado "+lado+" Area: "+area();
    }
}