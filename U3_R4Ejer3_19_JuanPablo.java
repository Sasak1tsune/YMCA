import java.util.Scanner;
public class U3_R4Ejer3_19_JuanPablo {
    public static void main(String[]args){
    //Defino variables
	int numero,raiz=0,modu;
	Scanner entrada = new Scanner(System.in);
	//Resolución del programa
	System.out.println("Dame un número y te daré su raíz(será aproximado en alguna ocasión, no esperes que sea exacto):");
	numero=entrada.nextInt();
	for(int i=0;i*i<=numero;i++){raiz=i;}
	modu=numero-raiz*raiz;
	if(modu==0){
		System.out.printf("La raíz cuadrada de "+numero+" es "+raiz);
	}
	else{
		System.out.printf("La raíz cuadrada aproximada de "+numero+" es "+raiz);
	}
    }    
}
