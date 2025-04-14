public class Pedido {
    private String usuario;
    private String articulo;
    private int cantidad;
    private String estado; // Pendiente, En proceso, Enviado

    public Pedido(String usuario, String articulo, int cantidad) {
        this.usuario = usuario;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.estado = "Pendiente"; // Estado inicial
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }
}
