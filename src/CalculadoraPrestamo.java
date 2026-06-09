public class CalculadoraPrestamo {

    public static double calcularInteresSimple(double prestamo, double tasa, int meses) {
        return prestamo * (tasa / 100) * (meses / 12.0);
    }

    public static double calcularTotalAPagar(double prestamo, double interes) {
        return 0;
    }

    public static double calcularCuotaMensual(double total, int meses) {
        return 0;
    }

    public static void compararCuotasPorPlazo(double prestamo, double tasa) {
    }
}