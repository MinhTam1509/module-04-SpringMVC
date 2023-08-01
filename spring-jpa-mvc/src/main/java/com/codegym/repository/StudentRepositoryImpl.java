package com.codegym.repository;

import com.codegym.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
public class StudentRepositoryImpl implements IStudentRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Student> findAll() {
        String qrFindAll = "select st from Students as st";
        TypedQuery<Student> query = entityManager.createQuery(qrFindAll, Student.class);
        return query.getResultList();
    }

    @Override
    public List<Student> findByName(String name) {
        String qrFindByName = "select st from Student as st where st.name LIKE :name";
        TypedQuery<Student> query = entityManager.createQuery(qrFindByName, Student.class);
        query.setParameter("name", name);
        return query.getResultList();
    }
}
