package com.example.lab6.service;

import com.example.lab6.domain.PostInfo;


import java.util.List;
import java.util.Optional;


public interface PostService {
    public List<PostInfo> getAll();
    public Optional<PostInfo> getById(long id);
    public void delete(long id);
    public PostInfo updatePost(long id,PostInfo post);
    public PostInfo save(PostInfo post);
}
