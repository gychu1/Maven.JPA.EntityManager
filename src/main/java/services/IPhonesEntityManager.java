package services;


import entities.IPhones;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class IPhonesEntityManager implements EntityManagerInterface<IPhones>{

    EntityManagerFactory emFactory;
    EntityManager entitymanager;

    public IPhonesEntityManager(){
        this.emFactory = Persistence.createEntityManagerFactory("test");
        this.entitymanager = emFactory.createEntityManager();

    }
    public IPhones findById(int id) {
        return null;
    }

    public List<IPhones> findAll() {
        return null;
    }

    public IPhones update(IPhones dto) {
        return null;
    }

    public IPhones create(IPhones iPhone) {
        try {
            entitymanager.getTransaction().begin();
            entitymanager.persist(iPhone);
            entitymanager.getTransaction().commit();

            entitymanager.close();
            emFactory.close();

            return iPhone;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(int id) {

    }
}
