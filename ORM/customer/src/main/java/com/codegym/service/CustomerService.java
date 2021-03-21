package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findOne(int id);

    Customer save(Customer customer);

    Customer update(Customer customer);

    List<Customer> save(List<Customer> customers);

    boolean exists(int id);

    List<Customer> findAll(List<Integer> ids);

    int count();

    void delete(int id);

    void delete(List<Customer> customers);

    void deleteAll();
}
