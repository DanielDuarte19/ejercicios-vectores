import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] puntajes = new int[6];
        int mayor = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese puntaje: ");
            puntajes[i] = sc.nextInt();

            if (puntajes[i] > mayor) {
                mayor = puntajes[i];
            }
        }

        System.out.println("Puntajes:");
        for (int p : puntajes) {
            System.out.println(p);
        }

        System.out.println("Mayor puntaje: " + mayor);

    }
}