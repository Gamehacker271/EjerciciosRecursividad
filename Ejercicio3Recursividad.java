import javax.swing.JOptionPane;

public class Ejercicio3Recursividad {
/**
     * EJERCICIO 3: Potencia.
     * Funcionamiento: Multiplica la base por sí misma "exponente" veces.
     */
    public double potenciaRecursiva(double base, int exponente) {
        // CASO BASE: Cualquier número elevado a la 0 siempre es 1.
        if (exponente == 0) {
            return 1;
        }
        // PASO RECURSIVO: Multiplica la base y le resta 1 al exponente pendiente.
        return base * potenciaRecursiva(base, exponente - 1);
    }
    public static void main(String[] args) {
        Ejercicio3Recursividad ej3 = new Ejercicio3Recursividad();
        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base:"));
        int exponente = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el exponente:"));
        double resPotencia = ej3.potenciaRecursiva(base, exponente);
        JOptionPane.showMessageDialog(null, base + " elevado a la " + exponente + " es: " + resPotencia);
    }
}
