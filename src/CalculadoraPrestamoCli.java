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
                    System.out.print("Ingrese el valor del préstamo: ");
                    double p2 = scanner.nextDouble();
                    System.out.print("Ingrese la tasa de interés (%): ");
                    double t2 = scanner.nextDouble();
                    System.out.print("Ingrese el número de meses: ");
                    int m2 = scanner.nextInt();
                    double i2 = CalculadoraPrestamo.calcularInteresSimple(p2, t2, m2);
                    double total2 = CalculadoraPrestamo.calcularTotalAPagar(p2, i2);
                    System.out.printf("Total a pagar: $%.2f%n", total2);
                    break;
                case 3:
                    System.out.print("Ingrese el valor del préstamo: ");
                    double p3 = scanner.nextDouble();
                    System.out.print("Ingrese la tasa de interés (%): ");
                    double t3 = scanner.nextDouble();
                    System.out.print("Ingrese el número de meses: ");
                    int m3 = scanner.nextInt();
                    double i3 = CalculadoraPrestamo.calcularInteresSimple(p3, t3, m3);
                    double total3 = CalculadoraPrestamo.calcularTotalAPagar(p3, i3);
                    double cuota = CalculadoraPrestamo.calcularCuotaMensual(total3, m3);
                    System.out.printf("Cuota mensual: $%.2f%n", cuota);
                    break;
                case 4:
                    System.out.print("Ingrese el valor del préstamo: ");
                    double p4 = scanner.nextDouble();
                    System.out.print("Ingrese la tasa de interés (%): ");
                    double t4 = scanner.nextDouble();
                    CalculadoraPrestamo.compararCuotasPorPlazo(p4, t4);
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
