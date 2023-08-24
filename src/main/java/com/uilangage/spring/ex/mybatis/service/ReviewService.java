package com.uilangage.spring.ex.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilangage.spring.ex.mybatis.domain.Review;
import com.uilangage.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	public Review getReview(int id) {
		
		Review review = reviewRepository.selectReview(id);
		return review;
		
	}
}
