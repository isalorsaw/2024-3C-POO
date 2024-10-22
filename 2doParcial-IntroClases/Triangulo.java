public class Triangulo
{
    //Atributos (Variables-Datos del Triangulo)
    int base;
    int altura;
    String titulo;
    
    //Constructor
    public Triangulo(int base, int altura)
    {
        this.base=base;
        this.altura=altura;
        this.titulo="";
    }
    public Triangulo(String titulo,int base, int altura)
    {
        this.base=base;
        this.altura=altura;
        this.titulo=titulo;
    }
    public Triangulo()
    {
        
    }

    
    //Funcion
    public int area()
    {
        int a=(base*altura)/2;
        return a;
    }
    
    //Funcion
    public String toString()
    {
        return titulo+"\nBase: "+base+" Altura: "+altura+" Area: "+area();
    }
    //public void duplicar()//Metodo
    //public int pedirNumero()//Funcion
    //public String imprimir()//Funcion
    
    
}