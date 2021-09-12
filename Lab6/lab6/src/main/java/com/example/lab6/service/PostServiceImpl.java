package com.example.lab6.service;

import com.example.lab6.domain.PostInfo;
import com.example.lab6.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public List<PostInfo> getAll() {
        return postRepository.findAll();
    }
    public Optional<PostInfo> getById(long id) {
        return postRepository.findById(id);
    }

    public PostInfo save(PostInfo post){
        postRepository.save(post);
        return post;
    }
    /////////////Delete
    public void delete(long id){
        postRepository.deleteById(id);

    }
    public PostInfo updatePost(long id, PostInfo post){
        Optional<PostInfo> postValid = postRepository.findById(id);
        if(postValid != null) {
            post.setId(id);
            postRepository.save(post);
        }
             return post;
         }
     }
