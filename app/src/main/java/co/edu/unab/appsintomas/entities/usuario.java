package co.edu.unab.appsintomas.entities;

public class usuario {

    private int id;
    private int user_id;
    private String nombres;
    private String apellidos;
    private String profesion;
    private String contrasena;
    private String tipo_doc;
    private int documento;
    private String url_foto;
    private int estado;
    private String tipo_usuario;


    public usuario(int id,int user_id, String nombres, String apellidos,String profesion, String contrasena, String tipo_doc, int documento, String url_foto, int estado, String tipo_usuario) {
        this.id = id;
        this.user_id=user_id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.profesion = profesion;
        this.contrasena = contrasena;
        this.tipo_doc = tipo_doc;
        this.documento = documento;
        this.estado = estado;
        this.url_foto = url_foto;
        this.tipo_usuario = tipo_usuario;
    }

    public usuario(int id, int user_id, String nombres, String apellidos, String profesion, int documento, int estado,String url_foto) {
        this.id = id;
        this.user_id = user_id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.profesion = profesion;
        this.documento = documento;
        this.estado = estado;
        this.url_foto = url_foto;

    }

    public usuario() {
    }

    

    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }
    public String getApellidoss() {
        return apellidos;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public int getdocumento() {
        return documento;
    }

    public String getUrl_foto() {
        return url_foto;
    }

    public int getestado() {
        return estado;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser_Id(int user_id) {
        this.user_id = user_id;
    }

    public void setnombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setProfesion(String usuario) {
        this.profesion = profesion;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public void setdocumento(int documento) {
        this.documento = documento;
    }

    public void setUrl_foto(String url_foto) {
        this.url_foto = url_foto;
    }

    public void setestado(int estado) {
        this.estado = estado;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    @Override
    public String toString() {
        return "usuario{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", profesion='" + profesion + '\'' +
                ", tipo_doc='" + tipo_doc + '\'' +
                ", documento=" + documento +
                ", estado=" + estado +
                '}';
    }
}
