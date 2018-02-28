package com.infoshareacademy.dao;

import com.infoshareacademy.model.Address;
import com.infoshareacademy.model.Computer;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class AddressDao {
    @PersistenceContext
    private EntityManager entityManager;

    public Long save(Address a) {
        entityManager.persist(a);
        return a.getId();
    }

    public Address update(Address a) {
        return entityManager.merge(a);
    }

    public void delete(Long id) {
        final Address a = entityManager.find(Address.class, id);
        if (a != null) {
            entityManager.remove(a);
        }

        }
    public Address findById(Long id) {
        return entityManager.find(Address.class, id);
    }

    public List<Address> findAll() {
        final Query query = entityManager.createQuery("SELECT s FROM Address a");

        return query.getResultList();
    }

}
