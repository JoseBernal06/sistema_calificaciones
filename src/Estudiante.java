public class Estudiante {

    String nombre;
    String apellido;
    String materia;
    double calificaciones;

    public Estudiante(String nombre, String apellido, String materia, double calificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.calificaciones = calificaciones;
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double calificaciones) {
        this.calificaciones = calificaciones;
    }
}
