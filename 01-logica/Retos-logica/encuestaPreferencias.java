/* Ejercicio: simular una encuesta con 3 opciones y guardarlas en 
un array calcular la cantidad de veces que aparecen y decir cual 
aparece mas veces o si hay empate entre alguna
 */
import java.util.Scanner;
public class encuestaPreferencias {
    public static void main(String[] args) {
        int[] selecciones = new int[10];
        int java = 0;
        int python = 0;
        int javaScript = 0;
        int contadorSelecciones = 0;
        int opcion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("selecciones su preferencia");
            System.out.println("1 para java");
            System.out.println("2 para python");
            System.out.println("3 para javaScript");
            do {
                opcion = scanner.nextInt();
                if(opcion > 0 && opcion < 4){
                    selecciones[contadorSelecciones] = opcion; 
                    contadorSelecciones++;
                    switch (opcion) {
                            case 1:
                                java++;
                                break;
                            case 2:
                                python++;
                                break;
                            case 3:
                                javaScript++;
                                break;
                            }
                    
                }else{
                    System.out.println("seleccione un nmero valido");
                }
            } while (contadorSelecciones != 10);       
        System.out.println("eligieron java: " + java);
        System.out.println("eligieron python: " + python);
        System.out.println("eligieron javaScript: " + javaScript);
        if (java == python && java == javaScript) {
            System.out.println("hubo empate entre todas");
        }
        if (java > python && java > javaScript) {
            System.out.println("java fue la opcion mas elegida");
        }else if (java == python) {
            System.out.println("hubo empate entre java y python");
        }
        if (python > java && python > javaScript) {
            System.out.println("python fue la opcion mas elegida");
        }else if (python == javaScript) {
            System.out.println("hubo empate entre python y javaScript");
        }
        if (javaScript > java && javaScript > python) {
            System.out.println("javaScript fue la opcion mas elegida");
        }else if (javaScript == java) {
            System.out.println("hubo empate entre javaScript y java");
        }
        scanner.close();
        }
    }

