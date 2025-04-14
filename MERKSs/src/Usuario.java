public class Usuario {
    private String nombre;
    private String contraseña;
    private String departamento;

    public Usuario(String nombre, String contraseña, String departamento) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.departamento = departamento;
    }

    // Getters y setters
    public String getContraseña() { return contraseña; }
    public String getDepartamento() { return departamento; }
}
