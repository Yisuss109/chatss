package Manejoerrores;

    public class Principal {
        public static void main(String[] args) {
            int[] numero={1,2,3};

            System.out.print("Valor ");
        try {
            System.out.println(numero[3]);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            //throw new RuntimeException(e);
           System.out.println("Hay un error en el codigo " + e.getMessage()); //error codigo general
        }
        System.out.println("final");

    }
}
