public class GestionArticulos {
    private HashMap<String, Articulo> articulos;

    public GestionArticulos() {
        articulos = new HashMap<>();
    }

    // Función para agregar artículo
    public void agregarArticulo(String nombre, int cantidad) {
        articulos.put(nombre, new Articulo(nombre, cantidad));
    }

    // Función para modificar cantidad de un artículo
    public void modificarArticulo(String nombre, int nuevaCantidad) {
        if (articulos.containsKey(nombre)) {
            articulos.get(nombre).setCantidad(nuevaCantidad);
        }
    }

    // Función para eliminar un artículo
    public void eliminarArticulo(String nombre) {
        articulos.remove(nombre);
    }

    // Función para consultar los artículos
    public Collection<Articulo> consultarArticulos() {
        return articulos.values();
    }
}
