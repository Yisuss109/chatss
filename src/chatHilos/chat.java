package chatHilos;

public class chat {
    public static void conver(String palabra, int velocidad) {
        char[] caracteres = palabra.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print(caracteres[i]);
            try {
                Thread.sleep(velocidad);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class lectura {
    public static void main(String[] args) {
        String conver1 = "Meg: Hi, there\n";
        String conver2 = "Kathyo: Hi, Megm\n";
        String conver3 = "Meg: What are you doing\n";
        String conver4 = "Kathyo: I'm sitting on my bed with my laptop. I'm doing my homework\n";
        String conver5 = "Megm:I´m in a café with my friend Carmen. I´m having coffee, and she´s \n";
        String conver6 = "Kathyo: What are you working on?\n";
        String conver7 = "Megm: I'm writing an essay for Spanish clas. Where are you\n";
        String conver8 = "Kathyo: They're all fine! My father's watching a baseball game with his friends. My mother is out shopping\n";
        String conver9 = "Megm: Where's your brother?\n";
        String conver10 = "Kathyo: John's playing soccer in the park. Oh, wait. My phone is ringing. My mother's calling me. I have to go! Bye!\n";
        String conver11 = "Megm: Ok! Bye!\n";
        chat.conver(conver1, 0);
        chat.conver(" " , 2000);
        chat.conver(conver2, 0);
        chat.conver(" " , 2000);
        chat.conver(conver3, 0);
        chat.conver(" " , 2000);
        chat.conver(conver4, 0);
        chat.conver(" " , 2000);
        chat.conver(conver5, 0);
        chat.conver(" " , 2000);
        chat.conver(conver6, 0);
        chat.conver(" " , 2000);
        chat.conver(conver7, 0);
        chat.conver(" " , 2000);
        chat.conver(conver8, 0);
        chat.conver(" " , 2000);
        chat.conver(conver9, 0);
        chat.conver(" " , 2000);
        chat.conver(conver10, 0);
        chat.conver(" " , 2000);
        chat.conver(conver11, 0);
        System.out.println();
    }
}
