import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Set;

class PedidoTest {

    @Test
    void testPedido() {
        Cliente cliente = new Cliente("Miguel", "123456789");
        Pedido pedido = new Pedido(cliente);
        assertEquals(cliente, pedido.getCliente());

        Producto producto1 = new Producto("Café", 1.20);
        Producto producto2 = new Producto("Tostada", 2.00);

        pedido.addLinea(producto1, 2);
        pedido.addLinea(producto2, 1);

        Set<LineaPedido> lineas = pedido.getLineas();
        assertEquals(2, lineas.size());
        assertEquals(4.40, pedido.calcularTotal());

        LineaPedido primeraLinea = lineas.iterator().next();
        pedido.removeLinea(primeraLinea);
        assertEquals(1, pedido.getLineas().size());
    }
}
