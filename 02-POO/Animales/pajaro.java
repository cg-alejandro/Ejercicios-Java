public class pajaro extends animales implements volador {
    public pajaro(String nombre, int edad){
        super(nombre, edad);
    }
    @Override
       public void hacerSonido(){
        System.out.println("pio pio");
       }
    public void volar(){
        System.out.println("el pajaro esta volando");
    }
}
