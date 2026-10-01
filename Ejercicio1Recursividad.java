import javax.swing.JOptionPane;

public class Ejercicio1Recursividad {
    /**
     * EJERCICIO 1: Suma de números del 1 al N.
     * Funcionamiento: Si entra el 5, retorna 5 + sumar(4). 
     * Eso a su vez retorna 4 + sumar(3)... y así hasta llegar a 1.
     */
    public int sumarRecursivo(int n) {
        // CASO BASE: El freno de mano. Si n llega a 1, ya no llama a más métodos, solo devuelve 1.
        if (n <= 1) {
            return 1;
        }
        // PASO RECURSIVO: Suma el número actual más el resultado de llamar a la misma función con un número menos.
        return n + sumarRecursivo(n - 1);
    
    }
    public static void main(String[] args) {
        Ejercicio1Recursividad ej1 = new Ejercicio1Recursividad();
        int limiteSuma = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el límite (N) para la suma:"));
        int resSuma = ej1.sumarRecursivo(limiteSuma);
        JOptionPane.showMessageDialog(null, "La suma recursiva del 1 al " + limiteSuma + " es: " + resSuma);
    }
}
