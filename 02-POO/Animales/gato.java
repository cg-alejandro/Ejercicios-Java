public class gato extends animales{
    public gato(String nombre,int edad){
      super(nombre, edad);
    }
    @Override
       public void hacerSonido(String sonido){
          System.out.println("miau");
       }
  }

