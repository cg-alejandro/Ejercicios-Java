public class perro extends animales {
   public perro(String nombre,int edad){
      super(nombre, edad);
   } 
   @Override
       public void hacerSonido(){
         System.out.println("guau");
       }
}
