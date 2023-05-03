package Models;

public class Escritorio extends Mueble{
    private int alto;
    private int ancho;

    public Escritorio() {
    }

    public Escritorio(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public Escritorio(int stock, String nombre, double precio, int alto, int ancho) {
        super(stock, nombre, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Escritorio{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                "} " + super.toString();
    }
}
