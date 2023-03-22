package tema2;

public class App {
    public static void main(String[] args) {
        IVA(1000);
    }

    static void IVA(double precio) {
        double iva = precio * 0.19;
        System.out.println("El precio con iva es: $"+ (iva + precio));
    }
}
