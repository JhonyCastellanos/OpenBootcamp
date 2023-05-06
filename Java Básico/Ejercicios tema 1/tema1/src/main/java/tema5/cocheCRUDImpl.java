package tema5;

public class cocheCRUDImpl implements cocheCRUD {

    @Override
    public void save() {
        System.out.println("Guardado");
    }

    @Override
    public void findAll() {
        System.out.println("Buscando");
    }

    @Override
    public void delete() {
        System.out.println("Elimindado");
    }

}
