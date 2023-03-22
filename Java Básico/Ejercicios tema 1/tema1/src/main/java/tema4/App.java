package tema4;

public class App {
    public static void main(String[] args) {
        SmartPhone redmiNote10 = new SmartPhone("Xiaomi", "Readme 10", 600000.00, 6, 4, "SnapDragon4000", "Andoid");
        System.out.println(redmiNote10.fabricante);
        System.out.println(redmiNote10.nombre);
        System.out.println(redmiNote10.precio);
        System.out.println(redmiNote10.pulgadas);
        System.out.println(redmiNote10.numeroDeCamaras);
        System.out.println(redmiNote10.procesador);
        System.out.println(redmiNote10.ios);

        SmartWatch appleWatch = new SmartWatch("Iphone", "Apple Watch Ultra", 2500000, 2, true, true, 2023);
        System.out.println(appleWatch.fabricante);
        System.out.println(appleWatch.nombre);
        System.out.println(appleWatch.precio);
        System.out.println(appleWatch.pulgadas);
        System.out.println(appleWatch.ritmoCardiaco);
        System.out.println(appleWatch.cronometro);
        System.out.println(appleWatch.modelo);
    }

    public static class SmartDevice {
        String fabricante;
        String nombre;
        double precio;
        double pulgadas;

        public SmartDevice() {
        }

        public SmartDevice(String fabricante, String nombre, double precio, double pulgadas) {
            this.fabricante = fabricante;
            this.nombre = nombre;
            this.precio = precio;
            this.pulgadas = pulgadas;
        }
    }

    public static class SmartPhone extends SmartDevice {
        int numeroDeCamaras;
        String procesador;
        String ios;

        public SmartPhone() {
            super();
        }

        public SmartPhone(String fabricante, String nombre, double precio, double pulgadas, int numeroDeCamaras,
                String procesador, String ios) {
            super(fabricante, nombre, precio, pulgadas);
            this.numeroDeCamaras = numeroDeCamaras;
            this.procesador = procesador;
            this.ios = ios;
        }
    }

    public static class SmartWatch extends SmartDevice {
        boolean ritmoCardiaco;
        boolean cronometro;
        int modelo;

        public SmartWatch() {
            super();
        }

        public SmartWatch(String fabricante, String nombre, double precio, double pulgadas, boolean ritmoCardiaco,
                boolean cronometro, int modelo) {
            super(fabricante, nombre, precio, pulgadas);
            this.ritmoCardiaco = ritmoCardiaco;
            this.cronometro = cronometro;
            this.modelo = modelo;
        }
    }
}
