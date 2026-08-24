public class Main { 
    public static void main(String[] args){
        animales primerAnimal = new perro("labrador", 5);
        animales segundoAnimal = new gato("siames", 6);
        pajaro miPajaro= new pajaro( "gorrión", 1);
             animales animal= miPajaro;
             volador volador= miPajaro;
    
          animal.hacerSonido();
          volador.volar();
          primerAnimal.hacerSonido();
          segundoAnimal.hacerSonido();
          primerAnimal.mostrarDatos();
    }
}
