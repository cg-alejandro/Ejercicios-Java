public class Main {

    public static void main(String[] args) {

        // 1. crear un array de objetos
        animales[] listaAnimales = new animales [4];

        animales primerAnimal = new perro("husky", 4);
        animales segundoAnimal = new gato("siames" , 3);
        animales tercerAnimal = new pajaro("gorrión", 1);
        animales cuartoAnimal = new perro("pastor aleman", 7);

        listaAnimales[0] = primerAnimal;
        listaAnimales[1] = segundoAnimal;
        listaAnimales[2] = tercerAnimal;
        listaAnimales[3] = cuartoAnimal;
        // 2. buscar un animal por su nombre y guardar su posición
          boolean encontrado = false;
          int posicionSiames = -1;
          for (int i = 0; i < listaAnimales.length; i++) {
            if (listaAnimales[i].nombre.equals("siames") )  {
                encontrado = true;
                posicionSiames = i;
                break;
            } 
          }
        // 3. contar animales que tienen mas de 4 años
          int masde4años = 0;
          for (int i = 0; i < listaAnimales.length; i++) {
             if(listaAnimales[i].edad > 4){
                masde4años++;
             }
          } 
        // 4. buscar el animal de mayor edad
          int mayor= listaAnimales[0].edad;
          int posicionMayor = 0;
          for (int i = 1; i < listaAnimales.length; i++) {
              if (mayor < listaAnimales[i].edad) {
                 mayor = listaAnimales[i].edad;  
                 posicionMayor = i;  
              }
            }
        // 5. modificar un atributo de un objeto
           listaAnimales[posicionSiames].edad = 4;

        // 6. Mostrar animales mayores de 3 años
           System.out.println("animales mayores de 3 años:");
           for (int i = 0; i < listaAnimales.length; i++) {
               if (listaAnimales[i].edad > 3) {
                 listaAnimales[i].mostrarDatos(); 
               }
           }
            if (encontrado) {
            System.out.println("esta en la posición " + posicionSiames);
            listaAnimales[posicionSiames].mostrarDatos();
          }
          System.out.println("hay "+ masde4años +" animales de mas de 4 años");
          System.out.println("el animal mas mayor:");
          listaAnimales[posicionMayor].mostrarDatos();
       }
}