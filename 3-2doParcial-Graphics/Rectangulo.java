import java.awt.Graphics;
public class Rectangulo extends Figura
{
    private int alto;
    private int ancho;
    
    public Rectangulo()
    {
        super();
        //this.alto=0;
        //this.ancho=0;
        
        this.alto=BancoFM.pedirNumero("Ingrese la Altura");
        this.ancho=BancoFM.pedirNumero("Ingrese la Anchura");
    }
    
    public Rectangulo(int x, int y, int alto, int ancho, String nombre)
    {
        super(x,y,nombre);
        this.alto=alto;
        this.ancho=ancho;
    }
    
    public int area()
    {
        return alto*ancho;
    }
    public String toString()
    {
        return super.toString()+" Ancho: "+ancho+" Altura: "+alto+" Area: "+area();
    }
        public void dibuja(Graphics g)
    {
        
    }
}