import javax.swing.*;
import java.util.HashMap;

// Si ambos archivos están en el mismo paquete, no necesitas declarar un paquete
public class ControlAcceso {
    private HashMap<String, String> usuarios;

    public ControlAcceso() {
        usuarios = new HashMap<>();
        usuarios.put("admin", "admin123");  // Usuario y contraseña de ejemplo
        usuarios.put("usuario1", "clave123");
    }

    // Método para verificar las credenciales
    public boolean verificarCredenciales(String usuario, String password) {
        return usuarios.containsKey(usuario) && usuarios.get(usuario).equals(password);
    }

    // Método para recuperar la contraseña
    public void recuperarContra(String correo) {
        // Lógica para la recuperación de contraseña, por ejemplo:
        JOptionPane.showMessageDialog(null, "Se ha enviado un enlace de recuperación a: " + correo);
    }
}
