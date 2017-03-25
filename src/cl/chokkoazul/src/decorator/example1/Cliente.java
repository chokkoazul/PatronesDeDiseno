package cl.chokkoazul.src.decorator.example1;

/**
 * Created by cristian.osorio on 06-03-17.
 */
public class Cliente {

    public static void main(String[] args) {
        Vendible auto = new NissanVersa();

        System.out.println(auto.getDescripcion());
        System.out.println("Su precio es de :" + auto.getPrecio());

        auto = new AirBag(auto);

        System.out.println(auto.getDescripcion());
        System.out.println("Su precio es de :" + auto.getPrecio());

        auto = new AireAcondicionado(auto);

        System.out.println(auto.getDescripcion());
        System.out.println("Su precio es de :" + auto.getPrecio());

        Vendible auto2 = new SuzukiSwift();

        System.out.println(auto2.getDescripcion());
        System.out.println("Su precio es de :" + auto2.getPrecio());

        auto2 = new CdPlayer(auto2);
        auto2 = new FrenosABS(auto2);

        System.out.println(auto2.getDescripcion());
        System.out.println("Su precio es de :" + auto2.getPrecio());


    }
}
