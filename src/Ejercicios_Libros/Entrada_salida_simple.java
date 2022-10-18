package Ejercicios_Libros;
// Fig. 12.2: Suma.java
// Programa de suma que utiliza a JOptionPane para entrada y salida.
import javax.swing.JOptionPane;
public class Entrada_salida_simple {
    public static void main(String[] args) {
        // obtiene la entrada del usuario de los diálogos de entrada de JOptionPane
        String primerNumero = JOptionPane.showInputDialog("introduzca el primer entero");
        String SegundoNumero = JOptionPane.showInputDialog("Introduzca el seguno entero");

        //convierte las entradas String en valores int para usarlos en un calculo
        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(SegundoNumero);
        int suma = numero1 + numero2;

        // muestra los resultados en un diálogo de mensajes de JOptionPane
        JOptionPane.showMessageDialog(null, "las suma es " + suma, "suma de enteros", JOptionPane.PLAIN_MESSAGE);
}
}// fin de la clase suma