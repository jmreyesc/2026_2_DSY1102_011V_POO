package org.example;

public class Asignatura {
    String codigo;
    String nombre;
    int creditos;
    Alumno alumno;
    Profesor profesor;

    public Asignatura(String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void mostrarAsignatura() {
        System.out.println("====================================");
        System.out.println("ASIGNATURA");
        System.out.println("====================================");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Creditos: " + creditos);
        if (profesor != null) {
            System.out.println("Profesor: No asignado" );
        }else{
            System.out.println("Profesor\n" + profesor.getNombre());
        }
        if (alumno != null) {
            System.out.println("Alumno: No asignado" );
        }else{
            System.out.println("Alumno\n" + alumno.getNombre());
        }
    }
}