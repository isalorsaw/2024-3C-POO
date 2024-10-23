public class Triangulo extends Figura
{
    //Atributos (Variables-Datos del Triangulo)
    int base;
    int altura;
    //String titulo;
    //Constructor Vacio
    public Triangulo()
    {
        super();
        this.base=0;
        this.altura=0;
    }
    //Constructor
    public Triangulo(int base, int altura)
    {
        super(0,0);//Constructor int,int
        
        this.base=base;
        this.altura=altura;
        //this.titulo="";
    }
    public Triangulo(int x, int y, int base, int altura, String nombre)
    {
        super(x,y,nombre);
        this.base=base;
        this.altura=altura;
    }
    /*public Triangulo(String titulo,int base, int altura)
    {
        super(0,0);
        this.base=base;
        this.altura=altura;
        //this.titulo=titulo;
    }
    public Triangulo()
    {
        
    }*/

    //Funcion
    public int area()
    {
        int a=(base*altura)/2;
        return a;
    }
    
    //Funcion
    public String toString()
    {
        //return titulo+"\nBase: "+base+" Altura: "+altura+" Area: "+area();
        return super.toString()+" Base: "+base+" Altura: "+altura+" Area: "+area();
    }
    //public void duplicar()//Metodo
    //public int pedirNumero()//Funcion
    //public String imprimir()//Funcion
    
    
}