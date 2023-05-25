package chatHilos;

import Hilos2.EscrituraLenta;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaCuestionario {
    public static void main(String[] args) {
        Scanner enatrada=new Scanner(System.in);
        ArrayList<Cuestionario> questions=new ArrayList<>();
        questions.add(new Cuestionario("_____ is writing an essay.","Kathyo",1));
        questions.add(new Cuestionario("_____ is having coffee.","Megm and Carmen",2));
        questions.add(new Cuestionario("_____ is talking on the phone.","Carmen",3));
        questions.add(new Cuestionario("_____ is watching a baseball game.","Kathyo´s dad",4));
        questions.add(new Cuestionario("_____ is shopping.","Kathyo´s  mom",5));
        questions.add(new Cuestionario("_____ is playing  soccer.","John",6));
        String respuestaU;
        int aciertos=0;
        for (int i=0;i<6;i++){
            EscrituraLenta.escribir(questions.get(i).getnPregunta()+".-"+questions.get(i).getPregunta()+"\n",20);
                    respuestaU=enatrada.nextLine();
            if (respuestaU.equals(questions.get(i).getRespuesta())){
                aciertos++;
                EscrituraLenta.escribir("La respuesta es correcta\n",20);
            }else{
                EscrituraLenta.escribir("Respuesta incorrecta.",20);
                EscrituraLenta.escribir("La respuesta correcta es: "+questions.get(i).getRespuesta()+"\n",20);
            }
        }
        double cal=(aciertos*10)/6;
        System.out.println("Tu calificacion es: "+cal);
    }
}

