public class compararArrays {
     public static void main(String[] args) {
        int[] numeros1 = {4, 7, 2, 9};
        int[] numeros2 = {4, 7, 2, 9};
        boolean iguales = true;
        if(numeros1.length != numeros2.length){
            iguales= false;
            System.out.println("los arrays son de distinta longitud");
        }else{
        for (int i = 0; i < numeros2.length; i++) {
            if(numeros1[i] != numeros2[i]){
                iguales= false;
               
        
        }
     }if(iguales){
        System.out.println("los arrays son iguales");
     }else{
        System.out.println("los arrays no son iguales");
     }
     }
    }
}