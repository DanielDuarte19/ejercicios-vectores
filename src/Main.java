import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese nota: ");
            notas[i] = sc.nextDouble();
        }

        System.out.println("Notas:");
        for (double nota : notas) {
            System.out.println(nota);
        }
    }
}