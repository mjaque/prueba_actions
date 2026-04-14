import java.util.*;

// Clase Pedido
public class Pedido {
    private Cliente cliente;
    private Set<LineaPedido> lineas;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.lineas = new HashSet<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addLinea(ItemVendible item, Integer cantidad) {
        lineas.add(new LineaPedido(item, cantidad));
    }

    public void removeLinea(LineaPedido linea) {
        lineas.remove(linea);
    }

    public Set<LineaPedido> getLineas() {
        return lineas;
    }

    public Double calcularTotal() {
        Double total = 0.0;
        for (LineaPedido linea : lineas) {
            total += linea.calcularSubtotal();
        }
        return total;
    }
}

