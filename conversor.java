import javax.swing.*;

public class conversor extends entrada {
    public static void realizarConversion(String monedaObjetivo, double tasaDeCambio) {
        try {
            String valor1 = solicitarEntrada("Introduce el valor en dolares");
            double dolares = Double.parseDouble(valor1);
            double conversion = dolares * tasaDeCambio;
            JOptionPane.showMessageDialog(null, "El valor en " + monedaObjetivo + " es de: " + conversion);

            int decision = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas continuar?", "Confirmación",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    
            if (decision == 0) {
                JOptionPane.showMessageDialog(null, "Continuando...");
            } else {
                JOptionPane.showMessageDialog(null, "Saliendo...");
                System.exit(0);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor introducido no es un número");
        }
    }
}
