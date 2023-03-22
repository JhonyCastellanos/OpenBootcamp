package tema3;

public class App {
    public static void main(String[] args) {
        String[] nombres = {"jhony","Santiago","Ray","Kayle"};
        String nombresConcatenados = "";
        for (int i = 0; i < nombres.length; i++) {
            nombresConcatenados = nombresConcatenados + nombres[i] + ", ";
        }
        System.out.println(nombresConcatenados);
    }
}
