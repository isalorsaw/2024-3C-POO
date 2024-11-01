public class Test
{
    public static void main(String args[])
    {
        //Libro i=new Libro("Titulo","Deitel",10,0);
        
        /*String titulo=BancoFM.pedirCadena("Titulo del Libro");
        String autor=BancoFM.pedirCadena("Autor del Libro");
        int ejemplares=BancoFM.pedirNumero("Ejemplares");
        int prestados=0;*/
        Libro l=new Libro();//(titulo,autor,ejemplares,prestados);
        BancoFM.mostrar(l.toString());
    }
}