import java.util.Scanner;
public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num, resultado;

        System.out.println("Ingrese un numero para mostrar su tabla de multiplicacion: ");
        num = tec.nextInt();

        while(num != 0){
            int contador = 1;
            int multiplicador = 1;

            while(contador <= 10){
                resultado = num * multiplicador;
                System.out.println(num + " * " + multiplicador + " = " + resultado);
                multiplicador++;
                contador++;
            }
            System.out.println("Ingrese otro numero para multiplicar: ");
            num = tec.nextInt();
        }
        System.out.println("Fin del programa.");
    }
}
