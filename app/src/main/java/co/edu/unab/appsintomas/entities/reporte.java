package co.edu.unab.appsintomas.entities;

import java.util.Date;

public class reporte {
    private String id_reporte;
    private String id_usuario;
    private String  fecha;
    private int respuesta1=0;
    private int respuesta2=0;
    private int respuesta3=0;
    private int respuesta4=0;
    private int respuesta5=0;
    private String estado;

    public reporte(String id_reporte, String id_usuario, String  fecha, int respuesta1, int respuesta2, int respuesta3, int respuesta4, int respuesta5, String estado) {
        this.id_reporte = id_reporte;
        this.id_usuario = id_usuario;
        this.fecha = fecha;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
        this.respuesta5 = respuesta5;
        this.estado = establecerEstado();
    }


    public reporte(String id_reporte, String id_usuario, String fecha, int respuesta1, int respuesta2, int respuesta3, int respuesta4, int respuesta5) {
        this.id_reporte = id_reporte;
        this.id_usuario = id_usuario;
        this.fecha = fecha;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
        this.respuesta5 = respuesta5;
        this.estado = establecerEstado();

    }

    public reporte() {
    }

    public String establecerEstado(){
        String estate="HABILITADO";
        int suma=respuesta1+respuesta2+respuesta3+respuesta4+respuesta5;

        if(suma>=3){
            estate="INHABILITADO";

        }


        return estate;
    }
    public String getId_reporte() {
        return id_reporte;
    }

    public void setId_reporte(String id_reporte) {
        this.id_reporte = id_reporte;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String  getFecha() {
        return fecha;
    }

    public void setFecha(String  fecha) {
        this.fecha = fecha;
    }

    public int getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(int respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public int getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(int respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public int getRespuesta3() {
        return respuesta3;
    }

    public void setRespuesta3(int respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public int getRespuesta4() {
        return respuesta4;
    }

    public void setRespuesta4(int respuesta4) {
        this.respuesta4 = respuesta4;
    }

    public int getRespuesta5() {
        return respuesta5;
    }

    public void setRespuesta5(int respuesta5) {
        this.respuesta5 = respuesta5;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "reporte{" +
                "id_reporte='" + id_reporte + '\'' +
                ", id_usuario='" + id_usuario + '\'' +
                ", fecha='" + fecha + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
