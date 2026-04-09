import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] edades = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese edad: ");
            edades[i] = sc.nextInt();
        }

        System.out.println("Edades registradas:");
        for (int i = 0; i < 5; i++) {
            System.out.println(edades[i]);
        }
    }
}