import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Set;

class CombinadoTest {

    @Test
    void testCombinado() {
        Combinado combo = new Combinado("Menu Infantil");
        assertEquals("Menu Infantil", combo.getNombre());

        Producto producto1 = new Producto("Hamburguesa", 3.50);
        Producto producto2 = new Producto("Patatas", 1.50);

        combo.addProducto(producto1);
        combo.addProducto(producto2);

        Set<Producto> productos = combo.getProductos();
        assertEquals(2, productos.size());
        assertEquals(5.00, combo.calcularPrecio());

        combo.removeProducto(producto1);
        assertEquals(1, combo.getProductos().size());
    }
}
