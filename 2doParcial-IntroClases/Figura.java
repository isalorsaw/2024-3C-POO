public class Figura
{
    int x;//Coordenadas x,y
    int y;
    String nombre;
    
    //Constructor Vacio
    public Figura()//Inicializando los Atributos en 0
    {
        this.x=0;
        this.y=0;
        this.nombre="";
    }
    //Constructor con parametros int,int
    public Figura(int x, int y)
    {
        this.x=x;
        this.y=y;
        this.nombre="";
    }
    //Constructor con parametros int,int,String
    public Figura(int x, int y, String nombre)
    {
        this.x=x;
        this.y=y;
        this.nombre=nombre;
    }
    public String toString()
    {
        return nombre+" X "+x+" Y "+y;
    }
    
}