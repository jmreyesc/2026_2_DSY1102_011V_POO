package org.example;
import java.time.LocalDate;

public abstract class Persona {
    protected String run;
    protected String nombre;
    protected String apellido;
    protected LocalDate fechaNacimiento;

    public Persona(String run, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.run = run;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void mostrarDatosPersonales(){
        System.out.println("Run: " + run);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Fecha nacimiento: "+fechaNacimiento);

    }

    public abstract void mostrarInformacion();
    public abstract void realizarActividad();
}
