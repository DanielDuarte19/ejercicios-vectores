import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] calificaciones = new int[12];
        int[] conteo = new int[6]; // usamos índice 1 a 5

        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese calificación (1-5): ");
            calificaciones[i] = sc.nextInt();
            conteo[calificaciones[i]]++;
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Calificación " + i + ": " + conteo[i]);
        }
    }
}