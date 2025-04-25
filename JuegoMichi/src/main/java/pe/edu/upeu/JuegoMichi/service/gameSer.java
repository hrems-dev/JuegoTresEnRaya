package pe.edu.upeu.JuegoMichi.service;

import pe.edu.upeu.JuegoMichi.modelo.Jgars;

import java.util.List;

public interface gameSer {
    List<Jgars> findAll();
    public Jgars findById(int index);
    public void save(Jgars gaming);
    //public CalcTO delete(CalcTO calcTO);
    public Jgars update(Jgars gaming, int index);

    public void delete(Jgars gaming);
    public void deleteById(int index);
}
