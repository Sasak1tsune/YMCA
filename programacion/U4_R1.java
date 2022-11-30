//Juan Pablo Perea Santos
import java.util.Scanner;
public class U4_R1 {
    public static void main(String[] args) {
        //Defino variables
        int select, salida = 1;
        Scanner scanner = new Scanner(System.in);
        Scanner letra = new Scanner(System.in);
        //Programa principal
        do {
            System.out.println("**********\n***MENÚ***\n**********\n\n1. Función eco\n2. números comprendidos entre 2 números\n3. Máximo de 2 números\n4.Es una vocal?\n5.Es primo?\n0. Salir");
            select = scanner.nextInt();
            switch (select) {
                /*Todos los programas siguen el mismo esquema
                Mensaje
                tomo los datos
                ejecuto función
                mensaje
                */
                case 1:
                    System.out.println("Introduzca el número de veces que el mensaje será mostrado en pantalla");
                    int repeticion = scanner.nextInt();
                    eco(repeticion);
                    System.out.println("Función terminada");
                    break;
                case 2:
                    System.out.println("Introduzca el primer número");
                    int a = scanner.nextInt();
                    System.out.println("Introduzca el segundo número");
                    int b = scanner.nextInt();
                    comprendidos(b, a);
                    System.out.println("Función terminada");
                    break;
                case 3:
                    System.out.println("Introduzca el primer número");
                    int num1 = scanner.nextInt();
                    System.out.println("Introduzca el segundo número");
                    int num2 = scanner.nextInt();
                    System.out.println("El número mayor entre " + num1 + " y " + num2 + " es: " + mayor(num1, num2));
                    System.out.println("Función terminada");
                    break;
                case 4:
                    System.out.println("Introduzca una letra para saber si es una vocal");
                    char caracter = letra.next().charAt(0);
                    System.out.println("La letra " + caracter + " es vocal?\n" + vocal(caracter));
                    System.out.println("Función terminada");
                    break;
                case 5:
                    System.out.println("Introduzca un número para saber si es primo");
                    int numPrimo = scanner.nextInt();
                    System.out.println("El número " + numPrimo + " es primo? " + primo(numPrimo));
                    System.out.println("Función terminada");
                    break;
                case 0:
                    System.out.println("Realmente desea salir?");
                    System.out.println("Digite 0 para salir");
                    salida = scanner.nextInt();
                    if (salida == 0) {
                        System.out.println("Adios");
                    }
                    break;
                default:
                    System.out.println("No ha introducido ningúna opción valida");
            }
        } while (salida != 0);
    } //Fin Main
    //ECO
    public static void eco(int repeticion) {
        int n = repeticion;
        for (int i = 1; i <= n; i++) {
            System.out.println("Eco...");
        }
    }
    //Comprendidos
    public static void comprendidos(int a, int b) {
        if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }
        System.out.println("Los números comprendidos entre " + a + " y " + b + " son:");
        for (int i = a; i <= b; i++) {
            System.out.print(" " + i);
        }
    }
    //Máximo
    public static int mayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    //Vocal?
    public static boolean vocal(char caracter) {
        if (caracter == 'a' || caracter == 'A' || caracter == 'e' || caracter == 'E' || caracter == 'i' || caracter == 'I' || caracter == 'o' || caracter == 'O' || caracter == 'u' || caracter == 'U') {
            return true;
        } else {
            return false;
        }
    }
    //Primo?
    public static boolean primo(int numPrimo) {
        int esprimo = numPrimo % 2;
        if (numPrimo <= 2 || esprimo != 0) {
            return true;
        } else {
            return false;
        }
    }
} //Fin clase