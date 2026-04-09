import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Edades");
            System.out.println("2. Notas");
            System.out.println("3. Puntajes");
            System.out.println("4. Buscar número");
            System.out.println("5. Encuesta");
            System.out.println("6. Gastos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1(sc);
                    break;
                case 2:
                    ejercicio2(sc);
                    break;
                case 3:
                    ejercicio3(sc);
                    break;
                case 4:
                    ejercicio4(sc);
                    break;
                case 5:
                    ejercicio5(sc);
                    break;
                case 6:
                    ejercicio6(sc);
                    break;
            }
        } while (opcion != 0);
    }

    // 1
    public static void ejercicio1(Scanner sc) {
        int[] edades = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese edad: ");
            edades[i] = sc.nextInt();
        }

        System.out.println("Edades:");
        for (int e : edades) {
            System.out.println(e);
        }
    }

    // 2
    public static void ejercicio2(Scanner sc) {
        double[] notas = new double[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese nota: ");
            notas[i] = sc.nextDouble();
        }

        System.out.println("Notas:");
        for (double n : notas) {
            System.out.println(n);
        }
    }

    // 3
    public static void ejercicio3(Scanner sc) {
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

        System.out.println("Mayor: " + mayor);
    }

    // 4
    public static void ejercicio4(Scanner sc) {
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
            System.out.println("Sí está");
        } else {
            System.out.println("No está");
        }
    }

    // 5
    public static void ejercicio5(Scanner sc) {
        int[] conteo = new int[6];

        for (int i = 0; i < 12; i++) {
            System.out.print("Calificación (1-5): ");
            int cal = sc.nextInt();
            conteo[cal]++;
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Calificación " + i + ": " + conteo[i]);
        }
    }

    // 6
    public static void ejercicio6(Scanner sc) {
        int[] gastos = new int[7];
        int suma = 0;
        int mayores = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Gasto: ");
            gastos[i] = sc.nextInt();

            suma += gastos[i];

            if (gastos[i] > 50000) {
                mayores++;
            }
        }

        System.out.println("Gastos:");
        for (int g : gastos) {
            System.out.println(g);
        }

        System.out.println("Total: " + suma);
        System.out.println("Mayores a 50.000: " + mayores);
    }
}