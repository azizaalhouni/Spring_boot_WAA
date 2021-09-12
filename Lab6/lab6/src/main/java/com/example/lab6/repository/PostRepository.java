package com.example.lab6.repository;


import com.example.lab6.domain.PostInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<PostInfo,Long> {

    public List<PostInfo> findAll();
}
