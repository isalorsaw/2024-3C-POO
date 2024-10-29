import javax.swing.JOptionPane;
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
        
        this.nombre=JOptionPane.showInputDialog("Ingrese el Nombre de la Figura");
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
    public boolean equals(String otra)
    {
        //this.nombre==otra.nombre;
        //OJO
        //boolean b=this.nombre.equals(otra);
        
        //boolean b=this.nombre.equalsIgnoreCase(otra);
        //return b;
        
        //if(this.nombre.equalsIgnoreCase(otra)==true)return true;
        //else return false;
        
        //return (this.nombre.equalsIgnoreCase(otra)?true:false);
        
        return this.nombre.equalsIgnoreCase(otra);
    }
    public void modificar()
    {
        
    }
    public String toString()
    {
        return nombre+" X "+x+" Y "+y;
    }
    
}