package Models;

public class Escritorio extends Mueble{
    private double alto;
    private double ancho;

    public Escritorio() {
    }

    public Escritorio(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public Escritorio(int stock, String nombre, double precio, double alto, double ancho) {
        super(stock, nombre, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
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
