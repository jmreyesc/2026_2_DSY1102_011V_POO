package org.example;
import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Asignatura asignatura = new Asignatura("DSY1102", "Desarrollo Orientado a Objetos",6);
        int op = -1;
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Alumno alumno = null;
        Profesor profesor = null;
        String run = "";
        String name = "";
        String apellido = "";
        int nmrMatricula = 0;
        double prom = 0.0;
        String promedio = "";
        String matricula = "";
        boolean val = true;
        LocalDate fechaNacimiento = null;
        Persona persona = null;

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
            sc.nextLine();

            switch (op) {
                case 1:
                    while (val) {
                        System.out.println("==Ingresando Alumno==");
                        try {
                            System.out.println("Ingresa tu rut:");
                            run = sc.nextLine();
                            System.out.println("Ingresa tu nombre:");
                            name = sc.nextLine();;
                            System.out.println("Ingresa tu apellido:");
                            apellido = sc.nextLine();
                            System.out.println("Ingresa tu fecha nacimiento(dd/mm/yyyy:");
                            String fecha = sc.nextLine();
                            fechaNacimiento = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                            System.out.println("Ingresa tu nmro de matricula:");
                            matricula = sc.nextLine();
                            nmrMatricula =  Integer.parseInt(matricula);
                            System.out.println("Ingrese su promedio:");
                            promedio = sc.nextLine();
                            prom = Double.parseDouble(promedio);

                            if (run.isBlank()){
                                System.out.println("El rut ingresado no es valido");
                                val = true;
                            }else{
                                if(run.length()>7 && run.length()<9) {val = false;}
                            }

                            if (name.isBlank()){
                                System.out.println("El nombre ingresado no es valido");
                                val = true;
                            }else{val = false;}

                            if (apellido.isBlank()){
                                System.out.println("El apellido ingresado no es valido");
                                val = true;
                            }else{val = false;}

                            if(prom >= 1.0 && prom <= 7.0)
                            {val = false;} else{
                                System.out.println("El promedio ingresado no es valido");
                                val = true;}
                            if(nmrMatricula > 0){val = false;}
                            else {System.out.println("El numero de matricula ingresado no es valido");}

                            } catch (RuntimeException e) {
                            System.out.println("Capturado: " + e.getMessage());
                            }
                    }

                    alumno = new Alumno(run,name,apellido,fechaNacimiento,nmrMatricula,prom,asignatura);

                    if(alumno != null){
                        System.out.println("Alumno creado con exito");
                        asignatura.alumno = alumno;
                    }else{System.out.println("Alumno no encontrado");}
                    break;
                case 2:
                    String especialidad = "";
                    int hrsSemana = 0;
                    val = true;

                    while (val) {
                        System.out.println("==Ingresando Profesor==");
                        try {
                            System.out.println("Ingrese su rut:");
                            run = sc.nextLine();
                            System.out.println("Ingrese su nombre:");
                            name = sc.nextLine();
                            System.out.println("Ingrese su apellido:");
                            apellido = sc.nextLine();
                            System.out.println("Ingrese su fecha nacimiento(dd/mm/yyyy:");
                            String fecha = sc.nextLine();
                            fechaNacimiento = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                            System.out.println("Ingresa su especialidad:");
                            especialidad = sc.nextLine();
                            System.out.println("Ingrese su numero de hrs semanales:");
                            String semana = sc.nextLine();
                            hrsSemana = Integer.parseInt(semana);

                            if (run.isBlank()){
                                System.out.println("El rut ingresado no es valido");
                                val = true;
                            }else{
                                if(run.length()>7 && run.length()<9) {val = false;}
                            }
                            if (name.isBlank()){
                                System.out.println("El nombre ingresado no es valido");
                                val = true;
                            }else{val = false;}
                            if (apellido.isBlank()){
                                System.out.println("El apellido ingresado no es valido");
                                val = true;
                            }else{val = false;}
                            if (especialidad.isBlank()){
                                System.out.println("La especialidad ingresada no es valida");
                                val = true;
                            }else{val = false;}

                            if(hrsSemana > 0){val = false;}
                            else {System.out.println("El numero de horas semanales no es valido");}

                        } catch (RuntimeException e) {
                            System.out.println("Capturado: " + e.getMessage());
                        }
                    }

                   profesor = new Profesor(run,name,apellido,fechaNacimiento,especialidad,hrsSemana,asignatura);

                    if(alumno != null){
                        System.out.println("Alumno creado con exito");
                        asignatura.profesor = profesor;
                    }else{System.out.println("Alumno no encontrado");}
                    break;
                case 3:
                    alumno.mostrarInformacion();
                    break;
                case 4:
                    profesor.mostrarInformacion();
                    break;
                case 5:
                    asignatura.mostrarAsignatura();
                    break;
                case 6:
                    alumno.realizarActividad();
                    break;
                case 7:
                    profesor.realizarActividad();
                    break;
                case 8:
                    persona = alumno;
                    persona.mostrarInformacion();
                    break;
                case 9:
                    persona = profesor;
                    persona.mostrarInformacion();
            }
        }
    public static void mostrarPersona(Persona persona)
        {
            persona.mostrarInformacion();
        }

    }
}
