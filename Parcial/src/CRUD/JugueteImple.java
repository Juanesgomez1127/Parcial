package CRUD;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JugueteImple implements IJuguete {
    private List<JugueteDTO> juguetes;

    public JugueteImple() throws IOException, ClassNotFoundException {
        juguetes = new ArrayList<>();
    }

    @Override
    public JugueteDTO findById(int id) {
        return juguetes.stream()
                .filter(juguete -> juguete.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<JugueteDTO> findAll() throws IOException, ClassNotFoundException {
        juguetes = (List<JugueteDTO>) ObjectSerializer.readObjectFromFile("juguetes.ax");
        return juguetes;
    }

    @Override
    public void save(JugueteDTO centro) throws IOException {
        juguetes.add(centro);
        ObjectSerializer.writeObjectToFile(juguetes, "juguetes.ax");
    }

    @Override
    public void update(JugueteDTO centro) throws IOException {
        JugueteDTO oldcentro = findById(centro.getId());
        if (oldcentro != null) {
            juguetes.remove(oldcentro);
            juguetes.add(centro);
            ObjectSerializer.writeObjectToFile(juguetes, "juguetes.ax");
        }
    }

    @Override
    public void delete(JugueteDTO juguete) throws IOException {
        juguetes.remove(juguete);
        ObjectSerializer.writeObjectToFile(juguetes, "juguetes.ax");
    }
}
