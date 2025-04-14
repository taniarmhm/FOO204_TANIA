public class Validacion {
    public static boolean validarCampoVacio(String campo) {
        return campo != null && !campo.trim().isEmpty();
    }
}

