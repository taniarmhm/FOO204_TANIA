import javax.swing.JOptionPane;
import java.security.SecureRandom;

class GeneradorPassword {
    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private static final String ESPECIALES = "!@#$%^&*()-_+=<>?";

    public static String generarPassword(int longitud, boolean incluirMayusculas, boolean incluirEspeciales) {
        String caracteres = MINUSCULAS + NUMEROS;
        if (incluirMayusculas) {
            caracteres += MAYUSCULAS;
        }
        if (incluirEspeciales) {
            caracteres += ESPECIALES;
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            password.append(caracteres.charAt(index));
        }
        return password.toString();
    }

    public static String evaluarFortaleza(String password) {
        int puntuacion = 0;
        if (password.length() >= 8) puntuacion++;
        if (password.matches(".*[A-Z].*")) puntuacion++;
        if (password.matches(".*[0-9].*")) puntuacion++;
        if (password.matches(".*[!@#$%^&*()\\-_+=<>?].*")) puntuacion++;


        switch (puntuacion) {
            case 4: return "Fuerte";
            case 3: return "Moderada";
            case 2: return "Débil";
            default: return "Muy Débil";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int longitud = 8;
        String inputLongitud = JOptionPane.showInputDialog("Ingrese la longitud del password (8 por defecto):");
        if (inputLongitud != null && !inputLongitud.isEmpty()) {
            longitud = Integer.parseInt(inputLongitud);
        }

        int incluirMayusculas = JOptionPane.showConfirmDialog(null, "¿Incluir mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION);
        int incluirEspeciales = JOptionPane.showConfirmDialog(null, "¿Incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION);

        String password = GeneradorPassword.generarPassword(longitud, incluirMayusculas == JOptionPane.YES_OPTION, incluirEspeciales == JOptionPane.YES_OPTION);
        String fortaleza = GeneradorPassword.evaluarFortaleza(password);

        JOptionPane.showMessageDialog(null, "Password generado: " + password + "\nFortaleza: " + fortaleza);
    }
}
