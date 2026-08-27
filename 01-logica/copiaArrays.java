public class copiaArrays{

   public static void main(String[] args){
int[] nmeros={4, 7, 2, 9, 6};
int[] copia=new int [nmeros.length];
for(int i = 0; i < nmeros.length; i++){
copia[i] = nmeros[i];

} copia[0]= 1;
for(int i = 0; i< copia.length; i++){
       System.out.println(copia[i]); 
       } 

 }

}