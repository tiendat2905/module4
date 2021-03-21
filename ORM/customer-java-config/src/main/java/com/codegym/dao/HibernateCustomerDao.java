package com.codegym.dao;

import com.codegym.model.Customer;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class HibernateCustomerDao implements CustomerDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> findAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<Customer> query = session.createQuery("from Customer", Customer.class);
        return query.list();
    }

    @Override
    public Customer findOne(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.find(Customer.class,id);
    }

    @Override
    public Customer save(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.save(customer);
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        Customer find = session.find(Customer.class,customer.getId());
        find.setName(customer.getName());
        find.setEmail(customer.getEmail());
        find.setAddress(customer.getAddress());
        return customer;
    }

    @Override
    public List<Customer> save(List<Customer> customers) {
        return null;
    }

    @Override
    public boolean exists(int id) {
        return false;
    }

    @Override
    public List<Customer> findAll(List<Integer> ids) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = session.get(Customer.class,id);
        session.remove(customer);
    }

    @Override
    public void delete(List<Customer> customers) {

    }

    @Override
    public void deleteAll() {

    }
}
