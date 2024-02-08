package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String tipoCliente;
        String tipoConsola;
        String llevaControl;
        Integer precioConsola;
        Integer precioControl;
        Integer totalSinDescuento;
        Double descuento=0.2;
        Double totalConDescuento;

        System.out.println("\n*****Bienvenido a ClinicaPlay*****");
        System.out.println("\nUsted es un cliente nuevo?");
        tipoCliente=leer.nextLine();
        if (tipoCliente.equals("si")){
            //Cliente nuevo
            System.out.println("\nConsolas: ");
            System.out.println("PS3: $300.000");
            System.out.println("PS4: $900.000");
            System.out.println("PS5: $2.500.000");

            System.out.println("\n¿Que consola desea llevar?");
            tipoConsola=leer.nextLine();
            if (tipoConsola.equals("ps3")){
                //PS3 cliente nuevo
                precioConsola=300000;
                System.out.println("\nEl precio del control es: $80.000");
                System.out.println("Si lleva un control, le regalamos 5 juegos.");
                System.out.println("\nDesea comprar un control?");
                llevaControl=leer.nextLine();
                if (llevaControl.equals("si")){
                    precioControl=80000;
                    totalSinDescuento=precioConsola+precioControl;
                    System.out.println("\nEl total de su compra es: $"+totalSinDescuento);
                }else{
                    totalSinDescuento=precioConsola;
                    System.out.println("\nEl total de su compra es: $"+totalSinDescuento);
                }
            }else if (tipoConsola.equals("ps4")){
                //PS4 cliente nuevo
                precioConsola=900000;
                System.out.println("\nEl precio del control es: $200.000");
                System.out.println("Si lleva un control, le regalamos 5 juegos.");
                System.out.println("\nDesea comprar un control?");
                llevaControl=leer.nextLine();
                if (llevaControl.equals("si")){
                    precioControl=200000;
                    totalSinDescuento=precioConsola+precioControl;
                    System.out.println("\nEl total de su compra es: $"+totalSinDescuento);
                }else{
                    totalSinDescuento=precioConsola;
                    System.out.println("\nEl total de su compra es: $"+totalSinDescuento);
                }
            }else if (tipoConsola.equals("ps5")){
                //PS5 cliente nuevo
                precioConsola=2500000;
                System.out.println("\nEl precio del control es: $350.000");
                System.out.println("Si lleva un control, le regalamos 5 juegos.");
                System.out.println("\nDesea comprar un control?");
                llevaControl=leer.nextLine();
                if (llevaControl.equals("si")){
                    precioControl=350000;
                    totalSinDescuento=precioConsola+precioControl;
                    System.out.println("\nEl total de su compra es: $"+totalSinDescuento);
                }else{
                    totalSinDescuento=precioConsola;
                    System.out.println("\nEl total de su compra es: $"+totalSinDescuento);
                }
            }else{
                System.out.println("Digite una opcion valida");
            }
        }else{
            //Cliente viejo
            System.out.println("\nComo cliente viejo tiene derecho a 1 control adicional en la compra de una consola.");

            System.out.println("\nConsolas: ");
            System.out.println("PS3: $300.000");
            System.out.println("PS4: $900.000");
            System.out.println("PS5: $2.500.000");

            System.out.println("\n¿Que consola desea llevar?");
            tipoConsola=leer.nextLine();
            if (tipoConsola.equals("ps3")){
                //PS3 cliente viejo
                precioConsola=300000;
                totalSinDescuento=precioConsola;
                totalConDescuento=precioConsola-precioConsola*descuento;
                System.out.println("El total de su compra sin descuento es: $"+totalSinDescuento);
                System.out.println("El total de su compra con descuento es: $"+totalConDescuento);
            }else if (tipoConsola.equals("ps4")){
                //PS4 cliente viejo
                precioConsola=900000;
                totalSinDescuento=precioConsola;
                totalConDescuento=precioConsola-precioConsola*descuento;
                System.out.println("El total de su compra sin descuento es: $"+totalSinDescuento);
                System.out.println("El total de su compra con descuento es: $"+totalConDescuento);
            }else if (tipoConsola.equals("ps5")){
                //PS5 cliente viejo
                precioConsola=2500000;
                totalSinDescuento=precioConsola;
                totalConDescuento=precioConsola-precioConsola*descuento;
                System.out.println("El total de su compra sin descuento es: $"+totalSinDescuento);
                System.out.println("El total de su compra con descuento es: $"+totalConDescuento);
            }else{
                System.out.println("Digite una opcion valida");
            }
        }



    }
}