public class Validacion {
    // Método para validar que el campo no esté vacío
    public static boolean validarCampoVacio(String campo) {
        return campo != null && !campo.trim().isEmpty();
    }
}
