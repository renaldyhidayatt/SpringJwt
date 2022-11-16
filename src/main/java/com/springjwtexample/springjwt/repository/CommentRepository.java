package com.springjwtexample.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springjwtexample.springjwt.models.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
