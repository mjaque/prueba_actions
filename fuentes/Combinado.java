import java.util.*;

// Clase Combinado
public class Combinado implements ItemVendible {
    private String nombre;
    private Set<Producto> productos;

    public Combinado(String nombre) {
        this.nombre = nombre;
        this.productos = new HashSet<>();
    }

    public void addProducto(Producto producto) {
        productos.add(producto);
    }

    public void removeProducto(Producto producto) {
        productos.remove(producto);
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Double calcularPrecio() {
        Double total = 0.0;
        for (Producto producto : productos) {
            total += producto.calcularPrecio();
        }
        return total;
    }
}

