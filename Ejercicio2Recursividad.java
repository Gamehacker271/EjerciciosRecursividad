import javax.swing.JOptionPane;

public class Ejercicio2Recursividad {
/**
     * EJERCICIO 2: Sucesión de Fibonacci.
     * Funcionamiento: Devuelve el número en la posición N de la serie sumando los dos anteriores.
     */
    public int fibonacciRecursivo(int n) {
        // CASO BASE: Los dos primeros números de la serie son 0 y 1.
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        // PASO RECURSIVO: La suma de los dos métodos anteriores.
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
    public static void main(String[] args) {
        Ejercicio2Recursividad ej2 = new Ejercicio2Recursividad();
        int limiteFibo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa qué posición de Fibonacci deseas calcular:"));
        int resFibo = ej2.fibonacciRecursivo(limiteFibo);
        JOptionPane.showMessageDialog(null, "El número de Fibonacci en la posición " + limiteFibo + " es: " + resFibo);
    }
}
