import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];
        boolean encontrado = false;

        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Número a buscar: ");
        int buscar = sc.nextInt();

        for (int n : numeros) {
            if (n == buscar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Sí está en el vector");
        } else {
            System.out.println("No está");
        }
    }
}