import java.util.Scanner;
public class pedirContrasena{
    public static void main(String[] args){
        int contrasena = 1345;
        Scanner scanner = new Scanner(System.in);
        int contrasenaIntroducida;
        do{
            System.out.println("introducir contraseña");
            contrasenaIntroducida = scanner.nextInt();
            
            if (contrasenaIntroducida == contrasena) {
                System.out.println("contraseña correcta bienvenido");
            }
        }while(contrasenaIntroducida != contrasena);
    }
}