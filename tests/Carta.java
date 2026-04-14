import java.util.*;

// Clase Carta (Singleton)
public class Carta {
    private static Carta instancia;
    private String nombre;
    private Set<ItemVendible> items;

    private Carta(String nombre) {
        this.nombre = nombre;
        this.items = new HashSet<>();
    }

    public static Carta getInstancia() {
        if (instancia == null) {
            instancia = new Carta("Carta Principal");
        }
        return instancia;
    }

    public void addItem(ItemVendible item) {
        items.add(item);
    }

    public void removeItem(ItemVendible item) {
        items.remove(item);
    }

    public Set<ItemVendible> getItemsCarta() {
        return items;
    }
}

