package com.codeStorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeStorm.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
