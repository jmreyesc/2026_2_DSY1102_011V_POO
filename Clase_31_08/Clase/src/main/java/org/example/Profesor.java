package org.example;

public class Profesor extends Persona implements ParticipanteAcademico {
    String especialidad;
    int horasSemanales;
    Asignatura asignatura;

    public Profesor(String especialidad, int horasSemanales, Asignatura asignatura) {
        this.especialidad = especialidad;
        this.horasSemanales = horasSemanales;
        this.asignatura = asignatura;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarDatosPersonales();
        System.out.println("Especialidad: "+especialidad);
        System.out.println("Horas Semanales: "+horasSemanales);
        asignatura.mostrarAsignatura();

    }

    @Override
    public void realizarActividad() {
        System.out.println("El profesor está impartiendo "+asignatura.getNombre());
    }
}
