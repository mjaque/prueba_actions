// Clase Bebida
public class Bebida extends Producto {
    private Boolean conGas;

    public Bebida(String nombre, Double precio, Boolean conGas) {
        super(nombre, precio);
        this.conGas = conGas;
    }

    public Boolean getConGas() {
        return conGas;
    }

    public void setConGas(Boolean conGas) {
        this.conGas = conGas;
    }
}

