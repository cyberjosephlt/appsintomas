package co.edu.unab.appsintomas.entities;

public class cursos {

    private String id_curso;
    private String nombre_curso;
    private String id_docente;
    private String jornada;


    public cursos() {
    }

    public cursos(String id_curso, String nombre_curso, String id_docente,String jornada) {
        this.id_curso = id_curso;
        this.nombre_curso = nombre_curso;
        this.id_docente = id_docente;
        this.jornada = jornada;
    }

    public String getId_curso() {
        return id_curso;
    }

    public void setId_curso(String id_curso) {
        this.id_curso = id_curso;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public String getId_docente() {
        return id_docente;
    }

    public void setId_docente(String id_docente) {
        this.id_docente = id_docente;
    }


    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    @Override
    public String toString() {
        return "cursos{" +
                "id_curso='" + id_curso + '\'' +
                ", nombre_curso='" + nombre_curso + '\'' +
                ", id_docente='" + id_docente + '\'' +
                ", jornada='" + jornada + '\'' +
                '}';
    }


}
