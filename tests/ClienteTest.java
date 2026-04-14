import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClienteTest {

    @Test
    void testCliente() {
        Cliente cliente = new Cliente("Miguel", "123456789");
        assertEquals("Miguel", cliente.getNombre());
        assertEquals("123456789", cliente.getTelefono());

        cliente.setNombre("Ana");
        assertEquals("Ana", cliente.getNombre());

        cliente.setTelefono("987654321");
        assertEquals("987654321", cliente.getTelefono());
    }
}
