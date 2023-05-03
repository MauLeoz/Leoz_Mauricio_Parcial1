import Models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Silla s = new Silla(5,"Silla de oficina",35000,true);
        Escritorio e = new Escritorio(10,"Mesa de computadora",85000,1,2);
        Notebook n = new Notebook(3,"vaio 125f",125000,"Sony",16);
        Impresora i = new Impresora(15,"hl2130",56000,"Brother",60);

        List<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(s);
        listaProductos.add(e);
        listaProductos.add(n);
        listaProductos.add(i);

        for (Producto p : listaProductos) {
            System.out.println(p.toString());
        }

        s.aplicarDescuento(15);
        System.out.println(s.getPrecio());
        System.out.println();

        for (Producto p : listaProductos) {
            {
                System.out.println(p.getClass().getName() + " precio original: $" + p.getPrecio());


                if(p.getClass().getName()=="Silla"){
                    p.aplicarDescuento(5);
                }else if(p.getClass().getName()=="Escritorio"){
                    p.aplicarDescuento(10);
                }else if(p.getClass().getName()=="Impresora"){
                    p.aplicarDescuento(15);
                }else{
                    p.aplicarDescuento(20);
                }

                System.out.println(p.getClass().getName() + " precio Nuevo: $" + p.getPrecio());
                System.out.println();
                System.out.println();
            }


        }
    }
}