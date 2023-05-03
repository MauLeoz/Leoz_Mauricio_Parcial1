package Models;

public class Impresora extends ProductoInformatico{
    private int ppm;

    public Impresora() {
    }

    public Impresora(int ppm) {
        this.ppm = ppm;
    }

    public Impresora(String nombreFabricante, int ppm) {
        super(nombreFabricante);
        this.ppm = ppm;
    }

    public Impresora(int stock, String nombre, double precio, String nombreFabricante, int ppm) {
        super(stock, nombre, precio, nombreFabricante);
        this.ppm = ppm;
    }

    public int getPpm() {
        return ppm;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "ppm=" + ppm +
                "} " + super.toString();
    }
}
