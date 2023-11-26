public class Estudiante {

    String codigo_unico;
    String nombre;
    String apellido;
    int edad;

    public Estudiante(String codigo_unico, String nombre, String apellido, int edad) {
        this.codigo_unico = codigo_unico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getCodigo_unico() {
        return codigo_unico;
    }

    public void setCodigo_unico(String codigo_unico) {
        this.codigo_unico = codigo_unico;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}



