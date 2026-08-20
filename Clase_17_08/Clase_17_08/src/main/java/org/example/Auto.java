package org.example;

public class Auto extends Vehiculo {
    protected String color;

    public Auto(String patente, String marca, int precioPorDia, String color) {
        super(patente, marca, precioPorDia);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Color: " + color);
    }

    public int calcularArriendo(int dias, int descuento) {
        int total = precioPorDia * dias;
        int total_descuento = total - descuento;
        return total_descuento;
    }
}
