package Models;

public class Silla extends Mueble{
    private boolean tieneRueda;

    public Silla() {
    }

    public Silla(boolean tieneRueda) {
        this.tieneRueda = tieneRueda;
    }

    public Silla(int stock, String nombre, double precio, boolean tieneRueda) {
        super(stock, nombre, precio);
        this.tieneRueda = tieneRueda;
    }

    public boolean isTieneRueda() {
        return tieneRueda;
    }

    public void setTieneRueda(boolean tieneRueda) {
        this.tieneRueda = tieneRueda;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "tieneRueda=" + tieneRueda +
                "} " + super.toString();
    }
}
