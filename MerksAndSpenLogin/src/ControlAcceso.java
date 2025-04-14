import java.util.HashMap;
import javax.swing.JOptionPane;


public class ControlAcceso {
    private HashMap<String, String> usuarios;


    public ControlAcceso() {
        usuarios = new HashMap<>();
        usuarios.put("admin", "admin123");
        usuarios.put("usuario1", "clave123");
    }

    public boolean verificarCredenciales(String usuario, String password) {
        return usuarios.containsKey(usuario) && usuarios.get(usuario).equals(password);
    }

    public void recuperarContra(String correo) {
        JOptionPane.showMessageDialog(null, "Se ha enviado un enlace de recuperación a: " + correo);
    }

    // Métodos de gestión de usuarios
    public void agregarUsuario(String usuario, String password) {
        usuarios.put(usuario, password);
    }

    public void eliminarUsuario(String usuario) {
        usuarios.remove(usuario);
    }

    public void modificarPassword(String usuario, String nuevaPassword) {
        if (usuarios.containsKey(usuario)) {
            usuarios.put(usuario, nuevaPassword);
        }
    }
}
