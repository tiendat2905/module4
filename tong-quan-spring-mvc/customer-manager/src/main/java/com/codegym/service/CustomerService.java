package com.codegym.service;

import com.codegym.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    private int currentId = 0;
    private final List<Customer> list = new ArrayList<>();

    {
        add(new Customer("T","t@codegym.vn","Da Nang"));
        add(new Customer("Nhat","nhat@codegym.vn","Quang Tri"));
        add(new Customer("Trang","trang@codegym.vn","Ha Noi"));
        add(new Customer("Nguyen Binh Son","son@codegym.vn","Sai Gon"));
        add(new Customer("Dang Xuan Hoa","hoa.dang@codegym.vn","Da Nang"));
    }

    public List<Customer> getAll() {
        return list;
    }

    public Customer getById(int id) {
        for (Customer customer : list) {
            if (customer.getId() == id)
                return customer;
        }
        return null;
    }

    public boolean update(Customer customer) {
        Customer cus = getById(customer.getId());
        if (cus == null)
            return false;

        cus.setName(customer.getName());
        cus.setAddress(customer.getAddress());
        cus.setEmail(customer.getEmail());

        return true;
    }

    public void add(Customer customer){
        customer.setId(currentId++);
        list.add(customer);
    }

    public boolean delete(Customer customer){
        Customer cus = getById(customer.getId());
        if (cus == null)
            return false;

        list.remove(cus);

        return true;
    }
}
