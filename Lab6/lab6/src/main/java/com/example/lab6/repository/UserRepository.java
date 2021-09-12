package com.example.lab6.repository;

import com.example.lab6.domain.PostInfo;
import com.example.lab6.domain.UserInfo;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<UserInfo, Long> {

    public List<UserInfo>  findAll();

    public Optional<UserInfo> findByUsername(String username);

    @Query(value="Select u.posts from User u where u.id = : id ")
    public List<PostInfo> getPostsById(@Param("id") long id);

//    @Query(value="Select u from User u where u.posts.count>1")
//    public List<UserInfo> getUserPostMoreThan(@Param("num") int num);
}
