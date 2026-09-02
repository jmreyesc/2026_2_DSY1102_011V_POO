package org.example;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Asignatura asignatura = new Asignatura("DSY1102", "Desarrollo Orientado a Objetos", 6)
        int op = -1;
        Scanner sc = new Scanner(System.in);
        while (op != 0) {
            System.out.println("========================================");
            System.out.println("SISTEMA DE GESTIÓN DE ASIGNATURA");
            System.out.println("========================================");
            System.out.println("1. Crear Alumno");
            System.out.println("2. Crear Profesor");
            System.out.println("3. Mostrar Alumno");
            System.out.println("4. Mostrar Profesor");
            System.out.println("5. Mostrar Asignatura");
            System.out.println("6. Realizar actividad del Alumno");
            System.out.println("7. Realizar actividad del Profesor");
            System.out.println("8. Demostrar polimorfismo con Alumno");
            System.out.println("9. Demostrar polimorfismo con Profesor");
            System.out.println("0. Salir");
            System.out.println("========================================");
            System.out.println("Seleccione una opción:");
            op = sc.nextInt();


            switch (op) {
                case 1:
                    String run = "";
                    String name = "";
                    String apellido = "";
                    LocalDate fechaNacimiento = 0;
                    int nmrMatricula = 0;
                    double prom = 0.0;
                    boolean val = true;

                    while (val) {
                        try {
                            System.out.println("Ingresa tu rut:");
                            run = sc.nextLine();
                            System.out.println("Ingresa tu nombre:");
                            name = sc.nextLine();
                            System.out.println("Ingresa tu apellido:");
                            apellido = sc.nextLine();

                            if (run.isBlank() && run.length()>7 && run.length()<9){
                                System.out.println("El rut ingresado no es valido");
                                val = true;
                            }else{val = false;}

                            if (name.isBlank()){
                                System.out.println("El nombre ingresado no es valido");
                                val = true;
                            }else{val = false;}

                            if (apellido.isBlank()){
                                System.out.println("El apellido ingresado no es valido");
                                val = true;
                            }else{val = false;}
                        } catch (RuntimeException e) {
                            System.out.println("Capturado: " + e.getMessage());
                        }
                    }
            }
        }
    }
}