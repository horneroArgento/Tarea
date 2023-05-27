import java.util.Scanner;
public class Edades {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int edad;
        int repositorio = 0;
        int promedio = 0;

        System.out.println("Ingrese la edad:");
        edad = tec.nextInt();

        while(edad != 0){
            promedio++;
            repositorio = repositorio + edad;

            System.out.println("Ingrese otra edad:");
            edad = tec.nextInt();
        }

        promedio = repositorio / promedio;
        System.out.println("La suma de las edades ingresadas es:" + repositorio);
        System.out.println("El promedio de las edades es:" + promedio);
    }

}
