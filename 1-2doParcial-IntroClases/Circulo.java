public class Circulo extends Figura
{
    //Atributos
    private double radio;
    
    //Constructores
    public Circulo()
    {
        super();
        this.radio=0;
        
        this.radio=BancoFM.pedirDecimal("Ingrese el Radio del Circulo");
    }
    public Circulo(int x, int y, double radio, String nombre)
    {
        super(x,y,nombre);
        this.radio=radio;
    }
    //setters (Metodo)
    public void setRadio(double radio)
    {
        this.radio=radio;
    }
    //getters
    public double getRadio()
    {
        return this.radio;
    }
    //TOString
    public String toString()
    {
        return super.toString()+" Radio: "+radio+" Area: "+area();
    }
    //Calcular Area
    public double area()
    {
        //return Math.PI*(radio*radio);
        return Math.PI*Math.pow(radio,2);
    }
    
}