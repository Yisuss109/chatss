package Ejercicios_clase;

public interface IntAlumno2 {
    void MostrarGrado();
    int obtenerAnnosdeCarretera();
    public abstract void encontrarCurso();
    default void mostrarHorario(){
        System.out.println("Horario corrido ");
    }
}
