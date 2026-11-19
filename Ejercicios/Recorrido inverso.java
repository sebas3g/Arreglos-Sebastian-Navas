public class Ejercicio2 {
    public static void main(String[] args) {

        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};

        // Recorrer de atrás hacia adelante
        System.out.println("Dias en orden inverso:");

        for (int i = dias.length - 1; i >= 0; i--) {
            System.out.println(dias[i]);
        }
    }
}
