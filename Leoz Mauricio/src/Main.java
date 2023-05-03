import Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creación de los distintos productos

        Silla s1 = new Silla(5, "Silla de oficina", 35000, true);
        Silla s2 = new Silla(5, "Silla de comedor", 18500, false);
        Silla s3 = new Silla(5, "Silla de patio", 10000, false);

        Escritorio e1 = new Escritorio(10, "Mesa de computadora", 85000, 1, 2);
        Escritorio e2 = new Escritorio(10, "Escritorio Infantil", 32500, 0.60, 1.1);
        Escritorio e3 = new Escritorio(10, "Mesa comedor", 110000, 1.1, 2.25);

        Notebook n1 = new Notebook(35, "vaio 125f", 125000, "Sony", 16);
        Notebook n2 = new Notebook(25, "Dell 1258", 250000, "Dell", 128);
        Notebook n3 = new Notebook(8, "HP 12SD", 185000, "HP", 32);

        Impresora i1 = new Impresora(15, "hl2130", 56000, "Brother", 60);
        Impresora i2 = new Impresora(7, "125hfuw", 89500, "HP", 120);
        Impresora i3 = new Impresora(10, "Max126", 32000, "Epson", 45);


        //Se crea la lista y se agregan los productos creados

        List<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(s1);
        listaProductos.add(e1);
        listaProductos.add(n1);
        listaProductos.add(i1);
        listaProductos.add(s2);
        listaProductos.add(e2);
        listaProductos.add(n2);
        listaProductos.add(i2);
        listaProductos.add(s3);
        listaProductos.add(e3);
        listaProductos.add(n3);
        listaProductos.add(i3);


        //Se recorre la lista con los productos
        System.out.println("Listado de Productos");
        System.out.println();

        for (Producto p : listaProductos) {
            System.out.println(p.toString());

        }
        System.out.println();

        //Se aplica un descuento especial segun la clase de cliente. La funcion esta desarrollada abajo

        descuentoSegunCategoria(listaProductos);
        System.out.println();
        System.out.println();

        //Updateo masivo de los precios segun los porcentajes indicados


        for (Producto p : listaProductos) {
                System.out.println(p.getClass().getSimpleName()+" " +p.getNombre()+" precio original: $" + p.getPrecio());


                if(p.getClass().getSimpleName().equals("Silla")){
                    p.actualizarPrecio(5);
                }else if(p.getClass().getSimpleName().equals("Escritorio")){
                    p.actualizarPrecio(10);
                }else if(p.getClass().getSimpleName().equals("Impresora")){
                    p.actualizarPrecio(15);
                }else{
                    p.actualizarPrecio(20);
                }
                System.out.println(p.getClass().getSimpleName()+" " +p.getNombre()+ " precio Nuevo: $" + p.getPrecio());
                System.out.println();
            }
}

    public static void descuentoSegunCategoria (List lista){
        int option;
        Scanner scanner = new Scanner(System.in);

            System.out.println("Buenas tardes, indique que tipo de cliente es: ");
            System.out.println("1 Cliente Regular (no aplica descuento)");
            System.out.println("2 Cliente Premium (Descuento del 15%)");
            System.out.println("3 Cliente VIP (Descuento del 35%)");
            option = scanner.nextInt();

            if(option==1){
                System.out.println("Cliente Regular. Precio sin descuento: ");
                for(Object p : lista) {
                    if (p instanceof Silla) {
                        System.out.print("Sillas "+ ((Silla) p).getNombre() + " ");
                        System.out.println(((Silla) p).getPrecio());
                    }if (p instanceof Impresora){
                        System.out.print("Impresora " + ((Impresora) p).getNombre()+ " ");
                        System.out.println(((Impresora) p).getPrecio());
                    }
                }
            } else if (option == 2) {
                System.out.println("Cliente Premium. Precio con 15 % descuento: ");
                for(Object p : lista) {
                    if (p instanceof Silla) {
                        double precioConDescuento = ((Silla) p).aplicarDescuento(15);
                        System.out.print("Sillas "+ ((Silla) p).getNombre() + " ");
                        System.out.println(precioConDescuento);
                    }if (p instanceof Impresora){
                        double precioConDescuento = ((Impresora) p).aplicarDescuento(15);
                        System.out.print("Impresora " + ((Impresora) p).getNombre()+ " ");
                        System.out.println(precioConDescuento);
                    }
                }
            } else if (option == 3) {
                System.out.println("Cliente VIP. Precio con 35 % descuento: ");
                for (Object p : lista) {
                    if (p instanceof Silla) {
                        double precioConDescuento = ((Silla) p).aplicarDescuento(35);
                        System.out.print("Sillas " + ((Silla) p).getNombre() + " ");
                        System.out.println(precioConDescuento);
                    }
                    if (p instanceof Impresora) {
                        double precioConDescuento = ((Impresora) p).aplicarDescuento(35);
                        System.out.print("Impresora " + ((Impresora) p).getNombre() + " ");
                        System.out.println(precioConDescuento);
                    }
                }
            }else{
                System.out.println("Ha ingresado una opcion invalida. ");
            }

    }
}


