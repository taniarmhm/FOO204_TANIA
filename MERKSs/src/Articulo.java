public class Articulo {
    private String nombre;
    private int cantidad;

    public Articulo(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public int getCantidad() { return cantidad; }
}
