package services;

import java.util.List;

public interface EntityManagerInterface<T> {

    T findById(int id);
    List<T> findAll();
    T update(T dto, int id);
    T create(T dto);
    void delete(int id);
}
