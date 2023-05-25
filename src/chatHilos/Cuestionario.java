package chatHilos;

public class Cuestionario {
    private String pregunta;
    private String respuesta;
    private int Pregunta;
    public Cuestionario(String pregunta, String respuesta, int Pregunta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.Pregunta = Pregunta;
    }
    public String getPregunta() {
        return pregunta;
    }
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    public String getRespuesta() {
        return respuesta;
    }
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    public int getnPregunta() {
        return Pregunta;
    }
    public void setnPregunta(int Pregunta) {
        this.Pregunta = Pregunta;
    }
    @Override
    public String toString() {
        return "preguntas2{" +
                "pregunta='" + pregunta + '\'' +
                ", respuesta='" + respuesta + '\'' +
                ", Pregunta='" + Pregunta + '\'' +
                '}';
    }
}
