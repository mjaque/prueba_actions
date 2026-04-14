import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;

class CartaTest {

    @Test
    void testSingleton() {
        Carta carta1 = Carta.getInstancia();
        Carta carta2 = Carta.getInstancia();
        assertSame(carta1, carta2);
    }

    @Test
    void testAddRemoveItem() {
        Carta carta = Carta.getInstancia();
        Producto producto = new Producto("Pizza", 8.00);
        Combinado combo = new Combinado("Menu Especial");

        carta.addItem(producto);
        carta.addItem(combo);

        Set<?> items = carta.getItemsCarta();
        assertEquals(2, items.size());

        carta.removeItem(producto);
        assertEquals(1, carta.getItemsCarta().size());
    }
}
