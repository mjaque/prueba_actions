// Clase LineaPedido
public class LineaPedido {
    private ItemVendible item;
    private Integer cantidad;

    public LineaPedido(ItemVendible item, Integer cantidad) {
        this.item = item;
        this.cantidad = cantidad;
    }

    public ItemVendible getItem() {
        return item;
    }

    public void setItem(ItemVendible item) {
        this.item = item;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double calcularSubtotal() {
        return item.calcularPrecio() * cantidad;
    }
}
