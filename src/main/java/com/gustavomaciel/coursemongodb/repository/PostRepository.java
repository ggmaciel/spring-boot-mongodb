package com.gustavomaciel.coursemongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gustavomaciel.coursemongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
}
