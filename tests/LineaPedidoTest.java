import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LineaPedidoTest {

    @Test
    void testLineaPedido() {
        Producto producto = new Producto("Refresco", 1.50);
        LineaPedido linea = new LineaPedido(producto, 3);

        assertEquals(producto, linea.getItem());
        assertEquals(3, linea.getCantidad());
        assertEquals(4.50, linea.calcularSubtotal());

        linea.setCantidad(5);
        assertEquals(5, linea.getCantidad());
        assertEquals(7.50, linea.calcularSubtotal());
    }
}
