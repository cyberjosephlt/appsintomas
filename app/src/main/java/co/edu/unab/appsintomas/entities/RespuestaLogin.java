package co.edu.unab.appsintomas.entities;

public class RespuestaLogin {


    private usuario user;
    private int docente_id;
    private String token;
    private String saludo;

    public usuario getUser() {
        return user;
    }

    public RespuestaLogin(usuario user, String token) {
        this.user = user;
        this.token = token;
        this.saludo = saludo;
    }

    public void setUser(usuario user) {
        this.user = user;
    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


    public RespuestaLogin(int docente_id) {
        this.docente_id = docente_id;
    }

    public int getDocente_id() {
        return docente_id;
    }

    public void setDocente_id(int docente_id) {
        this.docente_id = docente_id;
    }

    public String getsaludo() {
        return saludo;
    }

    public void setsaludo(String saludo) {
        this.saludo = saludo;
    }
}
