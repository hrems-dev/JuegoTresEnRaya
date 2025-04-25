package pe.edu.upeu.JuegoMichi.service;
import org.springframework.stereotype.Service;
import pe.edu.upeu.JuegoMichi.modelo.Jgars;
import java.util.ArrayList;
import java.util.List;

@Service
public class gameServiceImp implements gameSer{
    List<Jgars> datos=new ArrayList<>();

    @Override
    public List<Jgars> findAll() {
        return datos;
    }

    @Override
    public Jgars findById(int index) {
        return datos.get(index);
    }

    @Override
    public void save(Jgars gaming) {
        datos.add(gaming);
    }

    @Override
    public Jgars update(Jgars gaming, int index) {
        return datos.set(index,gaming);
    }

    @Override
    public void delete(Jgars gaming) {
        datos.remove(gaming);
    }

    @Override
    public void deleteById(int index) {
        datos.remove(index);
    }
}
