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
                        double euro = 0.94;
                        realizarConversion("euro", euro);
                        break;
                    case "Conversion de dolar a pesos mexicanos":
                        double peso = 18.36;
                        realizarConversion("pesos mexicanos", peso);
                        break;
                    case "Conversion de dolar a libra esterlina":
                        double libra = 0.83;
                        realizarConversion("libras esterlinas", libra);
                        break;
                    case "Conversion de dolar a soles":
                        double soles = 3.45;
                        realizarConversion("soles", soles);
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
