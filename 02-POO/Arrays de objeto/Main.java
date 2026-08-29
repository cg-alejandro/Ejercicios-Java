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
           if (encontrado) {
            System.out.println("esta en la posición " + posicionSiames);
            listaAnimales[posicionSiames].mostrarDatos();
          }
        // 3. contar animales que tienen mas de 4 años
          int masde4años = 0;
          for (int i = 0; i < listaAnimales.length; i++) {
             if(listaAnimales[i].edad > 4){
                masde4años++;
             }
          } 
          System.out.println("hay "+ masde4años +" animales de mas de 4 años");
        // 4. buscar el animal de mayor edad
          int mayor= listaAnimales[0].edad;
          int posicionMayor = 0;
          for (int i = 1; i < listaAnimales.length; i++) {
              if (mayor < listaAnimales[i].edad) {
                 mayor = listaAnimales[i].edad;  
                 posicionMayor = i;  
              }
            }
           System.out.println("el animal mas mayor:");
          listaAnimales[posicionMayor].mostrarDatos();
        // 5. modificar un atributo de un objeto
           listaAnimales[posicionSiames].edad = 4;

        // 6. Mostrar animales mayores de 3 años
           System.out.println("animales mayores de 3 años:");
           for (int i = 0; i < listaAnimales.length; i++) {
               if (listaAnimales[i].edad > 3) {
                 listaAnimales[i].mostrarDatos(); 
               }
           }
        // 7. Detectar nombres repetidos
        int nombresRepetidos = 0;
          for (int i = 0; i < listaAnimales.length; i++) {
            for (int j = i + 1; j < listaAnimales.length; j++) {
              if (listaAnimales[i].nombre.equals(listaAnimales[j].nombre)) {
                nombresRepetidos++;
              }
            }
          }if(nombresRepetidos > 0){
             System.out.println("hay nombres repetidos");
          }else{
                System.out.println("no hay nombres repetidos");
              }
        // 8. Insertar un elemento en el array en la posicion [1]
          animales[] nuevosAnimales = new animales[listaAnimales.length + 1];
           for (int i = 0; i < nuevosAnimales.length; i++) {
             if (i < 1) {
                nuevosAnimales[i] = listaAnimales[i];
             }
           }for (int i = listaAnimales.length - 1; i >= 1; --i) {
                nuevosAnimales[i + 1] =listaAnimales[i];
           }
           animales nevoAnimal = new perro("bodeguero", 2);
           nuevosAnimales[1] = nevoAnimal;
          for (int i = 0; i < nuevosAnimales.length; i++) {
            nuevosAnimales[i].mostrarDatos();
          }
        // 9. Intercambiar 2 objetos de un array
            animales temporal = listaAnimales[0];
            listaAnimales[0] = listaAnimales[1];
            listaAnimales[1] = temporal;
      
        // 10. Copiar un array de objetos
        animales[] copiaAnimales = new animales[listaAnimales.length];
          for (int i = 0; i < copiaAnimales.length; i++) {
            copiaAnimales[i] = listaAnimales[i];
          }
        // 11. Comparar arrays de objeto
        boolean iguales = true;
        for (int i = 0; i < copiaAnimales.length; i++) {
          if(!listaAnimales[i].nombre.equals(copiaAnimales[i].nombre)){
            iguales = false;
          }
          }if(iguales){
          System.out.println("los arrays son iguales");
          }else{
           System.out.println("los arrays no son iguales");
          }
        // 12. Ordenar objetos por un atributo
        animales temporalOrdenar = listaAnimales[0];
        for (int i = 0; i < listaAnimales.length; i++) {
          for (int j = i + 1; j < listaAnimales.length; j++) {
            if (listaAnimales[i].edad > listaAnimales[j].edad) {
              temporalOrdenar = listaAnimales[i];
              listaAnimales[i] = listaAnimales[j];
              listaAnimales[j] = temporalOrdenar;

            }
          }
          }System.out.println("la lista ordenada es:");
          for (int i = 0; i < copiaAnimales.length; i++) {
          listaAnimales[i].mostrarDatos();
        }
        // 13. Buscar el animal que sea el segundo mayor
        int segundoMayor = listaAnimales[0].edad;
        int posicionSegundomayor = 0;
        if (posicionMayor == 0) {
          segundoMayor = listaAnimales[1].edad;
          posicionSegundomayor = 1;
        }
        for (int i = 0; i < listaAnimales.length; i++){
          if (listaAnimales[i].edad < mayor && listaAnimales[i].edad > segundoMayor) {
            segundoMayor = listaAnimales[i].edad;
            posicionSegundomayor = i;
          }
        }
        System.out.println("el segundo animal mas mayor:");
        listaAnimales[posicionSegundomayor].mostrarDatos();
      }
    }