package Aplicacion_Notas.Modelo;

public class Nota {
    private String nombre;
    private String apellidos;
    private String nota_completa;

    public Nota(String nombre, String apellidos, String nota_completa) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota_completa = nota_completa;
    }

    public Nota() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNota_completa() {
        return nota_completa;
    }

    public void setNota_completa(String nota_completa) {
        this.nota_completa = nota_completa;
    }
}
