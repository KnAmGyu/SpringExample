package com.uilangage.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.uilangage.spring.ex.mybatis.domain.Review;

@Repository
public interface ReviewRepository {
	
	//파라미터로 전달된 id와 일치하는 정보
	public Review selectReview(@Param("id") int id);

	
	// 전달받은 리뷰 내용을 insert하는 기능
	public int insertReview(
			@Param("storeId") int storeId
			, @Param("menu") String menu
			, @Param("userName") String userName
			, @Param("point") double point);
	
	// 전달 받은 리뷰 객체 내용을 insert하는 기능
	public int insertReviewByObject(Review review);
	
}
