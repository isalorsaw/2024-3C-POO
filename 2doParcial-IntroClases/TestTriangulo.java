/*Pedir los datos de un triangulo y calcular su area
   Se debera pedir base y altura*/
   public class TestTriangulo
   {
       public static void main(String args[])
       {
           //Declarando Variable
           Triangulo t;
           int base=BancoFM.pedirNumero("Ingrese la Base del Triangulo");
           int altura=BancoFM.pedirNumero("Ingrese la Altura del Triangulo");
           
           //t=new Triangulo(base,altura);
           t=new Triangulo("Bermudas",base,altura);
           int areat=t.area();
           BancoFM.mostrar("El Area del Triangulo es: "+areat+"\n");
           BancoFM.mostrar(t+"");
           
           //int numero=0;
           //BancoFM.mostrar(numero+"");
           
           //Triangulo t2=new Triangulo("Otro Triangulo",10,20);
           //BancoFM.mostrar(t2+"");
           
           Triangulo arreglo[]=new Triangulo[5];//Pendiente Manana 22
           
           
       }
   }