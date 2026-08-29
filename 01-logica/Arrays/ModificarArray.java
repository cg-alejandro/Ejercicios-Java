public class ModificarArray{
   public static void main(String[] args){
       int[] numeros = {2, 5, 8, 3, 10};
       for(int i = 0; i< numeros.length; i++){
        numeros[i]= numeros[i]* 2;
       }for(int i = 0; i< numeros.length; i++){
       System.out.println(numeros[i]); 
       } 
   }
   

}