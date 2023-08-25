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
	
	//전달받은 리뷰내용 저장 기능
	public int addReview(int storeId, String menu, String userName, double point) {
		
		int count = reviewRepository.insertReview(storeId, menu, userName, point);
		
		return count;
	}
	
	//전달받은 리뷰객체의 내용을 저장하는 기능
	public int addReviewByObject(Review review){
		
		int count = reviewRepository.insertReviewByObject(review);
		
		return count;
	}
	
	
	
	
}
