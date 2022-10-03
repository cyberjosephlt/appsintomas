package co.edu.unab.appsintomas.entities;

public class usuario {

    private String id;
    private String nombre;
    private String usuario;
    private String contrasena;
    private String tipo_doc;
    private int n_documento;
    private String url_foto;
    private String estado_salud;
    private String tipo_usuario;


    public usuario(String id, String nombre, String usuario, String contrasena, String tipo_doc, int n_documento, String url_foto, String estado_salud, String tipo_usuario) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.tipo_doc = tipo_doc;
        this.n_documento = n_documento;
        this.url_foto = url_foto;
        this.estado_salud = estado_salud;
        this.tipo_usuario = tipo_usuario;
    }

    public usuario() {
    }


    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public int getN_documento() {
        return n_documento;
    }

    public String getUrl_foto() {
        return url_foto;
    }

    public String getEstado_salud() {
        return estado_salud;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public void setN_documento(int n_documento) {
        this.n_documento = n_documento;
    }

    public void setUrl_foto(String url_foto) {
        this.url_foto = url_foto;
    }

    public void setEstado_salud(String estado_salud) {
        this.estado_salud = estado_salud;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    @Override
    public String toString() {
        return "usuario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", usuario='" + usuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", tipo_doc='" + tipo_doc + '\'' +
                ", n_documento=" + n_documento +
                ", estado_salud='" + estado_salud + '\'' +
                ", tipo_usuario='" + tipo_usuario + '\'' +
                '}';
    }
}
