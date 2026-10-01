import javax.swing.JOptionPane;

public class Ejercicio4Recursividad {
/**
     * EJERCICIO 4: Recorrer un String al revés.
     * Funcionamiento: Extrae la primera letra de la palabra, invierte el resto de la palabra 
     * y al final le pega esa primera letra al final de la cadena.
     */
    public String invertirStringRecursivo(String palabra) {
        // CASO BASE: Si la palabra está vacía, no hay nada que invertir.
        if (palabra.isEmpty()) {
            return palabra;
        }
        // PASO RECURSIVO: Llama a invertir quitándole la primera letra, y luego suma esa letra al final.
        // Ejemplo con "Hola": invertirStringRecursivo("ola") + 'H'
        return invertirStringRecursivo(palabra.substring(1)) + palabra.charAt(0);
    }
    public static void main(String[] args) {
        Ejercicio4Recursividad ej4 = new Ejercicio4Recursividad();
        String texto = JOptionPane.showInputDialog("Ingresa el texto a invertir:");
        String textoInvertido = ej4.invertirStringRecursivo(texto);
        JOptionPane.showMessageDialog(null, "El texto invertido es:\n" + textoInvertido);
    }
}
