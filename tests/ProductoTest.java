import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ProductoTest {

    @Test
    void testProducto() {
        Producto producto = new Producto("Coca-Cola", 2.50);
        assertEquals("Coca-Cola", producto.getNombre());
        assertEquals(2.50, producto.calcularPrecio());

        producto.setNombre("Fanta");
        assertEquals("Fanta", producto.getNombre());

        producto.setPrecio(2.75);
        assertEquals(2.75, producto.calcularPrecio());
    }

    @Test
    void testBebida() {
        Bebida bebida = new Bebida("Agua", 1.00, false);
        assertEquals("Agua", bebida.getNombre());
        assertEquals(1.00, bebida.calcularPrecio());
        assertFalse(bebida.getConGas());

        bebida.setConGas(true);
        assertTrue(bebida.getConGas());
    }
}
