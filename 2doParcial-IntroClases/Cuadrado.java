public class Cuadrado extends Figura
{
    int lado;
    
    //Constructor Vacio
    public Cuadrado()
    {
        super();
        this.lado=0;
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
    public int area()
    {
        return lado*lado;
    }
    public String toString()
    {
        return super.toString()+" Lado "+lado+" Area: "+area();
    }
}