public class GestionPedidos {
    private List<Pedido> pedidos;

    public GestionPedidos() {
        pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void actualizarEstadoPedido(Pedido pedido, String nuevoEstado) {
        pedido.actualizarEstado(nuevoEstado);
    }

    public void mostrarPedidos() {
        for (Pedido pedido : pedidos) {
            System.out.println("Usuario: " + pedido.getUsuario() + ", Artículo: " + pedido.getArticulo() + ", Estado: " + pedido.getEstado());
        }
    }
}
