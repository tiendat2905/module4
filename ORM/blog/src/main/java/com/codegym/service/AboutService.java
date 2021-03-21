package com.codegym.service;

import com.codegym.model.About;
import com.codegym.repository.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AboutService implements IAboutService {

    @Autowired
    private AboutRepository aboutRepository;

    @Override
    public List<About> findAll() {
        return aboutRepository.findAll();
    }

    @Override
    public void saveOrUpdate(About object) {

    }

    @Override
    public Optional<About> findById(int id) {
        return aboutRepository.findById(id);
    }

    @Override
    public void delete(int id) {
    }
}
