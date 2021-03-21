package com.codegym.service;

import com.codegym.dao.CustomerDao;
import com.codegym.dao.HibernateCustomerDao;
import com.codegym.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Transactional
    public List<Customer> findAll(){
        return customerDao.findAll();
    }

    @Transactional
    public Customer findOne(int id){
        return customerDao.findOne(id);
    }

    @Transactional
    public Customer save(Customer customer){
        return customerDao.save(customer);
    }

    @Transactional
    public Customer update(Customer customer){
        return customerDao.update(customer);
    }

    @Transactional
    public void delete(int id){
        customerDao.delete(id);
    }
}
