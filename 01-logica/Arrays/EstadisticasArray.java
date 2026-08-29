/*
Ejercicio: Estadísticas de un array
Dado un array de números enteros, 
recorrerlo para determinar la cantidad de números pares e impares,
 además del número mayor y menor.
 */
public class EstadisticasArray {
  
  public static void main(String[] args) {
    int[] numeros = {4, 7, 2, 9, 6, 3, 12, 5};
    int menor = numeros[0];
    int mayor = numeros[0];
    int pares = 0;
    int impares = 0;
    for (int i = 0; i< numeros.length; i++ ){
      if (numeros[i] < menor){
        menor = numeros[i];
        }
      if (numeros[i] > mayor){
      mayor= numeros[i];
      }  
      if (numeros[i] % 2 == 0) {
        pares++;
      }else{
        impares++;
      }
    }
    System.out.println("hay "+ pares +" numeros pares, "+ impares +" numeros impares");
    System.out.println("el numero mayor es "+ mayor + " el numero menor es " + menor);
  }
}

