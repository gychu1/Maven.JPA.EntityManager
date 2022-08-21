package services;

import entities.IPhonesStores;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class IPhonesStoresEntityManager implements EntityManagerInterface<IPhonesStores> {
    EntityManagerFactory emFactory;
    EntityManager entitymanager;

    public IPhonesStoresEntityManager() {
        this.emFactory = Persistence.createEntityManagerFactory("test");
        this.entitymanager = emFactory.createEntityManager();
    }

    public IPhonesStores findById(int id) {
        return null;
    }

    public List<IPhonesStores> findAll() {
        return null;
    }

    public IPhonesStores update(IPhonesStores dto, int id) {
        return null;
    }

    public IPhonesStores create(IPhonesStores iPhonesStore) {
        try {
            entitymanager.getTransaction().begin();
            entitymanager.persist(iPhonesStore);
            entitymanager.getTransaction().commit();

            entitymanager.close();
            emFactory.close();

            return iPhonesStore;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(int id) {

    }
}
