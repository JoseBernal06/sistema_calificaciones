public class Estudiante {

    String nombre;
    String apellido;
    String materia_uno;
    String materia_dos;
    String materia_tres;
    String materia_cuatro;
    String materia_cinco;
    double calificaciones;

    public Estudiante(String nombre, String apellido, String materia_uno, String materia_dos, String materia_tres, String materia_cuatro, String materia_cinco, double calificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia_uno = materia_uno;
        this.materia_dos = materia_dos;
        this.materia_tres = materia_tres;
        this.materia_cuatro = materia_cuatro;
        this.materia_cinco = materia_cinco;
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

    public String getMateria_uno() {
        return materia_uno;
    }

    public void setMateria_uno(String materia_uno) {
        this.materia_uno = materia_uno;
    }

    public String getMateria_dos() {
        return materia_dos;
    }

    public void setMateria_dos(String materia_dos) {
        this.materia_dos = materia_dos;
    }

    public String getMateria_tres() {
        return materia_tres;
    }

    public void setMateria_tres(String materia_tres) {
        this.materia_tres = materia_tres;
    }

    public String getMateria_cuatro() {
        return materia_cuatro;
    }

    public void setMateria_cuatro(String materia_cuatro) {
        this.materia_cuatro = materia_cuatro;
    }

    public String getMateria_cinco() {
        return materia_cinco;
    }

    public void setMateria_cinco(String materia_cinco) {
        this.materia_cinco = materia_cinco;
    }

    public double getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double calificaciones) {
        this.calificaciones = calificaciones;
    }
}
