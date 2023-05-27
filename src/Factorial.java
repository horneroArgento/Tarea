import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num, repositorio;
        int factorial = 0;

        System.out.println("Ingrese un numero para factoriar:");
        num = tec.nextInt();
        repositorio = num;

        for(int n = num - 1 ;n != 1 ;n-- ){
            num--;
            factorial = repositorio * num;
            repositorio = factorial;

        }
        System.out.println("La factorial del numero ingresado es: " + factorial);
    }
}
