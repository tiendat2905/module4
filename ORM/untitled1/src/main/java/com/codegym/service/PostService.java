package com.codegym.service;

import com.codegym.model.Post;
import com.codegym.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> findAll(){
        return postRepository.findAll();
    }

    public Optional<Post> findById(int id){
        return postRepository.findById(id);
    }

    public void saveOrUpdate(Post post){
        postRepository.save(post);
    }

    public void delete(int id){
        postRepository.deleteById(id);
    }
}
