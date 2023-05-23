import java.util.Scanner;
public class Detector {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero para detectar si es par o impar:");
        num = tec.nextInt();

        while(num != 0){
            if(num%2 == 0){
                num = num * num;
                System.out.println("El numero ingresado es par, y su pontencia al cuadro es: " + num );
            }
            else{
                num = num * num;
                System.out.println("El numero ingresado no es par, y su pontencia al cuadrado es: " + num);
            }
            System.out.println("---------------------------");
            System.out.println("Vuelva a ingresar un numero");
            num = tec.nextInt();
        }
        System.out.println("Fin del Programa");

    }
}
