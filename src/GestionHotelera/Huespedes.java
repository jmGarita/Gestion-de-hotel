package GestionHotelera;

public class Huespedes {

    private  String nombre;
    private String apellido;
    private String identificacion;
    private String telefono;
    private String correo;
    private String nacionalidad;

    public Huespedes( String nombre,String apellido, String identificacion, String telefono, String correo, String nacionalidad){

        this.nombre=nombre;
        this.apellido=apellido;
        this.identificacion=identificacion;
        this.telefono=telefono;
        this.correo=correo;
        this.nacionalidad=nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
