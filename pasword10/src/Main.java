import javax.swing.JOptionPane;
import java.security.SecureRandom;

class PasswordGenerator {
    private int longitud;
    private boolean incluirMayusculas;
    private boolean incluirEspeciales;

    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private static final String ESPECIALES = "!@#$%^&*()_\\-+=<>?";

    public PasswordGenerator(int longitud, boolean incluirMayusculas, boolean incluirEspeciales) {
        this.longitud = (longitud >= 8) ? longitud : 8; // Longitud mínima de 8 caracteres
        this.incluirMayusculas = incluirMayusculas;
        this.incluirEspeciales = incluirEspeciales;
    }

    public String generarPassword() {
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
        if (password.matches(".*[!@#$%^&*()_\\-+=<>?].*")) puntuacion++;

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
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del password (mínimo 8):"));
        boolean incluirMayusculas = JOptionPane.showConfirmDialog(null, "¿Incluir mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        boolean incluirEspeciales = JOptionPane.showConfirmDialog(null, "¿Incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        PasswordGenerator generador = new PasswordGenerator(longitud, incluirMayusculas, incluirEspeciales);
        String password = generador.generarPassword();
        String fortaleza = PasswordGenerator.evaluarFortaleza(password);

        JOptionPane.showMessageDialog(null, "Password generado: " + password + "\nFortaleza: " + fortaleza);
    }
}
