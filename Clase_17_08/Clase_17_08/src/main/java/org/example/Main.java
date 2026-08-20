package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Vehiculo vehiculo = new Vehiculo("AABB11","Kia",1000);
        vehiculo.mostrarDatos();
        System.out.println("Valor total del arriendo= "+vehiculo.calcularArriendo(10));
        vehiculo.calcularArriendov2(20);
        Auto auto = new Auto("CCBB11","Kia",3000,"Azul");
        auto.mostrarDatos();
        System.out.println("Valor total del arriendo= "+auto.calcularArriendo(10,500));*/

        Scanner sc = new Scanner(System.in);
        Auto auto = null;
        int op = 0;
        while (op != 5) {

            System.out.println();
            System.out.println("===== ARRIENDO DE VEHICULO =====");
            System.out.println(("1-Ingresar datos del auto"));
            System.out.println(("2-Mostrar datos del auto"));
            System.out.println(("3-Calcular valor del arriendo"));
            System.out.println(("4-Calcular valor del arriendo con descuento"));
            System.out.println(("5-Salir del programa"));
            System.out.println("Seleccione una opcion:");
            op = sc.nextInt();


            switch (op) {
                case 1:
                    System.out.println("Ingresar los datos del auto.");
                    System.out.println("Ingrese la patente del auto:");
                    String patente = sc.next();
                    System.out.println("Ingrese la marca del auto:");
                    String marca = sc.next();
                    System.out.println("Ingrese el precio por dia del auto:");
                    int precio = sc.nextInt();
                    System.out.println("Ingrese el color del auto:");
                    String color = sc.next();
                    auto = new Auto(patente, marca, precio, color);
                    System.out.println("El auto se registro con exito.");
                    break;
                case 2:
                    if (auto != null) {
                        System.out.println("Los datos del auto son.");
                        auto.mostrarDatos();
                    }else{
                        System.out.println("No existe el auto registrado");
                    }
                    break;
                case 3:
                    if (auto != null) {
                        System.out.println("Ingrese los dias que arrendara el auto:");
                        int dias = sc.nextInt();
                        auto.calcularArriendov2(dias);
                    }else{
                        System.out.println("No existe el auto registrado");
                    }
                    break;

                case 4:
                    if (auto != null) {
                        System.out.println("Ingrese los dias de arriendo:");
                        int dias = sc.nextInt();
                        System.out.println("Ingrese el descuento que arrendara el auto:");
                        int descuento = sc.nextInt();
                        System.out.println("El arriendo con descuento es:"+ auto.calcularArriendo(dias, descuento));
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
            }
        }
    }
}