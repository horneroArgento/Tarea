import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num;
        int contador = 1;

        System.out.println("Ingrese un numero:");
        num = tec.nextInt();

        while(contador <= num){
            System.out.println(contador);
            contador++;
        }


    }
}
