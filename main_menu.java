import javax.swing.*;

public class main_menu extends conversor {
    public static void main(String[] args) {
        while (true) {
            try {
                String[] opciones = { "Conversion de dolar a euro", "Conversion de dolar a pesos mexicanos",
                        "Conversion de dolar a libra esterlina", "Conversion de dolar a soles" };
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Selecciona una opción", "Menú",
                        JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

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
}
