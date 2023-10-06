package CRUD;

import java.io.IOException;
import java.util.List;

public interface IJuguete {
    JugueteDTO findById(int id);
    List<JugueteDTO> findAll() throws IOException, ClassNotFoundException;
    void save(JugueteDTO juguete) throws IOException;
    void update(JugueteDTO juguete) throws IOException;
    void delete(JugueteDTO juguete) throws IOException;
}
