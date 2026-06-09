import java.util.Scanner;

public class CalculadoraPrestamoCli {
    Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        int opcion = 0;
        do {
            System.out.println("\n=== Calculadora de Préstamo ===");
            System.out.println("1. Calcular interés simple");
            System.out.println("2. Calcular total a pagar");
            System.out.println("3. Calcular cuota mensual");
            System.out.println("4. Comparar cuotas por plazo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor del préstamo: ");
                    double p1 = scanner.nextDouble();
                    System.out.print("Ingrese la tasa de interés (%): ");
                    double t1 = scanner.nextDouble();
                    System.out.print("Ingrese el número de meses: ");
                    int m1 = scanner.nextInt();
                    double interes = CalculadoraPrestamo.calcularInteresSimple(p1, t1, m1);
                    System.out.printf("Interés generado: $%.2f%n", interes);
                    break;
                case 2:
                    System.out.println("(Módulo pendiente - Integrante 2)");
                    break;
                case 3:
                    System.out.println("(Módulo pendiente - Integrante 3)");
                    break;
                case 4:
                    System.out.println("(Módulo pendiente - Integrante 4)");
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
}