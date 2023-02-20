import javax.swing.*;
public class ConversorMoneda {
    public static void main(String[] args) {
        while (true) {
            try {
                String[] opciones = {"Conversion de dolar a euro", "Conversion de dolar a pesos mexicanos", "Conversion de dolar a libra esterlina", "Conversion de dolar a soles"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Selecciona una opción", "Menú", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                switch (opcionSeleccionada) {
                    case "Conversion de dolar a euro":
                        realizarConversion("euro", 0.94);
                        break;
                    case "Conversion de dolar a pesos mexicanos":
                        realizarConversion("pesos mexicanos", 18.36);
                        break;
                    case "Conversion de dolar a libra esterlina":
                        realizarConversion("libras esterlinas", 0.83);
                        break;
                    case "Conversion de dolar a soles":
                        realizarConversion("soles", 3.83);
                        break;
                    default:
                        // Acción por defecto si no se selecciona ninguna opción válida
                        break;
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Saliendo...");
                System.exit(0);
            }
        }
    }

    public static void realizarConversion(String monedaObjetivo, double tasaDeCambio) {
        try {
            String valor1 = solicitarEntrada("Introduce el valor en dolares");
            double dolares = Double.parseDouble(valor1);
            double conversion = dolares * tasaDeCambio;
            JOptionPane.showMessageDialog(null, "El valor en " + monedaObjetivo + " es de: " + conversion);

            int decision = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas continuar?", "Confirmación", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

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

    public static String solicitarEntrada(String mensaje) {
        while (true) {
            try {
                return JOptionPane.showInputDialog(mensaje);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor introducido no es un número");
            }
        }
    }
}


