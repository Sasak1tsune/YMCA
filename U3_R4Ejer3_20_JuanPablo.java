import java.util.Scanner;
public class U3_R4Ejer3_20_JuanPablo {
    public static void main(String[] args) {
        //Defino variables
        Scanner entrada = new Scanner(System.in);
        float dinero, sum_dinero = 0;


        System.out.println("Introduce la cantidad de dinero que tengas en los bolsillos, banco, cajones, lo que sea\nPara salir del programa introduce ''0''");
        do {
            dinero = entrada.nextFloat();
            sum_dinero = sum_dinero + dinero;
            if (dinero != 0) {
                System.out.println("Algo mas?");
            }
        } while (dinero != 0);

        System.out.println("La cantidad de dinero total es: " + sum_dinero);
        if (sum_dinero == 0) {
            System.out.println("Tiempos dificiles, eh?");
        }
    }
}