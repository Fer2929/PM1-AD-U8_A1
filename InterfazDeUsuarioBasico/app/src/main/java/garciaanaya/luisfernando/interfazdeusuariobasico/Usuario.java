package garciaanaya.luisfernando.interfazdeusuariobasico;

import java.util.Date;

public class Usuario {

    private String username;
    private String password;
    private String nombre;
    private String tecnologias;
    private String genero;
    private String ies_origen;
    private boolean notificaciones;
    private boolean publicidad;
    private Date FechaHoraNacimiento;

    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tecnologias='" + tecnologias + '\'' +
                ", genero='" + genero + '\'' +
                ", ies_origen='" + ies_origen + '\'' +
                ", notificaciones=" + notificaciones +
                ", publicidad=" + publicidad +
                ", FechaHoraNacimiento=" + FechaHoraNacimiento +
                '}';
    }

    public Date getFechaHoraNacimiento() {
        return FechaHoraNacimiento;
    }

    public void setFechaHoraNacimiento(Date fechaHoraNacimiento) {
        FechaHoraNacimiento = fechaHoraNacimiento;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIes_origen() {
        return ies_origen;
    }

    public void setIes_origen(String ies_origen) {
        this.ies_origen = ies_origen;
    }

    public boolean isNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(boolean notificaciones) {
        this.notificaciones = notificaciones;
    }

    public boolean isPublicidad() {
        return publicidad;
    }

    public void setPublicidad(boolean publicidad) {
        this.publicidad = publicidad;
    }
}
