public class CalculadoraPrestamo {

    public static double calcularInteresSimple(double prestamo, double tasa, int meses) {
        return prestamo * (tasa / 100) * (meses / 12.0);
    }

    public static double calcularTotalAPagar(double prestamo, double interes) {
        return prestamo + interes;
    }

    public static double calcularCuotaMensual(double total, int meses) {
        return 0;
    }

    public static void compararCuotasPorPlazo(double prestamo, double tasa) {
        int[] plazos = {6, 12, 24};
        System.out.println("Comparación de cuotas:");
        for (int plazo : plazos) {
            double interes = calcularInteresSimple(prestamo, tasa, plazo);
            double total = prestamo + interes;
            double cuota = total / plazo;
            System.out.printf("%d meses -> $%.2f%n", plazo, cuota);
        }

    }
}