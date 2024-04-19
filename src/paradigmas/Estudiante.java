package paradigmas;

import java.util.HashMap;
import java.util.Map;

public class Estudiante {
	private String nombre;
    private String apellido;
    private String carrera;
    private String turno;
    private int semestre;
    private Map<String, Double> calificaciones; 

  
    public Estudiante(String nombre, String apellido, String carrera, String turno, int semestre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.turno = turno;
        this.semestre = semestre;
        this.calificaciones = new HashMap<>();
    }

    
    public void asignarCalificacion(String materia, double calificacion) {
        calificaciones.put(materia, calificacion);
    }

    
    public boolean aproboSemestre() {
        double sumaCalificaciones = 0;
        for (double calificacion : calificaciones.values()) {
            sumaCalificaciones += calificacion;
        }
        double promedio = sumaCalificaciones / calificaciones.size();
        return promedio >= 6.0;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    

}
