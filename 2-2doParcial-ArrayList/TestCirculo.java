public class TestCirculo
{
    public static void main(String args[])
    {
        Circulo c=new Circulo(10,10,20,"Un Circulo");
        
        BancoFM.mostrar(c.toString());
        
        //double radio=c.radio;
        double radio=c.getRadio();
        BancoFM.mostrar(radio+"");
    }
}