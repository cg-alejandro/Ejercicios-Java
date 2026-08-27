public class buscarPosicion {
    public static void main(String[] args) {
        int[] numeros = {8, 3, 12, 5, 7};
        boolean encontrado = false;
        int posicion = -1;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == 12){
                encontrado = true;
                posicion = i;
                break;
            }
         }if(encontrado){
            System.out.println("el numero esta en la posición "+ posicion);
         }else{
        System.out.println("el numero no esta");
    }
}  
}
