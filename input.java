import javax.swing.*;

public class input {

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
