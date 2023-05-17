package temas7_8_9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;

public class ejercicios {
    public static void main(String[] args) {

        // Hola Mundo = odnuM aloH
        holaMundo();

        // Ejercicio 1
        String[] arrayUniDi = { "a", "b", "c" };
        arrayUnidimensional(arrayUniDi);

        // Ejercicio 2
        int[][] arrayBiDi = { { 1, 2 }, { 3, 4 } };
        arrayBidimensional(arrayBiDi);

        // Ejercicio 3
        int[] vectorInt = { 1, 2, 3, 4, 5 };
        vector(vectorInt);

        // Ejercicio 4 = Cada vez que se añada un elemento se cargarían nuevamente todos
        // los elementos del array así estuviesen vacíos, sería mejor hacerlo auto
        // incrementable para solucionar el problema de carga.

        // Ejercicio 5
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList(arrayList);

        // Ejercicio 6
        arrayConBucle();

        // Ejercicio 7
        try {
            DividePorCero(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Demo de código");
        }

        // Ejercicio 8
        copiaFicheros();
    }

    static void holaMundo() {
        String text = "Hola mundo";
        String handleText = "";
        for (int i = 0; i < text.length(); i++) {
            handleText = handleText + String.valueOf(text.charAt(text.length() - i - 1));
        }
        System.out.println(handleText);
    }

    static void arrayUnidimensional(String[] arrayUniDi) {

        for (int i = 0; i < arrayUniDi.length; i++) {
            System.out.println(arrayUniDi[i]);
        }
    }

    static void arrayBidimensional(int[][] arrayBiDi) {
        for (int i = 0; i < arrayBiDi.length; i++) {
            for (int j = 0; j < arrayBiDi.length; j++) {
                System.out.print(arrayBiDi[i][j]);
            }
            System.out.println("");
        }
    }

    static void vector(int[] vectorInt) {
        for (int i = 3; i < vectorInt.length - 1; i++) {
            vectorInt[i] = vectorInt[i + 1];
        }

        for (int i = 2; i < vectorInt.length - 1; i++) {
            vectorInt[i] = vectorInt[i + 1];
        }

        for (int i = 0; i < vectorInt.length - 2; i++) {
            System.out.println(vectorInt[i]);
        }

    }

    static void arrayList(ArrayList<String> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
        }
        System.out.println("");

        LinkedList<String> linkedList = new LinkedList<String>(arrayList);

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i));
        }
        System.out.println("");
    }

    static void arrayConBucle() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            numeros.add(i, i + 1);
            System.out.println(numeros);
        }

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                numeros.remove(i);
            }
        }
        System.out.println(numeros);
    }

    static int DividePorCero(int numero) throws ArithmeticException {
        try {
            return numero / 0;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Esto no puede hacerse");
        }
    }

    static void copiaFicheros() {
        byte[] buffer = new byte[1024];
        try {
            OutputStream fileOut = new FileOutputStream("ficheroCopia.txt");
            InputStream fileIn = new FileInputStream("fichero.txt");
            int byteReader;
            while ((byteReader = fileIn.read(buffer)) != -1) {
                fileOut.write(buffer, 0, byteReader);
                ;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
