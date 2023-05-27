import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num1, num2, resultado;
        int opc = 1;


        while(opc != 5){
            System.out.println("----------------------");
            System.out.println("MENU DE OPCIONES");
            System.out.println("1 - SUMAR");
            System.out.println("2 - RESTAR");
            System.out.println("3 - MULTIPLICAR");
            System.out.println("4 - DIVIDIR");
            System.out.println("5 - SALIR");
            System.out.println("----------------------");

            opc = tec.nextInt();

            if(opc < 1 || opc > 5) {
                System.out.println("La opcion que ingreso no es valida, vuelva a intentarlo");
            }
            else{
                switch (opc) {
                    case 1:
                        System.out.println("Ingrese los numeros que desee sumar:");
                        num1 = tec.nextInt();
                        num2 = tec.nextInt();
                        resultado = num1 + num2;
                        System.out.println(num1 + " + " + num2 + " = " + resultado);
                        break;

                    case 2:
                        System.out.println("Ingrese los numeros que desee restar:");
                        num1 = tec.nextInt();
                        num2 = tec.nextInt();
                        resultado = num1 - num2;
                        System.out.println(num1 + " - " + num2 + " = " + resultado);
                        break;

                    case 3:
                        System.out.println("Ingrese los numeros que desee multiplicar:");
                        num1 = tec.nextInt();
                        num2 = tec.nextInt();
                        resultado = num1 * num2;
                        System.out.println(num1 + " * " + num2 + " = " + resultado);
                        break;

                    case 4:
                        System.out.println("Ingrese los numeros que desee dividir:");
                        num1 = tec.nextInt();
                        num2 = tec.nextInt();
                        resultado = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + resultado);
                        break;

                    case 5:
                        System.out.println("FIN DEL PROGRAMA");
                    break;

                }
            }
        }
    }
}
