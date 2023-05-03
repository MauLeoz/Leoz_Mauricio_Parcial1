package Models;

public class Producto {
    private int stock;
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(int stock, String nombre, double precio) {
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void aplicarDescuento(float porcentaje){
        double v = getPrecio() - ((getPrecio() * porcentaje) / 100);
        setPrecio(v);
    }
}
