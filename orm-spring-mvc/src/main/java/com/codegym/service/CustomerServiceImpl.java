package com.codegym.service;

import com.codegym.model.Customer;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    public static SessionFactory sessionFactory;
    public static EntityManager entityManager;

    static {
        try {
            sessionFactory = new Configuration().configure("hibernate.conf.xml").buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> findAll() {
        String qrfindAll = "select c from Customer as c";
        TypedQuery<Customer> query = entityManager.createQuery(qrfindAll, Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findById(long id) {
        String qrfindId = "select c from Customer as c where c.id = :id";
        TypedQuery<Customer> query = entityManager.createQuery(qrfindId, Customer.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
}
