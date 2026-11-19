public class Ejercicio3 {
    public static void main(String[] args) {

        int[] notas = {14, 16, 12, 19};

        int suma = 0;

        // Calcular suma
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        // Calcular promedio
        double promedio = (double) suma / notas.length;

        // Mostrar resultados
        System.out.println("Suma total: " + suma);
        System.out.printf("Promedio: %.2f%n", promedio);
    }
}
