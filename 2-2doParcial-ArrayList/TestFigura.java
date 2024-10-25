public class TestFigura
{
    public static void main(String args[])
    {
        Figura f[]=new Figura[2];
                            //x,y,base,altura,"triangulo"
        f[0]=new Triangulo(100,200,50,80,"Triangulo");
        f[1]=new Cuadrado(30,40,50,"Cuadrado");
        
        //BancoFM.mostrar(f[0]+"");
        imprimir(f);
        
    }
    public static void imprimir(Figura f[])
    {
        String cadena="Informacion de Figuras\n================================\n";
        for(int i=0;i<f.length;i++)
        {
            int pos=i+1;
            cadena+=pos+" "+f[i].toString()+"\n================================\n";
        }
        BancoFM.mostrar(cadena);
    }
}