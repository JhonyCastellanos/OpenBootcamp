package tema5;

public class Main {

    public static void main(String[] args) {
        cocheCRUD cocheCrud = new cocheCRUDImpl();

        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();
    }

}
